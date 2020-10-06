package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.SkuLadderDao;
import com.cloud.mall.entity.SkuLadder;
import com.cloud.mall.service.SkuLadderService;


@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadder> implements SkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuLadder> page = this.page(
                new Query<SkuLadder>().getPage(params),
                new QueryWrapper<SkuLadder>()
        );

        return new PageUtils(page);
    }

}