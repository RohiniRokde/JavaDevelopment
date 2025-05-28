package com.Annotation.Test.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.Annotation.Test")
@PropertySource(value="Info.properties")
public class BeanConfiguration {

	
}
