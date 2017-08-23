package ch7;

public class Operator13 {

	
	public static void main(String[] args) {
		Time time = new Time(12, 35, 30);
		System.out.println(time);
		time.setHour(time.getHour()+1);
		System.out.println();
	}
}

class Time{
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		hour = getHour();
		minute = getMinute();
		second = getSecond();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour > 23 || hour < 0) return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute > 59 || minute < 0) return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second > 59 || second < 0) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
