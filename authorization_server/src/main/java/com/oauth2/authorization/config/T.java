package com.oauth2.authorization.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class T {

  public static void main(String[] args) {
    System.err.println(new BCryptPasswordEncoder().encode("secret"));
  }
}
