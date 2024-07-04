package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Float price;

    @Column(name = "number_of_product", nullable = false)
    private int numberOfProduct;

    @Column(name = "total_money", nullable = false)
    private int totalMoney;

    @Column(name = "color")
    private String color;
}
