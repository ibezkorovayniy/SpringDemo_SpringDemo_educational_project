package com.illia.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CATEGORIES")
public class Category {

    @Id
    @GeneratedValue(generator = "CATEGORY_GEN")
    @SequenceGenerator(name = "CATEGORY_GEN", sequenceName = "CATEGORY_SEQ", allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "category")
    private List<Product> products = new ArrayList<>();

}
