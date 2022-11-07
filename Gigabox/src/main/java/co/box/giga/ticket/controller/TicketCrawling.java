package co.box.giga.ticket.controller;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TicketCrawling {
	public static void main(String[] args) {
		final String bookingUrl = "https://www.megabox.co.kr/booking";
        Connection conn = Jsoup.connect(bookingUrl);
        
        try {
			Document document = conn.get();
			Elements dateElements = document.getElementsByClass("time-schedule");
			
			for(Element element : dateElements) {
				System.out.println(element);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
        
	}

}
