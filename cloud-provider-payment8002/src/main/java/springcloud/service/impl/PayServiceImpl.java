package springcloud.service.impl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import springcloud.dao.PayDao;
import springcloud.entities.CommonResult;
import springcloud.entities.Payment;
import springcloud.service.PayService;

import javax.annotation.Resource;

@Service
public class PayServiceImpl implements PayService {

    @Resource
    private PayDao payDao;

    @Value("${server.port}")
    private String serverPort;

    @Override
    public CommonResult create(Payment payment) {
        int i = payDao.create(payment);
        return new CommonResult(200,"插入成功"+serverPort,i);
    }

    @Override
    public CommonResult getPaymentById(int id) {
        Payment paymentById = payDao.getPaymentById(id);
        return new CommonResult(200,"查询成功" + serverPort,paymentById);
    }
}
