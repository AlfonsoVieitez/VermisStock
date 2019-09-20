package es.vermislab.almacen.telegram.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.vermislab.almacen.entity.Elemento;
import es.vermislab.almacen.repository.ElementoRepository;

@Service
public class TelegramService {
	@Autowired
	ElementoRepository elementoRepository;
	
	
	public List<Elemento> processUserRequest(String userRequest) {
		String[] userText = userRequest.split(" ");
		String orderRequest = userText[0];
		Optional<List<Elemento>> elementos = null;

		switch (orderRequest) {
		case "/search":
			elementos = this.elementoRepository.findByNbElemento(userText[1]);
			break;


		default:
			break;
		}
		return elementos.get();

	}
}