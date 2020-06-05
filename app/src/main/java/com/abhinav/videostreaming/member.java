package com.abhinav.videostreaming;

import java.lang.reflect.Member;

public class member {
    String title,url;

    public member() {}

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
