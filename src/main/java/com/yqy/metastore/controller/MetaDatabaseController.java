package com.yqy.metastore.controller;

import com.yqy.metastore.domain.MetaDatabase;
import com.yqy.metastore.service.MetaDatabaseService;
import com.yqy.metastore.utils.ResultVO;
import com.yqy.metastore.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bahsk
 * @createTime 2021-01-05 0:05
 * @description
 */

@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/" , method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();
    }

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ResultVO query(){
        return ResultVOUtil.success(metaDatabaseService.query());
    }
}
