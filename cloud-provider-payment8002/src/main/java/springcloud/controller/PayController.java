package springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springcloud.entities.CommonResult;
import springcloud.entities.Payment;
import springcloud.service.PayService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
public class PayController {

    @Resource
    private PayService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") int id){
        return paymentService.getPaymentById(id);
    }
    @GetMapping("/lb")
    public String paymentport(){
        return serverPort;
    }
}
