package Practice;

import java.util.Date;

public class Practice26102024 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		String dateString = date.toString();
		String timeStampWithoutSpaces = dateString.replace(" ", "");
		System.out.println(timeStampWithoutSpaces);
		String timeStampWithoutSpacesAndColons = timeStampWithoutSpaces.replace(":", "");
		System.out.println(timeStampWithoutSpacesAndColons);
		long time = date.getTime();
		System.out.println(time);
		int toDayDate = date.getDate();
		System.out.println(toDayDate);
	}
	
}
