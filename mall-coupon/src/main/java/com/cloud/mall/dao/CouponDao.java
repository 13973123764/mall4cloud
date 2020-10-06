package com.cloud.mall.dao;

import com.cloud.mall.entity.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:26:48
 */
@Mapper
public interface CouponDao extends BaseMapper<Coupon> {
	
}
