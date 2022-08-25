package com.xiaofengstu.abstractfactory;

/**
 * The type Abstract oss factory.
 *
 * @ClassName AbstractOssFactory
 * @Author fengzeng
 * @Date 2022 /8/4 0004 15:50
 */
public abstract class AbstractOssFactory {
  /**
   * Upload image oss image.
   *
   * @param bytes     the bytes
   * @param waterMark the watermark
   * @return the oss image
   */
  public abstract OssImage uploadImage(byte[] bytes,String waterMark);

  /**
   * Upload video oss video.
   *
   * @param bytes     the bytes
   * @param waterMark the watermark
   * @return the oss video
   */
  public abstract OssVideo uploadVideo(byte[] bytes,String waterMark);
}
