package com.huway0310.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("使用者物件")
public class User {
	@ApiModelProperty("使用者名字")
	public String username;
	@ApiModelProperty("密碼")
	public String password;
	
	
	

}
