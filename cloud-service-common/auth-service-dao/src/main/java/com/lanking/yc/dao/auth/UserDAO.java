package com.lanking.yc.dao.auth;

import com.lanking.cloud.component.db.support.hibernate.dao.IHibernateDAO;
import com.lanking.yc.domain.auth.User;

public interface UserDAO extends IHibernateDAO<User, Long> {

	User findByAccountId(long accountId);
}