package com.example.code;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@SpringBootTest
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ZuulITest {

    @Autowired
    WebApplicationContext context;

    MockMvc mvc;

    @Before
    public void before() throws Exception {
        mvc = webAppContextSetup(context).build();
    }

    @Test
    public void testInvokeAndGet200() throws Exception {
        String simpleUrl = "/hello/world";

        mvc.perform(get(simpleUrl)).andExpect(status().isOk());
    }

    @Test
    public void testInvokeAndGetDifferent200() throws Exception {
        String simpleUrl = "/hello/app";

        mvc.perform(get(simpleUrl)).andExpect(status().isOk());
    }

}
