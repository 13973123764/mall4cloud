package com.cloud.mall.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.dao.MemberLoginLogDao;
import com.cloud.mall.entity.MemberLoginLog;
import com.cloud.mall.service.MemberLoginLogService;


@Service("memberLoginLogService")
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogDao, MemberLoginLog> implements MemberLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLoginLog> page = this.page(
                new Query<MemberLoginLog>().getPage(params),
                new QueryWrapper<MemberLoginLog>()
        );

        return new PageUtils(page);
    }

}