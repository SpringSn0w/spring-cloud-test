package com.baizhi.user.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.baizhi.user.entity.User;

public interface UserMapper {
    
    @Select("select * from t_user where id = #{id}")
    User findUserById(@Param("id") Long id);
}