package com.hyd.domain.repository;


public class LearnResouce {
    
	private String author;
    private String title;
    private String url;
    
    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LearnResouce(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
    	this.author=string;
    	this.title=string2;
    	this.url=string3;
	}
}
