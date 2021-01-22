package com.vincent.maven_clean_plugin;

import com.vincent.maven_clean_plugin.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenCleanPluginApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SampleService sampleService;

    @Override
    public void run(String... strings) throws Exception {
        logger.info(sampleService.sampleServiceStringConcat("value1", "value2"));
    }

    public static void main(String[] args) {
        SpringApplication.run(MavenCleanPluginApplication.class, args);
    }
}
