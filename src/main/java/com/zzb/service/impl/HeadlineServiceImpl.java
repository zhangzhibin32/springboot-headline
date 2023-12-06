package com.zzb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzb.pojo.Headline;
import com.zzb.service.HeadlineService;
import com.zzb.mapper.HeadlineMapper;
import org.springframework.stereotype.Service;

/**
* @author zhang
* @description 针对表【news_headline】的数据库操作Service实现
* @createDate 2023-11-30 18:27:02
*/
@Service
public class HeadlineServiceImpl extends ServiceImpl<HeadlineMapper, Headline>
    implements HeadlineService{

}




