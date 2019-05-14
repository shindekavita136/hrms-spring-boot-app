package com.parent.hrmsparent.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping
public class HomeController {
       @GetMapping("/home")
       public Map home() {
    	   Map<String, String> m = new HashMap<String, String>();
    	   m.put("id","A1");
    	   m.put("name", "kavita");
              return m;
       }
}
