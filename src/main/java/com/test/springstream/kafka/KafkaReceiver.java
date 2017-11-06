package com.test.springstream.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 消费者端代码
 *
 * 消费者通过@StreamListener监听
 */
@EnableBinding(Sink.class)
public class KafkaReceiver {

    private final Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    @StreamListener(Sink.INPUT)
    private void receive(String vote) {
        logger.info("receive message : " + vote);
    }

}