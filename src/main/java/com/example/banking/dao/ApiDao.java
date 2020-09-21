package com.example.banking.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author : DaEunKim
 * @version : 2020.09.19
 * @Description :
 */
@Repository
public class ApiDao {
	protected static final String NAMESPACE = "com.example.banking.dao.";

	@Autowired
	private SqlSession sqlSession;

	public String selectName(){
		return sqlSession.selectOne(NAMESPACE + "selectName");
	}
}
