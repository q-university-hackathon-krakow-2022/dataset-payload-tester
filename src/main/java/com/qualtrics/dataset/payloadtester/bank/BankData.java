package com.qualtrics.dataset.payloadtester.bank;

import lombok.Data;

@Data
public class BankData {
    String created;
    String channel;
    String product;
    String issue;
    String subIssue;
    String text;
    String companyResponse;
    String companyToCustomerResponse;
    String consumerDisputed;
    Company company;
}
