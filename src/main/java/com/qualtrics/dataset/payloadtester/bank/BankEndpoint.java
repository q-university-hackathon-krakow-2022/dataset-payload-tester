package com.qualtrics.dataset.payloadtester.bank;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankEndpoint {
    @PostMapping("/bank")
    ResponseEntity<Object> bank(@RequestBody BankData bankData) {
        System.out.println(bankData.text.length());
        return ResponseEntity.ok().build();
    }
}
