package com.github.callmewaggs.decenttownapi;

import com.github.callmewaggs.decenttownapi.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecentTownApiApplication {

  @Autowired
  HouseRepository houseRepository;

  public static void main(String[] args) {
    //      SpringApplication app = new SpringApplication(DecentTownApiApplication.class);
    //    app.run(args);

    for (int startYM = 201901; startYM <= 201912; ++startYM) {
      //String urlPattern = URLBuilder.build(String.valueOf(11680), String.valueOf(startYM));
      // List<House> houses = XMLParser.RowHouseParsing(urlPattern);
      System.out.println(true);
    }
  }
}
