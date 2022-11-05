package com.qualtrics.dataset.payloadtester.hotel;

import lombok.Data;

@Data
public class HotelData {
    String created;
    String updated;
    String categories;
    String primaryCategories;
    Hotel hotel;
    Review review;
}
