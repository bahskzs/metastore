package com.yqy.metastore.service;

import com.yqy.metastore.domain.MetaDatabase;
import com.yqy.metastore.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author bahsk
 * @createTime 2021-01-04 23:20
 * @description
 */

@Service
public class MetaDatabaseService {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase){
        metaDatabaseRepository.save(metaDatabase);
    }

    public Iterable<MetaDatabase> query() {
        return  metaDatabaseRepository.findAll();
    }
}
