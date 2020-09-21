package com.example.banking.repository;

import com.example.banking.model.MemberInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author : DaEunKim
 * @version : 2020.09.19
 * @Description :
 */
@Mapper
public interface IdentiCheckMapper {

	List <MemberInfo> selectMemberInfo();

	/**
	 * @author : DaEunKim
	 * @param
	 * @return
	 * @Description 신분증 이미지 저장
	 */
//	@Override
//	public void insertIdCardImg(MemberInfo memberInfo) {
//		memberInfoDao.insertIdCardImg(memberInfo);
//	}
//	@Override
//	public MemberInfo selectMemberInfo() {
//		memberInfoDao.selectMemberInfo();
//	}
}
