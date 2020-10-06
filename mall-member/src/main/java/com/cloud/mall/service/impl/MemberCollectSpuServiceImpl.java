package com.cloud.mall.service.impl;

import com.cloud.mall.dao.MemberCollectSpuDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.entity.MemberCollectSpu;
import com.cloud.mall.service.MemberCollectSpuService;


@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpu> implements MemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberCollectSpu> page = this.page(
                new Query<MemberCollectSpu>().getPage(params),
                new QueryWrapper<MemberCollectSpu>()
        );

        return new PageUtils(page);
    }

}