// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties related to service bus queue endpoint types. */
@Fluent
public final class RoutingServiceBusQueueEndpointProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingServiceBusQueueEndpointProperties.class);

    /*
     * Id of the service bus queue endpoint
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The connection string of the service bus queue endpoint.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * The url of the service bus queue endpoint. It must include the protocol
     * sb://
     */
    @JsonProperty(value = "endpointUri")
    private String endpointUri;

    /*
     * Queue name on the service bus namespace
     */
    @JsonProperty(value = "entityPath")
    private String entityPath;

    /*
     * Method used to authenticate against the service bus queue endpoint
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * The name that identifies this endpoint. The name can only include
     * alphanumeric characters, periods, underscores, hyphens and has a maximum
     * length of 64 characters. The following names are reserved:  events,
     * fileNotifications, $default. Endpoint names must be unique across
     * endpoint types. The name need not be the same as the actual queue name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The subscription identifier of the service bus queue endpoint.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The name of the resource group of the service bus queue endpoint.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get the id property: Id of the service bus queue endpoint.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id of the service bus queue endpoint.
     *
     * @param id the id value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the connectionString property: The connection string of the service bus queue endpoint.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of the service bus queue endpoint.
     *
     * @param connectionString the connectionString value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the endpointUri property: The url of the service bus queue endpoint. It must include the protocol sb://.
     *
     * @return the endpointUri value.
     */
    public String getEndpointUri() {
        return this.endpointUri;
    }

    /**
     * Set the endpointUri property: The url of the service bus queue endpoint. It must include the protocol sb://.
     *
     * @param endpointUri the endpointUri value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * Get the entityPath property: Queue name on the service bus namespace.
     *
     * @return the entityPath value.
     */
    public String getEntityPath() {
        return this.entityPath;
    }

    /**
     * Set the entityPath property: Queue name on the service bus namespace.
     *
     * @param entityPath the entityPath value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setEntityPath(String entityPath) {
        this.entityPath = entityPath;
        return this;
    }

    /**
     * Get the authenticationType property: Method used to authenticate against the service bus queue endpoint.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Method used to authenticate against the service bus queue endpoint.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be
     * the same as the actual queue name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types. The name need not be
     * the same as the actual queue name.
     *
     * @param name the name value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription identifier of the service bus queue endpoint.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription identifier of the service bus queue endpoint.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: The name of the resource group of the service bus queue endpoint.
     *
     * @return the resourceGroup value.
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: The name of the resource group of the service bus queue endpoint.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the RoutingServiceBusQueueEndpointProperties object itself.
     */
    public RoutingServiceBusQueueEndpointProperties setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw logger.logExceptionAsError(
                    new IllegalArgumentException(
                            "Missing required property name in model RoutingServiceBusQueueEndpointProperties"));
        }
    }
}
