package com.xiaofengstu.abstractfactory.qiniuyun.product;

import com.xiaofengstu.abstractfactory.OssVideo;
import com.xiaofengstu.abstractfactory.aliyun.product.AliyunImage;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName QiniuYunVideo
 * @Author fengzeng
 * @Date 2022/8/4 0004 16:33
 */
@Slf4j
public class QiniuYunVideo implements OssVideo {

  public QiniuYunVideo(byte[] bytes, String waterMark) {
    log.info("[七牛云]上传视频成功");
  }

  @Override
  public String get720P() {
    return "qiniuyun 720p";
  }

  @Override
  public String get1080P() {
    return "qiniuyun 1080p";
  }
}
