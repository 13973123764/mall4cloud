package com.cloud.mall.dao;

import com.cloud.mall.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
