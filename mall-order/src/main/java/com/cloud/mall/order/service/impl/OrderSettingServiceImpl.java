package com.cloud.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.order.dao.OrderSettingDao;
import com.cloud.mall.order.entity.OrderSetting;
import com.cloud.mall.order.service.OrderSettingService;


@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSetting> implements OrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderSetting> page = this.page(
                new Query<OrderSetting>().getPage(params),
                new QueryWrapper<OrderSetting>()
        );

        return new PageUtils(page);
    }

}