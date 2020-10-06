package com.cloud.mall.dao;

import com.cloud.mall.entity.MemberLoginLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:37:04
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLog> {
	
}
