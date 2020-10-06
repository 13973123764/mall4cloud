package com.cloud.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestProdMapper {

    void incrSellNum(@Param("prodId") Long prodId);

}
