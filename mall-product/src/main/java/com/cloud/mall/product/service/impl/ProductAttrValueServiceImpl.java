package com.cloud.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.product.dao.ProductAttrValueDao;
import com.cloud.mall.product.entity.ProductAttrValue;
import com.cloud.mall.product.service.ProductAttrValueService;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueDao, ProductAttrValue> implements ProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductAttrValue> page = this.page(
                new Query<ProductAttrValue>().getPage(params),
                new QueryWrapper<ProductAttrValue>()
        );

        return new PageUtils(page);
    }

}