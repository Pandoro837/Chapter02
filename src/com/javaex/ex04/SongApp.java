package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		
		/*
		 * 아이유, 좋은날 ( Real, 2010, 3번 track, 이민수 작곡 ) BIGBANG, 거짓말 ( Always, 2007, 2번
		 * track, G-DRAGON 작곡 ) 버스커버스커, 벚꽃엔딩 (버스커버스커1집, 2012, 4번 track, 장범준 작곡 )
		 */

		Song iu = new Song();
		
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");
		
		Song big = new Song();
		
		big.setArtist("BIGBANG");
		big.setTitle("거짓말");
		big.setAlbum("Always");
		big.setYear(2007);
		big.setTrack(2);
		big.setComposer("G-DRAGON");
		
		Song bus = new Song();
		
		bus.setArtist("버스커버스커");
		bus.setTitle("벚꽃엔딩");
		bus.setAlbum("버스커버스커1집");
		bus.setYear(2012);
		bus.setTrack(4);
		bus.setComposer("장범준");

		iu.showInfo();
		big.showInfo();
		bus.showInfo();
		
	}

}
