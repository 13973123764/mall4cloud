package com.cloud.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.ware.dao.PurchaseDetailDao;
import com.cloud.mall.ware.entity.PurchaseDetail;
import com.cloud.mall.ware.service.PurchaseDetailService;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetail> implements PurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseDetail> page = this.page(
                new Query<PurchaseDetail>().getPage(params),
                new QueryWrapper<PurchaseDetail>()
        );

        return new PageUtils(page);
    }

}