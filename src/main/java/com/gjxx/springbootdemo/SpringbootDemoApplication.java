package com.gjxx.springbootdemo;

import com.gjxx.springbootdemo.filter.CrosFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author Sxs
 */
@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	/**
	 * 配置跨域访问的过滤器
	 * @return 过滤器
	 */
	@Bean
	public FilterRegistrationBean<CrosFilter> registerFilter() {
		FilterRegistrationBean<CrosFilter> bean = new FilterRegistrationBean<>();
		bean.addUrlPatterns("/*");
		bean.setFilter(new CrosFilter());
		return bean;
	}

}
