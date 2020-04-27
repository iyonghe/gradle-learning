package com.yonghe.business.mapper;

import com.yonghe.business.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select uid,nick from users where uid = #{uid}")
    List<User> findUserNickByUid(@Param("uid") Long uid);

}
