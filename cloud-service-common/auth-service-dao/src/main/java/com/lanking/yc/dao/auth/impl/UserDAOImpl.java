package com.lanking.yc.dao.auth.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lanking.cloud.component.db.support.hibernate.Repo;
import com.lanking.cloud.component.db.support.hibernate.dao.AbstractHibernateDAO;
import com.lanking.cloud.sdk.data.Params;
import com.lanking.yc.dao.auth.UserDAO;
import com.lanking.yc.domain.auth.User;

@Component("userDAO")
public class UserDAOImpl extends AbstractHibernateDAO<User, Long> implements UserDAO {

	@Autowired
	@Qualifier("UserRepo")
	@Override
	public void setRepo(Repo<User, Long> repo) {
		this.repo = repo;
	}

	@Override
	public User findByAccountId(long accountId) {
		return repo.find("$findByAccountId", Params.param("accountId", accountId)).get();
	}
}
