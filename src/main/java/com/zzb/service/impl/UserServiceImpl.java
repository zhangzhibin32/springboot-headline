package com.zzb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzb.pojo.User;
import com.zzb.service.UserService;
import com.zzb.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author zhang
* @description 针对表【news_user】的数据库操作Service实现
* @createDate 2023-11-30 18:27:02
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




