package parser;

import domain.BookmarkRiseSetInfoDTO;
import mapper.BookmarkRiseSetMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RiseSetInfoParser {
    private BookmarkRiseSetInfoDTO riseSetInfoDTO;
    private String urlStr;
    private Document document;
    public RiseSetInfoParser(String src, String keyValueList, String serviceKey){
        urlStr = src +"&ServiceKey="+serviceKey + keyValueList;
        BufferedReader br = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        try{
            String urlStr = "http://apis.data.go.kr"
                    + "/B090041/openapi/service/RiseSetInfoService/getAreaRiseSetInfo"
                    + "?location=%EC%84%9C%EC%9A%B8&locdate=20150101&ServiceKey="
                    + "kcC12496uTBemhlOIjYLgPOX4xJ5Tb%2BpoD30h21pWJ6TZyuxND7KUR%2BaWDyGD6qu%2ByVOUWUE78iGCzm%2F3VAQ7w%3D%3D&";
            URL url = new URL(urlStr);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
            String result = "";
            String line;
            while((line =br.readLine()) != null){
                result = result + line.trim();
            }

            InputSource source = new InputSource(new StringReader(result));
            builder = factory.newDocumentBuilder();
            document = builder.parse(source);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public BookmarkRiseSetInfoDTO getValue() throws XPathExpressionException {
        BookmarkRiseSetInfoDTO temp = new BookmarkRiseSetInfoDTO();

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();

        XPathExpression expression = xPath.compile("//items/item/aste");
        NodeList nodeList = (NodeList) expression.evaluate(document, XPathConstants.NODESET);

    }

}
