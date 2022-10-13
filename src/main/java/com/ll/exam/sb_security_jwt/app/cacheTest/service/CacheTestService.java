package com.ll.exam.sb_security_jwt.app.cacheTest.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheTestService {
    @Cacheable("key1")
    public int getCachedInt(){
        System.out.println("getCachedInt 호출됨");
        return 5;
    }

    @CacheEvict("key1")
    public void deleteCacheKey1() {
        System.out.println("삭제됨");
    }

    @CachePut("key1")
    public int putCacheKey1(){
        System.out.println("수정됨");
        return 10;
    }

    @Cacheable("plus")
    public int getCachedPlus(int num1, int num2){
        System.out.println("getCachedPlus 호출됨");
        return num1+num2;
    }
}