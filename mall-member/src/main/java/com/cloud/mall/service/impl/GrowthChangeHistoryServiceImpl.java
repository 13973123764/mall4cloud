package com.cloud.mall.service.impl;

import com.cloud.mall.dao.GrowthChangeHistoryDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.entity.GrowthChangeHistory;
import com.cloud.mall.service.GrowthChangeHistoryService;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistory> implements GrowthChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GrowthChangeHistory> page = this.page(
                new Query<GrowthChangeHistory>().getPage(params),
                new QueryWrapper<GrowthChangeHistory>()
        );

        return new PageUtils(page);
    }

}