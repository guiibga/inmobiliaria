CREATE TABLE INMUEBLE (
       COD_ID CHAR(10) NOT NULL
     , CALLE CHAR(20)
     , LOCALIDAD CHAR(20)
     , FECHA_ALTA CHAR(10)
     , SUPERFICIE_TOTAL CHAR(10)
     , VENTA_ALQUILER CHAR(10)
     , PRIMARY KEY (COD_ID)
);

CREATE TABLE PISO (
       COD_ID CHAR(10) NOT NULL
     , NUM_HABITACIONES CHAR(10)
     , PRIMARY KEY (COD_ID)
     , CONSTRAINT FK_PISO_1 FOREIGN KEY (COD_ID)
                  REFERENCES INMUEBLE (COD_ID)
);

