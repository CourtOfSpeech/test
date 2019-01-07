package com.toor.user.dao;

import com.toor.user.pojo.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author jiangxin
 * @create 2019-01-01-13:48
 * 数据访问接口
 */
public interface AdminDao extends JpaRepository<Admin,String>,JpaSpecificationExecutor<Admin>{
	/**
	 * 根据登录名称获取管理员信息
	 * @param loginname
	 * @return
	 */
	public Admin findByLoginname(String loginname);
}
