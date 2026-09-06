package lab.order.processing.system.service;

import lab.order.processing.system.domain.Order;
import lab.order.processing.system.map.OrderMap;
import lab.order.processing.system.repository.OrderActionsRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    OrderActionsRepository orderActionsRepository;
    OrderMap orderMap = new OrderMap();

    public OrderService(OrderActionsRepository orderActionsRepository) {
        this.orderActionsRepository = orderActionsRepository;
    }

    public void createOrder(Order order){
        orderActionsRepository.save(orderMap.orderDomainToOrderEntity(order));
    }
}
