package com.toor.user.dao;

import com.toor.user.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author jiangxin
 * @create 2019-01-01-13:50
 * 数据访问接口
 */
public interface UserDao extends JpaRepository<User,String>,JpaSpecificationExecutor<User>{
    /**
     * 根据手机号查询用户
     * @param mobile
     * @return
     */
	public User findByMobile(String mobile);
    /**
     * 更新用户的粉丝数量
     * @param friendid    用户的id
     * @param x    粉丝数量的值，它的值只能是+1或者-1
     */
	@Modifying
	@Query(value = "update tb_user set fanscount=fanscount+? where id=?", nativeQuery = true)
    public void updatefanscount(int x, String friendid);
    /**
     * 更新用户的关注数量
     * @param userid    用户的id
     * @param x    关注数量的值，它的值只能是+1或者-1
     */
    @Modifying
    @Query(value = "update tb_user set followcount=followcount+? where id=?", nativeQuery = true)
    public void updatefollowcount(int x, String userid);
}
