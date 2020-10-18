package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author yangdp
 * @create 2020-10-18-0:19
 */
public class Hello2 {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
