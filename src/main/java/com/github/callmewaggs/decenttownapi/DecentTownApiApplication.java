package com.github.callmewaggs.decenttownapi;

import com.github.callmewaggs.decenttownapi.api.URLBuilder;
import com.github.callmewaggs.decenttownapi.api.XMLParser;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecentTownApiApplication {

  public static void main(String[] args) {
    String urlPattern = URLBuilder.build(String.valueOf(11680), String.valueOf(201806));
    XMLParser.parse(urlPattern);
    // SpringApplication.run(DecentTownApiApplication.class, args);
  }
}
