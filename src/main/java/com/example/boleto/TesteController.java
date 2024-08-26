package com.example.boleto;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class TesteController {



    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        System.out.println("Caiu no controller do teste, preparando para gerar o boleto");

        ACBrBoleto.geraBoleto();

        var aaa = new ResponseEntity<String>(HttpStatus.OK);
        return aaa;
    }

}
