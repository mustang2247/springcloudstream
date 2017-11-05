package com.test.springstream.kafka.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 定义输入通道并绑定输入通道配置信息
 * INPUT_1 = "testa" 跟配置文件里面的通道名称 testa 保持一致
 */
public interface Sink {
    //接收队列1
    String INPUT_1 = "testa";

    @Input(Sink.INPUT_1)
    SubscribableChannel input1();
}
