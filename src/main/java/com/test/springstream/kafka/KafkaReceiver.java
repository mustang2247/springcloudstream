package com.test.springstream.kafka;

import com.test.springstream.kafka.input.Sink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * 消费者端代码
 * 通过receive方法接收消息
 */
@EnableBinding(Sink.class)
public class KafkaReceiver {

    private final Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    @StreamListener(Sink.INPUT_1)
    private void receive(String vote) {
        logger.info("receive message : " + vote);
    }

}