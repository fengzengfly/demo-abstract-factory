package com.xiaofengstu.abstractfactory;

import com.xiaofengstu.abstractfactory.aliyun.AliyunFactory;

import java.nio.charset.StandardCharsets;


/**
 * @ClassName Main
 * @Author fengzeng
 * @Date 2022/8/4 0004 16:39
 */
public class Main {
  public static void main(String[] args) {
    AbstractOssFactory ossFactory = new AliyunFactory();
    OssImage ossImage = ossFactory.uploadImage("hello world".getBytes(StandardCharsets.UTF_8), "xiaofengstu.com");
    System.out.println(ossImage.getThumb());
  }

}
