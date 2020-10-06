package com.cloud.mall.service.impl;

import com.cloud.mall.dao.IntegrationChangeHistoryDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.entity.IntegrationChangeHistory;
import com.cloud.mall.service.IntegrationChangeHistoryService;


@Service("integrationChangeHistoryService")
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistory> implements IntegrationChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IntegrationChangeHistory> page = this.page(
                new Query<IntegrationChangeHistory>().getPage(params),
                new QueryWrapper<IntegrationChangeHistory>()
        );

        return new PageUtils(page);
    }

}