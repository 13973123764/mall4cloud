package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.HomeAdvDao;
import com.cloud.mall.entity.HomeAdv;
import com.cloud.mall.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdv> implements HomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdv> page = this.page(
                new Query<HomeAdv>().getPage(params),
                new QueryWrapper<HomeAdv>()
        );

        return new PageUtils(page);
    }

}