package com.yqy.metastore.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bahsk
 * @createTime 2021-01-04 23:02
 * @description 数据库元数据
 */
@Entity
@Data
@Table(name="meta_database")
public class MetaDatabase {

    @Id
    @GeneratedValue
    /**数据库ID*/
    private Integer id;

    /**数据库名称*/
    private String name;

    /**数据库存放的文件系统地址*/
    private String location;

}
