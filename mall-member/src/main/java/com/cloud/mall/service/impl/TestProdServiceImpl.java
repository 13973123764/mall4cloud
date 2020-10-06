package com.cloud.mall.service.impl;

import com.cloud.mall.dao.TestProdMapper;
import com.cloud.mall.service.TestOrderService;
import com.cloud.mall.service.TestProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestProdServiceImpl implements TestProdService {

    @Autowired
    TestProdMapper prodMapper;

    @Override
    public void incrSellNum(Long prodId) {
        prodMapper.incrSellNum(prodId);
    }
}
