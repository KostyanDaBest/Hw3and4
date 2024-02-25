package DZ3.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Obertka {
    @JsonProperty("order")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
