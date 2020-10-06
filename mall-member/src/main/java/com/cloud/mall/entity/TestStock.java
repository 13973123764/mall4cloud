package com.cloud.mall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test_stock")
public class TestStock {

    @TableId
    private Long stockId;
    private Long prodId;
    private Long prodNum;
}
