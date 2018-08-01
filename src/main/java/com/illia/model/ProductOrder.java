package com.illia.model;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ORDERS")
public class ProductOrder {

    @Id
    @GeneratedValue(generator = "ORDER_GEN")
    @SequenceGenerator(name = "ORDER_GEN", sequenceName = "ORDER_SEQ", allocationSize = 1)
    private Long id;
    @Column(name = "ORDER_DETAILS")
    private String details;

    @ManyToOne
    @JoinColumn(name = "FK_USER_ID")
    private User user;

    public ProductOrder() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
