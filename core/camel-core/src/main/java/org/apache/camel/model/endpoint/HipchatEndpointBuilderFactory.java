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

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The hipchat component supports producing and consuming messages from/to
 * Hipchat service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HipchatEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Hipchat component.
     */
    public interface HipchatEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedHipchatEndpointConsumerBuilder advanced() {
            return (AdvancedHipchatEndpointConsumerBuilder) this;
        }
        /**
         * The protocol for the hipchat server, such as http.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder protocol(String protocol) {
            setProperty("protocol", protocol);
            return this;
        }
        /**
         * The host for the hipchat server, such as api.hipchat.com.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * The port for the hipchat server. Is by default 80.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder port(Integer port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The port for the hipchat server. Is by default 80.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * OAuth 2 auth token.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder authToken(String authToken) {
            setProperty("authToken", authToken);
            return this;
        }
        /**
         * Username(s) when consuming messages from the hiptchat server.
         * Multiple user names can be separated by comma.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder consumeUsers(
                String consumeUsers) {
            setProperty("consumeUsers", consumeUsers);
            return this;
        }
        /**
         * The CloseableHttpClient reference from registry to be used during API
         * HTTP requests.
         * The option is a
         * <code>org.apache.http.impl.client.CloseableHttpClient</code> type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder httpClient(
                Object httpClient) {
            setProperty("httpClient", httpClient);
            return this;
        }
        /**
         * The CloseableHttpClient reference from registry to be used during API
         * HTTP requests.
         * The option will be converted to a
         * <code>org.apache.http.impl.client.CloseableHttpClient</code> type.
         * @group common
         */
        public default HipchatEndpointConsumerBuilder httpClient(
                String httpClient) {
            setProperty("httpClient", httpClient);
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
        public default HipchatEndpointConsumerBuilder bridgeErrorHandler(
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
        public default HipchatEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public default HipchatEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            setProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public default HipchatEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            setProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            setProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            setProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            setProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            setProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder backoffMultiplier(
                int backoffMultiplier) {
            setProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            setProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option is a <code>long</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder delay(long delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option will be converted to a <code>long</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder delay(String delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder greedy(boolean greedy) {
            setProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder greedy(String greedy) {
            setProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option is a <code>long</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder initialDelay(
                long initialDelay) {
            setProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option will be converted to a <code>long</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder initialDelay(
                String initialDelay) {
            setProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * The option is a <code>org.apache.camel.LoggingLevel</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            setProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * The option will be converted to a
         * <code>org.apache.camel.LoggingLevel</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder runLoggingLevel(
                String runLoggingLevel) {
            setProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            setProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            setProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component.
         * The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            setProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder scheduler(String scheduler) {
            setProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            setProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            setProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder startScheduler(
                boolean startScheduler) {
            setProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder startScheduler(
                String startScheduler) {
            setProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * The option is a <code>java.util.concurrent.TimeUnit</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder timeUnit(TimeUnit timeUnit) {
            setProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * The option will be converted to a
         * <code>java.util.concurrent.TimeUnit</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder timeUnit(String timeUnit) {
            setProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder useFixedDelay(
                boolean useFixedDelay) {
            setProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        public default HipchatEndpointConsumerBuilder useFixedDelay(
                String useFixedDelay) {
            setProperty("useFixedDelay", useFixedDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Hipchat component.
     */
    public interface AdvancedHipchatEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default HipchatEndpointConsumerBuilder basic() {
            return (HipchatEndpointConsumerBuilder) this;
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
        public default AdvancedHipchatEndpointConsumerBuilder exceptionHandler(
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
        public default AdvancedHipchatEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedHipchatEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedHipchatEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedHipchatEndpointConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            setProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * The option will be converted to a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedHipchatEndpointConsumerBuilder pollStrategy(
                String pollStrategy) {
            setProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedHipchatEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedHipchatEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedHipchatEndpointConsumerBuilder synchronous(
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
        public default AdvancedHipchatEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Hipchat component.
     */
    public static interface HipchatEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedHipchatEndpointProducerBuilder advanced() {
            return (AdvancedHipchatEndpointProducerBuilder) this;
        }
        /**
         * The protocol for the hipchat server, such as http.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder protocol(String protocol) {
            setProperty("protocol", protocol);
            return this;
        }
        /**
         * The host for the hipchat server, such as api.hipchat.com.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * The port for the hipchat server. Is by default 80.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder port(Integer port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The port for the hipchat server. Is by default 80.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * OAuth 2 auth token.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder authToken(String authToken) {
            setProperty("authToken", authToken);
            return this;
        }
        /**
         * Username(s) when consuming messages from the hiptchat server.
         * Multiple user names can be separated by comma.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder consumeUsers(
                String consumeUsers) {
            setProperty("consumeUsers", consumeUsers);
            return this;
        }
        /**
         * The CloseableHttpClient reference from registry to be used during API
         * HTTP requests.
         * The option is a
         * <code>org.apache.http.impl.client.CloseableHttpClient</code> type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder httpClient(
                Object httpClient) {
            setProperty("httpClient", httpClient);
            return this;
        }
        /**
         * The CloseableHttpClient reference from registry to be used during API
         * HTTP requests.
         * The option will be converted to a
         * <code>org.apache.http.impl.client.CloseableHttpClient</code> type.
         * @group common
         */
        public default HipchatEndpointProducerBuilder httpClient(
                String httpClient) {
            setProperty("httpClient", httpClient);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Hipchat component.
     */
    public interface AdvancedHipchatEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default HipchatEndpointProducerBuilder basic() {
            return (HipchatEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedHipchatEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedHipchatEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedHipchatEndpointProducerBuilder synchronous(
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
        public default AdvancedHipchatEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Hipchat component.
     */
    public static interface HipchatEndpointBuilder
            extends
                HipchatEndpointConsumerBuilder, HipchatEndpointProducerBuilder {
        public default AdvancedHipchatEndpointBuilder advanced() {
            return (AdvancedHipchatEndpointBuilder) this;
        }
        /**
         * The protocol for the hipchat server, such as http.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointBuilder protocol(String protocol) {
            setProperty("protocol", protocol);
            return this;
        }
        /**
         * The host for the hipchat server, such as api.hipchat.com.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * The port for the hipchat server. Is by default 80.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default HipchatEndpointBuilder port(Integer port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The port for the hipchat server. Is by default 80.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default HipchatEndpointBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * OAuth 2 auth token.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointBuilder authToken(String authToken) {
            setProperty("authToken", authToken);
            return this;
        }
        /**
         * Username(s) when consuming messages from the hiptchat server.
         * Multiple user names can be separated by comma.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default HipchatEndpointBuilder consumeUsers(String consumeUsers) {
            setProperty("consumeUsers", consumeUsers);
            return this;
        }
        /**
         * The CloseableHttpClient reference from registry to be used during API
         * HTTP requests.
         * The option is a
         * <code>org.apache.http.impl.client.CloseableHttpClient</code> type.
         * @group common
         */
        public default HipchatEndpointBuilder httpClient(Object httpClient) {
            setProperty("httpClient", httpClient);
            return this;
        }
        /**
         * The CloseableHttpClient reference from registry to be used during API
         * HTTP requests.
         * The option will be converted to a
         * <code>org.apache.http.impl.client.CloseableHttpClient</code> type.
         * @group common
         */
        public default HipchatEndpointBuilder httpClient(String httpClient) {
            setProperty("httpClient", httpClient);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hipchat component.
     */
    public static interface AdvancedHipchatEndpointBuilder
            extends
                AdvancedHipchatEndpointConsumerBuilder, AdvancedHipchatEndpointProducerBuilder {
        public default HipchatEndpointBuilder basic() {
            return (HipchatEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedHipchatEndpointBuilder basicPropertyBinding(
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
        public default AdvancedHipchatEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedHipchatEndpointBuilder synchronous(
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
        public default AdvancedHipchatEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The hipchat component supports producing and consuming messages from/to
     * Hipchat service. Creates a builder to build endpoints for the Hipchat
     * component.
     */
    public default HipchatEndpointBuilder hipchat(String path) {
        class HipchatEndpointBuilderImpl extends AbstractEndpointBuilder implements HipchatEndpointBuilder, AdvancedHipchatEndpointBuilder {
            public HipchatEndpointBuilderImpl(String path) {
                super("hipchat", path);
            }
        }
        return new HipchatEndpointBuilderImpl(path);
    }
}