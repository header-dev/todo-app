package com.idevalot.backend.jwt;

public class JwtTokenRequest {
      
      private String username;
      
      private String password;
  
      public JwtTokenRequest() {
      }
  
      public JwtTokenRequest(String username, String password) {
          this.username = username;
          this.password = password;
      }
  
      public String getUsername() {
          return username;
      }

      public void setUsername(String username) {
        this.username = username;
      }
  
      public String getPassword() {
          return password;
      }

      public void setPassword(String password) {
        this.password = password;
      }
}
