package com.cloud.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.product.dao.AttrAttrgroupRelationDao;
import com.cloud.mall.product.entity.AttrAttrgroupRelation;
import com.cloud.mall.product.service.AttrAttrgroupRelationService;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelation> implements AttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrAttrgroupRelation> page = this.page(
                new Query<AttrAttrgroupRelation>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelation>()
        );

        return new PageUtils(page);
    }

}