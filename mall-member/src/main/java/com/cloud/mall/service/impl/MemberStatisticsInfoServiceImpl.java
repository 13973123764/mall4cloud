package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.MemberStatisticsInfoDao;
import com.cloud.mall.entity.MemberStatisticsInfo;
import com.cloud.mall.service.MemberStatisticsInfoService;


@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfo> implements MemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberStatisticsInfo> page = this.page(
                new Query<MemberStatisticsInfo>().getPage(params),
                new QueryWrapper<MemberStatisticsInfo>()
        );

        return new PageUtils(page);
    }

}