package com.demo;

import com.cloud.mall.product.ProductApplication;
import com.cloud.mall.product.entity.Brand;
import com.cloud.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = {ProductApplication.class})
@RunWith(SpringRunner.class)
public class MyTest {

    @Resource
    BrandService brandService;

    @Test
    public void test(){
        Brand brand = brandService.lambdaQuery().eq(Brand::getName, "华为").one();
        System.out.println("brand = " + brand);
    }
}
