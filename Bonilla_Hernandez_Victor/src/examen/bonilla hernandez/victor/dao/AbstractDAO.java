package bonilla hernandez.victor.dao;

import bonilla hernandez.victor.beans.Satelite;

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
}
