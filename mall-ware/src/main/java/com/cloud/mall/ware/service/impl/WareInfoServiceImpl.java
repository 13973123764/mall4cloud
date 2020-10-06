package com.cloud.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.ware.dao.WareInfoDao;
import com.cloud.mall.ware.entity.WareInfo;
import com.cloud.mall.ware.service.WareInfoService;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfo> implements WareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareInfo> page = this.page(
                new Query<WareInfo>().getPage(params),
                new QueryWrapper<WareInfo>()
        );

        return new PageUtils(page);
    }

}