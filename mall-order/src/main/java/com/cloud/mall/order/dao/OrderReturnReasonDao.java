package com.cloud.mall.order.dao;

import com.cloud.mall.order.entity.OrderReturnReason;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:50:03
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReason> {
	
}
