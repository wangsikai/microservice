package com.lanking.yc.dao.handwritingProxy;

import com.lanking.cloud.component.db.support.hibernate.dao.IHibernateDAO;
import com.lanking.yc.domain.handwritingProxy.HandwritingRecord;

public interface HandwritingRecordDAO extends IHibernateDAO<HandwritingRecord, Long> {

	void create(long id, String scgInk);

	void response(long id, String response);
}