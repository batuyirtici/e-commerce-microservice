package microservice.ecommerce.commonpackage.events.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreatedEvent {
    private UUID categoryId;
    private UUID productId;
    private String categoryName;
    private String productName;
    private int productQuantity;
    private double productPrice;
    private String productDescription;
    private String state;
}