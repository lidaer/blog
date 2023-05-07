package com.blog.service.adminService;

import com.blog.mapper.FansMapper;
import com.blog.pojo.Fans;
import com.blog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class FansService implements FansMapper {

    @Autowired
    private FansMapper fansMapper;

    @Override
    public List<User> getFansByIdolId(Integer idolId) {
        return fansMapper.getFansByIdolId(idolId);
    }

    @Override
    public List<User> getIdolByFansId(Integer fansId) {
        return fansMapper.getIdolByFansId(fansId);
    }

    @Override
    public int getIdolByFansIdCount(Integer fansId) {
        return fansMapper.getIdolByFansIdCount(fansId);
    }

    @Override
    public int getFansByIdolIdCount(Integer id) {
        return fansMapper.getFansByIdolIdCount(id);
    }

    @Override
    public Fans ifIAmFans(Integer myId, Integer hisId) {
        return fansMapper.ifIAmFans(myId, hisId);
    }

    @Override
    public Fans ifEverFans(Fans fans) {
        return fansMapper.ifEverFans(fans);
    }

    //beFans分为firstBeFans和againBeFans
    @Override
    public void beFans(Fans fans) {

        if(Objects.isNull(ifEverFans(fans))){
            firstBeFans(fans);
        } else {
            againBeFans(fans);
        }
    }

    @Override
    public void firstBeFans(Fans fans) {
        fansMapper.firstBeFans(fans);
    }

    @Override
    public void againBeFans(Fans fans) {
        fansMapper.againBeFans(fans);
    }

    @Override
    public void everBeFans(Fans fans) {
        fansMapper.everBeFans(fans);
    }


}
