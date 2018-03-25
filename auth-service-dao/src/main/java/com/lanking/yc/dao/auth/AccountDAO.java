package com.lanking.yc.dao.auth;

import com.lanking.cloud.component.db.support.hibernate.dao.IHibernateDAO;
import com.lanking.yc.domain.auth.Account;

public interface AccountDAO extends IHibernateDAO<Account, Long> {

	Account findByUsername(String username);

	Account findByMobile(String mobile);

	Account findByEmail(String email);
}