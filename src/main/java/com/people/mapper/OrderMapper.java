package com.people.mapper;

import com.people.pojo.Order;
import com.people.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface OrderMapper {
    List<Order> queryOrderList();
    Order queryOrderById(int order_id);
    int addOrder(Order order);
    int updateOrder(Order order);
    int deleteOrder(int order_id);
}
