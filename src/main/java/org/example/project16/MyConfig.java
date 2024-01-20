package org.example.project16;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example.project16")
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class MyConfig {
}
