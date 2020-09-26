package modelo.repositorio;

import java.sql.*;
import java.util.*;

public class FabricaConexao {

    protected Connection conexao;

    public FabricaConexao(){
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://lallah.db.elephantsql.com:5432/obgbuebz";
            Properties props = new Properties();
            props.setProperty("user", "obgbuebz");
            props.setProperty("password", "1vIzez72xLAJFNDwAhnl9RDm8XaSR3G1");

            this.conexao = DriverManager.getConnection(url, props);

            System.out.println("Conexão Criada com sucesso");
        } catch (Exception e) {
            System.out.println("erro ao criar  " + e.getMessage());
        }
    }

    public void fecharConexao(){
        try {
            if(conexao != null) {
                conexao.close();
            }
        }catch (Exception e){
            System.out.println("erro ao fechar conexão" + e.getMessage());
        }
    }



}
