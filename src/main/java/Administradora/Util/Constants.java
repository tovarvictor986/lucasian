package Administradora.Util;

public class Constants {

	public static final String user = "system";
	public static final String pass = "poderoso2019";
	public static final String jdbc = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String routeFile = "C:/FileInputCSV.csv";
	public static final String routeLogs = "D:/Log"+java.time.LocalDate.now()+".txt";

	private Constants() {
		throw new AssertionError();
	}
}
