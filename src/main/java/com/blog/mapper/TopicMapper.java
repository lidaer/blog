package com.blog.mapper;


import com.blog.pojo.Select;
import com.blog.pojo.Topic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TopicMapper {

    int getTotalTopicCount();

    List<Topic> getTopicList();

    List<Topic> getTopicAddUserList();

    Topic getTopicById(Integer id);

    List<Topic> getTopicListBySelectMessage(String selectMessage);

    int getTopicListBySelectMessageCount(String selectMessage);

    List<Topic> getTopicListByUserId(Integer id);

    int getTopicListByUserIdCount(Integer id);

    List<Topic> getTopicByWhich(Select select);

    int getTopicByWhichCount(Select select);

    void deleteTopicById(@Param("id") Integer id);

    List<Topic> getTopBrowseTopic(int count);

    Integer getUserIdByTopicId(Integer topicId);

    void insertTopic(Topic topic);

    List<Topic> getNearTimeTopic(int count);

    List<Topic> getTopicListByTagId(Integer id);

    int getTopicListByTagIdCount(Integer id);

    void OneParamUpdate(@Param("topicId") Integer topicId, @Param("message")String message, @Param("updateParam")int updateParam);
}
