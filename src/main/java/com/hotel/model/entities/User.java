package com.hotel.model.entities;

import com.hotel.model.enums.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
Inheritance:
    - SIMPLE_TABLE: una sola tabla. Se agrega @DiscriminationColumn, para saber que tipo de entidad es.
        * Simple y rapida, menos tablas. Muchas columnas nulas.
    - JOINED: Cada clase se mapea a su propia tabla, y las subclases se conectan mediante una tabla JOIN.
        * Limpio y normalizado. Requiere JOIN (mas lento), consultas complejas.
    - TABLE_PER_CLASS: Cada clase concreta (no abstracta) se guarda en su propia tabla completa, con sus propios campos heredados.
        * Tablas independientes. Ideal para subclases sin relacion. Duplicacion de columnas.
 */

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @SequenceGenerator(
            name = "user_seq_gen",
            sequenceName = "user_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_seq_gen"
    )
    private Long id;

    @Column(
            name = "name",
            nullable = false
    )
    private String name;

    @Column(
            name = "lastName",
            nullable = false
    )
    private String lastName;

    @Column(
            name = "email",
            unique = true,
            nullable = false
    )
    private String email;

    @Column(
            name = "password",
            length = 8,
            nullable = false
    )
    private String password;

    @Column(
            name = "createdDate",
            nullable = false
    )
    private LocalDate createdDate;

    @Enumerated(EnumType.STRING)
    private Roles role;
}
