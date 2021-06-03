package com.javaex.ex07;

public class Song {
	// 필드
	private String title, artist, album, composer;
	private int year, track;

	// 생성자
	public Song() {

	}

	public Song(String artist, String title, String album, int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public Song(int year, int track) {
		this.year = year;
		this.track = track;
	}

	public Song(String artist, String title, String album, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
	}

	// 겟터셋터
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드 - 일반
	public void showInfo() {
		System.out.println(
				artist + ", " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}

}
