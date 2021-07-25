package ru.seoweblab.jwtRestApp.dto;

import lombok.Data;

/**
 * DTO class for authentication (login) request.
 *
 */

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}
