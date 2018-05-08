package com.ibs.qservice.InstrumentService.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 * Created by Balagan on 4/23/2018.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.ibs.qservice.InstrumentService")
@EnableJms
public class DBConfig {
}
