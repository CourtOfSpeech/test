package com.toor.user.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * @author jiangxin
 * @create 2019-01-01-13:46
 * 实体类
 */
@Entity             //标注为实体类的注解
@Table(name="tb_admin")         //指定数据库的表名的注解
public class Admin implements Serializable{

	@Id          //标注为主键的注解
	private String id;//ID


	
	private String loginname;//登陆名称
	private String password;//密码
	private String state;//状态

	
	public String getId() {		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLoginname() {		
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {		
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {		
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	
}
