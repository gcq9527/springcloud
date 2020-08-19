package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Guo
 * @Create 2020/7/9 12:23
 */
@Configuration
public class GateConfig {
    /**
     * 配置一个id为route_name的路由规则
     * 当访问地址XXX时 自动转发到对应的地址
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLoator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }

    /**
     * routeBean配置
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLoator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu", //id
                r -> r.path("/guoji") //地址
                        .uri("http://news.baidu.com/guoji")) //对应的地址
                .build();

        return routes.build();
    }
}