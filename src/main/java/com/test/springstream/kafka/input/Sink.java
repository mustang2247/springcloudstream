package com.test.springstream.kafka.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 定义输入通道并绑定输入通道配置信息
 * INPUT = "testa" 跟配置文件里面的通道名称 testa 保持一致
 *
 * Sink用于有单个输入（inbound）通道的应用，通道名称为input
 */
public interface Sink {
    //接收队列1
    String INPUT = "input";

    @Input(Sink.INPUT)
    SubscribableChannel input1();
}
