package com.mak.verification;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Junit 用于测试 单元测试
 * @BeforeALl 在测试开始前执行，只执行一次,该方法必须是静态的;
 * @AfterAll 在测试结束后执行，只执行一次，该方法必须是静态的
 * @BeforeEach 单元测试中先执行的操作
 * @AfterEach 单元测试中最后执行的操作
 * @Test 单元测试
 *
 * 还可以使用 import static org.junit.jupiter.api.Assertions.*;里的静态方法去判断值是否符合预期
 * 如果不符合将会抛出异常
 *
 * 流程如下：
 * BeforeAll
 * BeforeEach
 * Test
 * AfterEach
 *
 * BeforeEach
 * Test
 * AfterEach
 *
 * ...
 *
 * AfterAll
 *
 */

public class JunitTest {

    private List list;

    @BeforeAll
    public static void beforeAllTest(){
        System.out.println("在测试开始前执行，只执行一次,该方法必须是静态的");
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("在测试结束后执行，只执行一次，该方法必须是静态的");
    }

    @BeforeEach
    public void testInitialize(){
        list = new ArrayList();
        for (int i = 0; i < 3; i++) {
            list.add(i);

        }
    }

    @AfterEach
    public void testEnd(){
        System.out.println("一个测试结束了");
    }

    @Test
    public void insert(){
        list.add("insert");
        assertEquals(list.size(),4);
        assertEquals(list.get(3),"insert");
        for (Object o : list) {
            System.out.println(o);

        }
    }

    @Test
    public void delete(){
        list.remove(0);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
