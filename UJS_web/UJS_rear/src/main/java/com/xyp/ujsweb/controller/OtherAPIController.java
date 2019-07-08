package com.xyp.ujsweb.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyp.ujsweb.entity.NewsItem;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * OtherAPIController:
 *
 * @author XvYanPeng
 * @date 2019/5/12 13:44
 */
@CrossOrigin
@RestController
public class OtherAPIController {
    /**
     * @return java.lang.String
     * @description 日历API
     * @params []
     * @date 2019/5/12
     */
    @GetMapping("/calendar")
    public Object getCalendar() throws IOException {
        String time;
        int year;
        int month;
        int day;
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DATE);
        String uri = "http://v.juhe.cn/calendar/day?date=" + year + "-" + month + "-" + day + "&key=9312f02a3582e7deb132c4246937db22";
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // 设置请求方式
        connection.setRequestMethod("GET");
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
        String json = br.readLine();
        ObjectMapper mapper = new ObjectMapper();
        Object object = mapper.readValue(json, Object.class);
        return object;
    }

    /**
     * @return java.lang.Object
     * @description 获取天气的接口
     * @params []
     * @date 2019/5/13
     */
    @GetMapping("/weather")
    public Object getWeather() throws IOException {
        String uri = "http://apis.juhe.cn/simpleWeather/query?city=%E9%95%87%E6%B1%9F&key=3743ec817ecbd30fb3ae2d07493536e2";
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
        String json = br.readLine();
        ObjectMapper mapper = new ObjectMapper();
        Object object = mapper.readValue(json, Object.class);
        return object;
    }

    @GetMapping("/new")
    public ArrayList<NewsItem> getNewsItemArrayList() throws IOException {
        ArrayList<NewsItem> newsItemArrayList = new ArrayList<>();
        Document document = Jsoup.connect("http://www.ujs.edu.cn/system/resource/code/rss/rssfeed.jsp?type=list&treeid=1062&viewid=187881&mode=10&dbname=vsb&owner=1342798350&ownername=ujs&contentid=132545&number=8&httproot=").get();
        ArrayList<Element> items = document.getElementsByTag("item");
        //存放临时新闻数据
        for (Element item : items) {
            NewsItem tempItem = new NewsItem();
            tempItem.setTitle(item.getElementsByTag("title").html());
            tempItem.setUrl(item.getElementsByTag("link").html());
            tempItem.setDate(item.getElementsByTag("pubDate").html());
            newsItemArrayList.add(tempItem);
        }
        return newsItemArrayList;
    }
}
