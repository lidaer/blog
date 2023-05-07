package com.blog.mapper;

import com.blog.pojo.Fans;
import com.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FansMapper {

    List<User> getFansByIdolId(Integer idolId);

    List<User> getIdolByFansId(Integer fansId);

    int getIdolByFansIdCount(Integer fansId);

    int getFansByIdolIdCount(Integer id);

    Fans ifIAmFans(@Param("myId") Integer myId, @Param("hisId") Integer hisId);

    Fans ifEverFans(Fans fans);

    void beFans(Fans fans);

    void firstBeFans(Fans fans);

    void againBeFans(Fans fans);

    void everBeFans(Fans fans);

}
