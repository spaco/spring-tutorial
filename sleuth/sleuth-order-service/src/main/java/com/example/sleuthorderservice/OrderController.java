package com.example.sleuthorderservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class OrderController {

    @GetMapping("order")
    public String order(@RequestHeader HttpHeaders headers) {
        log.info("http header {}",headers.toString());

        log.info("order api is called !");
        return "order called success";
    }
}
