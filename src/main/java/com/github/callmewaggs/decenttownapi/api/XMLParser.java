package com.github.callmewaggs.decenttownapi.api;

import com.github.callmewaggs.decenttownapi.domain.item.RentItem;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {

  private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

  // tag값의 정보를 가져오는 메소드
  private static String getTagValue(String tag, Element eElement) {
    NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
    Node nValue = nlList.item(0);
    if (nValue == null) {
      return null;
    }
    return nValue.getNodeValue().trim();
  }

  public static List<RentItem> parse(String url) {
    try {
      // parsing할 url 지정(API 키 포함해서)
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(url);

      // root tag
      doc.getDocumentElement().normalize();
      System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

      // 파싱할 tag
      NodeList nList = doc.getElementsByTagName("item");
      System.out.println("파싱할 리스트 수 : " + nList.getLength());

      for (int temp = 0; temp < nList.getLength(); temp++) {
        Node nNode = nList.item(temp);
        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          System.out.println("######################");
          System.out.println(eElement.getTextContent());
          System.out.println("건축년도 : " + getTagValue("건축년도", eElement));
          System.out.println("지역코드 : " + getTagValue("지역코드", eElement));
          System.out.println("동 : " + getTagValue("법정동", eElement));
          System.out.println("지번 : " + getTagValue("지번", eElement));
          System.out.println("연립다세대 : " + getTagValue("연립다세대", eElement));
          System.out.println("층 : " + getTagValue("층", eElement));
          System.out.println("보증금 : " + getTagValue("보증금액", eElement));
          System.out.println("월세 : " + getTagValue("월세금액", eElement));
          System.out.println("전용면적 : " + getTagValue("전용면적", eElement));
          System.out.println("계약연도 : " + getTagValue("년", eElement));
          System.out.println("계약월 : " + getTagValue("월", eElement));
          System.out.println("계약일 : " + getTagValue("일", eElement));
        } // for end
      } // if end

    } catch (Exception e) {
      e.printStackTrace();
    } // try ~ catch end
    return new ArrayList<>();
  }
}
