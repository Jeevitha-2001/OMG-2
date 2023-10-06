package com.omg.OMG.Repository;

import com.omg.OMG.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User,String> {
//    @Query("select coalesce(max(U.user_id),0)from User U")
//    public String findMaxid();

    @Query(value = "select count(u.user_email) from User u where u.user_email = ?1", nativeQuery = true)
    public int existsByUser_email(String user_email);

    @Query(value = "select count(u.user_pwd) from User u where u.user_email = ?1 and u.user_pwd = ?2", nativeQuery = true)
    public int existsByUserPass(String user_email, String user_pwd);

    @Query(value = "select * from User u where u.user_email = ?1", nativeQuery = true)
    public List<User> findByUser_email(String user_email);
}
