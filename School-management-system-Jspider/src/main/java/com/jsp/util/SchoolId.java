package com.jsp.util;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SchoolId implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		Random r = new Random();
		return "SCH-2023-BNGLR-" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9);
	}

}
