package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@ImportResource({"classpath:spring-dao.xml","classpath:spring-shiro.xml"})
@ComponentScan(basePackages= {"dao","service","model"},
    excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
    }
)
@Configuration
public class RootConfig {
}
