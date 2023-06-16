package com.sm.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sm.domain.LineVO;
import com.sm.domain.ProductVO;

@Repository
public class PerformanceImpl implements PerformanceDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(PerformanceImpl.class);
	
	private static final String NAMESPACE = "com.sm.mapper.ProductMapper";
	
	@Override
	public void insetProd(ProductVO vo) {
		logger.debug("DAO ����");
		
		sqlSession.insert(NAMESPACE+".prodIn", vo);
		
	}
	
	// 라인
	@Override
	public void insertLine(LineVO vo) throws Exception {
		logger.debug("@@insert@@");
		
		int result = sqlSession.insert(NAMESPACE+".insertLine", vo);
		
		if(result != 0)
			logger.debug("라인 글쓰기 완료");
		
	}
	@Override
	public List<LineVO> getLineList() throws Exception {
		logger.debug("@@getLineList() 호출@@");
		
		return sqlSession.selectList(NAMESPACE+".lineList");
	}
	
}
