// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input values. */
@Fluent
public final class OperationInputs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInputs.class);

    /*
     * The name of the IoT hub to check.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: The name of the IoT hub to check.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the IoT hub to check.
     *
     * @param name the name value to set.
     * @return the OperationInputs object itself.
     */
    public OperationInputs setName(String name) {
        this.name = name;
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
                    new IllegalArgumentException("Missing required property name in model OperationInputs"));
        }
    }
}
