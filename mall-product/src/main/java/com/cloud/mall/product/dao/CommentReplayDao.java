package com.cloud.mall.product.dao;

import com.cloud.mall.product.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 14:59:59
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
