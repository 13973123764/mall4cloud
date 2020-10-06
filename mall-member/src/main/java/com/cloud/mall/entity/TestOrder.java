package com.cloud.mall.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("test_order")
public class TestOrder {

    @TableId
    private Long orderId;
    private String remark;
    private LocalDateTime createTime;
}
