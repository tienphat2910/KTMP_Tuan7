package com.tienphat29.orderservice.services;

import com.tienphat29.orderservice.entities.Order;

public interface OrderService {
    Order save(Order order);
    Order findById(long id);
}
