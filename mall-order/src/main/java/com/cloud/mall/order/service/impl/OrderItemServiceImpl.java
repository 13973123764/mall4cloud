package com.cloud.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.order.dao.OrderItemDao;
import com.cloud.mall.order.entity.OrderItem;
import com.cloud.mall.order.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItem> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItem> page = this.page(
                new Query<OrderItem>().getPage(params),
                new QueryWrapper<OrderItem>()
        );

        return new PageUtils(page);
    }

}