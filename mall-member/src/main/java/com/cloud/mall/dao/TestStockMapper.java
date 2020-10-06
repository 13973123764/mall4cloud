package com.cloud.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestStockMapper {

    void decrStock(@Param("prodId") Long prodId);
}
