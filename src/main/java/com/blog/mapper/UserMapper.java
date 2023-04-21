package com.blog.mapper;


import com.blog.pojo.Select;
import com.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@mapper
@Repository
@Mapper
public interface UserMapper {

    String getAdminPassword();

    int getTotalUserCount();

    User getUserByUsername(String username);

    List<User> getUserList();

    User getUserById(@Param("id") Integer id);

    List<User> getUserByWhich(Select select);

    int getUserByWhichCount(Select select);

    void deleteUserById(@Param("id") Integer id);

    void updateUserById(User user);

    void insertUser(User user);

    void topicCountPlus(Integer id);

    void commentCountPlus(Integer id);

    void browseCountPlus(Integer id);

    void supportCountPlus(Integer id);

    void supportCountMinus(Integer id);

    void topicCountMinus(Integer id);

    List<User> getHotCommentUser(int count);

    void updateUserLimit(User user);

    User getUserByEmail(String email);

    List<User> getUserListByMessage(String namMessage);

    void updateOnlyOne(@Param("id") Integer id, @Param("value") String value, @Param("message") String message);


}
