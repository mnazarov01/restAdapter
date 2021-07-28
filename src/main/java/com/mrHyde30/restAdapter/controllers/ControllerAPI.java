package com.mrHyde30.restAdapter.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrHyde30.restAdapter.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.validation.Valid;

@RestController
public class ControllerAPI {

    @Autowired
    public ApplicationContext ac;

    @Autowired
    public WebServiceTemplate webServiceTemplate;

    @Autowired
    public ObjectMapper objectMapper;

    @PostMapping(path = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AddResponse doAdd(@Valid @RequestBody Add add){

        AddResponse response = (AddResponse) webServiceTemplate
                .marshalSendAndReceive(add);

        return response;

    }

    @PostMapping(path = "/divide",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DivideResponse doDivine(@Valid @RequestBody Divide params){

        DivideResponse response = (DivideResponse) webServiceTemplate
                .marshalSendAndReceive(params);

        return response;

    }

    @PostMapping(path = "/multiply",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public MultiplyResponse doMultiply(@Valid @RequestBody Multiply params){

        MultiplyResponse response = (MultiplyResponse) webServiceTemplate
                .marshalSendAndReceive(params);

        return response;

    }

    @PostMapping(path = "/subtract",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SubtractResponse doSubtract(@Valid @RequestBody Subtract params){

        SubtractResponse response = (SubtractResponse) webServiceTemplate
                .marshalSendAndReceive(params);

        return response;

    }


}
