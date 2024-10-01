CREATE TABLE profile_db.tritianos (
	id INT auto_increment NOT NULL,
	nombre varchar(50) NOT NULL,
	apellido varchar(50) NOT NULL,
	correo_electronico varchar(100) NOT NULL,
	telefono varchar(30) NULL,
	estado varchar(20) NOT NULL,
	enlace_bizneo varchar(255) NULL,
	enlace_hubspot varchar(255) NULL,
	enlace_jira varchar(255) NULL,
	created_at DATE NULL,
	CONSTRAINT tritianos_PK PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci;

TRUNCATE TABLE tritianos;

INSERT INTO tritianos (nombre, apellido, correo_electronico, telefono, estado, enlace_bizneo, enlace_hubspot, enlace_jira, created_at) VALUES 
('Alfonsina','Aravena','alfonsina@hotmail.com','+569112233','Activo','http://www.bizneo.com/aaravena','http://www.hubspot.com/aaravena','http://www.jira.com/aaravena', DATE_FORMAT(now(),'%Y-%m-%d')),
('Bernardo','Bustos','bbustos@yahoo.com','+569223344','Activo','http://www.bizneo.com/bbustos','http://www.hubspot.com/bbustos','http://www.jira.com/bbustos', DATE_FORMAT(now(),'%Y-%m-%d')),
('Carla','Cabezas','carla.cabezas@gmail.com','+569334455','Desactivado','http://www.bizneo.com/ccabezas','http://www.hubspot.com/ccabezas','http://www.jira.com/ccabezas', DATE_FORMAT(now(),'%Y-%m-%d')),
('Danilo','Durán','daniloduran@yahoo.es','+569445566','Activo','http://www.bizneo.com/dduran','http://www.hubspot.com/dduran','http://www.jira.com/dduran', DATE_FORMAT(now(),'%Y-%m-%d')),
('Elizabeth','Echeverría','echeverria.elizabeth@gmail.com','+569556677','Activo','http://www.bizneo.com/eecheverria','http://www.hubspot.com/eecheverria','http://www.jira.com/eecheverria', DATE_FORMAT(now(),'%Y-%m-%d')),
('Francisco','Fuentes','pancho@hotmail.com','+569667788','Activo','http://www.bizneo.com/ffuentes','http://www.hubspot.com/ffuentes','http://www.jira.com/ffuentes', DATE_FORMAT(now(),'%Y-%m-%d')),
('Gerardo','Gómez','ggomezt@yahoo.com','+569778899','Desactivado','http://www.bizneo.com/ggomez','http://www.hubspot.com/ggomez','http://www.jira.com/ggomez', DATE_FORMAT(now(),'%Y-%m-%d')),
('Humberto','Huerta','hhuerta@microsoft.com','+569889900','Activo','http://www.bizneo.com/hhuerta','http://www.hubspot.com/hhuerta','http://www.jira.com/hhuerta', DATE_FORMAT(now(),'%Y-%m-%d')),
('Ignacia','Izurieta','ignacia@hotmail.com','+569990011','Activo','http://www.bizneo.com/iizurieta','http://www.hubspot.com/iizurieta','http://www.jira.com/iizurieta', DATE_FORMAT(now(),'%Y-%m-%d')),
('Javiera','Jimenez','javi.jimenez@gmail.com','+569001122','Desactivado','http://www.bizneo.com/jjimenez','http://www.hubspot.com/jjimenez','http://www.jira.com/jjimenez', DATE_FORMAT(now(),'%Y-%m-%d'));
