DROP TABLE IF EXISTS FABRICANTES;
-- DROP TABLE IF EXISTS ARTICULOS;

CREATE TABLE FABRICANTES (
Codigo INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(100));

-- CREATE TABLE ARTICULOS (
-- Codigo INT AUTO_INCREMENT PRIMARY KEY,
-- Nombre VARCHAR(100),
-- Precio INT(20),
-- CodigoFabricante INT,
-- KEY (CodigoFabricante),
-- FOREIGN KEY (CodigoFabricante) REFERENCES FABRICANTES (Codigo) ON DELETE CASCADE ON UPDATE CASCADE
-- );

INSERT INTO FABRICANTES (Nombre) VALUES ('Fabricante Sergio');
INSERT INTO FABRICANTES (Nombre) VALUES ('Fabricante Javier');
INSERT INTO FABRICANTES (Nombre) VALUES ('Fabricante Matías');
INSERT INTO FABRICANTES (Nombre) VALUES ('Fabricante Laura');
INSERT INTO FABRICANTES (Nombre) VALUES ('Fabricante Tatiana');

-- INSERT INTO ARTICULOS (Nombre, Precio, CodigoFabricante) VALUES ('Articulo1', 20, 1);
-- INSERT INTO ARTICULOS (Nombre, Precio, CodigoFabricante)  VALUES ('Articulo2', 20, 2);
-- INSERT INTO ARTICULOS (Nombre, Precio, CodigoFabricante)  VALUES ('Articulo3', 20, 3);
-- INSERT INTO ARTICULOS (Nombre, Precio, CodigoFabricante)  VALUES ('Articulo4', 20, 4);
-- INSERT INTO ARTICULOS (Nombre, Precio, CodigoFabricante)  VALUES ('Articulo5', 20, 5);