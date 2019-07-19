package com.student.StudentProjectHibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {
	
	

	public int  saveStudent (StudentDto student) {
		
		Configuration cfg = new Configuration().configure();
		//cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		//save a object here
		//save method return the primary key
		Serializable returnpk = session.save(student);
		// downcast the pk
		Integer id = (Integer)returnpk;
		tx.commit();
		factory.close();
		session.close();
	    return id;
		
	}
	
	public StudentDto fetchStudent(int pk) {
		
		Configuration cfg = new Configuration().configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		StudentDto student = session.get(StudentDto.class, pk);
		
		return student;
		
	}
	
	public  void updateStudent(StudentDto s)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		StudentDto student = session.get(StudentDto.class, s.getId());
		
		String email = s.getEmail();
	    String name =	s.getName();
		String stream = s.getStream();
		 
		
			student.setName(name);
			student.setEmail(email);
			student.setStream(stream);
		
		 
		session.update(student);
		
		
		trans.commit();
		
		
	}
	public void  deleteStudent(int pk) {
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory Fact = config.buildSessionFactory();
		
		 Session session = Fact.openSession();
		 
		 Transaction tx = session.beginTransaction();
		StudentDto st1 = session.get(StudentDto.class,1);
		
		
		
		 session.delete(st1);
		 System.out.println("deleted");
		 
		 tx.commit();
		
	}
	
	
}
