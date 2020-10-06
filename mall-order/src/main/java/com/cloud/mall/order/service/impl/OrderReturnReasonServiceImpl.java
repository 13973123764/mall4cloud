package com.cloud.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.order.dao.OrderReturnReasonDao;
import com.cloud.mall.order.entity.OrderReturnReason;
import com.cloud.mall.order.service.OrderReturnReasonService;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReason> implements OrderReturnReasonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnReason> page = this.page(
                new Query<OrderReturnReason>().getPage(params),
                new QueryWrapper<OrderReturnReason>()
        );

        return new PageUtils(page);
    }

}