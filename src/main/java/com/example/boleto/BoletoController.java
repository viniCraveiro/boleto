package com.example.boleto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BoletoController {

    @GetMapping("/gerarBoleto")
    public ResponseEntity<String> gerarBoleto() {
//        BoletoGenerator boletoGenerator = new BoletoGenerator();
//        boletoGenerator.gerarBoletoPDF();

        return ResponseEntity.ok("Boleto gerado com sucesso.");
    }
}
