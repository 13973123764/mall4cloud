package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.SeckillPromotionDao;
import com.cloud.mall.entity.SeckillPromotion;
import com.cloud.mall.service.SeckillPromotionService;


@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionDao, SeckillPromotion> implements SeckillPromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillPromotion> page = this.page(
                new Query<SeckillPromotion>().getPage(params),
                new QueryWrapper<SeckillPromotion>()
        );

        return new PageUtils(page);
    }

}