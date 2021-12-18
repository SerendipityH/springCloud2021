package com.serendipity.springcloud.alibaba.hadler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.serendipity.springcloud.alibaba.entities.CommonResult;

import java.util.HashMap;

/**
 * @author serendipity
 * @version 1.0
 * @date 2021/12/10 19:44
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"自定义，global handlerException");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(5555,"自定义，global handlerException-----------2");
    }
}
