package com.cloud.mall.controller;

import com.cloud.mall.common.utils.Result;
import com.cloud.mall.service.TestOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestOrderService orderService;

    @GetMapping("confirmOrder")
    public ResponseEntity<Result> confirmOrder(){
        orderService.confirmOrder();
        return ResponseEntity.ok(Result.ok("ok"));
    }

}
