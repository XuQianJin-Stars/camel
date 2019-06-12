/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.concurrent.BlockingQueue;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.WaitForTaskToComplete;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The vm component provides asynchronous call to another endpoint from the same
 * CamelContext.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface VmEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the VM component.
     */
    public interface VmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedVmEndpointConsumerBuilder advanced() {
            return (AdvancedVmEndpointConsumerBuilder) this;
        }
        /**
         * Name of queue.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default VmEndpointConsumerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * The option is a <code>int</code> type.
         * @group common
         */
        public default VmEndpointConsumerBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default VmEndpointConsumerBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public default VmEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public default VmEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        public default VmEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        public default VmEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the VM component.
     */
    public interface AdvancedVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default VmEndpointConsumerBuilder basic() {
            return (VmEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off.
         * The option is a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder limitConcurrentConsumers(
                boolean limitConcurrentConsumers) {
            setProperty("limitConcurrentConsumers", limitConcurrentConsumers);
            return this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder limitConcurrentConsumers(
                String limitConcurrentConsumers) {
            setProperty("limitConcurrentConsumers", limitConcurrentConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint.
         * The option is a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder multipleConsumers(
                boolean multipleConsumers) {
            setProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder multipleConsumers(
                String multipleConsumers) {
            setProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown.
         * The option is a <code>int</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder pollTimeout(
                int pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown.
         * The option will be converted to a <code>int</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder pollTimeout(
                String pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded.
         * The option is a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder purgeWhenStopping(
                boolean purgeWhenStopping) {
            setProperty("purgeWhenStopping", purgeWhenStopping);
            return this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVmEndpointConsumerBuilder purgeWhenStopping(
                String purgeWhenStopping) {
            setProperty("purgeWhenStopping", purgeWhenStopping);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * The option is a <code>java.util.concurrent.BlockingQueue</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointConsumerBuilder queue(
                BlockingQueue queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointConsumerBuilder queue(String queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the VM component.
     */
    public static interface VmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedVmEndpointProducerBuilder advanced() {
            return (AdvancedVmEndpointProducerBuilder) this;
        }
        /**
         * Name of queue.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default VmEndpointProducerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * The option is a <code>int</code> type.
         * @group common
         */
        public default VmEndpointProducerBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default VmEndpointProducerBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder blockWhenFull(
                boolean blockWhenFull) {
            setProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder blockWhenFull(
                String blockWhenFull) {
            setProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder discardIfNoConsumers(
                boolean discardIfNoConsumers) {
            setProperty("discardIfNoConsumers", discardIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder discardIfNoConsumers(
                String discardIfNoConsumers) {
            setProperty("discardIfNoConsumers", discardIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder failIfNoConsumers(
                boolean failIfNoConsumers) {
            setProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder failIfNoConsumers(
                String failIfNoConsumers) {
            setProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value.
         * The option is a <code>long</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder offerTimeout(long offerTimeout) {
            setProperty("offerTimeout", offerTimeout);
            return this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value.
         * The option will be converted to a <code>long</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder offerTimeout(
                String offerTimeout) {
            setProperty("offerTimeout", offerTimeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value.
         * The option is a <code>long</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder timeout(long timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value.
         * The option will be converted to a <code>long</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder timeout(String timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected.
         * The option is a <code>org.apache.camel.WaitForTaskToComplete</code>
         * type.
         * @group producer
         */
        public default VmEndpointProducerBuilder waitForTaskToComplete(
                WaitForTaskToComplete waitForTaskToComplete) {
            setProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected.
         * The option will be converted to a
         * <code>org.apache.camel.WaitForTaskToComplete</code> type.
         * @group producer
         */
        public default VmEndpointProducerBuilder waitForTaskToComplete(
                String waitForTaskToComplete) {
            setProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the VM component.
     */
    public interface AdvancedVmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default VmEndpointProducerBuilder basic() {
            return (VmEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * The option is a <code>java.util.concurrent.BlockingQueue</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointProducerBuilder queue(
                BlockingQueue queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointProducerBuilder queue(String queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the VM component.
     */
    public static interface VmEndpointBuilder
            extends
                VmEndpointConsumerBuilder, VmEndpointProducerBuilder {
        public default AdvancedVmEndpointBuilder advanced() {
            return (AdvancedVmEndpointBuilder) this;
        }
        /**
         * Name of queue.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default VmEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * The option is a <code>int</code> type.
         * @group common
         */
        public default VmEndpointBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default VmEndpointBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the VM component.
     */
    public static interface AdvancedVmEndpointBuilder
            extends
                AdvancedVmEndpointConsumerBuilder, AdvancedVmEndpointProducerBuilder {
        public default VmEndpointBuilder basic() {
            return (VmEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * The option is a <code>java.util.concurrent.BlockingQueue</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointBuilder queue(BlockingQueue queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointBuilder queue(String queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVmEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The vm component provides asynchronous call to another endpoint from the
     * same CamelContext. Creates a builder to build endpoints for the VM
     * component.
     */
    public default VmEndpointBuilder vm(String path) {
        class VmEndpointBuilderImpl extends AbstractEndpointBuilder implements VmEndpointBuilder, AdvancedVmEndpointBuilder {
            public VmEndpointBuilderImpl(String path) {
                super("vm", path);
            }
        }
        return new VmEndpointBuilderImpl(path);
    }
}