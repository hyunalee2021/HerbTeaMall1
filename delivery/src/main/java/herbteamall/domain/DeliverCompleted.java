package herbteamall.domain;

import herbteamall.domain.*;
import herbteamall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliverCompleted extends AbstractEvent {

    private Long id;

    public DeliverCompleted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliverCompleted() {
        super();
    }
}
