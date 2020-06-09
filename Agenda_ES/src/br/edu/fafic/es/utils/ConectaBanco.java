/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.es.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yurir
 */
public class ConectaBanco {
    
    public Connection conn;
    public Statement stm;
    public ResultSet rs;
    
    
    private final String Driver = "com.mysql.cj.jdbc.Driver";
    //private final String url = "jdbc:mysql://localhost:3306/projeto_engenharia";
    private final String url = "jdbc:mysql://localhost:3306/projeto_engenharia?useTimezone=true&serverTimezone=America/Sao_Paulo";
    private final String root = "root";
    private final String senha = "12345";
    
    
    public void conecta(){
        try {
            System.setProperty("jdbc.Driver", Driver);
            conn = DriverManager.getConnection(url, root, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        ConectaBanco conectaBD = new ConectaBanco();
        conectaBD.conecta();
        conectaBD.desconecta();
    }
}
