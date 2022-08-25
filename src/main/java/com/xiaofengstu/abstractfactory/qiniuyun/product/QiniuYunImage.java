package com.xiaofengstu.abstractfactory.qiniuyun.product;

import com.xiaofengstu.abstractfactory.OssImage;

/**
 * @ClassName QiniuYunImage
 * @Author fengzeng
 * @Date 2022/8/4 0004 16:33
 */
public class QiniuYunImage implements OssImage {

  private byte[] image;
  private String waterMark;

  public QiniuYunImage(byte[] bytes, String waterMark) {
    this.image = bytes;
    this.waterMark = waterMark;
  }

  @Override
  public String getThumb() {
    return "qiniuyun image thumb";
  }

  @Override
  public String getWaterMark() {
    return waterMark;
  }
}
