package com.jwt.service;

import java.util.List;

import com.jwt.model.Catalogue;

public interface CatalogueService {
	void save(Catalogue catalogue);

	void update(Catalogue catalogue);

	List<Catalogue> findAllCatalogues();
}
