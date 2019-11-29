package Administradora;

import java.sql.Connection;

import Administradora.Util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        OracleCon oracleCon = new OracleCon();
        Connection con = oracleCon.connect();
        
        System.out.println("conexion "+con);
    }
}
