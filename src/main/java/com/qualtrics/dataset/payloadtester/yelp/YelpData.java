package com.qualtrics.dataset.payloadtester.yelp;

import lombok.Data;

@Data
public class YelpData {
    String created;
    String business;
    String user;
    String stars;
    String text;
    String useful;
    String funny;
    String cool;
}
