package com.yonghe.business.service;

import com.yonghe.business.mapper.UserMapper;
import com.yonghe.business.model.User;
import com.yonghe.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author yonghe
 * @date 2020/04/27 16:18
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据uid查询用户昵称
     * @param uid
     * @return
     */
    public String getUserNickByUid(Long uid) {
        List<User> users = userMapper.findUserNickByUid(uid);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        return StringUtils.retouch(users.get(0).getNick());
    }

}
