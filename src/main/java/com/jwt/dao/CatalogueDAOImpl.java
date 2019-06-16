package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.Catalogue;

@Repository
@Transactional
public class CatalogueDAOImpl implements CatalogueDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Catalogue> getAllCatalogues() {

		return sessionFactory.getCurrentSession().createQuery("from Catalogue").list();
	}

}