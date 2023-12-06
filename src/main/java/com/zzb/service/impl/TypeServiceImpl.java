package com.zzb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzb.pojo.Type;
import com.zzb.service.TypeService;
import com.zzb.mapper.TypeMapper;
import org.springframework.stereotype.Service;

/**
* @author zhang
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2023-11-30 18:27:02
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

}




