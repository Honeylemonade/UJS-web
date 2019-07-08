package com.xyp.ujsweb;


import com.xyp.ujsweb.entity.NewsItem;
import com.xyp.ujsweb.entity.User;
import com.xyp.ujsweb.service.UserService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UjswebApplicationTests {
    @Autowired
   UserService userService;

    @Test
    public void t1() throws IOException {
        ArrayList<NewsItem> newsItemArrayList=new ArrayList<>();
        Document document = Jsoup.connect("http://www.ujs.edu.cn/system/resource/code/rss/rssfeed.jsp?type=list&treeid=1062&viewid=187881&mode=10&dbname=vsb&owner=1342798350&ownername=ujs&contentid=132545&number=5&httproot=").get();
        ArrayList<Element> items = document.getElementsByTag("item");
        System.out.println(items);
    }
}
