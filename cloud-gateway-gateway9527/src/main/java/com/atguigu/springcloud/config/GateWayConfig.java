package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置bean 编码配置 路由规则
 */
@Configuration
public class GateWayConfig
{
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                        //映射地址
                        .uri("http://news.baidu.com/guonei")).build();
        routes.route("path_www",
                r -> r.path("/cc")
                        //映射地址
                        .uri("https://cc.163.com/")).build();

        return routes.build();
    }
}
