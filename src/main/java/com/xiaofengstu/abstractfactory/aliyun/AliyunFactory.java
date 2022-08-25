package com.xiaofengstu.abstractfactory.aliyun;

import com.xiaofengstu.abstractfactory.AbstractOssFactory;
import com.xiaofengstu.abstractfactory.OssImage;
import com.xiaofengstu.abstractfactory.OssVideo;
import com.xiaofengstu.abstractfactory.aliyun.product.AliyunImage;
import com.xiaofengstu.abstractfactory.aliyun.product.AliyunVideo;

import java.nio.charset.StandardCharsets;

/**
 * @ClassName AliyunFactory
 * @Author fengzeng
 * @Date 2022/8/4 0004 15:54
 */
public class AliyunFactory extends AbstractOssFactory {
  @Override
  public OssImage uploadImage(byte[] bytes,String waterMark) {
    return new AliyunImage(bytes, waterMark);
  }

  @Override
  public OssVideo uploadVideo(byte[] bytes,String waterMark) {
    return new AliyunVideo(bytes, waterMark);
  }
}
