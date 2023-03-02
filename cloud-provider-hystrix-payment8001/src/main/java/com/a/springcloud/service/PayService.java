package com.a.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface PayService {
    String paymentInfoOk(Integer id);

    /**
     * 超时访问，演示降级
     *
     * @param id
     * @return
     */
    String paymentInfoTimeOut(Integer id);


    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
