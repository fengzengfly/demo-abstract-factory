package com.xiaofengstu.abstractfactory.aliyun.product;

import com.xiaofengstu.abstractfactory.OssImage;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName AliyunImage
 * @Author fengzeng
 * @Date 2022/8/4 0004 15:55
 */

@Slf4j
public class AliyunImage implements OssImage {
  private byte[] bytes;

  public AliyunImage(byte[] bytes,String waterMark) {
    this.bytes = bytes;
    log.info("[阿里云]图片上传成功，URL:http://oss.aliyun.com/images/xxxx.jpg");
  }

  @Override
  public String getThumb() {
    return "http://oss.aliyun.com/images/xxxxThumb.jpg";
  }

  @Override
  public String getWaterMark() {
    return "http://oss.aliyun.com/images/waterMark.jpg";
  }
}
