package com.blog.service.adminService;


import com.blog.mapper.TagMapper;
import com.blog.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements TagMapper {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> getTagList() {
        return tagMapper.getTagList();
    }


    public String getTagNameById(Integer id){
        return tagMapper.getTagNameById(id);
    }

    @Override
    public List<Tag> getTagListByFuzzyName(String message) {
        return tagMapper.getTagListByFuzzyName(message);
    }

    @Override
    public Integer getTotalTagCount() {
        return tagMapper.getTotalTagCount();
    }

    @Override
    public Tag getTagById(Integer id) {
        return tagMapper.getTagById(id);
    }

    @Override
    public void insertTag(String name) {
        tagMapper.insertTag(name);
    }

    @Override
    public void deleteById(Integer id) {
        tagMapper.deleteById(id);
    }

    @Override
    public void summitUpdate(Integer id, String newName) {
        tagMapper.summitUpdate(id, newName);
    }


}
