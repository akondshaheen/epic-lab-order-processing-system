package lab.order.processing.system.controller;

import lab.order.processing.system.domain.Order;
import lab.order.processing.system.dto.OrderRequestBody;
import lab.order.processing.system.repository.OrderActionsRepository;
import lab.order.processing.system.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/create")
    public void createorderCreation(){
        System.out.println("##########################-----------######################");
    }

    @PostMapping("/create")
    public void orderCreation(@RequestBody OrderRequestBody orderRequestBody){
        System.out.println("##########################-----222222------######################");

        orderService.createOrder(new Order( orderRequestBody.getName(), orderRequestBody.getTest(), orderRequestBody.getTime()));
    }

}
