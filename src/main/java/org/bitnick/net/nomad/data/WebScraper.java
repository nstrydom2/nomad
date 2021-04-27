package org.bitnick.net.nomad.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.List;
import java.util.stream.Collectors;

public class WebScraper {
    public static List<Object> scrapeData(String rawPageSrc) {
        Document document = Jsoup.parse(rawPageSrc);
        List<Element> elements = document.select("")
                .stream()
                .filter(Element::hasText)
                .filter(e -> e.text().equalsIgnoreCase(""))
                .collect(Collectors.toList());

        if (!elements.isEmpty()) {
            return null;
        }

        return null;
    }
}
