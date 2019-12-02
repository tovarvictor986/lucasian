package Administradora.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validations {
	
	public Validations() {
		super();
	}

	public boolean validateDate(String dateToValidate, String dateFromat) {
		boolean flag = true;
		if (dateToValidate == null) {
			flag = false;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);

		try {
			Date date = sdf.parse(dateToValidate);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	public boolean validateBoolean(String bool) {
		boolean flag;
		if(bool.equals("1")||bool.equals("0")) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	
	public boolean validateString(String str, int lon) {
		boolean flag;
		if(str.length()<=lon){
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	
	public boolean validateValue(String str, String[] arrStr) {
		boolean flag = true;
		for(String s : arrStr) {
			if(s.equals(str)) {
				flag = true;
				System.out.println("entra");
				break;
			}else {
				flag = false;
			}
		}
		return flag;
	}
}
