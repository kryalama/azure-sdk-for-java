// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties indicating whether a given IoT hub name is available. */
@Fluent
public final class IotHubNameAvailabilityInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubNameAvailabilityInfo.class);

    /*
     * The value which indicates whether the provided name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /*
     * The reason for unavailability.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private IotHubNameUnavailabilityReason reason;

    /*
     * The detailed reason message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the nameAvailable property: The value which indicates whether the provided name is available.
     *
     * @return the nameAvailable value.
     */
    public Boolean isNameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason property: The reason for unavailability.
     *
     * @return the reason value.
     */
    public IotHubNameUnavailabilityReason getReason() {
        return this.reason;
    }

    /**
     * Get the message property: The detailed reason message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The detailed reason message.
     *
     * @param message the message value to set.
     * @return the IotHubNameAvailabilityInfo object itself.
     */
    public IotHubNameAvailabilityInfo setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
