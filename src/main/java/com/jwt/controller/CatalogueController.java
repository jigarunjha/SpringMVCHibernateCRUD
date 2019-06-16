package com.jwt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.jwt.model.Catalogue;
import com.jwt.service.CatalogueService;


@Controller
public class CatalogueController {
    @Autowired
    private CatalogueService catalogueService;
    
    public CatalogueController() {
		System.out.println("CatalogueController()");
	}

	//-------------------Retrieve All Catalogues--------------------------------------------------------
	
	@RequestMapping(value = "/catalogue", method = RequestMethod.GET)
	public ModelAndView listAllCatalogueForPurchase(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		int userId = Integer.parseInt(request.getParameter("id"));
		List<Catalogue> catalogues = catalogueService.findAllCatalogues();
		model.addObject("listCatalogue", catalogues);
		model.addObject("userId",userId);
		model.setViewName("catalogue");
		return model;
	}


	//-------------------Retrieve Single Catalogue--------------------------------------------------------
/*	
	@RequestMapping(value = "/catalogue/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Catalogue> getCatalogue(@PathVariable("id") long id) {
		System.out.println("Fetching Catalogue with id " + id);
		Catalogue catalogue = catalogueService.findById(id);
		if (catalogue == null) {
			System.out.println("Catalogue with id " + id + " not found");
			return new ResponseEntity<Catalogue>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Catalogue>(catalogue, HttpStatus.OK);
	}

	*/
	
	//-------------------Catalogue--------------------------------------------------------
	
	@RequestMapping(value = "/catalogue/purchase", method = RequestMethod.POST)
	public ResponseEntity<Void> cataloguePurchase(@RequestBody Catalogue catalogue, UriComponentsBuilder ucBuilder) {
		

	/*	if (catalogueService.isCatalogueExist(catalogue)) {
			System.out.println("A Catalogue with name " + catalogue.getName() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
*/
		//catalogueService.saveCatalogue(catalogue);

		HttpHeaders headers = new HttpHeaders();
	//	headers.setLocation(ucBuilder.path("/catalogue/{id}").buildAndExpand(catalogue.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
}


