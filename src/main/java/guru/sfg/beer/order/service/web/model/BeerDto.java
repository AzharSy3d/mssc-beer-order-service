package guru.sfg.beer.order.service.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * * Created by AzSyed on 4/27/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto implements Serializable {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private String upc;
    private BigDecimal price;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
}
