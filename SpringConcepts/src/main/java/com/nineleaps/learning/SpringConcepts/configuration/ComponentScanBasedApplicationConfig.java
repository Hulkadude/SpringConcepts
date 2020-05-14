package com.nineleaps.learning.SpringConcepts.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "com.nineleaps.learning.SpringConcepts", includeFilters = @Filter(type = FilterType.REGEX, pattern = ""), excludeFilters = @Filter(Repository.class), useDefaultFilters = true)
@Import(ApplicationConfig.class)
public class ComponentScanBasedApplicationConfig {

}
