package com.titans.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.titans.data.HibernateSession;
import com.titans.util.HibernateUtil;

@Component
@Aspect
public class HibernateAspect {
	@Autowired
	private HibernateUtil hu;
	
	@Around("allDaoObjects()")
	public Object manageSession(ProceedingJoinPoint pjp) throws Throwable{
		Object obj = null;
		Session session = hu.getSession();
		Transaction tx = session.beginTransaction();
		HibernateSession hs = (HibernateSession) pjp.getThis();
		hs.setSession(session);
		
		try {
			obj = pjp.proceed();
		} catch (Throwable t) {
			tx.rollback();
			session.close();
			throw t;
		}
		tx.commit();
		session.close();
		hs.setSession(null);
		return obj;
	}
	
	@Pointcut("execution(* com.titans.data..*(..)) && "
			+" !execution(* com.titans.data..setSession(..))")
	public void allDaoObjects() {}
	
}
