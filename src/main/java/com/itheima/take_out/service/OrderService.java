package com.itheima.take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.take_out.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);

    /**
     * 用户再来一单
     * @param orders
     */
    public void again(Orders orders);
}
