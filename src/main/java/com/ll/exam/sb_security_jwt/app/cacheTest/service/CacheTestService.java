package com.ll.exam.sb_security_jwt.app.cacheTest.service;

import com.ll.exam.sb_security_jwt.app.cacheTest.dto.Person;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheTestService {
    @Cacheable("key1")
    public int getCachedInt(){
        System.out.println("== getCachedInt 실행 ==");
        return 5;
    }

    @CacheEvict("key1")
    public void deleteCacheKey1() {
        System.out.println("== deleteCacheKey1 실행 ==");
    }

    @CachePut("key1")
    public int putCacheKey1(){
        System.out.println("수정됨");
        return 10;
    }

    @Cacheable("plus")
    public int getCachedPlus(int num1, int num2){
        System.out.println("== getCachedPlus 실행 ==");
        return num1+num2;
    }

    @Cacheable(value = "getName", key = "#person.id")
    public String getName(Person person, int random){
        System.out.println("== getName 실행 ==");
        return person.getName();
    }
}
