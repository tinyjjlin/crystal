package com.tiny.crystal.service.impl;

import com.tiny.crystal.entity.News;
import com.tiny.crystal.mapper.NewsMapper;
import com.tiny.crystal.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tiny lin
 * @since 2018-12-02
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
