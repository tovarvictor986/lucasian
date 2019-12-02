package Administradora;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.util.List;

import Administradora.File.Files;
import Administradora.Models.Administradora;
import Administradora.Util.*;

public class App {
	public static void main(String[] args) throws IOException {
		OracleCon oracleCon = new OracleCon();
		Connection con = oracleCon.connect();
		System.out.println("conexion " + con);
		Files files = new Files();
		String routeLog = Constants.routeLogs;
		File file = new File(routeLog);
		FileOutputStream fos = new FileOutputStream(file);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
//		files.createFile(routeLog);
		Validations validations = new Validations();
		List<Administradora> lstAdministradora = files.LoadFile(Constants.routeFile);
		int i = 1;
		
		for (Administradora adm : lstAdministradora) {
			boolean insert = true;
			boolean flagCodigo = validations.validateString(adm.getCodigo(), 20);
			boolean flagNombre = validations.validateString(adm.getNombre(), 200);
			boolean flagCodTpId = validations.validateString(adm.getCodTpId(), 2);
			boolean flagCodTpId2 = validations.validateValue(adm.getCodTpId(), new String[] { "NI", "CC", "PA", "RC" });
			boolean flagNroId = validations.validateString(adm.getNroId(), 50);
			boolean flagNaturaleza = validations.validateString(adm.getNaturaleza(), 20);
			boolean flagNaturaleza2 = validations.validateValue(adm.getNaturaleza(),
					new String[] { "PRIVADA", "MIXTA", "PUBLICA" });
			boolean flagMultipleArp = validations.validateBoolean(adm.getMultipleARP());
			boolean flagFSP = validations.validateBoolean(adm.getFsp());
			boolean flagFusionada = validations.validateBoolean(adm.getFusionada());
			boolean flagFechaFusion = validations.validateDate(adm.getFechaFusion(), "dd/MM/yyyy");
			if (!flagCodigo) {
				bw.write("Error en la linea " + i + " campo Codigo \n");
				insert=false;
			}
			if (!flagNombre) {
				bw.write("Error en la linea " + i + " campo Nombre \n");
				insert=false;
			}
			if (!flagCodTpId || !flagCodTpId2) {
				bw.write("Error en la linea " + i + " campo Codigo Tp Id \n");
				insert=false;
			}
			if (!flagNroId) {
				bw.write("Error en la linea " + i + " campo Nro Id \n");
				insert=false;
			}
			if (!flagNaturaleza || !flagNaturaleza2) {
				bw.write("Error en la linea " + i + " campo Naturaleza \n");
				insert=false;
			}
			if (!flagMultipleArp) {
				bw.write("Error en la linea " + i + " campo Multiple Arp \n");
				insert=false;
			}
			if (!flagFSP) {
				bw.write("Error en la linea " + i + " campo Multiple FSP \n");
				insert=false;
			}
			if (!flagFusionada) {
				bw.write("Error en la linea " + i + " campo Fusionada \n");
				insert=false;
			}
			if (!flagFechaFusion) {
				bw.write("Error en la linea " + i + " campo Fecha Fusion \n");
				insert=false;
			}
			i++;			
			if(insert) {
				oracleCon.queryInsertt(adm);
			}
		}
		bw.close();

	}
}
