package Administradora.File;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Administradora.Models.Administradora;

public class Files {

	public List<Administradora> LoadFile(String ruta) {
		List<Administradora> lstAdministradora = new ArrayList<Administradora>();
		try {
			Scanner input = new Scanner(new File(ruta));
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] row = line.split(";");
				Administradora administradora = new Administradora();
				administradora.setCodigo(row[0]);
				administradora.setNombre(row[1]);
				administradora.setCodTpId(row[2]);
				administradora.setNroId(row[3]);
				administradora.setNaturaleza(row[4]);
				administradora.setMultipleARP(row[5]);
				administradora.setFsp(row[6]);
				administradora.setFusionada(row[7]);
				administradora.setFechaFusion(row[8]);
				lstAdministradora.add(administradora);
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return lstAdministradora;
	}

	public void createFile(String routeFile) {
		File file = new File(routeFile);//"D:/Log.txt"
	}
	

}
