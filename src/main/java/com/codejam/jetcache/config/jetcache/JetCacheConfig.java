//package com.codejam.jetcache.config.jetcache;
//
//import com.alicp.jetcache.anno.CacheConsts;
//import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
//import com.alicp.jetcache.anno.config.EnableMethodCache;
//import com.alicp.jetcache.anno.support.GlobalCacheConfig;
//import com.alicp.jetcache.anno.support.SpringConfigProvider;
//import com.alicp.jetcache.embedded.EmbeddedCacheBuilder;
//import com.alicp.jetcache.embedded.LinkedHashMapCacheBuilder;
//import com.alicp.jetcache.redis.RedisCacheBuilder;
//import com.alicp.jetcache.support.FastjsonKeyConvertor;
//import com.alicp.jetcache.support.JavaValueDecoder;
//import com.alicp.jetcache.support.JavaValueEncoder;
//import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//import redis.clients.util.Pool;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableMethodCache(basePackages = "com.codejam.jetcache")
//@EnableCreateCacheAnnotation
//public class JetCacheConfig {
//
//    @Value("${jetcache.remote.default.host}")
//    private String redisHost;
//
//    @Value("${jetcache.remote.default.port}")
//    private Integer redisPort;
//
////    @Value("${jetcache.remote.default.password}")
////    private String redisPswd;
////
////    @Value("${jetcache.remote.default.database}")
////    private Integer redisDatabase;
//
//    @Bean
//    public Pool<Jedis> pool() {
//        GenericObjectPoolConfig pc = new GenericObjectPoolConfig();
////        pc.setMinIdle(2);
////        pc.setMaxIdle(10);
////        pc.setMaxTotal(10);
////        return new JedisPool(pc, redisHost, redisPort, 1000, redisPswd, redisDatabase);
//        return new JedisPool(pc, redisHost, redisPort);
//    }
//
//    @Bean
//    public SpringConfigProvider springConfigProvider() {
//        return new SpringConfigProvider();
//    }
//
//    @Bean
//    public GlobalCacheConfig config(SpringConfigProvider configProvider, Pool<Jedis> pool) {
//        Map localBuilders = new HashMap();
//        EmbeddedCacheBuilder localBuilder = LinkedHashMapCacheBuilder
//                .createLinkedHashMapCacheBuilder()
//                .keyConvertor(FastjsonKeyConvertor.INSTANCE);
//        localBuilders.put(CacheConsts.DEFAULT_AREA, localBuilder);
//
//        Map remoteBuilders = new HashMap();
//        RedisCacheBuilder remoteCacheBuilder = RedisCacheBuilder.createRedisCacheBuilder()
//                .keyConvertor(FastjsonKeyConvertor.INSTANCE)
//                .valueEncoder(JavaValueEncoder.INSTANCE)
//                .valueDecoder(JavaValueDecoder.INSTANCE)
//                .jedisPool(pool);
//        remoteBuilders.put(CacheConsts.DEFAULT_AREA, remoteCacheBuilder);
//
//        GlobalCacheConfig globalCacheConfig = new GlobalCacheConfig();
//        //globalCacheConfig.setConfigProvider(configProvider);
//        globalCacheConfig.setLocalCacheBuilders(localBuilders);
//        globalCacheConfig.setRemoteCacheBuilders(remoteBuilders);
//        globalCacheConfig.setStatIntervalMinutes(15);
//        globalCacheConfig.setAreaInCacheName(false);
//
//        return globalCacheConfig;
//    }
//}
