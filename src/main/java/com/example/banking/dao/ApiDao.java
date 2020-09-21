package com.example.banking.dao;

import com.example.banking.model.IdentiCheckErrorLog;
import com.example.banking.model.MemberInfo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

	public String selectName(MemberInfo memberInfo) {
		return sqlSession.selectOne(NAMESPACE + "selectName", memberInfo);
	}

	public List<MemberInfo> selectAll(){
		return sqlSession.selectList(NAMESPACE + "selectAll");
	}
	public int insertMemberInfo(MemberInfo memberInfo){
		return sqlSession.insert(NAMESPACE + "insertMemberInfo", memberInfo);
	}

	public int updateIdCardImg(MemberInfo memberInfo) {
		return sqlSession.update(NAMESPACE+"updateIdCardImg", memberInfo);
	}

	public int updateIdCardInfo(MemberInfo memberInfo) {
		return sqlSession.update(NAMESPACE+"updateIdCardInfo", memberInfo);
	}
	public int insertIdentiErrorLog(IdentiCheckErrorLog identiCheckErrorLog) {
		return sqlSession.insert(NAMESPACE+"insertIdentiErrorLog", identiCheckErrorLog);
	}


}
