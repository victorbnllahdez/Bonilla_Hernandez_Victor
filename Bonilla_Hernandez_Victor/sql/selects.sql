SELECT
S.id_satelites,
S.nombre,
S.orbita,
S.peso, 
S.coste, 
S.activo,
S.fecha_lanzamiento,
S.autor_examen,

D.id_detalle_satelite, 
D.velocidad_maxima, 
D.combustible, 
D.vida_util,
D.IDIOMA_temperatura_max 


FROM SATELITES S 
INNER JOIN DETALLE_SATELITE D
ON S.ID = D.id_satelites
WHERE S.id_satelites = ?
ORDER BY S.id_satelites;


SELECT * FROM SATELITES
ORDER BY id_satelites;

SELECT * FROM SATELITES
WHERE id_satelites = ?

SELECT * FROM SATELITES
WHERE id_agencia = ?


