package com.service.iswift.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-07-02T03:29:44.980Z")

@RestSchema(schemaId = "iswift")
@RequestMapping(path = "/iswift", produces = MediaType.APPLICATION_JSON)
public class IswiftImpl {

    @Autowired
    private IswiftDelegate userIswiftDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userIswiftDelegate.helloworld(name);
    }

}
