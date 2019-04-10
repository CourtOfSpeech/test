package com.toor.friend.dao;

import com.toor.friend.pojo.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FriendDao extends JpaRepository<Friend, String> {
    /**
     * 查询当前用户是否关注过friendid
     * @param userid
     * @param friendid
     * @return
     */
    public Friend findByUseridAndFriendid(String userid, String friendid);
    /**
     *  更新islike的值
     * @param islike
     * @param userid
     * @param friendid
     */
    @Modifying
    @Query(value = "UPDATE tb_friend SET islike=? WHERE userid = ? AND friendid = ?", nativeQuery = true)
    public void updateIslike(String islike, String userid, String friendid);
    /**
     *  删除好友
     * @param userid
     * @param friendid
     */
    @Modifying
    @Query(value = "delete FROM tb_friend WHERE userid = ? AND friendid = ?", nativeQuery = true)
    void deletefriend(String userid, String friendid);
}
