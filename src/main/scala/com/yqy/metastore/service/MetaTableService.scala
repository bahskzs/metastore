package com.yqy.metastore.service

import java.beans.Transient

import com.yqy.metastore.domain.MetaTable
import com.yqy.metastore.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * @author bahsk
 * @createTime 2021-01-05 0:42
 * @description
 */

@Service
class MetaTableService @Autowired()(metaTableRepository:MetaTableRepository){

  @Transactional
  def save(metaTable:MetaTable) ={
    metaTableRepository.save(metaTable)
  }

  def query()={
    metaTableRepository.findAll()
  }
}
