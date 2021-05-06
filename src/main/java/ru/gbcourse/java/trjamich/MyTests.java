package ru.gbcourse.java.trjamich;

public class MyTests {

    @BeforeSuite
    public static void testBS(){
        System.out.println("testBS");
    }

    @Test
    public static void test1(){
        System.out.println("test1, pr default 3");
    }

    @Test(priority = 5)
    public static void test2(){
        System.out.println("test2, pr5");
    }

    @Test(priority = 1)
    public static void test3(){
        System.out.println("test3, pr 1");
    }

    @Test(priority = 2)
    public static void test4(){
        System.out.println("test4, pr 2");
    }

    @Test(priority = 2)
    public static void test5(){
        System.out.println("test5, pr 2");
    }

    @Test
    public static void test6(){
        System.out.println("test6, pr default 3");
    }

    @Test(priority = 3)
    public static void test7(){
        System.out.println("test6, pr 3");
    }

    @AfterSuite
    public static void testAS(){
        System.out.println("testAS");
    }
}
