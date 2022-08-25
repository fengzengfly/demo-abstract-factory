package com.xiaofengstu.abstractfactory.qiniuyun;

import com.xiaofengstu.abstractfactory.AbstractOssFactory;
import com.xiaofengstu.abstractfactory.OssImage;
import com.xiaofengstu.abstractfactory.OssVideo;
import com.xiaofengstu.abstractfactory.qiniuyun.product.QiniuYunImage;
import com.xiaofengstu.abstractfactory.qiniuyun.product.QiniuYunVideo;

/**
 * @ClassName QiniuYunFactory
 * @Author fengzeng
 * @Date 2022/8/4 0004 16:34
 */
public class QiniuYunFactory extends AbstractOssFactory {
  @Override
  public OssImage uploadImage(byte[] bytes,String waterMark) {
    return new QiniuYunImage(bytes,waterMark);
  }

  @Override
  public OssVideo uploadVideo(byte[] bytes,String waterMark) {
    return new QiniuYunVideo(bytes,waterMark);
  }
}
