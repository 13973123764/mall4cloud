package com.cloud.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestOrderMapper {

    void confirmOrder();

    void insertOrder(@Param("uuid") String uuid);
}
