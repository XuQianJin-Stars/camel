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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The jcr component allows you to add/read nodes to/from a JCR compliant
 * content repository.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JcrEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the JCR component.
     */
    public interface JcrEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedJcrEndpointConsumerBuilder advanced() {
            return (AdvancedJcrEndpointConsumerBuilder) this;
        }
        /**
         * Name of the javax.jcr.Repository to lookup from the Camel registry to
         * be used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * Get the base node when accessing the repository.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder base(String base) {
            setProperty("base", base);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder deep(boolean deep) {
            setProperty("deep", deep);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder deep(String deep) {
            setProperty("deep", deep);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * The option is a <code>int</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder eventTypes(int eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder eventTypes(String eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * When a comma separated nodeTypeName list string is set, only events
         * whose associated parent node has one of the node types (or a subtype
         * of one of the node types) in this list will be received.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder nodeTypeNames(
                String nodeTypeNames) {
            setProperty("nodeTypeNames", nodeTypeNames);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder noLocal(boolean noLocal) {
            setProperty("noLocal", noLocal);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder noLocal(String noLocal) {
            setProperty("noLocal", noLocal);
            return this;
        }
        /**
         * Password for login.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * The option is a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder sessionLiveCheckInterval(
                long sessionLiveCheckInterval) {
            setProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * The option will be converted to a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder sessionLiveCheckInterval(
                String sessionLiveCheckInterval) {
            setProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * The option is a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder sessionLiveCheckIntervalOnStart(
                long sessionLiveCheckIntervalOnStart) {
            setProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * The option will be converted to a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder sessionLiveCheckIntervalOnStart(
                String sessionLiveCheckIntervalOnStart) {
            setProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Username for login.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * When a comma separated uuid list string is set, only events whose
         * associated parent node has one of the identifiers in the comma
         * separated uuid list will be received.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder uuids(String uuids) {
            setProperty("uuids", uuids);
            return this;
        }
        /**
         * The workspace to access. If it's not specified then the default one
         * will be used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointConsumerBuilder workspaceName(
                String workspaceName) {
            setProperty("workspaceName", workspaceName);
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
        public default JcrEndpointConsumerBuilder bridgeErrorHandler(
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
        public default JcrEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the JCR component.
     */
    public interface AdvancedJcrEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default JcrEndpointConsumerBuilder basic() {
            return (JcrEndpointConsumerBuilder) this;
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
        public default AdvancedJcrEndpointConsumerBuilder exceptionHandler(
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
        public default AdvancedJcrEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedJcrEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedJcrEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedJcrEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedJcrEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedJcrEndpointConsumerBuilder synchronous(
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
        public default AdvancedJcrEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the JCR component.
     */
    public static interface JcrEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedJcrEndpointProducerBuilder advanced() {
            return (AdvancedJcrEndpointProducerBuilder) this;
        }
        /**
         * Name of the javax.jcr.Repository to lookup from the Camel registry to
         * be used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * Get the base node when accessing the repository.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder base(String base) {
            setProperty("base", base);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder deep(boolean deep) {
            setProperty("deep", deep);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder deep(String deep) {
            setProperty("deep", deep);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * The option is a <code>int</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder eventTypes(int eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder eventTypes(String eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * When a comma separated nodeTypeName list string is set, only events
         * whose associated parent node has one of the node types (or a subtype
         * of one of the node types) in this list will be received.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder nodeTypeNames(
                String nodeTypeNames) {
            setProperty("nodeTypeNames", nodeTypeNames);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder noLocal(boolean noLocal) {
            setProperty("noLocal", noLocal);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder noLocal(String noLocal) {
            setProperty("noLocal", noLocal);
            return this;
        }
        /**
         * Password for login.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * The option is a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder sessionLiveCheckInterval(
                long sessionLiveCheckInterval) {
            setProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * The option will be converted to a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder sessionLiveCheckInterval(
                String sessionLiveCheckInterval) {
            setProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * The option is a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder sessionLiveCheckIntervalOnStart(
                long sessionLiveCheckIntervalOnStart) {
            setProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * The option will be converted to a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder sessionLiveCheckIntervalOnStart(
                String sessionLiveCheckIntervalOnStart) {
            setProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Username for login.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * When a comma separated uuid list string is set, only events whose
         * associated parent node has one of the identifiers in the comma
         * separated uuid list will be received.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder uuids(String uuids) {
            setProperty("uuids", uuids);
            return this;
        }
        /**
         * The workspace to access. If it's not specified then the default one
         * will be used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointProducerBuilder workspaceName(
                String workspaceName) {
            setProperty("workspaceName", workspaceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the JCR component.
     */
    public interface AdvancedJcrEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default JcrEndpointProducerBuilder basic() {
            return (JcrEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedJcrEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedJcrEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedJcrEndpointProducerBuilder synchronous(
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
        public default AdvancedJcrEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the JCR component.
     */
    public static interface JcrEndpointBuilder
            extends
                JcrEndpointConsumerBuilder, JcrEndpointProducerBuilder {
        public default AdvancedJcrEndpointBuilder advanced() {
            return (AdvancedJcrEndpointBuilder) this;
        }
        /**
         * Name of the javax.jcr.Repository to lookup from the Camel registry to
         * be used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * Get the base node when accessing the repository.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointBuilder base(String base) {
            setProperty("base", base);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointBuilder deep(boolean deep) {
            setProperty("deep", deep);
            return this;
        }
        /**
         * When isDeep is true, events whose associated parent node is at
         * absPath or within its subgraph are received.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointBuilder deep(String deep) {
            setProperty("deep", deep);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * The option is a <code>int</code> type.
         * @group common
         */
        public default JcrEndpointBuilder eventTypes(int eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * eventTypes (a combination of one or more event types encoded as a bit
         * mask value such as javax.jcr.observation.Event.NODE_ADDED,
         * javax.jcr.observation.Event.NODE_REMOVED, etc.).
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default JcrEndpointBuilder eventTypes(String eventTypes) {
            setProperty("eventTypes", eventTypes);
            return this;
        }
        /**
         * When a comma separated nodeTypeName list string is set, only events
         * whose associated parent node has one of the node types (or a subtype
         * of one of the node types) in this list will be received.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointBuilder nodeTypeNames(String nodeTypeNames) {
            setProperty("nodeTypeNames", nodeTypeNames);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointBuilder noLocal(boolean noLocal) {
            setProperty("noLocal", noLocal);
            return this;
        }
        /**
         * If noLocal is true, then events generated by the session through
         * which the listener was registered are ignored. Otherwise, they are
         * not ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default JcrEndpointBuilder noLocal(String noLocal) {
            setProperty("noLocal", noLocal);
            return this;
        }
        /**
         * Password for login.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * The option is a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointBuilder sessionLiveCheckInterval(
                long sessionLiveCheckInterval) {
            setProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before each session live checking
         * The default value is 60000 ms.
         * The option will be converted to a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointBuilder sessionLiveCheckInterval(
                String sessionLiveCheckInterval) {
            setProperty("sessionLiveCheckInterval", sessionLiveCheckInterval);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * The option is a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointBuilder sessionLiveCheckIntervalOnStart(
                long sessionLiveCheckIntervalOnStart) {
            setProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Interval in milliseconds to wait before the first session live
         * checking. The default value is 3000 ms.
         * The option will be converted to a <code>long</code> type.
         * @group common
         */
        public default JcrEndpointBuilder sessionLiveCheckIntervalOnStart(
                String sessionLiveCheckIntervalOnStart) {
            setProperty("sessionLiveCheckIntervalOnStart", sessionLiveCheckIntervalOnStart);
            return this;
        }
        /**
         * Username for login.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * When a comma separated uuid list string is set, only events whose
         * associated parent node has one of the identifiers in the comma
         * separated uuid list will be received.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointBuilder uuids(String uuids) {
            setProperty("uuids", uuids);
            return this;
        }
        /**
         * The workspace to access. If it's not specified then the default one
         * will be used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JcrEndpointBuilder workspaceName(String workspaceName) {
            setProperty("workspaceName", workspaceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JCR component.
     */
    public static interface AdvancedJcrEndpointBuilder
            extends
                AdvancedJcrEndpointConsumerBuilder, AdvancedJcrEndpointProducerBuilder {
        public default JcrEndpointBuilder basic() {
            return (JcrEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedJcrEndpointBuilder basicPropertyBinding(
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
        public default AdvancedJcrEndpointBuilder basicPropertyBinding(
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
        public default AdvancedJcrEndpointBuilder synchronous(
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
        public default AdvancedJcrEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The jcr component allows you to add/read nodes to/from a JCR compliant
     * content repository. Creates a builder to build endpoints for the JCR
     * component.
     */
    public default JcrEndpointBuilder jcr(String path) {
        class JcrEndpointBuilderImpl extends AbstractEndpointBuilder implements JcrEndpointBuilder, AdvancedJcrEndpointBuilder {
            public JcrEndpointBuilderImpl(String path) {
                super("jcr", path);
            }
        }
        return new JcrEndpointBuilderImpl(path);
    }
}