package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.SeckillSkuNoticeDao;
import com.cloud.mall.entity.SeckillSkuNotice;
import com.cloud.mall.service.SeckillSkuNoticeService;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNotice> implements SeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuNotice> page = this.page(
                new Query<SeckillSkuNotice>().getPage(params),
                new QueryWrapper<SeckillSkuNotice>()
        );

        return new PageUtils(page);
    }

}