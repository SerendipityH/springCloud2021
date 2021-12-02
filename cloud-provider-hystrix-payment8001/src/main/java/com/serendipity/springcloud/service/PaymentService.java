package com.serendipity.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/12/2 20:49
 */
@Service
public class PaymentService {

    //成功
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_OK,id：  " + "O(∩_∩)O" + "哈哈哈";
    }

    //失败
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "13000")  //3秒钟以内就是正常的业务逻辑
    })
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 5;
        //int i = 1/0;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_TimeOut,id：  " + id + "\t" + "(●'◡'●)" + " 耗时(秒)" + timeNumber;
    }
    //兜底方法
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   系统繁忙 或出错, 请稍候再试   ,id：  "+id+"\t"+"哭了哇呜";
    }

}



