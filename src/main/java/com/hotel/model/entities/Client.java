package com.hotel.model.entities;

import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Client extends User{
    @Column(
            name = "address",
            nullable = true
    )
    private String address;

    @Column(
            name = "address",
            nullable = true
    )
    private String city;

    @Column(
            name = "address",
            nullable = true
    )
    private String country;

    @Column(
            name = "address",
            nullable = true
    )
    private String zipCode;

    @Column(
            name = "address",
            nullable = true
    )
    private String phone;

    @Column(
            name = "address",
            nullable = true
    )
    private String passportNumber;
}
