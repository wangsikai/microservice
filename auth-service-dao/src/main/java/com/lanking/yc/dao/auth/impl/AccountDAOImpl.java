package com.lanking.yc.dao.auth.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lanking.cloud.component.db.support.hibernate.Repo;
import com.lanking.cloud.component.db.support.hibernate.dao.AbstractHibernateDAO;
import com.lanking.cloud.sdk.data.Params;
import com.lanking.yc.dao.auth.AccountDAO;
import com.lanking.yc.domain.auth.Account;

@Component("accountDAO")
public class AccountDAOImpl extends AbstractHibernateDAO<Account, Long> implements AccountDAO {

	@Autowired
	@Qualifier("AccountRepo")
	@Override
	public void setRepo(Repo<Account, Long> repo) {
		this.repo = repo;
	}

	@Override
	public Account findByUsername(String username) {
		return repo.find("$findByUsername", Params.param("username", username)).get();
	}

	@Override
	public Account findByMobile(String mobile) {
		return repo.find("$findByMobile", Params.param("mobile", mobile)).get();
	}

	@Override
	public Account findByEmail(String email) {
		return repo.find("$findByEmail", Params.param("email", email)).get();
	}

}
