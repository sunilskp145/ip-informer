package com.example.skpbot;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class IPService {

    private String ENDPOINT = "http://ip-api.com/json/";

    String getDetails (String ip) {

        try {
            var restTemplate = new RestTemplate();
            var result = restTemplate.exchange(ENDPOINT+ip, HttpMethod.GET, null , String.class);
            return result.getBody();
        }
        catch(RestClientException e){
            System.out.println("Reset Client Exception " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception " + e.getMessage());
        }
        finally {
        }
        return "";
    }
}
