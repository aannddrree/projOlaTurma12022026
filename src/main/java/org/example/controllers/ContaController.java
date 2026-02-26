package org.example.controllers;

import org.example.model.Conta;
import org.example.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PostMapping("/myproject/api/v1/conta")
    public Conta save(Conta conta){
        return  contaService.save(conta);
    }
    @GetMapping("/myproject/api/v1/conta")
    public List<Conta> findAll(){
        return contaService.findAll();
    }
}
