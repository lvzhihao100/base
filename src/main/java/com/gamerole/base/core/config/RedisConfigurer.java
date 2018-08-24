package com.gamerole.base.core.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @Description: redis配置
 */
@Configuration
@EnableCaching   //开启缓存
public class RedisConfigurer extends CachingConfigurerSupport {

//    @Bean
//    @ConfigurationProperties(prefix = "spring.redis")
//    public JedisPoolConfig getRedisConfig() {
//        JedisPoolConfig config = new JedisPoolConfig();
//
//        return config;
//    }

//    @Bean
//    public JavaMailSender getJavaMailSender() {
//        return new JavaMailSenderImpl();
//    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.redis")
//    public JedisConnectionFactory getConnectionFactory() {
//        JedisConnectionFactory factory = new JedisConnectionFactory();
//        JedisPoolConfig config = getRedisConfig();
//        factory.setPoolConfig(config);
//        return factory;
//    }


//    @Bean
//    public RedisTemplate<?, ?> getRedisTemplate() {
//        RedisTemplate<?, ?> template = new StringRedisTemplate(getConnectionFactory());
//        return template;
//    }
}

