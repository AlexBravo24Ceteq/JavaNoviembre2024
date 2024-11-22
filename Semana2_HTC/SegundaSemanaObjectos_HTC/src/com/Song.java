package com;

public class Song {

	private String title;
	private String album;
	private String author;
	private int releaseDate;
	
	public Song() {
		
	}
	
	
	public Song(String title, String album, String author, int releaseDate) {
		super();
		this.title = title;
		this.album = album;
		this.author = author;
		this.releaseDate = releaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", author=" + author + ", releaseDate=" + releaseDate
				+ "]";
	}
	
	
	
	
}
