package org.example.service;

import org.example.model.Conta;
import org.example.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    // Injeção de dependencia -> Classe ContaRepository não precisa
    // ser instanciada, esta anotação garante que eu posso acessar
    // os métodos existentes nesta interface que implementa a classe
    // MontoRepository
    @Autowired
    private ContaRepository contaRepository;

    // responsável por savar as informações no mongoDB
    // por meio da utilização da interface contaRepository
    // String Data
    public Conta save(Conta conta){
        return contaRepository.save(conta);
    }
    // responsável por consultar os dados no mongoDB
    public List<Conta> findAll(){
        return  contaRepository.findAll();
    }
}
