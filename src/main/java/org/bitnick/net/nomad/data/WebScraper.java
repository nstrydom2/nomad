package org.bitnick.net.nomad.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebScraper {
    public static void scrapeData(String rawPageSrc) {
        Document document = Jsoup.parse(rawPageSrc);
        Elements elements = document.select("");

    }
}
