package com.javaex.ex04;

public class Song {
	//필드
	private String title, artist, album, composer;
	private int year, track;
	
	//겟터셋터
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println(artist + ", " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )" );
	}
	
	
}
