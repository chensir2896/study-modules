package com.study.mapper;

import com.study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description mapper
 * @Date 2019/6/27 17:57
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    List<User> list();
}
