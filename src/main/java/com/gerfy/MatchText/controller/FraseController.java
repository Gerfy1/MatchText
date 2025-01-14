package com.gerfy.MatchText.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired //injeta o serviço
    private FraseService servico;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();
    }
}
