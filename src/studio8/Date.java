package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	private boolean isholiday;
	
	public Date(int year, int month, int day, boolean isholiday) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.isholiday = isholiday;
		
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}



	public String toString() {
		String a = this.month + "/" + this.day + "/" + this.year;
		if(this.isholiday) {
			a = a + " is a holiday.";
			return a;
		}
		else {
			a = a + " is not a holiday.";
			return a;
		}
	}
	
    public static void main(String[] args) {
    	LinkedList<Date> list = new LinkedList<Date>();
    	HashSet<Date> set = new HashSet<Date>();
     	
    	Date day1 = new Date(2000, 3, 29 ,true);
    	Date day2 = new Date(2023,4,6,false);
    	Date day3 = new Date(2000,11,22,false);
    	Date day4 = new Date(2000,11,22,true);
    	
    	list.add(day1);
    	list.add(day2);
    	list.add(day1);
    	list.add(day4);
    	
    	set.add(day1);
    	set.add(day2);
    	set.add(day1);
    	
    	System.out.println(set);
    	
    	System.out.println(day1);
    	System.out.println(day2);
    	
    	System.out.println(day1.hashCode());
    	System.out.println(day2.hashCode());
    	
    	System.out.println(day1.equals(day3));
    	System.out.println(day2.equals(day4));
    	
    	
    }

}
