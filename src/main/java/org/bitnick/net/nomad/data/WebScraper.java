package org.bitnick.net.nomad.data;

import org.bitnick.net.nomad.entity.JobListing;
import org.bitnick.net.nomad.http.HttpRequest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO remove suppress warnings annotation
@SuppressWarnings(value = "all")
public class WebScraper {
    public static List<JobListing> scrapeData(String keyword) throws MalformedURLException, IOException {
        // TODO get correct url
        URL url = new URL("https://test.change.me/");

        // TODO add css selector for target page
        String cssSelector = "[ADD RIGHT CSS SELECTER]";
        Document document = Jsoup.parse(HttpRequest.get(url));
        List<Element> elements = document.select(cssSelector)
                .stream()
                .filter(Element::hasText)
                .filter(e -> e.text().equalsIgnoreCase(keyword))
                .collect(Collectors.toList());

        if (!elements.isEmpty()) {
            List<JobListing> listings = new ArrayList<>();
            elements.forEach(element -> {
                // TODO Replace set method parameters to the appropriate
                //  attributes provided by the web element
                JobListing listing = new JobListing();
                listing.setJobTitle("");
                listing.setListingTitle("");
                listing.setUrl("");

                listings.add(listing);
            });

            return listings;
        }

        return null;
    }
}
