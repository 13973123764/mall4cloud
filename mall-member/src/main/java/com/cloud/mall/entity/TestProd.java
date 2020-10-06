package com.cloud.mall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test_prod")
public class TestProd {

    @TableId
    private Long prodId;
    private String prodName;
    private Integer sellNum;
}
