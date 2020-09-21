package com.example.banking.controller;

import com.example.banking.dao.ApiDao;
import com.example.banking.model.MemberInfo;
import com.example.banking.service.MemberInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : DaEunKim
 * @version : 2020.09.18
 * @Description : 뱅킹 Rest API - 신분증 인증 구현 컨트롤러
 */
@Slf4j
@RestController
@RequestMapping("/bankingAPI/")
public class BankingApiController {
	@Autowired
	MemberInfoService memberInfoService;

	@Autowired
	private ApiDao apiDao;

	/**
	 * @author : DaEunKim
	 * @param
	 * @return
	 * @Description 모바일에서 이미지 받아서 저장하는 api
	 */
	@PostMapping(path = "/insertMemberInfo")
	public String insertMemberInfo(@RequestBody MemberInfo memberInfo){
		apiDao.insertMemberInfo(memberInfo);
		apiDao.updateIdCardImg(memberInfo);
		return "success";
	}

	/**
	 * @author : DaEunKim
	 * @param
	 * @return
	 * @Description MEMBER_INFO 테이블 모든 데이터 select
	 */
	@GetMapping("/selectAll")
	public List selectAll() {
		List<MemberInfo> selectAll = apiDao.selectAll();
		return selectAll;
	}

//	신분증 인증 단계
//	인증 개발 AP와 sync
//	모바일로부터 신분증 사진 GET
//	신분증 사진 post
//	신분증 정보 Get 이름, 주민번호, 신분증 가린 사진, 면허 발급 번호, 발급일자
//	db 저장 - 신분증 정보, 성공여부 등


// 1. 모바일에서 이미지 받는 api (post 이미지 저장) - 모바일 토큰도 ?
// 2. 인증개발 ap에 이미지 전송하고 신분증 정보 받는 API(post 정보 저장)
//	3. 고객 개발로 고객정보 보내주기

//	@GetMapping("/getMobileIdCardImg")
//	public Map<String, Object> getMobileIdCardImg(){
//		Map<String, Object> resultMap = new HashMap<>();
//		resultMap.put("imgPath", "com/example/banking/idcard.jpg");
//		return resultMap;
//	}

	@PostMapping(value = "/sendIdCardImg")
	public Map<String, Object> sendIdCardImg(@RequestParam(value="name") String name) {
//		logger.info("Creating Product : {}", product);
		Map<String, Object> resultMap = new HashMap<>();
		// DB에 있는 이미지 경로(?), 유저정보 담아서 주기

		resultMap.put("name", name);

		return resultMap;
	}

}
