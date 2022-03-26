package com.itcast.jenkins.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * describe: <br/>
 * <span><span/>
 *
 * @author lu
 * @version 1.0
 * 2022/3/26
 */
@SpringBootApplication
@Controller
public class JenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

    @GetMapping("index")
    public String index(){
        return "index";
    }
}
