package com.github.callmewaggs.decenttownapi;

import com.github.callmewaggs.decenttownapi.api.ApiExplorer;
import java.io.IOException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecentTownApiApplication {

  public static void main(String[] args) throws IOException {
    ApiExplorer.sendUrlRequest();
    //SpringApplication.run(DecentTownApiApplication.class, args);
  }

}
