package com.excelence.demo.service;

import com.excelence.demo.model.ExampleOrder;
import com.excelence.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public ExampleOrder getOrderById(int orderId) {
        return orderRepository.getOrder(orderId);
    }

    public void createOrder(ExampleOrder order) {
        orderRepository.insertOrder(order);
    }

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
