package com.indizen.curso;

import java.io.IOException;
import java.util.Properties;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try
		{
			Properties properties = new Properties();
			properties.load(App.class.getClassLoader().getResourceAsStream("config.properties"));
			System.out.println( "Estoy en : "+ properties.getProperty("message_init"));
    	}catch (IOException e) {
			System.out.println("Error al cargar el ficheros de propiedades "+e.getMessage());
		}
	}
}
