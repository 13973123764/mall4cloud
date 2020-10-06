package com.cloud.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.ware.dao.WareSkuDao;
import com.cloud.mall.ware.entity.WareSku;
import com.cloud.mall.ware.service.WareSkuService;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSku> implements WareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareSku> page = this.page(
                new Query<WareSku>().getPage(params),
                new QueryWrapper<WareSku>()
        );

        return new PageUtils(page);
    }

}