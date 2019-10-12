package com.entor.test;

import java.io.IOException;

import javax.security.auth.Subject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
	
	public static void main(String[] args) throws IOException {
		Document doc = null;		
		//给我个连接
		String  url = "https://www.dytt8.net/html/gndy/dyzz/list_23_2.html";
		doc = Jsoup.connect(url).get();
		//分解
		Elements tables =  doc.select("table.tbspan");
		//分解
		for (Element table : tables) {
			String name = table.select("tr").last().select("td").first().text();
			String [] b = name.split("/");
			System.out.println(b[0]);
//			System.out.println(name);
		}
		
	}
}
