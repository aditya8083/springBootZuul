package com.coviam.springbootzuulgateway;

import com.coviam.springbootzuulgateway.filters.ErrorFilter;
import com.coviam.springbootzuulgateway.filters.PostFilter;
import com.coviam.springbootzuulgateway.filters.PreFilter;
import com.coviam.springbootzuulgateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
