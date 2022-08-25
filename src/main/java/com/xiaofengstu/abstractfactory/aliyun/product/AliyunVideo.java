package com.xiaofengstu.abstractfactory.aliyun.product;

import com.xiaofengstu.abstractfactory.OssVideo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @ClassName AliyunVideo
 * @Author fengzeng
 * @Date 2022/8/4 0004 15:56
 */
@Slf4j
public class AliyunVideo implements OssVideo {

  private byte[] bytes;

  public AliyunVideo(byte[] bytes, String waterMark) {
    this.bytes = bytes;
    log.info("[阿里云]视频已上传至阿里云oss,URL:http://oss.aliyun.com/xxxx.mp4");
    log.info("[阿里云]720P转码成功，码率：5000K");
    log.info("[阿里云]1080P转码成功，码率：7000K");

  }


  @Override
  public String get720P() {
    return "http://oss.aliyun.com/xxxx720P.mp4";
  }

  @Override
  public String get1080P() {
    return "http://oss.aliyun.com/xxxx1080P.mp4";
  }
}
