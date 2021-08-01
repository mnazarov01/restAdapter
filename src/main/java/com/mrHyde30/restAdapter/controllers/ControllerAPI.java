package com.mrHyde30.restAdapter.controllers;

import com.mrHyde30.restAdapter.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1")
public class ControllerAPI {

    @Autowired
    public WebServiceTemplate webServiceTemplate;

    @PostMapping(path = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AddResponse doAdd(@Valid @RequestBody Add add){
        return (AddResponse) webServiceTemplate
                .marshalSendAndReceive(add);
    }

    @PostMapping(path = "/divide",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DivideResponse doDivine(@Valid @RequestBody Divide params){
        return (DivideResponse) webServiceTemplate
                .marshalSendAndReceive(params);
    }

    @PostMapping(path = "/multiply",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public MultiplyResponse doMultiply(@Valid @RequestBody Multiply params){
        return (MultiplyResponse) webServiceTemplate
                .marshalSendAndReceive(params);
    }

    @PostMapping(path = "/subtract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SubtractResponse doSubtract(@Valid @RequestBody Subtract params){
        return (SubtractResponse) webServiceTemplate
                .marshalSendAndReceive(params);
    }

}
