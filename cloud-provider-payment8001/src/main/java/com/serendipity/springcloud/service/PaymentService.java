package com.serendipity.springcloud.service;

import com.serendipity.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/11/27 15:45
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
