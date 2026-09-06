package lab.order.processing.system.map;

import lab.order.processing.system.domain.Order;
import lab.order.processing.system.repository.OrderEntity;
import org.springframework.stereotype.Component;

public class OrderMap {

    public OrderEntity orderDomainToOrderEntity(Order order){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(order.getId());
        orderEntity.setName(order.getName());
        orderEntity.setTest(order.getTest());
        orderEntity.setTime(order.getCreationTime());

        return  orderEntity;
    }

    public Order orderEntityToOrderDomain(OrderEntity orderEntity){
        return new Order(orderEntity.getName(), orderEntity.getTest(), orderEntity.getTime());
    }
}
