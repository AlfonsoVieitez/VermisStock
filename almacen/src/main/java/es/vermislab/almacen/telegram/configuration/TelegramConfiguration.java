package es.vermislab.almacen.telegram.configuration;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import es.vermislab.almacen.entity.Almacen;
import es.vermislab.almacen.entity.Balda;
import es.vermislab.almacen.entity.Elemento;
import es.vermislab.almacen.entity.Zona;
import es.vermislab.almacen.repository.AlmacenRepository;
import es.vermislab.almacen.repository.BaldaRepository;
import es.vermislab.almacen.repository.ZonaRepository;
import es.vermislab.almacen.telegram.service.TelegramService;

@Component
public class TelegramConfiguration extends TelegramLongPollingBot {

	private static final Logger logger = LoggerFactory.getLogger(TelegramConfiguration.class);

	@Value("${bot.token}")
	private String token;

	@Value("${bot.username}")
	private String username;

	@Override
	public String getBotToken() {
		return token;
	}
	@Autowired 
	TelegramService telegramService;
	
	@Autowired
	BaldaRepository baldaRepository;
	
	@Autowired
	ZonaRepository zonaRepository;
	
	@Autowired
	AlmacenRepository almacenRepository;


	@Override
	public String getBotUsername() {
		return username;
	}

	@Override
	@Transactional
	public void onUpdateReceived(Update update) {
		if (update.hasMessage()) {
			Message message = update.getMessage();
			SendMessage response = new SendMessage();
			Long chatId = message.getChatId();
			response.setChatId(chatId);
			try {
				List<Elemento> responseToUser = this.telegramService.processUserRequest(message.getText());
				String textResponse = "";
				for(Elemento elemento: responseToUser) {
				
					Balda balda = elemento.getBalda();
					Zona zona = balda.getZona();
					Almacen almacen = zona.getAlmacen();
					textResponse += "\n\n"+ elemento.getNb_elemento();
					textResponse += "\n\tBALDA: " + balda.getNb_balda();
					textResponse += "\n\tZONA: " + zona.getNb_zona();
					textResponse += "\n\tALMACEN: " + almacen.getNb_almacen();
				}
				
				response.setText(textResponse);
				execute(response);
				logger.info("SEND to {}", chatId);
			} catch (TelegramApiException e) {
				logger.error("Failed to send message to {} due to error: {}", chatId, e.getMessage());
			}
		}
	}

	@PostConstruct
	public void start() {
		logger.info("username: {}, token: {}", username, token);
	}

}

