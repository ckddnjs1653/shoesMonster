package com.sm.persistence;

import java.util.List;

import com.sm.domain.ProductVO;

public interface PerformanceDAO {
	
	// ǰ����� ��� �ҷ�����
	public List<ProductVO> readProdList() throws Exception;
		
	public void insertProdList(ProductVO product); 
		
	
}
