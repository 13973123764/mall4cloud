package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.MemberReceiveAddressDao;
import com.cloud.mall.entity.MemberReceiveAddress;
import com.cloud.mall.service.MemberReceiveAddressService;


@Service("memberReceiveAddressService")
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressDao, MemberReceiveAddress> implements MemberReceiveAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberReceiveAddress> page = this.page(
                new Query<MemberReceiveAddress>().getPage(params),
                new QueryWrapper<MemberReceiveAddress>()
        );

        return new PageUtils(page);
    }

}