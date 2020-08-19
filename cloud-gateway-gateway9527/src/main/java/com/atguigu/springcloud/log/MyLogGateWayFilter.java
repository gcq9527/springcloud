package com.atguigu.springcloud.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author Guo
 * @Create 2020/7/9 13:39
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {

    /**
     * 没带上请求参数 判断为非法用户
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        log.info("****************come in MyLogGatewayFilter:" + new Date());
        //拿到请求参数
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        //为空 返回指定的错误编码
        if(uname == null) {
          log.info("*****用户名为null，非法用户 (0_0)---");
          //   NOT_ACCEPTABLE(406, "Not Acceptable"),
          exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
          return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    //数据越小优先级越高
    public int getOrder() {
        return 0;
    }
}