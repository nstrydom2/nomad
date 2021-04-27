package org.bitnick.net.nomad.data;

import org.bitnick.net.nomad.entity.JobListing;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
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
            List<JobListing> listings = new ArrayList<>();
            elements.forEach(element -> {
                // TODO Replace set method paramets to the appropriate
                //  attributes provided by the web element
                JobListing listing = new JobListing();
                listing.setJobTitle("");
                listing.setListingTitle("");
                listing.setUrl("");

                listings.add(listing);
            });
        }

        return null;
    }
}
