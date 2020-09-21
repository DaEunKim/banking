package com.example.banking.model;


import lombok.Data;

import java.util.Date;

/**
 * @author : DaEunKim
 * @version : 2020.09.11
 * @Description : IDENTI_CHECK_ERROR_LOG 테이블
 */
@Data
public class IdentiCheckErrorLog {
	private Integer index;
	private Integer set_account_process_PK;
	private String error_code;
	private Date error_datetime;

	public Integer getSet_account_process_PK() {
		return set_account_process_PK;
	}

	public void setSet_account_process_PK(Integer set_account_process_PK) {
		this.set_account_process_PK = set_account_process_PK;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public Date getError_datetime() {
		return error_datetime;
	}

	public void setError_datetime(Date error_datetime) {
		this.error_datetime = error_datetime;
	}


}
