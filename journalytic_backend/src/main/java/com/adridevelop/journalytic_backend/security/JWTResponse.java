package com.adridevelop.journalytic_backend.security;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTResponse {

    private String jwt;
    private Map<String, Object> messages;
}
