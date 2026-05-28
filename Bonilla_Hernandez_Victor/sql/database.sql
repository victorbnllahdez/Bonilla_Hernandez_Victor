CREATE TABLE AGENCIAS(
id_agencias INTEGER(4),
nombre VARCHAR(20),
pais VARCHAR(20),
fecha_fundacion VARCHAR(15),
autor_examen VARCHAR(150) NOT NULL,
CONSTRAINT PK_AGENCIAS PRIMARY KEY(id_agencias)
);

CREATE TABLE SATELITES(
id_satelites INTEGER(4),
nombre VARCHAR(20),
orbita VARCHAR(20),
peso VARCHAR(20),
coste VARCHAR(20),
activo VARCHAR(20),
fecha_lanzamiento VARCHAR(20),
id_agencia INTEGER(4),
autor_examen VARCHAR(150) NOT NULL,
CONSTRAINT PK_SATELITES PRIMARY KEY(id_satelites),
CONSTRAINT FK_SATELITES_id_agencia FOREIGN KEY (id_agencia) REFERENCES AGENCIAS(id_agencia),
);

CREATE TABLE DETALLE_SATELITE(
id_detalle_satelite INTEGER(4),
velocidad_maxima VARCHAR(20),
combustible VARCHAR(20),
vida_util VARCHAR(20),
temperatura_maxima VARCHAR(20),
autor_examen VARCHAR(150) NOT NULL,
CONSTRAINT PK_DETALLE_SATELITE PRIMARY KEY(id_detalle_satelite),
CONSTRAINT FK_DETALLE_SATELITE_id_satelite UNIQUE FOREIGN KEY (id_satelite) REFERENCES SATELITES(id_satelites),
);











