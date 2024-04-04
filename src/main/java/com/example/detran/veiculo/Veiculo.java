package com.example.detran.veiculo;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "veiculos")
@Entity(name = "veiculos")
@Data
public class Veiculo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Long ano;

    public Veiculo(VeiculoRequestDTO data){
        this.marca = data.marca();
        this.modelo = data.modelo();
        this.ano = data.ano();
    }
}
