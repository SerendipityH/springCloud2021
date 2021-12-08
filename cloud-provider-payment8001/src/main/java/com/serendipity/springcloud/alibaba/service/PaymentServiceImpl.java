package com.serendipity.springcloud.alibaba.service;

import com.serendipity.springcloud.alibaba.dao.PaymentDao;
import com.serendipity.springcloud.alibaba.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/11/27 15:45
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
