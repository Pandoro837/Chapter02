package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		/* 아이유, 좋은날 ( Real, 2010, 3번 track, 이민수 작곡 ) 
		 * BIGBANG, 거짓말 ( Always, 2007, 2번 track, G-DRAGON 작곡 ) 
		 * 버스커버스커, 벚꽃엔딩 (버스커버스커1집, 2012, 4번 track, 장범준 작곡 )
		 */
		
		Song iu = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		Song big = new Song(2007, 2);
		Song bus = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커 1집", "장범준");
		big.setAlbum("Always");
		big.setArtist("BIGBANG");
		big.setTitle("거짓말");
		big.setComposer("G-DRAGON");
		
		bus.setYear(2012);
		bus.setTrack(4);
		
		iu.showInfo();
		big.showInfo();
		bus.showInfo();
	}

}
