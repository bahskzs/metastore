package com.yqy.metastore.service;

import com.yqy.metastore.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @author bahsk
 * @createTime 2021-01-04 23:25
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @Test
    public void testSave() {
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setLocation("hdfs://192.168.8.106:9000/user/hive/warehouse");

        metaDatabaseService.save(metaDatabase);
    }

    @Test
    public void testQuery() {
        Iterable<MetaDatabase> metaDatabases = metaDatabaseService.query();
        for(MetaDatabase metaDatabase : metaDatabases){
            System.out.println(metaDatabase.getId());
            System.out.println(metaDatabase.getName());
            System.out.println(metaDatabase.getLocation());
        }
    }
}