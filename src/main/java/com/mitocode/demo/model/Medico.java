package com.mitocode.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idMedic;

    @Column(nullable = false,length = 70)
    private String fisrtName;
    @Column(nullable = false,length = 70)
    private String lastName;
    @Column(nullable = false,length = 12)
    private String cmp;
    @Column(length = 255)
    private String photoUrl;
}
