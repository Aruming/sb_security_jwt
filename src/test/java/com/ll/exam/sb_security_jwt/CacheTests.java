package com.ll.exam.sb_security_jwt;

import com.ll.exam.sb_security_jwt.app.cacheTest.service.CacheTestService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
@ActiveProfiles("test")
class CacheTests {
    @Autowired
    private CacheTestService cacheTestService;

    @Test
    @DisplayName("캐시 사용")
    void t1() throws Exception {
        int rs = cacheTestService.getCachedInt();
        System.out.println(rs);

        rs = cacheTestService.getCachedInt();
        System.out.println(rs);
    }

    @Test
    @DisplayName("캐시 삭제")
    void t2() throws Exception {
        int rs = cacheTestService.getCachedInt();
        System.out.println(rs);

        rs = cacheTestService.getCachedInt();
        System.out.println(rs);

        cacheTestService.deleteCacheKey1();

        rs = cacheTestService.getCachedInt();
        System.out.println(rs);
    }

    @Test
    @DisplayName("캐시 수정")
    void t3() throws Exception {
        int rs = cacheTestService.getCachedInt();
        System.out.println(rs);

        rs = cacheTestService.getCachedInt();
        System.out.println(rs);

        cacheTestService.putCacheKey1();

        rs = cacheTestService.getCachedInt();
        System.out.println(rs);
    }

    @Test
    @DisplayName("더하기 캐시")
    void t4() throws Exception {
        int rs = cacheTestService.getCachedPlus(2, 3);
        System.out.println(rs);

        rs = cacheTestService.getCachedPlus(10, 20);
        System.out.println(rs);

        rs = cacheTestService.getCachedPlus(2, 3);
        System.out.println(rs);
    }
}
