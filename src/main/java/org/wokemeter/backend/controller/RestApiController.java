package org.wokemeter.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wokemeter.backend.model.v1.ResponsePing;

import static org.wokemeter.backend.Constants.URL_API_V1_PING;

@RestController
public class RestApiController {
    @GetMapping(URL_API_V1_PING)
    public ResponsePing processApiV1Ping() {
        return new ResponsePing();
    }
}
