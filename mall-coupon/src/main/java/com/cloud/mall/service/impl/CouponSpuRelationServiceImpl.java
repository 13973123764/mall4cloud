package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.CouponSpuRelationDao;
import com.cloud.mall.entity.CouponSpuRelation;
import com.cloud.mall.service.CouponSpuRelationService;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelation> implements CouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuRelation> page = this.page(
                new Query<CouponSpuRelation>().getPage(params),
                new QueryWrapper<CouponSpuRelation>()
        );

        return new PageUtils(page);
    }

}