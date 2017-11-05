package com.test.springstream.kafka.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 定义输出通道并绑定输出通道配置信息
 * OUTPUT = "sourceA" 跟配置文件里面的通道名称 sourceA 保持一致
 *
 * Source用于有单个输出（outbound）通道的应用，通道名称为output
 */
public interface Source {
    //发送队列1
    String OUTPUT = "output";

    @Output(Source.OUTPUT)
    MessageChannel output1();
}
