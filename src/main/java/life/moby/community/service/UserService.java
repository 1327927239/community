package life.moby.community.service;

import life.moby.community.mapper.UserMapper;
import life.moby.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void updateOrInsert(User user) {
        User dbUser = userMapper.findByAccountId(user.getAccountId());
        if(dbUser != null) {
            // 更新
            dbUser.setGmtModified(System.currentTimeMillis());
            dbUser.setToken(user.getToken());
            dbUser.setName(user.getName());
            dbUser.setAvatarUrl(user.getAvatarUrl());
            userMapper.update(dbUser.getId());
        } else {
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            userMapper.insert(user);
        }
    }
}
