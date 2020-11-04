package neobistasks.week1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GameTimeWithMinutes {
	public static void main(String[] args) throws ParseException {
		GameTimeWithMinutes.findGameDuration(7, 8, 9, 10);
		GameTimeWithMinutes.findGameDuration(7, 7, 7, 7);
		GameTimeWithMinutes.findGameDuration(7, 10, 8, 9);
		GameTimeWithMinutes.findGameDuration(7, 8, 5, 8); // ???

	}

	public static void findGameDuration(int startHour, int startMin, int endHour, int endMin) throws ParseException {
		String startTime = startHour + ":" + startMin;
		String endTime = endHour + ":" + endMin;
		System.out.println(startTime + " &  " + endTime);

		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse(startTime);
		Date date2 = format.parse(endTime);
		System.out.println(date1);

		long differenceMilSec = date2.getTime() - date1.getTime();
		long differenceMin = differenceMilSec / 60000;

		System.out.println(differenceMin);
		long min = 0;
		long hour = 0;
		if (differenceMin == 0) {
			System.out.println("The game lasted " + 24 + " hour(s)");
		}
		if (differenceMin > 0) {
			hour = differenceMin / 60;
			min = differenceMin - (hour * 60);
			System.out.println("The game lasted " + hour + " hour(s) and " + min + " minutes");

		}
		if (differenceMin < 0) { // add date
			SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			String startTime2 = "2016/10/10 " + startHour + ":" + startMin;
			String endTime2 = "2016/10/11 " + endHour + ":" + endMin;
			// System.out.println(startTime2);

			Date date11 = format2.parse(startTime2);
			Date date22 = format2.parse(endTime2);

			differenceMilSec = date22.getTime() - date11.getTime();
			differenceMin = differenceMilSec / 60000;
			hour = differenceMin / 60;
			min = differenceMin - (hour * 60);
			System.out.println("The game lasted " + hour + " hour(s) and " + min + " minutes");

		}

	}

}
