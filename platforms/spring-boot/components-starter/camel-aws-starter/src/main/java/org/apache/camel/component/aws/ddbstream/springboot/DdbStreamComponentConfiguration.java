/**
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
package org.apache.camel.component.aws.ddbstream.springboot;

import javax.annotation.Generated;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams;
import com.amazonaws.services.dynamodbv2.model.ShardIteratorType;
import org.apache.camel.component.aws.ddbstream.DdbStreamComponent;
import org.apache.camel.component.aws.ddbstream.SequenceNumberProvider;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-ddbstream component is used for working with Amazon DynamoDB Streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-ddbstream")
public class DdbStreamComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * The AWS DDB stream default configuration
     */
    private DdbStreamConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Amazon AWS Region
     */
    private String region;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public DdbStreamConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            DdbStreamConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class DdbStreamConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.ddbstream.DdbStreamConfiguration.class;
        private AmazonDynamoDBStreams amazonDynamoDbStreamsClient;
        private String accessKey;
        private String secretKey;
        private String region;
        private Integer maxResultsPerRequest;
        private String tableName;
        private ShardIteratorType iteratorType = ShardIteratorType.LATEST;
        private SequenceNumberProvider sequenceNumberProvider;
        private String proxyHost;
        private Integer proxyPort;

        public AmazonDynamoDBStreams getAmazonDynamoDbStreamsClient() {
            return amazonDynamoDbStreamsClient;
        }

        public void setAmazonDynamoDbStreamsClient(
                AmazonDynamoDBStreams amazonDynamoDbStreamsClient) {
            this.amazonDynamoDbStreamsClient = amazonDynamoDbStreamsClient;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Integer getMaxResultsPerRequest() {
            return maxResultsPerRequest;
        }

        public void setMaxResultsPerRequest(Integer maxResultsPerRequest) {
            this.maxResultsPerRequest = maxResultsPerRequest;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public ShardIteratorType getIteratorType() {
            return iteratorType;
        }

        public void setIteratorType(ShardIteratorType iteratorType) {
            this.iteratorType = iteratorType;
        }

        public SequenceNumberProvider getSequenceNumberProvider() {
            return sequenceNumberProvider;
        }

        public void setSequenceNumberProvider(
                SequenceNumberProvider sequenceNumberProvider) {
            this.sequenceNumberProvider = sequenceNumberProvider;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }
    }
}