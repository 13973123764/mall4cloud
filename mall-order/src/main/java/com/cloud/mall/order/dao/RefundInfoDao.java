package com.cloud.mall.order.dao;

import com.cloud.mall.order.entity.RefundInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfo> {
	
}
