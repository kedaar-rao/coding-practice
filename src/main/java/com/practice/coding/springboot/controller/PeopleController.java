package com.practice.coding.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PeopleController.class);

    @GetMapping
    @ResponseBody
    public List<String> getPeople () {
        List<String> allPeople = new ArrayList<>();
        populateAllPeople(allPeople);
        LOGGER.info(String.format("allPeople = %s", allPeople));
        return allPeople;
    }

    private void populateAllPeople(List<String> allPeople) {
        allPeople.add("Kedaar");
        allPeople.add("David");
        allPeople.add("Fernandez");
        allPeople.add("Mainoo");
    }
}
