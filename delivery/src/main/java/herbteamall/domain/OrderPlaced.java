package herbteamall.domain;

import herbteamall.domain.*;
import herbteamall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
