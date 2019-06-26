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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The spring-batch component allows to send messages to Spring Batch for
 * further processing.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SpringBatchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spring Batch component.
     */
    public interface SpringBatchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSpringBatchEndpointBuilder advanced() {
            return (AdvancedSpringBatchEndpointBuilder) this;
        }
        /**
         * The name of the Spring Batch job located in the registry.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SpringBatchEndpointBuilder jobName(String jobName) {
            setProperty("jobName", jobName);
            return this;
        }
        /**
         * Explicitly defines if the jobName should be taken from the headers
         * instead of the URI.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default SpringBatchEndpointBuilder jobFromHeader(boolean jobFromHeader) {
            setProperty("jobFromHeader", jobFromHeader);
            return this;
        }
        /**
         * Explicitly defines if the jobName should be taken from the headers
         * instead of the URI.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default SpringBatchEndpointBuilder jobFromHeader(String jobFromHeader) {
            setProperty("jobFromHeader", jobFromHeader);
            return this;
        }
        /**
         * Explicitly specifies a JobLauncher to be used.
         * The option is a
         * <code>org.springframework.batch.core.launch.JobLauncher</code> type.
         * @group producer
         */
        default SpringBatchEndpointBuilder jobLauncher(Object jobLauncher) {
            setProperty("jobLauncher", jobLauncher);
            return this;
        }
        /**
         * Explicitly specifies a JobLauncher to be used.
         * The option will be converted to a
         * <code>org.springframework.batch.core.launch.JobLauncher</code> type.
         * @group producer
         */
        default SpringBatchEndpointBuilder jobLauncher(String jobLauncher) {
            setProperty("jobLauncher", jobLauncher);
            return this;
        }
        /**
         * Explicitly specifies a JobRegistry to be used.
         * The option is a
         * <code>org.springframework.batch.core.configuration.JobRegistry</code>
         * type.
         * @group producer
         */
        default SpringBatchEndpointBuilder jobRegistry(Object jobRegistry) {
            setProperty("jobRegistry", jobRegistry);
            return this;
        }
        /**
         * Explicitly specifies a JobRegistry to be used.
         * The option will be converted to a
         * <code>org.springframework.batch.core.configuration.JobRegistry</code>
         * type.
         * @group producer
         */
        default SpringBatchEndpointBuilder jobRegistry(String jobRegistry) {
            setProperty("jobRegistry", jobRegistry);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spring Batch component.
     */
    public interface AdvancedSpringBatchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SpringBatchEndpointBuilder basic() {
            return (SpringBatchEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSpringBatchEndpointBuilder basicPropertyBinding(
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
        default AdvancedSpringBatchEndpointBuilder basicPropertyBinding(
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
        default AdvancedSpringBatchEndpointBuilder synchronous(
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
        default AdvancedSpringBatchEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The spring-batch component allows to send messages to Spring Batch for
     * further processing.
     * Maven coordinates: org.apache.camel:camel-spring-batch
     */
    default SpringBatchEndpointBuilder springBatch(String path) {
        class SpringBatchEndpointBuilderImpl extends AbstractEndpointBuilder implements SpringBatchEndpointBuilder, AdvancedSpringBatchEndpointBuilder {
            public SpringBatchEndpointBuilderImpl(String path) {
                super("spring-batch", path);
            }
        }
        return new SpringBatchEndpointBuilderImpl(path);
    }
}