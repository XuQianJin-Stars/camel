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
 * The rest component is used for either hosting REST services (consumer) or
 * calling external REST services (producer).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the REST component.
     */
    public interface RestEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedRestEndpointConsumerBuilder advanced() {
            return (AdvancedRestEndpointConsumerBuilder) this;
        }
        /**
         * HTTP method to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * The base path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * The uri template.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder uriTemplate(
                String uriTemplate) {
            setProperty("uriTemplate", uriTemplate);
            return this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * restlet, spark-rest. If no component has been explicit configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestConsumerFactory
         * is registered in the registry. If either one is found, then that is
         * being used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder componentName(
                String componentName) {
            setProperty("componentName", componentName);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder consumes(String consumes) {
            setProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder inType(String inType) {
            setProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder outType(String outType) {
            setProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder produces(String produces) {
            setProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointConsumerBuilder routeId(String routeId) {
            setProperty("routeId", routeId);
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
        public default RestEndpointConsumerBuilder bridgeErrorHandler(
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
        public default RestEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Human description to document this REST service.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        public default RestEndpointConsumerBuilder description(
                String description) {
            setProperty("description", description);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the REST component.
     */
    public interface AdvancedRestEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default RestEndpointConsumerBuilder basic() {
            return (RestEndpointConsumerBuilder) this;
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
        public default AdvancedRestEndpointConsumerBuilder exceptionHandler(
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
        public default AdvancedRestEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedRestEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedRestEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedRestEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedRestEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedRestEndpointConsumerBuilder synchronous(
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
        public default AdvancedRestEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the REST component.
     */
    public static interface RestEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedRestEndpointProducerBuilder advanced() {
            return (AdvancedRestEndpointProducerBuilder) this;
        }
        /**
         * HTTP method to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * The base path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * The uri template.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder uriTemplate(
                String uriTemplate) {
            setProperty("uriTemplate", uriTemplate);
            return this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * restlet, spark-rest. If no component has been explicit configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestConsumerFactory
         * is registered in the registry. If either one is found, then that is
         * being used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder componentName(
                String componentName) {
            setProperty("componentName", componentName);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder consumes(String consumes) {
            setProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder inType(String inType) {
            setProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder outType(String outType) {
            setProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder produces(String produces) {
            setProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointProducerBuilder routeId(String routeId) {
            setProperty("routeId", routeId);
            return this;
        }
        /**
         * The swagger api doc resource to use. The resource is loaded from
         * classpath by default and must be in JSon format.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public default RestEndpointProducerBuilder apiDoc(String apiDoc) {
            setProperty("apiDoc", apiDoc);
            return this;
        }
        /**
         * Configures the binding mode for the producer. If set to anything
         * other than 'off' the producer will try to convert the body of the
         * incoming message from inType to the json or xml, and the response
         * from json or xml to outType.
         * The option is a
         * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code>
         * type.
         * @group producer
         */
        public default RestEndpointProducerBuilder bindingMode(
                RestBindingMode bindingMode) {
            setProperty("bindingMode", bindingMode);
            return this;
        }
        /**
         * Configures the binding mode for the producer. If set to anything
         * other than 'off' the producer will try to convert the body of the
         * incoming message from inType to the json or xml, and the response
         * from json or xml to outType.
         * The option will be converted to a
         * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code>
         * type.
         * @group producer
         */
        public default RestEndpointProducerBuilder bindingMode(
                String bindingMode) {
            setProperty("bindingMode", bindingMode);
            return this;
        }
        /**
         * Host and port of HTTP service to use (override host in swagger
         * schema).
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public default RestEndpointProducerBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * Query parameters for the HTTP service to call.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        public default RestEndpointProducerBuilder queryParameters(
                String queryParameters) {
            setProperty("queryParameters", queryParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the REST component.
     */
    public interface AdvancedRestEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default RestEndpointProducerBuilder basic() {
            return (RestEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedRestEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedRestEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedRestEndpointProducerBuilder synchronous(
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
        public default AdvancedRestEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the REST component.
     */
    public static interface RestEndpointBuilder
            extends
                RestEndpointConsumerBuilder, RestEndpointProducerBuilder {
        public default AdvancedRestEndpointBuilder advanced() {
            return (AdvancedRestEndpointBuilder) this;
        }
        /**
         * HTTP method to use.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder method(String method) {
            setProperty("method", method);
            return this;
        }
        /**
         * The base path.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder path(String path) {
            setProperty("path", path);
            return this;
        }
        /**
         * The uri template.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder uriTemplate(String uriTemplate) {
            setProperty("uriTemplate", uriTemplate);
            return this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * restlet, spark-rest. If no component has been explicit configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestConsumerFactory
         * is registered in the registry. If either one is found, then that is
         * being used.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder componentName(String componentName) {
            setProperty("componentName", componentName);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder consumes(String consumes) {
            setProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder inType(String inType) {
            setProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder outType(String outType) {
            setProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder produces(String produces) {
            setProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default RestEndpointBuilder routeId(String routeId) {
            setProperty("routeId", routeId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the REST component.
     */
    public static interface AdvancedRestEndpointBuilder
            extends
                AdvancedRestEndpointConsumerBuilder, AdvancedRestEndpointProducerBuilder {
        public default RestEndpointBuilder basic() {
            return (RestEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedRestEndpointBuilder basicPropertyBinding(
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
        public default AdvancedRestEndpointBuilder basicPropertyBinding(
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
        public default AdvancedRestEndpointBuilder synchronous(
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
        public default AdvancedRestEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code> enum.
     */
    public static enum RestBindingMode {
        auto, off, json, xml, json_xml;
    }
    /**
     * The rest component is used for either hosting REST services (consumer) or
     * calling external REST services (producer). Creates a builder to build
     * endpoints for the REST component.
     */
    public default RestEndpointBuilder restEndpoint(String path) {
        class RestEndpointBuilderImpl extends AbstractEndpointBuilder implements RestEndpointBuilder, AdvancedRestEndpointBuilder {
            public RestEndpointBuilderImpl(String path) {
                super("rest", path);
            }
        }
        return new RestEndpointBuilderImpl(path);
    }
}