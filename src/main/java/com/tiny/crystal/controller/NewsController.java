package com.tiny.crystal.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tiny.crystal.entity.News;
import com.tiny.crystal.model.RestfulResult;
import com.tiny.crystal.model.RestfulResultData;
import com.tiny.crystal.service.INewsService;
import com.tiny.crystal.support.DateEditor;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author tiny lin
 * @since 2018-12-02
 */
@RestController
@RequestMapping("/news")
@Api("crystal api")
public class NewsController {
    Logger logger = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private INewsService newsService;

    @GetMapping("/list")
    public RestfulResult list(@RequestParam(value = "page", defaultValue = "1", required = false) int page, @RequestParam(value = "size", defaultValue = "10", required = false) int size) {
        logger.info("news list the page........." + page);
        List<News> newsList = newsService.page(new Page<>(page, 10)).getRecords();

        return new RestfulResultData(200, "获取新闻列表成功！", newsList);
    }

    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new DateEditor());
    }
}
