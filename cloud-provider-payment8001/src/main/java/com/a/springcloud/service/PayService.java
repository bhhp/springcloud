package com.a.springcloud.service;


import org.apache.ibatis.annotations.Param;
import springcloud.entities.CommonResult;
import springcloud.entities.Payment;

public interface PayService {
    CommonResult create(Payment payment);
    CommonResult getPaymentById(@Param("id") int id);
}
