package com.tosan.modern.httpdockerizedsample.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(value = MainController.class)
public class MainControllerUTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testHelloWorld_withoutNameQueryParam_returnStrangerAsName() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/helloWorld");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("hello stranger", result.getResponse().getContentAsString());
    }


    @Test
    public void testHelloWorld_withNameQueryParam_returnQueryParamName() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/helloWorld?name=sara");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("hello sara", result.getResponse().getContentAsString());
    }

    @Test
    public void testGetAuthorName_returnAuthorName() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/author");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("Mina Khoshnevisan", result.getResponse().getContentAsString());
    }
}
