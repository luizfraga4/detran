package com.example.detran.veiculo;

public record VeiculoResponseDTO(Long id, String marca, String modelo, Long ano) {
    public VeiculoResponseDTO(Veiculo veiculo){
        this(veiculo.getId(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getAno());
    }
}
