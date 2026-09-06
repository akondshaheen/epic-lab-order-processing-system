package lab.order.processing.system.repository;

import lab.order.processing.system.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderActionsRepository implements OrderActions{
    OrderJpaRepository orderJpaRepository;

    public OrderActionsRepository(OrderJpaRepository orderJpaRepository) {
        this.orderJpaRepository = orderJpaRepository;
    }

    @Override
    public void save(OrderEntity orderEntity) {
        orderJpaRepository.save(orderEntity);
    }
}
