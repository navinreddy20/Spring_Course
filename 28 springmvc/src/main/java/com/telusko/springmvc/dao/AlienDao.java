package com.telusko.springmvc.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.telusko.springmvc.model.Alien;


@Component
public class AlienDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
public List<Alien> getAliens()
{
	Session session = sessionFactory.getCurrentSession();
	List <Alien> aliens = session.createQuery("from Alien",Alien.class).list();
	
	return aliens;
}
	@Transactional
	public void addAlien(Alien a)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(a);
	}
	
	
	@Transactional
	public Alien getAlien(int aid) 
	{
		Session session = sessionFactory.getCurrentSession();
		Alien a= session.get(Alien.class, aid);
		return a;
	}
}
