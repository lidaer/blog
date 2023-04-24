package com.blog.mapper;

import com.blog.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TagMapper {

    List<Tag> getTagList();

    String getTagNameById(Integer id);

    List<Tag> getTagListByFuzzyName(String message);

    Integer getTotalTagCount();

    Tag getTagById(Integer id);

    void insertTag(String name);

    void deleteById(Integer id);

    void summitUpdate(@Param("id") Integer id, @Param("newName") String newName);

}
