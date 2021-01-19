package com.java.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Des:
 * @Author: fengtingting
 * @Date: 1/19/21
 */
@Controller
@RequestMapping("/test")
public class TestServer {

    @RequestMapping("/ftt")
    public void getHello(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello Ftt");
    }
}
