package com.serendipity.springcloud.dao;

import com.serendipity.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/11/27 15:34
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
