package com.cloud.mall.service.impl;

import com.cloud.mall.dao.TestOrderMapper;
import com.cloud.mall.service.TestOrderService;
import com.cloud.mall.service.TestProdService;
import com.cloud.mall.service.TestStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class TestOrderServiceImpl implements TestOrderService {

    @Autowired
    TestOrderMapper orderMapper;
    @Autowired
    TestStockService stockService;
    @Autowired
    TestProdService prodService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void confirmOrder() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println("新订单: " + uuid);
        orderMapper.insertOrder(uuid);

        Long prodId = 1L;
        // 库存减一
        stockService.decrStock(prodId);
        // 销量加一
        prodService.incrSellNum(prodId);
    }
}
