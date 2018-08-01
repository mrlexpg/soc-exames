package br.com.soc.persistencia.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Conexao {

	Connection con;  // Conexao ao Banco de Dados
	PreparedStatement stmt; // Acessa a Tabela ( insert, update, delete , select)
	ResultSet rs; // Consulta a Tabela( select )

	public void open() throws Exception{
		
		Properties prop = getProperties("database.properties");
		Class.forName(prop.getProperty("driver"));
		con = DriverManager.getConnection(prop.getProperty("url"), 
										  prop.getProperty("username"),prop.getProperty("password"));		
	}

	public void close() throws Exception{		
		con.close();
	}

    private Properties getProperties(String fileName) throws IOException {

		InputStream inputStream = getClass().getClassLoader().
				getResourceAsStream(fileName);

		Properties prop = new Properties();
		prop.load(inputStream);

		return prop;
	}
}