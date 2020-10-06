package com.cloud.mall.service.impl;

import com.cloud.mall.dao.MemberDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.common.utils.Query;

import com.cloud.mall.entity.Member;
import com.cloud.mall.service.MemberService;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, Member> implements MemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Member> page = this.page(
                new Query<Member>().getPage(params),
                new QueryWrapper<Member>()
        );

        return new PageUtils(page);
    }

}