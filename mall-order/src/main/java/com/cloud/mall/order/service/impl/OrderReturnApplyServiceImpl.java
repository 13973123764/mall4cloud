package com.cloud.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.order.dao.OrderReturnApplyDao;
import com.cloud.mall.order.entity.OrderReturnApply;
import com.cloud.mall.order.service.OrderReturnApplyService;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApply> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApply> page = this.page(
                new Query<OrderReturnApply>().getPage(params),
                new QueryWrapper<OrderReturnApply>()
        );

        return new PageUtils(page);
    }

}