package com.koreaIT.example.JAM;

import java.time.LocalDateTime;
import java.util.Map;

public class Article extends Object {

	public int id;
	public String title;
	public String body;
	public LocalDateTime regDate;
	public LocalDateTime updateDate;
	public int memberId;
	public String writerName;

	public Article(Map<String, Object> articleMap) {
		this.id = (int) articleMap.get("id");
		this.regDate = (LocalDateTime) articleMap.get("regDate");
		this.updateDate = (LocalDateTime) articleMap.get("updateDate");
		this.title = (String) articleMap.get("title");
		this.body = (String) articleMap.get("body");
		this.memberId = (int) articleMap.get("memberId");
		this.writerName = (String) articleMap.get("writerName");
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + ", regDate=" + regDate + ", updateDate="
				+ updateDate + ", memberId=" + memberId + "]";
	}
}
