package com.study.service;

import com.study.entity.User;
import com.study.mapper.UserMapper;
import io.shardingsphere.api.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Description service
 * @Date 2019/6/27 17:58
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    @SuppressWarnings("all")
    private UserMapper userMapper;

    public List<User> list(boolean master) {
        if(master){
            // 强制路由主库
            HintManager.getInstance().setMasterRouteOnly();
        }
        return userMapper.list();
    }
}
