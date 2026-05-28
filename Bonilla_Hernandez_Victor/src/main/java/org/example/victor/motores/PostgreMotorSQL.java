package org.example.victor.motores;

import java.sql.DriverManager;

public class PostgreMotorSQL extends MotorSQL {
    private static final String URL =
            "bonilla-hernandez-dam.clugbyfnus07.us-east-1.rds.amazonaws.com";
    private static final String USER =
            "postgres";
    private static final String PASSWORD =
            "postgres";
    private static final String DRIVER =
            "org.postgresql.Driver";
    public PostgreMotorSQL(){
        super(
                URL,
                USER,
                PASSWORD,
                DRIVER
        );
    }
    @Override
    public void connect(){
        try{
            Class.forName(driver);
            conn =
                    DriverManager.getConnection(
                            url,
                            user,
                            password
                    );
            System.out.println(
                    "CONEXIÓN OK");
        }catch (Exception e){
            System.out.println(
                    e.getMessage());
        }
    }
}