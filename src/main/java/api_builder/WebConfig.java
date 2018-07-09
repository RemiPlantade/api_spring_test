package api_builder;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import api_conf.conf.model.formatter.ApiBeanFormatter;
import api_conf.conf.model.formatter.ApiGroupFormatter;
import api_conf.conf.model.formatter.ApiUserFormatter;
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	 @Override
     public void addResourceHandlers(ResourceHandlerRegistry registry) {
             registry.addResourceHandler("/resources/**")
                     .addResourceLocations("/resources/");
     }
	 @Override
     public void addFormatters(FormatterRegistry registry) {
         registry.addFormatter(new ApiGroupFormatter());
         registry.addFormatter(new ApiUserFormatter());
         registry.addFormatter(new ApiBeanFormatter());
     }
	 
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedMethods("HEAD", "GET");
	    }
}
