package com.example.banking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : DaEunKim
 * @version : 2020.09.18
 * @Description : 뱅킹 Rest API 구현 컨트롤러
 */
@RestController
@RequestMapping("/api/test")
public class BankingApiController {

	public static final Logger logger = LoggerFactory.getLogger(BankingApiController.class);
	//	신분증 인증 단계 http://localhost:8888/api/test/info
	@GetMapping("/info")
	public Map<String, Object> testInfoGET() {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("group", "com.devwon");
		resultMap.put("artifact", "sample1");
		return resultMap;
	}

//	신분증 인증 단계
//	인증 개발 AP와 sync
//	모바일로부터 신분증 사진 GET
//	신분증 사진 post
//	신분증 정보 Get 이름, 주민번호, 신분증 가린 사진, 면허 발급 번호, 발급일자
//	db 저장 - 신분증 정보, 성공여부 등


// 1. 모바일에서 이미지 받는 api (post 이미지 저장)
// 2. 인증개발 ap에 이미지 전송하고 신분증 정보 받는 API(post 정보 저장)
//	3. 고객 개발로 고객정보 보내주기

	@GetMapping("/get")
	public Map<String, Object> getHelloWorld(){
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("dani", "get");
		return resultMap;
	}

	@PostMapping(value = "/post")
	public Map<String, Object> createProduct(@RequestParam(value="name") String name) {
//		logger.info("Creating Product : {}", product);
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("dani", name);

		return resultMap;
	}


}
