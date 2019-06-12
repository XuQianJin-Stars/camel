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
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Integrates Camel with Wordpress.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface WordpressEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Wordpress component.
     */
    public interface WordpressEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedWordpressEndpointConsumerBuilder advanced() {
            return (AdvancedWordpressEndpointConsumerBuilder) this;
        }
        /**
         * The endpoint operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder operation(
                String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder operationDetail(
                String operationDetail) {
            setProperty("operationDetail", operationDetail);
            return this;
        }
        /**
         * The Wordpress REST API version.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder apiVersion(
                String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder criteria(
                Map<String, Object> criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder criteria(String criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder force(Boolean force) {
            setProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder force(String force) {
            setProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder id(Integer id) {
            setProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder id(String id) {
            setProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * The option is a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder searchCriteria(
                Object searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * The option will be converted to a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder searchCriteria(
                String searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder url(String url) {
            setProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointConsumerBuilder user(String user) {
            setProperty("user", user);
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
        public default WordpressEndpointConsumerBuilder bridgeErrorHandler(
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
        public default WordpressEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default WordpressEndpointConsumerBuilder basic() {
            return (WordpressEndpointConsumerBuilder) this;
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
        public default AdvancedWordpressEndpointConsumerBuilder exceptionHandler(
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
        public default AdvancedWordpressEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedWordpressEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedWordpressEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedWordpressEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedWordpressEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedWordpressEndpointConsumerBuilder synchronous(
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
        public default AdvancedWordpressEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Wordpress component.
     */
    public static interface WordpressEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedWordpressEndpointProducerBuilder advanced() {
            return (AdvancedWordpressEndpointProducerBuilder) this;
        }
        /**
         * The endpoint operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder operation(
                String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder operationDetail(
                String operationDetail) {
            setProperty("operationDetail", operationDetail);
            return this;
        }
        /**
         * The Wordpress REST API version.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder apiVersion(
                String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder criteria(
                Map<String, Object> criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder criteria(String criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder force(Boolean force) {
            setProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder force(String force) {
            setProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder id(Integer id) {
            setProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder id(String id) {
            setProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * The option is a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder searchCriteria(
                Object searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * The option will be converted to a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder searchCriteria(
                String searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder url(String url) {
            setProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointProducerBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default WordpressEndpointProducerBuilder basic() {
            return (WordpressEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedWordpressEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedWordpressEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedWordpressEndpointProducerBuilder synchronous(
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
        public default AdvancedWordpressEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Wordpress component.
     */
    public static interface WordpressEndpointBuilder
            extends
                WordpressEndpointConsumerBuilder, WordpressEndpointProducerBuilder {
        public default AdvancedWordpressEndpointBuilder advanced() {
            return (AdvancedWordpressEndpointBuilder) this;
        }
        /**
         * The endpoint operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder operationDetail(
                String operationDetail) {
            setProperty("operationDetail", operationDetail);
            return this;
        }
        /**
         * The Wordpress REST API version.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder apiVersion(String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder criteria(
                Map<String, Object> criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group common
         */
        public default WordpressEndpointBuilder criteria(String criteria) {
            setProperty("criteria", criteria);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder force(Boolean force) {
            setProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        public default WordpressEndpointBuilder force(String force) {
            setProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option is a <code>java.lang.Integer</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder id(Integer id) {
            setProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group common
         */
        public default WordpressEndpointBuilder id(String id) {
            setProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * The option is a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder searchCriteria(
                Object searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * The option will be converted to a
         * <code>org.apache.camel.component.wordpress.api.model.SearchCriteria</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder searchCriteria(
                String searchCriteria) {
            setProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder url(String url) {
            setProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default WordpressEndpointBuilder user(String user) {
            setProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Wordpress component.
     */
    public static interface AdvancedWordpressEndpointBuilder
            extends
                AdvancedWordpressEndpointConsumerBuilder, AdvancedWordpressEndpointProducerBuilder {
        public default WordpressEndpointBuilder basic() {
            return (WordpressEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedWordpressEndpointBuilder basicPropertyBinding(
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
        public default AdvancedWordpressEndpointBuilder basicPropertyBinding(
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
        public default AdvancedWordpressEndpointBuilder synchronous(
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
        public default AdvancedWordpressEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Integrates Camel with Wordpress. Creates a builder to build endpoints for
     * the Wordpress component.
     */
    public default WordpressEndpointBuilder wordpress(String path) {
        class WordpressEndpointBuilderImpl extends AbstractEndpointBuilder implements WordpressEndpointBuilder, AdvancedWordpressEndpointBuilder {
            public WordpressEndpointBuilderImpl(String path) {
                super("wordpress", path);
            }
        }
        return new WordpressEndpointBuilderImpl(path);
    }
}