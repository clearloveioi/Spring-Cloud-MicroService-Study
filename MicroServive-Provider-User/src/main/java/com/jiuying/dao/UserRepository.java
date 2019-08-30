package com.jiuying.dao;

import com.jiuying.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @auther guoruowang
 * @Date 2019/8/30 17:37
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
