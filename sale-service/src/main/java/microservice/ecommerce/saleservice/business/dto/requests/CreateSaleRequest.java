package microservice.ecommerce.saleservice.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateSaleRequest {
    private UUID productId;
    private int price;
    private int quantity;
    private LocalDateTime saleTime;
}
