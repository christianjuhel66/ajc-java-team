create database if not exists Agence_db;
use Agence_db;

drop table if exists Artisan;
create table Artisan
	(
		 id int primary key auto_increment,  
		 nom varchar(50) default "no_nom",
 		 prenom varchar(50) default "no_prenom",
 		 adresse varchar(50) default "no_adresse",
 		 age int default -1 
	);
	
	insert into Artisan(nom,prenom,adresse,age) values ("David","Yang","Rue de France",10);
	insert into Artisan(nom,prenom,adresse,age) values ("Julien","Dupont","Rue de Marseille",12);
	insert into Artisan(nom,prenom,adresse,age) values ("Franck","Petit","Rue de Nice",9);

