package com.koreaIT.example.JAM;

public class Article extends Object{

	int id;
	String title;
	String body;

	public Article(int id, String title, String body) {
		this.id=id;
		this.title=title;
		this.body=body;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + "]";
	}
}
