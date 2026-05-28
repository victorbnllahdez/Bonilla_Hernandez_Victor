package bonilla hernandez.victor.dao;

import bonilla hernandez.victor.beans.Satelite;

import java.sql.ResultSet;
import java.util.ArrayList;


public class SateliteDAOImpl
        extends AbstractDAO<Satelite> {

    private static final String SQL_DETALLE_PELICULA =
            "SELECT " +
                    "S.id_satelites, " +
                    "S.nombre, " +
                    "S.orbita, " +
                    "S.peso, " +
                    "S.coste, " +
                    "S.activo, " +
                    "S.fecha_lanzamiento, " +
                    "S.autor_examen, " +

                    "D.id_detalle_satelite, " +
                    "D.velocidad_maxima, " +
                    "D.combustible, " +
                    "D.vida_util, " +
                    "D.IDIOMA_temperatura_max " +

                    "FROM SATELITES S " +

                    "INNER JOIN DETALLE_SATELITE D " +
                    "ON S.ID = D.id_satelites " +

                    "WHERE S.id_satelites = ? " +

                    "ORDER BY S.id_satelites";


    private static final String SQL_FIND_ALL =
            "SELECT * " +
                    "FROM SATELITES " +
                    "ORDER BY id_satelites";


    private static final String SQL_FIND =
            "SELECT * " +
                    "FROM SATELITES " +
                    "WHERE id_satelites = ?";



    private static final String SQL_INSERT =
            "INSERT INTO SATELITES " +
                    "(" +
                    "nombre, " +
                    "orbita, " +
                    "peso, " +
                    "coste, " +
                    "activo," +
                    "fecha_lanzamiento" +
                    ") " +
                    "VALUES " +
                    "(" +
                    "?, ?, ?,?, ?, ?" +
                    ")";


    private static final String SQL_UPDATE =
            "UPDATE SATELITES " +
                    "SET " +
                    "nombre = ?, " +
                    "orbita = ?, " +
                    "peso = ?, " +
                    "coste = ?, " +
                    "activo = ?, " +
                    "fecha_lanzamiento = ? " +
                    "WHERE id_satelites = ?";


    private static final String SQL_DELETE =
            "DELETE FROM SATELITES " +
                    "WHERE id_satelites = ?";


    private static final String SQL_FIND_BY_GENERO =
            "SELECT * " +
                    "FROM peliculas " +
                    "WHERE genero = ? " +
                    "ORDER BY titulo";
        }