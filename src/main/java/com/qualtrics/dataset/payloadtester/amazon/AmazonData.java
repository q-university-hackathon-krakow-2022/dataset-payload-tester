package com.qualtrics.dataset.payloadtester.amazon;

import lombok.Data;

@Data
public class AmazonData {
    String overall;
    String verified;
    String reviewTime;
    String reviewerID;
    String asin;
    String reviewerName;
    String reviewText;
    String summary;
    String unixReviewTime;
}
