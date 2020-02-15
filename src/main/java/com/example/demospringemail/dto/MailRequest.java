package com.example.demospringemail.dto;

import lombok.Data;

@Data
public class MailRequest {
    public String name ;
    public String to ;
    public String from ;
    public String subject ;


}
