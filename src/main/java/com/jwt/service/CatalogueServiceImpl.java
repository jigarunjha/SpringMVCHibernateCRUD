package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.dao.CatalogueDAO;
import com.jwt.model.Catalogue;

@Service
public class CatalogueServiceImpl implements CatalogueService {
	
	@Autowired
	private CatalogueDAO catalogueDAO;

	@Override
	public void save(Catalogue catalogue) {

	}

	@Override
	public void update(Catalogue catalogue) {

	}

	@Override
	public List<Catalogue> findAllCatalogues() {
		return catalogueDAO.getAllCatalogues();
	}
}
