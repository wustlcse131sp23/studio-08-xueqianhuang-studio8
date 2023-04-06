package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	

	public static void main(String[] args) {
		Date day1 = new Date(2000, 3, 29 ,true);
		Date day2 = new Date(2000,11,22,true);
		
		Time time1 = new Time(45, 23, 12, true);
		Time time2 = new Time(59, 48, 13, false);
		
		Appointment app1 = new Appointment(day1, time1);
		Appointment app2 = new Appointment(day2, time2);
		
		System.out.println(app1.equals(app2));
		System.out.println(app1.hashCode());
		System.out.println(app2.hashCode());

	}

}
