package com.lanking.yc.dao.auth.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lanking.cloud.component.db.support.hibernate.Repo;
import com.lanking.cloud.component.db.support.hibernate.dao.AbstractHibernateDAO;
import com.lanking.yc.dao.auth.SessionDAO;
import com.lanking.yc.domain.auth.Session;

@Component("sessionDAO")
public class SessionDAOImpl extends AbstractHibernateDAO<Session, Long> implements SessionDAO {

	@Autowired
	@Qualifier("SessionRepo")
	@Override
	public void setRepo(Repo<Session, Long> repo) {
		this.repo = repo;
	}
}
