package ch7;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean powerChange() {
		return !isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		prevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_CHANNEL)
			return;
		this.volume = volume;
	}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
}

public class Exercise10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println(t.getChannel());
		t.setVolume(20);
		System.out.println(t.getVolume());
	}

}
//12번 c
//13번 몇개의 스태틱 멤버로 구성되어있기 때문에 멤버를 많이 만들 필요가 없다. 

