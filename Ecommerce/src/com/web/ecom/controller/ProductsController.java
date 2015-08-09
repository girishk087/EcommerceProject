package com.web.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.ecom.DAO.ProductsDAO;
import com.web.ecom.model.ProductsBean;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductsDAO productDAO;
	
	@RequestMapping("getproducts")
	public ModelAndView getAllProducts(HttpServletRequest request){
		
		List<ProductsBean> productList = new ArrayList<>();
		ProductsBean pBean = new ProductsBean();
		productList = productDAO.getAllProducts(pBean);
		
		ModelAndView model = new ModelAndView("products", "getMessage", "this Is Produts Page");
		model.addObject("proProduct", productList);
		return model;
	}
}
