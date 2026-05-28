package org.example.victor.dao;



import org.example.victor.beans.Agencia;
import org.example.victor.beans.Satelite;
import org.example.victor.motores.MotorSQL;
import org.example.victor.motores.MotorFactory;

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
                    "FROM satelites " +
                    "WHERE agencia = ? ";


    public void check() {
        try {
            motorSQL.connect();
            if (motorSQL.conn != null &&
                    !motorSQL.conn.isClosed()) {
                System.out.println("CONEXION OK");
            }
        } catch (Exception e) {
            printError(e);
        } finally {
            motorSQL.close();
        }
    }

    public SateliteDAOImpl(
            MotorSQL motorSQL) {
        super(motorSQL);
    }

    @Override
    public ArrayList<Satelite> findSateliteByAgencia(Agencia agencia) {
        return null;
    }

    @Override
    public Satelite findSateliteWithDetail(int idSatelite) {
        return null;
    }


    @Override
    public void add(Satelite satelite) {
        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_INSERT);
            motorSQL.getPs().setString(1, satelite.getNombre());
            motorSQL.getPs().setString(2, satelite.getOrbita());
            motorSQL.getPs().setString(3, satelite.getPeso());
            motorSQL.getPs().setString(4, satelite.getCoste());
            motorSQL.getPs().setString(5, satelite.getActivo());

            int rows = motorSQL.executeUpdate();
            System.out.println(
                    "INSERTADOS: " +
                            rows);


        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }
    }

    @Override
    public void update(
            int id,
            Satelite satelite) {
        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_UPDATE);
            motorSQL.getPs().setString(
                    1,
                    satelite.getNombre());
            motorSQL.getPs().setString(
                    2,
                    satelite.getOrbita());
            motorSQL.getPs().setString(
                    3,
                    satelite.getPeso());
            motorSQL.getPs().setString(
                    4,
                    satelite.getCoste());
            motorSQL.getPs().setString(
                    5,
                    satelite.getActivo());
            int rows =
                    motorSQL.executeUpdate();
            System.out.println(
                    "ACTUALIZADOS: " +
                            rows);
        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }
    }

    @Override
    public void delete(int id) {

        try{

            motorSQL.connect();

            motorSQL.prepare(SQL_DELETE);

            motorSQL.getPs().setInt(
                    1,
                    id);

            int rows =
                    motorSQL.executeUpdate();

            System.out.println(
                    "BORRADOS: " +
                            rows);

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }
    }

    @Override
    public Satelite find(int id) {

        Satelite satelite = null;

        try{
            motorSQL.connect();
            motorSQL.prepare(SQL_FIND);
            motorSQL.getPs().setInt(
                    1,
                    id);
            ResultSet rs =
                    motorSQL.executeQuery();
            if(rs.next()){

                satelite =
                        mapSatelite(rs);
            }

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }

        return satelite;
    }

    @Override
    public ArrayList<Satelite> findAll() {

        ArrayList<Satelite> satelites =
                new ArrayList<>();

        try{

            motorSQL.connect();

            motorSQL.prepare(SQL_FIND_ALL);

            ResultSet rs =
                    motorSQL.executeQuery();

            while(rs.next()){

                satelites.add(
                        mapSatelite(rs));
            }

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }

        return satelites;
    }
    @Override
    public ArrayList<Satelite> findByAgencia(Agencia agencia) {

        ArrayList<Satelite> satelites =
                new ArrayList<>();

        try{

            motorSQL.connect();
            motorSQL.getPs().setString(
                    1,
                    agencia.toString());

            ResultSet rs =
                    motorSQL.executeQuery();

            while(rs.next()){

                satelites.add(
                        mapSatelites(rs));
            }

        }catch (Exception e){

            printError(e);

        }finally {

            motorSQL.close();
        }

        return satelites;
    }

    private Satelite mapSatelites(ResultSet rs) {

        return null;
    }

    @Override
    public Satelite findDetalleSateliteBySatelite(int idSatelite) {
        Satelite satelite = new Satelite();
        try{
            motorSQL.connect();
            motorSQL.getPs().setInt(
                    1,
                    idSatelite);
            ResultSet rs =
                    motorSQL.executeQuery();
            if(rs.next()){
                satelite.setId(rs.getInt(1));
                satelite.setNombre(rs.getString(2));
                satelite.setOrbita(rs.getString(3));
                satelite.setPeso(rs.getString(4));
                satelite.setCoste(rs.getString(5));
                satelite.setActivo(rs.getString(6));

                satelite.getDetalle().
                        setId(rs.getInt(7));
                satelite.getDetalle().
                        getCombustible(rs.getString(8));

                satelite.getDetalle().
                        setCombustible(rs.getString(9));
                satelite.getDetalle().
                        setVelocidadMaxima(rs.getString(10));
                satelite.getDetalle().
                        setVidaUtil(rs.getString(11));
            }
        }catch (Exception e){
            printError(e);
        }finally {
            motorSQL.close();
        }
        return satelite;
    }
    private Satelite mapSatelite(
            ResultSet rs)
            throws Exception {

        Satelite satelite =
                new Satelite();

        satelite.setId(
                rs.getInt("id"));

        satelite.setNombre(
                rs.getString("nombre"));

        satelite.setOrbita(
                rs.getString("orbita"));

        satelite.setPeso(
                rs.getString("peso"));

        satelite.setCoste(
                rs.getString("coste"));

        satelite.setActivo(
                rs.getString("activo"));

        return satelite;
    }
    public static void main(String[] args){
        SateliteDAOImpl sateliteDAO =
                new SateliteDAOImpl(MotorFactory.
                        create(MotorFactory.ORACLE));
    }





        }