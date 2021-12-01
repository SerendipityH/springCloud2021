package com.serendipity.springcloud.dao;

import com.serendipity.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/11/27 15:34
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);
    @Select("select * from payment where id = #{id}")
    public Payment getPaymentById(@Param("id") Long id);
}
