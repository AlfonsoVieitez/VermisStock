create database Vermis;
use Vermis;
select * from inventarioOLD;
select * from inventarioOLD where Localizacion like 'Aula Ordenadores' ; -- sacar que hay en aulaOrdenadores
select * from inventarioOLD where zona = 1;  -- sacar lo que hay en zona1
select * from inventarioOLD where elemento like '%micro%'; -- sacar lo que hay que se parezca a...
select * from inventarioOLD where elemento like '%alicates%';


