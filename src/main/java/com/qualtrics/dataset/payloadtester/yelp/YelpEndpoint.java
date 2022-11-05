package com.qualtrics.dataset.payloadtester.yelp;

import com.qualtrics.dataset.payloadtester.hotel.HotelData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YelpEndpoint {
    @PostMapping("/yelp")
    ResponseEntity<Object> yelp(@RequestBody YelpData yelpData) {
        System.out.println(yelpData.created);
        return ResponseEntity.ok().build();
    }
}
