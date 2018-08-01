package com.illia.dao;

import com.illia.model.Category;
import com.illia.services.CategoryService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Category> findAll(){
        return sessionFactory
                .getCurrentSession()
                .createQuery("from Category")
                .list();
    }

    public Category findById(Long cId) {
        return sessionFactory
                .getCurrentSession()
                .find(Category.class, cId);
    }


}
