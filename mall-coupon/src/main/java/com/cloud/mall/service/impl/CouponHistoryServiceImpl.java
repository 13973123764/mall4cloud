package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.CouponHistoryDao;
import com.cloud.mall.entity.CouponHistory;
import com.cloud.mall.service.CouponHistoryService;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistory> implements CouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponHistory> page = this.page(
                new Query<CouponHistory>().getPage(params),
                new QueryWrapper<CouponHistory>()
        );

        return new PageUtils(page);
    }

}