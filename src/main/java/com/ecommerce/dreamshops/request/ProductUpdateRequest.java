package com.ecommerce.dreamshops.request;

import com.ecommerce.dreamshops.model.Category;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
@Data
public class ProductUpdateRequest {
    private int id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
