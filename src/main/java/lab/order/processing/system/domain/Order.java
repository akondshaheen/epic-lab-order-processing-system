package lab.order.processing.system.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Order {
    private final UUID id;
    private final String name;
    private final String test;
    private final Timestamp creationTime;

    public Order(String name, String test, Timestamp creationTime) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.test = test;
        this.creationTime = creationTime;
    }
}
