package practice;

import java.time.LocalDate;
import java.time.temporal.ChronoField;


/*
 * 
 * link: https://leetcode.com/problems/day-of-the-year/
 * YYYY-MM-DD
 */
public class DayOfTheYear {

	 public int dayOfYear(String date) {
	     LocalDate input= LocalDate.parse(date);
		 return input.get(ChronoField.DAY_OF_YEAR);
	   }
	
	public static void main(String[] args) {
		DayOfTheYear dayOfTheYear =new DayOfTheYear();
		int d= dayOfTheYear.dayOfYear("2019-01-09");
		System.out.println(d);

	}

}
