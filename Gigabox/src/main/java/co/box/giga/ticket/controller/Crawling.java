package co.box.giga.ticket.controller;

import java.io.IOException;
import java.util.Objects;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

public class Crawling {
	private static final int FIRST_PAGE_INDEX = 1;
	private static final int LAST_PAGE_INDEX = 32;
	private static final String PLATFORM = "Inflearn";

	/**
	 * 크롤링 어케하는건지 테스트 해본거임
	 */
	public static void main(String[] args) {
		try {
			// 개발 강의 모든 페이징 순회
			for (int i = FIRST_PAGE_INDEX; i <= LAST_PAGE_INDEX; i++) {
				final String inflearnUrl = "https://www.inflearn.com/courses/it-programming?order=seq&page=" + i;

				Connection conn = Jsoup.connect(inflearnUrl); // 강의 메인 페이지
				Document document = conn.get();

				// 이미지 주소 가져오기
				Elements imageUrlElements = document.getElementsByClass("swiper-lazy");
				// 강의 제목 가져오기
				Elements titleElements = document.select("div.card-content > div.course_title");
				// 가격 가져오기
				Elements priceElements = document.getElementsByClass("price");
				// 강의 링크 가져오기
				Elements linkElements = document.select("a.course_card_front");
				// 강의자 정보 가져오기
				Elements instructorElements = document.getElementsByClass("instructor");
				// 부가설명 가져오기
				Elements descriptionElements = document.select("p.course_description");
				// 기술스택 가져오기
				Elements skillElements = document.select("div.course_skills > span");
				// 이미지 주소 배열
				String[] imageUrls = new String[imageUrlElements.size()];

				int setIndex = 0;
				int getIndex = 0;

				for (Element e : imageUrlElements) {
					imageUrls[setIndex++] = e.attr("abs:src");
				}

				for (int j = 0; j < titleElements.size(); j++) {
					final String title = titleElements.get(j).text();
					final String price = priceElements.get(j).text();
					final String realPrice = getRealPrice(price); // 실제 가격
					final String salePrice = getSalePrice(price); // 할인된 가격
					final int realIntPrice = toInt(removeNotNumberic(realPrice));
					final int saleIntPrice = toInt(removeNotNumberic(salePrice));
					final String currency = String.valueOf(price.charAt(0));
					final String instructor = instructorElements.get(j).text();
					final String url = linkElements.get(j).attr("abs:href");
					final String description = descriptionElements.get(j).text();
					final String skills = removeWhiteSpace(skillElements.get(j).text());

					System.out.println("썸네일 : " + imageUrls[j]);
					System.out.println("강의제목 : " + title);
					System.out.println("가격 : " + realIntPrice);
					System.out.println("할인 가격 : " + saleIntPrice);
					System.out.println("원화 : " + currency);
					System.out.println("강의자 : " + instructor);
					System.out.println("강의 링크 : " + url);
					System.out.println("부가설명 : " + description);
					System.out.println("기술스택 : " + skills);

					// 강의 상세 페이지
					Connection innerConn = Jsoup.connect(url);
					Document innerDocument = innerConn.get();

					// 평점 가져오기
					Element ratingElement = innerDocument.selectFirst("div.dashboard-star__num");
					// 평점 없는 데이터 Null 처리
					final float rating = Objects.isNull(ratingElement) ? toFloat("0") : toFloat(ratingElement.text());
					System.out.println("평점 : " + rating);

					// 수강자 수
					Element listenerElement = innerDocument.selectFirst("div.cd-header__info-cover");
					final String listener = Objects.isNull(listenerElement)
							? innerDocument.selectFirst("span > strong").text()
							: innerDocument.select("div.cd-header__info-cover > span > strong").get(1).text();
					System.out.println("수강자 수 : " + removeNotNumberic(listener));
					final int viewCount = Integer.parseInt(removeNotNumberic(listener));

					// 강의 세션 수
					final String course = innerDocument.selectFirst("span.cd-curriculum__sub-title").text();
					System.out.println("강의 세션 수 : " + getSessionCount(course));
					final int sessionCount = Integer.parseInt(getSessionCount(course));
					System.out.println();

				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 맨 앞, 맨 뒤 소괄호 제거
	private static String removeBracket(final String str) {
		return str.replaceAll("^[(]|[)]$", "");
	}

	// html 태그 제거
	private static String stripHtml(final String html) {
		return Jsoup.clean(html, Whitelist.none());
	}

	private static String getSessionCount(String course) {
		return removeNotNumberic(course.substring(0, course.indexOf("개")));
	}

	// 공백 제거
	private static String removeWhiteSpace(final String str) {
		return str.replaceAll("\\s", "");
	}

	// 강의 평점
	private static float toFloat(final String str) {
		return Float.parseFloat(str);
	}

	// 실제 가격, 할인된 가격 모두 가져오기 위한 설정
	// 실제 가격
	private static String getRealPrice(final String price) {
		final String[] pricesArray = price.split(" ");
		return pricesArray[0];
	}

	// 할인된 가격
	private static String getSalePrice(final String price) {
		final String[] pricesArray = price.split(" ");
		return (pricesArray.length == 1) ? price : pricesArray[1];
	}

	// 숫자가 아닌것들 제거
	private static String removeNotNumberic(final String str) {
		return str.replaceAll("\\W", "");
	}

	// Int로 변환
	private static int toInt(final String str) {
		return Integer.parseInt(str);
	}
}
