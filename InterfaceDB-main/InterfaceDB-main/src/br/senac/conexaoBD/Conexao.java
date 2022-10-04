/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.conexaoBD;

import java.sql.*;//*importa biblioteca inteira

/**
 *
 * @author julio.gabardo
 */
public class Conexao {

    public static Connection Conector() {//metodo é usado no frmLogin para realizar a conexao,sendo chamado la
        Connection conexao = null;//variavel conexao
        String driver = "com.mysql.cj.jdbc.Driver";//informação do driver
        String url = "jdbc:mysql://localhost:3306/senac?characterEncoding=utf-8";//localhost= maquina local pode ser substituido por ip para server,senac é o nome do banco//* modificar a porta para fazer o teste,devera aparecer nao conectado se nao encontrar a conexao.
        String user = "admin";//usaurio e
        String password = "admin";//senha passagem por parametro

        try {
            Class.forName(driver);//puxando informações do conector do driver da biblioteca java
            conexao = DriverManager.getConnection(url, user, password);//conexao retornando as variasveis de url,senha e usaurio
            return conexao;//retorna variavel conexao
        } catch (Exception e) {
            System.out.println(e);//varial e retorna a informação de erro
            return null;
        }

    }
}
