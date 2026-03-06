package com.learning.Week1.OOP_Practice.a;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class phone {

    String brand;
    String UserName;
    String PhoneNumber;

    void init() {
        Scanner sc = new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        System.out.println("正在注册您的帐号，请输入用户名");
        UserName = sc.next();
        System.out.println("请输入手机号");
        PhoneNumber = sc.next();
        System.out.println("注册成功!");
        sc.close();
    }

    void call(String name) {
        System.out.println("与" + name + "通话完毕");
    }
}
