package com.sm.service;

import java.util.List;

import com.sm.domain.ProductList;
import com.sm.domain.ProductVO;

public interface PerformanceService {
		
	// ǰ����� ��� �ҷ�����
	public List<ProductVO> getProdList() throws Exception; 
	
	// ǰ����� ������ ���� ����
	public void insertProd(List<ProductVO> products); 
		
	
	
}
		