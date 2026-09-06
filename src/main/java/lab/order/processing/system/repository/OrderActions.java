package lab.order.processing.system.repository;


import lab.order.processing.system.domain.Order;

public interface OrderActions {
    void save(OrderEntity orderEntity);
}
