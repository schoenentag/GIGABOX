package co.box.giga.movie.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
/**
* 영화정보 API 출력 //사용안함
* @author 김하은
* @date 2022.11.01
* @version 1.0
*/

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
    	
    	Calendar cal = Calendar.getInstance(); //현재시간 정보
    	cal.setTime(new Date());
    	cal.add(Calendar.DATE, -1); // 하루 전 날짜
    	
    	Map<String, String> paramMap = new HashMap<String, String>();
    	paramMap.put("key", AUTH_KEY); //인증키
    	paramMap.put("targetDt", DT_FMT.format(cal.getTime())); // 조회 날짜
    	paramMap.put("itemperpage", "10"); // 조회 row 개수
    	paramMap.put("multiMovieYn", "Y"); // Y:다양성, N:상업영화, Default : 전체
    	paramMap.put("reNationCd", "K"); // K:한국영화, F:외국영화, Default:전체
    	
    	try {
    		 URL requestURL = new URL(REQUEST_URL+"?"+makeQueryString(paramMap)); //페이지전환
             HttpURLConnection conn = (HttpURLConnection) requestURL.openConnection();
             
             // Get 방식으로 요청
             conn.setRequestMethod("GET");
             conn.setDoInput(true);
             
             //Stream -> JSON JSONObject
             //버퍼 읽기
             BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
             String readline = null;
             StringBuffer response = new StringBuffer(); 
             
             while((readline = br.readLine()) != null) {
            	 response.append(readline); //StringBuffer의 append() 메소드를 통해 문자열을 계속 추가할 수 있다
             }
             
             //JSON  객체로 변환(key-value 쌍으로 데이터를 표현하는 객체)
             JSONObject responseBody = new JSONObject(response.toString());
             
             //데이터 추출
             JSONObject boxOfficeResult = responseBody.getJSONObject("boxOfficeResult");
             
             // 박스오피스 주제 출력
             String boxofficeType = boxOfficeResult.getString("boxofficeType");
             System.out.println("=============boxofficeType : " + boxofficeType);
             
             // 박스오피스 목록 출력
             JSONArray dailyBoxOfficeList = boxOfficeResult.getJSONArray("dailyBoxOfficeList");
             Iterator<Object> iter = dailyBoxOfficeList.iterator(); //반복자(열이나 그와 유사한 자료구조의 내부요소를 순회하는 객체)
             MovieInfoVO mVO = new MovieInfoVO();
             while(iter.hasNext()) { // boolean , 다음에 가져올 값이 있으면 True 아니면 False
            	 JSONObject boxOffice = (JSONObject) iter.next(); //iterator의 다음 요소 값 반환
            	 System.out.printf("============ %s - %s\n", boxOffice.get("rnum"), boxOffice.get("movieNm"));
            	 mVO.setTitle((String) boxOffice.get("movieNm"));
            	 System.out.println("=========값이 10개 들어갔을까..?"+mVO.getTitle());
            	
             }
             
    	}catch (IOException e) {
            e.printStackTrace();
        }
    }

}
