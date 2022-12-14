/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicionumero2.distribuidorDAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ernesto
 */
public class conexion {
    String strConexionDB="jdbc:sqlite:C:/db/pruebas_dp.s3db";
    Connection conn= null;
    
    public conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion" + e);
        }
    }
    
    public int insertarDatos(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
            
        }catch(SQLException e){
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta =  pstm.executeQuery();
            return respuesta;
            
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
}