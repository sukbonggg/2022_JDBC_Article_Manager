package com.koreaIT.example.JAM.service;

import java.sql.Connection;
import java.util.List;

import com.koreaIT.example.JAM.Article;
import com.koreaIT.example.JAM.dao.ArticleDao;

public class ArticleService {
	private ArticleDao articleDao;

	public ArticleService(Connection conn) {
		articleDao = new ArticleDao(conn);
	}

	public int doWrite(String title, String body) {
		return articleDao.doWrite(title, body);
	}

	public int doModify(int id, String title, String body) {
		return articleDao.doModify(id, title, body);
	}
	
	public void doDelete(int id) {
		articleDao.doDelete(id);
	}
	
	public boolean isArticleExists(int id) {
		return articleDao.isArticeExists(id);
	}

	public Article getArticle(int id) {
		
		return articleDao.getArticle(id);
	}

	public List<Article> getArticles() {
		
		return articleDao.getArticles();
	}

}

