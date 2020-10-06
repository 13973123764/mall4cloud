package com.cloud.mall.ware.dao;

import com.cloud.mall.ware.entity.Purchase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:56:34
 */
@Mapper
public interface PurchaseDao extends BaseMapper<Purchase> {
	
}
