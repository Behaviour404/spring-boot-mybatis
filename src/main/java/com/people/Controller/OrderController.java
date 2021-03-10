package com.people.Controller;

import com.people.mapper.OrderMapper;
import com.people.mapper.UserMapper;
import com.people.pojo.Order;
import com.people.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;
    @GetMapping("/queryOrderList")
    public List<Order> queryOrderList(){
        List<Order> orderList = orderMapper.queryOrderList();
        for(Order order : orderList){
            System.out.println(order);
        }
        return orderList;
    }
}
