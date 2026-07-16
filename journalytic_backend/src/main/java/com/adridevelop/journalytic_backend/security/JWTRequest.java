package com.adridevelop.journalytic_backend.security;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTRequest {

    private String username;
    private String password;

}
