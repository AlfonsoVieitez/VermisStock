SELECT * FROM VermislabStock.elemento;
USE VermislabStock;
SELECT * FROM elemento;
SELECT * FROM elemento where almacen_elemento = 30 ; -- almacen 30
SELECT * FROM elemento where almacen_elemento = 20 && zona_elemento = 6; -- 
SELECT id_elemento, nb_elemento FROM elemento WHERE nb_elemento like '%caixa%';


SELECT el.nb_elemento, al.nb_almacen, zo.nb_zona, ba.nb_balda FROM elemento el, almacen al, zona zo, balda ba  WHERE nb_elemento like 'paz%';

SELECT el.nb_elemento, al.id_almacen, al.nb_almacen FROM elemento el, almacen al WHERE el.nb_elemento like 'Paz%' && (el.almacen_elemento = al.id_almacen) ;