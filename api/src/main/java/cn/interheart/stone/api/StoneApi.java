package cn.interheart.stone.api;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

/**
 * Spring boot start
 *
 */
@RestController
@EnableAutoConfiguration
@ComponentScan("cn.interheart.stone.*.*")
public class StoneApi {
    public static void main(String[] args) {
        SpringApplication.run(StoneApi.class, args);
    }

    @RequestMapping("/")
    public String status() throws Exception {

        return "stone is runing..." + "2018年4月12日10:39:40";
    }


}