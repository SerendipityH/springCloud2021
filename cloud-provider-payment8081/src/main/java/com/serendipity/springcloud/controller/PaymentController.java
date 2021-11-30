package com.serendipity.springcloud.controller;

import com.serendipity.springcloud.entities.CommonResult;
import com.serendipity.springcloud.entities.Payment;
import com.serendipity.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/11/27 15:47
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*******" + result);
        if (result > 0) {
            return new CommonResult(200, "success");
        } else {
            return new CommonResult(400, "fail");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果:" + payment);
        if (payment != null) {
            return new CommonResult(200, "success", payment);
        } else {
            return new CommonResult(400, "fail");
        }
    }
}
