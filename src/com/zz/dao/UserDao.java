package com.sxt.dao;

import com.sxt.po.User;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDao {
    private HibernateTemplate hibernateTemplate;

    public void add(User u){
        System.out.println("UserDao.add()");
        hibernateTemplate.save(u);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
