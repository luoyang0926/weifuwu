package com.xy.cloud.controller;

import com.xy.cloud.pojo.CommonResult;
import com.xy.cloud.pojo.Payment;
import com.xy.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept) {
        int i = paymentService.create02(dept);
        log.info("***************插入成功*******" + i);
        if (i > 0) {
            return new CommonResult(200, "插入数据库成功" + 8002, i);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")

    public CommonResult queryById(@PathVariable("id") Long id) {
        Payment payment = paymentService.queryById02(id);
        log.info("***************查询成功*********" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功" + 8002, payment);
        } else {
            return new CommonResult(444, "查询失败", null);
        }
    }

}
