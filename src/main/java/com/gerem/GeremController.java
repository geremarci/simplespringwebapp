package com.gerem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;


@RestController
public class GeremController {

    @RequestMapping("/gerem")
    public String whoIsTheKing() {
        return "Marci";
    }

    @RequestMapping("/gerem/list")
    public List<String> list() {
        List<String> listOfString = new ArrayList<String>();
        listOfString.add("One");
        listOfString.add(UUID.randomUUID().toString());
        listOfString.add(LocalDateTime.now().toString());
        return listOfString;
    }
    @RequestMapping("/gerem/map")
    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("A", UUID.randomUUID().toString());
        map.put("B", "Hello");
        return map;

    }

}