package com.sm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sm.domain.ProductVO;
import com.sm.service.PerformanceService;

@Controller
@RequestMapping(value = "/performance/*")
public class PerfomanceController {
	
	// ���� ��ü ����
	@Autowired
	private PerformanceService service;

	private static final Logger logger = LoggerFactory.getLogger(PerfomanceController.class);
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public void productGET() {
		logger.debug("productGET() ȣ��");
		
	}
	
	@RequestMapping(value = "product", method = RequestMethod.POST)
	public String productPOST(ProductVO vo) throws Exception {
		
		logger.debug("productPOST() ȣ��");
		logger.debug("vo : " + vo);
		
		service.insertProd(vo);
		
		return "";
	}
	
	
}
