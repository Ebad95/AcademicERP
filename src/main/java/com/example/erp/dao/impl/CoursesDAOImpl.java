package com.example.erp.dao.impl;

import com.example.erp.bean.Courses;
import com.example.erp.dao.CoursesDAO;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class CoursesDAOImpl implements CoursesDAO {

    @Override
    public void addCourse(Courses course) {
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
            Integer id  = (Integer)session.save(course);
            System.out.println("Course created with id:"+id);
            session.getTransaction().commit();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }
    }
    @Override
    public List<Courses> getCourse() {
        List<Courses> cou=null;
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
            cou=session.createQuery("from Courses").list();
            session.getTransaction().commit();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }
        return cou;
    }
}
