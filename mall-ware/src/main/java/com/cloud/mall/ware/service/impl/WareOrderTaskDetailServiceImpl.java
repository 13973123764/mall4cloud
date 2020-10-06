package com.cloud.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.ware.dao.WareOrderTaskDetailDao;
import com.cloud.mall.ware.entity.WareOrderTaskDetail;
import com.cloud.mall.ware.service.WareOrderTaskDetailService;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetail> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskDetail> page = this.page(
                new Query<WareOrderTaskDetail>().getPage(params),
                new QueryWrapper<WareOrderTaskDetail>()
        );

        return new PageUtils(page);
    }

}