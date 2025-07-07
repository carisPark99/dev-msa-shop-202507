package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventorIncreased extends AbstractEvent {

    private Long id;

    public InventorIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventorIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
