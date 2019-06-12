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
 * The jgroups component provides exchange of messages between Camel and JGroups
 * clusters.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JGroupsRaftEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the JGroups raft component.
     */
    public interface JGroupsRaftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedJGroupsRaftEndpointConsumerBuilder advanced() {
            return (AdvancedJGroupsRaftEndpointConsumerBuilder) this;
        }
        /**
         * The name of the JGroupsraft cluster the component should connect to.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JGroupsRaftEndpointConsumerBuilder clusterName(
                String clusterName) {
            setProperty("clusterName", clusterName);
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
        public default JGroupsRaftEndpointConsumerBuilder bridgeErrorHandler(
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
        public default JGroupsRaftEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If set to true, the consumer endpoint will receive roleChange event
         * as well (not just connecting and/or using the state machine). By
         * default it is set to false.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public default JGroupsRaftEndpointConsumerBuilder enableRoleChangeEvents(
                boolean enableRoleChangeEvents) {
            setProperty("enableRoleChangeEvents", enableRoleChangeEvents);
            return this;
        }
        /**
         * If set to true, the consumer endpoint will receive roleChange event
         * as well (not just connecting and/or using the state machine). By
         * default it is set to false.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public default JGroupsRaftEndpointConsumerBuilder enableRoleChangeEvents(
                String enableRoleChangeEvents) {
            setProperty("enableRoleChangeEvents", enableRoleChangeEvents);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the JGroups raft component.
     */
    public interface AdvancedJGroupsRaftEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default JGroupsRaftEndpointConsumerBuilder basic() {
            return (JGroupsRaftEndpointConsumerBuilder) this;
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
        public default AdvancedJGroupsRaftEndpointConsumerBuilder exceptionHandler(
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
        public default AdvancedJGroupsRaftEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedJGroupsRaftEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedJGroupsRaftEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedJGroupsRaftEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedJGroupsRaftEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedJGroupsRaftEndpointConsumerBuilder synchronous(
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
        public default AdvancedJGroupsRaftEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the JGroups raft component.
     */
    public static interface JGroupsRaftEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedJGroupsRaftEndpointProducerBuilder advanced() {
            return (AdvancedJGroupsRaftEndpointProducerBuilder) this;
        }
        /**
         * The name of the JGroupsraft cluster the component should connect to.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JGroupsRaftEndpointProducerBuilder clusterName(
                String clusterName) {
            setProperty("clusterName", clusterName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the JGroups raft component.
     */
    public interface AdvancedJGroupsRaftEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default JGroupsRaftEndpointProducerBuilder basic() {
            return (JGroupsRaftEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedJGroupsRaftEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedJGroupsRaftEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedJGroupsRaftEndpointProducerBuilder synchronous(
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
        public default AdvancedJGroupsRaftEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the JGroups raft component.
     */
    public static interface JGroupsRaftEndpointBuilder
            extends
                JGroupsRaftEndpointConsumerBuilder, JGroupsRaftEndpointProducerBuilder {
        public default AdvancedJGroupsRaftEndpointBuilder advanced() {
            return (AdvancedJGroupsRaftEndpointBuilder) this;
        }
        /**
         * The name of the JGroupsraft cluster the component should connect to.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default JGroupsRaftEndpointBuilder clusterName(String clusterName) {
            setProperty("clusterName", clusterName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JGroups raft component.
     */
    public static interface AdvancedJGroupsRaftEndpointBuilder
            extends
                AdvancedJGroupsRaftEndpointConsumerBuilder, AdvancedJGroupsRaftEndpointProducerBuilder {
        public default JGroupsRaftEndpointBuilder basic() {
            return (JGroupsRaftEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedJGroupsRaftEndpointBuilder basicPropertyBinding(
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
        public default AdvancedJGroupsRaftEndpointBuilder basicPropertyBinding(
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
        public default AdvancedJGroupsRaftEndpointBuilder synchronous(
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
        public default AdvancedJGroupsRaftEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The jgroups component provides exchange of messages between Camel and
     * JGroups clusters. Creates a builder to build endpoints for the JGroups
     * raft component.
     */
    public default JGroupsRaftEndpointBuilder jGroupsRaft(String path) {
        class JGroupsRaftEndpointBuilderImpl extends AbstractEndpointBuilder implements JGroupsRaftEndpointBuilder, AdvancedJGroupsRaftEndpointBuilder {
            public JGroupsRaftEndpointBuilderImpl(String path) {
                super("jgroups-raft", path);
            }
        }
        return new JGroupsRaftEndpointBuilderImpl(path);
    }
}