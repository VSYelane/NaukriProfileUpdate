package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility {
	public String getSystemDateInformat() {
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		String date = f.format(d);
		return date;
	}
	
}
