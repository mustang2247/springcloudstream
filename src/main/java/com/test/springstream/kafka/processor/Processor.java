package com.test.springstream.kafka.processor;

import com.test.springstream.kafka.input.Sink;
import com.test.springstream.kafka.source.Source;

/**
 * Processor用于单个应用同时包含输入和输出通道的情况，通道名称分别为output和input。
 */
public interface Processor extends Source, Sink {
}
