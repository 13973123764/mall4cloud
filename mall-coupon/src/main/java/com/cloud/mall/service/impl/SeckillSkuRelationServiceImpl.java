package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.SeckillSkuRelationDao;
import com.cloud.mall.entity.SeckillSkuRelation;
import com.cloud.mall.service.SeckillSkuRelationService;


@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelation> implements SeckillSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuRelation> page = this.page(
                new Query<SeckillSkuRelation>().getPage(params),
                new QueryWrapper<SeckillSkuRelation>()
        );

        return new PageUtils(page);
    }

}