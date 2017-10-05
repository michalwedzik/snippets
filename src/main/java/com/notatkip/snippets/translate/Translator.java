package com.notatkip.snippets.translate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;

public class Translator {

    private static final String API_KEY = "trnsl.1.1.20170501T125742Z.2d79460e253e0b07.e7c69c1834645efe6c7d440cd181a9af6fb87062";

    private static final String API_URL = "https://translate.yandex.net/api/v1.5/tr.json/translate";

    private static final String LANG = "en-pl";


    private ResponseObject responseStringToObject(final String response) {
        Gson gson = new Gson();
        return gson.fromJson(response, ResponseObject.class);
    }


    public String translate(final String text) throws Exception {
        return responseStringToObject(makeRequestToTranslate(text)).getText().get(0);
    }


    private String makeRequestToTranslate(final String text) throws Exception {

        URL obj = buildUrl(API_URL, ImmutableMap.of("lang", LANG, "key", API_KEY, "text", text));

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();

    }


    private URL buildUrl(final String url, final Map<String, String> params) throws MalformedURLException {
        StringBuilder sb = new StringBuilder(url);
        sb.append("?");

        params.forEach((k, v) -> {
            sb.append(k);
            sb.append("=");
            try {
                sb.append(URLEncoder.encode(v, "UTF-8"));
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            sb.append("&");
        });
        return new URL(sb.toString());
    }
}
