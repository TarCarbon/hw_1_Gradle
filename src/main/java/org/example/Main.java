package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        MyData myData = new MyData();
        myData.setName("Тарас");
        myData.setSurname("Наконечний");
        System.out.println(objectMapper.writeValueAsString(myData));
    }
}