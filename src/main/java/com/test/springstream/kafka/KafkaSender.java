package com.test.springstream.kafka;

import com.test.springstream.kafka.source.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;

/**
 * 生产者端代码
 * 调用sendMessage方法发送消息
 * 负责消息发送
 */
@EnableBinding(Source.class)
public class KafkaSender implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(KafkaSender.class);

    @Autowired
    private Source source;

    public void sendMessage(String message) {
        try {
            source.output1().send(MessageBuilder.withPayload("message: " + message).build());
        } catch (Exception e) {
            logger.info("消息发送失败，原因："+e);
            e.printStackTrace();
        }
    }

    public void run(String... strings) throws Exception {
        // 字符串类型发送MQ
        System.out.println("字符串信息发送");
        sendMessage("字符串信息发送");
    }
}
