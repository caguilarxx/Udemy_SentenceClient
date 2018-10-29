package com.awi.sentenceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SentenceclientApplication {

  public static void main(String[] args) {
    SpringApplication.run(SentenceclientApplication.class, args);
  }
}
