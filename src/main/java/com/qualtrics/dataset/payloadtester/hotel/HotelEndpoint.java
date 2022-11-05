package com.qualtrics.dataset.payloadtester.hotel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelEndpoint {
    @PostMapping("/hotel")
    ResponseEntity<Object> hotel(@RequestBody HotelData hotelData) {
        System.out.println(hotelData.created);
        return ResponseEntity.ok().build();
    }
}
