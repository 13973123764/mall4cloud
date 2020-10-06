package com.cloud.mall.service.impl;

import com.cloud.mall.dao.TestStockMapper;
import com.cloud.mall.service.TestOrderService;
import com.cloud.mall.service.TestStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestStockServiceImpl implements TestStockService {

    @Autowired
    TestStockMapper stockMapper;

    @Override
    public void decrStock(Long prodId) {
        int i = 1/0;
        stockMapper.decrStock(prodId);
    }
}
