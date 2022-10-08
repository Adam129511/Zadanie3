package com.example.httpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

class Client {
    public static void main(String[] args) throws IOException {
        urlConnetion();
    }
    private static void urlConnetion() throws IOException {
        URL url = new URL("https://kanye.rest/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();



        InputStream stream = connection.getInputStream();

        String responseBody = new BufferedReader(new InputStreamReader(stream))
                .lines()
                .collect(Collectors.joining("\n"));

        System.out.println(responseBody);

    }
}