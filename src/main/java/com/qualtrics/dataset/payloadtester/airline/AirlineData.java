package com.qualtrics.dataset.payloadtester.airline;

import lombok.Data;

@Data
public class AirlineData {
    String travelType;
    String travelClass;
    String travelDistance;
    Passenger passenger;
    Review review;
}
