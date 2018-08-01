package com.illia.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @GeneratedValue(generator = "PRODUCT_GEN")
    @SequenceGenerator(name = "PRODUCT_GEN", sequenceName = "PRODUCT_SEQ", allocationSize = 1)
    private Long id;
    private String productName;
    private String description;

    @ManyToOne
    @JoinColumn(name = "FK_CATEGORY_ID")
    private Category category;


}
