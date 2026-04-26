package com.nearbuy.backend.entity;

import com.nearbuy.backend.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private double amount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
}