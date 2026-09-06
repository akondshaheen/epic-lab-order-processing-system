package lab.order.processing.system.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "order1")
@Data
public class OrderEntity {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name="test")
    private String test;

    @Column(name = "date")
    private Timestamp time;
}
