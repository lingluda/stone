package cn.interheart.stone.common.utils;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class EhcacheUtil {

    private static CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().build(true);

    /**
     * 设置绝对缓存
     * @param cacheName     缓存目录名称
     * @param key           缓存key
     * @param value         缓存值
     */
    public static void setCache(String cacheName, String key, Object value) {
        try {
            Cache<String, Object> cache = cacheManager.getCache(cacheName, String.class, Object.class);
            if (cache == null) {
                CacheConfiguration<String, Object> cacheConfig = getCacheConfiguration();
                cache = cacheManager.createCache(cacheName, cacheConfig);
            }
            cache.put(key, value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 设置缓存
     * @param cacheName     缓存目录名称
     * @param key           缓存key
     * @param value         缓存值
     * @param expireMinitus 过期时间
     * @param type      过期类型（0绝对过期，1相对过期）
     * @param heap      缓存容器大小
     */
    public static void setCache(String cacheName, String key, Object value, Byte type, Integer expireMinitus, Integer heap) {
        try {
            Cache<String, Object> cache = cacheManager.getCache(cacheName, String.class, Object.class);
            if (cache == null) {
                CacheConfiguration<String, Object> cnf = getCacheConfiguration(type, expireMinitus, heap);
                cache = cacheManager.createCache(cacheName, cnf);
            }
            cache.put(key, value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    /**
     * 设置缓存
     * @param cacheName     缓存目录名称
     * @param key           缓存key
     */
    public static void removeCache(String cacheName, String key) {
        try {
            Cache<String, Object> cache = cacheManager.getCache(cacheName, String.class, Object.class);
            if (cache != null) {
                if(cache.get(key) != null){
                    cache.remove(key);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 获取缓存的值
     * @param cacheName 缓存目录名称
     * @param key       缓存key
     */
    public static Object getCache(String cacheName, String key) {
        Cache<String, Object> cache = cacheManager.getCache(cacheName, String.class, Object.class);
        return Optional.ofNullable(cache).map(r -> r.get(key)).orElse(null);
    }

    /*
     * 获取缓存配置  (绝对时间过期)
     */
    private static CacheConfiguration<String, Object> getCacheConfiguration() {
        return CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, Object.class,
                ResourcePoolsBuilder.heap(2000))
                .withExpiry(Expirations.timeToLiveExpiration(Duration.of(10, TimeUnit.MINUTES)))
                .build();
    }

    /**
     * 获取缓存配置
     * @param type        (0-ttl,1-tti 0绝对时间过期，1相对时间过期)
     * @param minitues    过期时间
     * @param heap        堆大小（对象个数）
     */
    private static CacheConfiguration<String, Object> getCacheConfiguration(Byte type, Integer minitues, Integer heap) {
        CacheConfigurationBuilder<String, Object> builder = CacheConfigurationBuilder
                .newCacheConfigurationBuilder(String.class, Object.class, ResourcePoolsBuilder.heap(heap));
        if (type == 0) {
            return builder.withExpiry(Expirations.timeToLiveExpiration(Duration.of(minitues, TimeUnit.MINUTES))).build();
        }
        if (type == 1) {
            return builder.withExpiry(Expirations.timeToIdleExpiration(Duration.of(minitues, TimeUnit.MINUTES))).build();
        }
        return null;
    }



}
