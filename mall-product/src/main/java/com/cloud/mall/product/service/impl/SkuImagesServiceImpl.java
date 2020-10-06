package com.cloud.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.product.dao.SkuImagesDao;
import com.cloud.mall.product.entity.SkuImages;
import com.cloud.mall.product.service.SkuImagesService;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImages> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImages> page = this.page(
                new Query<SkuImages>().getPage(params),
                new QueryWrapper<SkuImages>()
        );

        return new PageUtils(page);
    }

}