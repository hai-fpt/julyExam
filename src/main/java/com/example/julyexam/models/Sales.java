package com.example.julyexam.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "sale")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slNo;
    private Long salesmanId;
    private String salesmanName;
    private LocalDate dos;

    @ManyToOne
    @JoinColumn(name = "prodId")
    private Product product;
}
