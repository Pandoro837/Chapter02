package com.javaex.ex08;

public class Tv {
	
//	필드
	private int channel;
	private int volume;
	private boolean power;
	
// 생성자
	public Tv() {
	//default	
	}
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
//	겟터
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
//	메소드 - 일반
//	파워
	public void power(boolean on) {
		if(on == true) {
			this.power = on;
		} else {
			this.power = false;
		}
	}
	
	public void channel(int channel) {
		if( 1<= channel && channel <= 255) {
			this.channel = channel;
		} else if(channel <= 0) {
			this.channel = 1;
		} else {
			this.channel = 255;
		}
	}
	
	public void channel(boolean up) {
		if(up == true && this.channel < 255) {
			this.channel++;	
		} else if(up == false && this.channel > 1) {
			this.channel--;
		}
	}
	
	public void volume(int volume) {
		if( 0 < volume && volume <= 100) {
			this.volume = volume;
		} else if(volume <= 0) {
			this.volume = 0;
		} else {
			this.volume = 100;
		}
	}
	
	public void volume(boolean up) {
		if(up == true && this.volume < 100) {
				this.volume++;	
		} else if(up == false && this.volume > 0) {
			this.volume--;
		}
	}
	
	public void status() {
		String power;
		if(this.power == true) {
			power = "on";
			System.out.println("현재 채널: " + channel + ", 볼륨: " + volume + ", 전원: " + power);
		} else {
			power = "off";
			System.out.println("현재 채널: " + channel + ", 볼륨: " + volume + ", 전원: " + power);
		}
	}
	
}

