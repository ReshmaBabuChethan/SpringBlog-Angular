package com.bjm.springblog.service;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private String authenticationToken;
    private String username;

    //created as error
    //public AuthenticationResponse(String authenticationToken, String username) {
    //}

    //public AuthenticationResponse(String authenticationToken, String username) {
    // }
}
