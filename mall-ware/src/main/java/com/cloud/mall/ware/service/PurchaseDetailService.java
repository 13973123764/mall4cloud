package com.cloud.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mall.common.utils.PageUtils;
import com.cloud.mall.ware.entity.PurchaseDetail;

import java.util.Map;

/**
 * 
 *
 * @author zfan
 * @email 13973123764@gmail.com
 * @date 2020-07-31 16:56:34
 */
public interface PurchaseDetailService extends IService<PurchaseDetail> {

    PageUtils queryPage(Map<String, Object> params);
}

