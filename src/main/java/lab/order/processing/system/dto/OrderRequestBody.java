package lab.order.processing.system.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class OrderRequestBody {
    String name;
    String test;
    Timestamp time;
}
