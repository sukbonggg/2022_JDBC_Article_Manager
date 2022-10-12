package com.koreaIT.example.JAM.service;

import java.sql.Connection;

import com.koreaIT.example.JAM.dao.ArticleDao;
import com.koreaIT.example.JAM.util.DBUtil;
import com.koreaIT.example.JAM.util.SecSql;

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

}

