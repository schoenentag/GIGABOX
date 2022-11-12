package co.box.giga.ticket.controller;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TicketCrawling {
	public static void main(String[] args) {
		
		try {
			final String bookingUrl = "https://www.megabox.co.kr/booking";
			Connection conn = Jsoup.connect(bookingUrl);
			Document document = conn.get();
			
			Elements timeElementsUrl = document.getElementsByClass("time-schedule");
			
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
        
	}

}
