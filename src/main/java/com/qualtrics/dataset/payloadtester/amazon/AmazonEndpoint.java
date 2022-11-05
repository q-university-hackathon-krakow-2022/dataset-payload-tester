package com.qualtrics.dataset.payloadtester.amazon;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonEndpoint {
    @PostMapping("/amazon")
    ResponseEntity<Object> amazon(@RequestBody AmazonData amazonData) {
        System.out.println(amazonData.reviewTime);
        return ResponseEntity.ok().build();
    }
}
