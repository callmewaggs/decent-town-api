package com.github.callmewaggs.decenttownapi;

import com.github.callmewaggs.decenttownapi.api.URLBuilder;
import com.github.callmewaggs.decenttownapi.api.XMLParser;

public class DecentTownApiApplication {

  public static void main(String[] args) {
    for (int startYM = 201901; startYM <= 201912; ++startYM) {
      String urlPattern = URLBuilder.build(String.valueOf(11680), String.valueOf(startYM));
      XMLParser.parse(urlPattern);
    }
  }
}
