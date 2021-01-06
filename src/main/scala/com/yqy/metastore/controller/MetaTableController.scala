package com.yqy.metastore.controller

import com.yqy.metastore.domain.MetaTable
import com.yqy.metastore.service.MetaTableService
import com.yqy.metastore.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, ResponseBody, RestController}

/**
 * @author bahsk
 * @createTime 2021-01-05 0:46
 * @description
 */

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService){

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable:MetaTable)={
      metaTableService.save(metaTable)
      ResultVOUtil.success() //scala调用java
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @ResponseBody
  def query()={
    ResultVOUtil.success(metaTableService.query())
  }
}
