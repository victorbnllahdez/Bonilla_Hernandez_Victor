package org.example.victor.dao;




import org.example.victor.beans.Agencia;
import org.example.victor.beans.Satelite;
import org.example.victor.motores.MotorSQL;
import java.util.ArrayList;

public abstract class AbstractDAO<T>
        implements DAO<T> {
    protected MotorSQL motorSQL;
    public AbstractDAO(MotorSQL motorSQL) {
        this.motorSQL = motorSQL;
    }
    protected void printError(Exception e){
        System.out.println(
                "[ERROR] " +
                        e.getMessage());
    }
    /*
     * CONSULTAS AVANZADAS
     */
    public abstract ArrayList<T> findSateliteByAgencia(Agencia agencia);
    public abstract Satelite findSateliteWithDetail(int idSatelite);

    public abstract ArrayList<Satelite> findByAgencia(Agencia agencia);

    public abstract Satelite findDetalleSateliteBySatelite(int idSatelite);
}
