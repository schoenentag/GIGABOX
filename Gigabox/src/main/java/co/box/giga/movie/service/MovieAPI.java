package co.box.giga.movie.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MovieAPI {
	
	//일별 박스오피스
    private final String REQUEST_URL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json";
    private final String AUTH_KEY = "74ce9f68d191d2c403cadefac177e152";
    
    //통계날짜
    private final SimpleDateFormat DT_FMT = new SimpleDateFormat("yyyyMMdd"); //자바 날짜 포맷
    
    public String makeQueryString(Map<String, String> paramMap) {
    	
    	final StringBuilder sb = new StringBuilder(); //문자열 연산
    	
    	//Map 전체 출력 : entrySet() -key, value 필요, keySet()-key값만 필요
    	paramMap.entrySet().forEach((entry)->{
    		if(sb.length() > 0) {
    			sb.append('&');
    		}
    		sb.append(entry.getKey()).append('=').append(entry.getValue());
    	});
    	return sb.toString();
    }
    
    public void requestAPI() {
    	
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(new Date());
    	cal.add(Calendar.DATE, -1); // 하루 전 날짜
    	
    	Map<String, String> paramMap = new HashMap<String, String>();
    	paramMap.put("key", AUTH_KEY); //인증키
    	paramMap.put("targetDt", DT_FMT.format(cal.getTime())); // 조회 날짜
    	paramMap.put("itemperpage", "10"); // 조회 row 개수
    	paramMap.put("multiMovieYn", "Y"); // Y:다양성, N:상업영화, Default : 전체
    	paramMap.put("reNationCd", "K"); // K:한국영화, F:외국영화, Default:전체
    	
    	try {
    		 URL requestURL = new URL(REQUEST_URL+"?"+makeQueryString(paramMap));
             HttpURLConnection conn = (HttpURLConnection) requestURL.openConnection();
    	}catch (IOException e) {
            e.printStackTrace();
        }
    }

}
