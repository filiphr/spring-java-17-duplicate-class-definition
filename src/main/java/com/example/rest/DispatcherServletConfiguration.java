
package com.example.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration(proxyBeanMethods = false)
@ComponentScan
@EnableAsync
public class DispatcherServletConfiguration extends WebMvcConfigurationSupport {

}
