package com.example.detran.controller;

import com.example.detran.veiculo.Veiculo;
import com.example.detran.veiculo.VeiculoRepository;
import com.example.detran.veiculo.VeiculoRequestDTO;
import com.example.detran.veiculo.VeiculoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    public void saveVeiculo(@RequestBody VeiculoRequestDTO data){
        Veiculo veiculoData = new Veiculo(data);
        veiculoRepository.save(veiculoData);
        //return;
    }

    @GetMapping
    public List<VeiculoResponseDTO> getAll(){
        List<VeiculoResponseDTO> veiculoList = veiculoRepository.findAll()
                .stream().map(VeiculoResponseDTO::new).toList();
        return veiculoList;
    }
}
