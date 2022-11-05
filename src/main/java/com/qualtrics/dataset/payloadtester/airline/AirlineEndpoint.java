package com.qualtrics.dataset.payloadtester.airline;

import com.qualtrics.dataset.payloadtester.hotel.HotelData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirlineEndpoint {
    @PostMapping("/airline")
    ResponseEntity<Object> airline(@RequestBody AirlineData airlineData) {
        System.out.println(airlineData.travelDistance);
        return ResponseEntity.ok().build();
    }
}
