package com.qualtrics.dataset.payloadtester.hotel;

import lombok.Data;

@Data
public class Review {
    String date;
    String rating;
    String text;
    String title;
    String username;
}
