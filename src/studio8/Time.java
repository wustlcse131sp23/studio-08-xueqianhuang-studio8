package studio8;

import java.util.Objects;

public class Time {
	private int second;
	private int minute;
	private int hour;
	private boolean is24hour;

	public Time(int second, int minute, int hour , boolean is24hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
		this.is24hour = is24hour;
	}
	
	public String toString() {
		String a;
		String b;
		if(this.is24hour) {
			a = this.hour + ":" + this.minute + ":" + this.second;
			return a;
		}
		else {
			if(this.hour > 12)
				b = (this.hour - 12) + ":" + this.minute + ":" + this.second;
			else 
				b = this.hour + ":" + this.minute + ":" + this.second;
			return b;
		}
	}
	
	public static void main(String[] args) {
		Time time1 = new Time(45, 23, 12, true);
		Time time2 = new Time(59, 48, 13, false);
		Time time3 = new Time(59, 48, 13, true);
		Time time4 = new Time(45, 23, 24, false);
    	
		System.out.println(time1);
		System.out.println(time2);
		
		System.out.println(time2.hashCode());
		System.out.println(time1.hashCode());
		
		System.out.println(time1.equals(time4));
		System.out.println(time2.equals(time3));
		
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && second == other.second;
	}

}