package com.example.spring.rest;

import com.example.spring.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/example")
@RestController
public class ExampleRestController {

    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> consumeUser(@RequestBody User user) {
        log.info(String.format("Received user info: login [%s], name [%s %s]",
                user.getLogin(), user.getFirstName(), user.getLastName()));
        return ResponseEntity.ok("OK");
    }

}
