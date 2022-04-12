package com.dev.swaggerservices.controller;

import com.dev.swaggerservices.api.InfoApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerServicesController implements InfoApi {
    @Override
    public ResponseEntity<String> getInfo() {
        return new ResponseEntity<String>("Success", HttpStatus.OK);
    }
}
