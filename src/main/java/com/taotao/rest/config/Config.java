package com.taotao.rest.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import redis.clients.jedis.JedisPool;

@Configuration
@ImportResource(locations={"classpath:dubbo-provider.xml"})	// xml版
public class Config {
	
	// 配置地址：https://blog.csdn.net/kdpujie/article/details/25818935
    @Bean("jedisPoolConfig")
    public JedisPool jedisPoolConfig() {
    	JedisPool jedisPool = new JedisPool("127.0.0.1", 6379);
    	
    	GenericObjectPoolConfig config = new GenericObjectPoolConfig();
    	config.setMaxTotal(1000);
    	config.setMaxIdle(200);
    	config.setMaxWaitMillis(2000);
    	config.setTestOnBorrow(true);
    	
//    	jedisPool.initPool(config, null);
    	
        return jedisPool;
    }
	
}
