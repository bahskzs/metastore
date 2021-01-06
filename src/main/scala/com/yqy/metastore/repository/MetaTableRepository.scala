package com.yqy.metastore.repository

import com.yqy.metastore.domain.MetaTable
import org.springframework.data.repository.CrudRepository

/**
 * @author bahsk
 * @createTime 2021-01-05 0:41
 * @description
 */
trait MetaTableRepository extends CrudRepository[MetaTable,Integer]{

}
