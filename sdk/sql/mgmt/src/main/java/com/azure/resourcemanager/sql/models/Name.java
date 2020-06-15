// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Name model. */
@Fluent
public final class Name {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Name.class);

    /*
     * Usage name value
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Usage name localized value.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the value property: Usage name value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Usage name value.
     *
     * @param value the value value to set.
     * @return the Name object itself.
     */
    public Name withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Usage name localized value.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Usage name localized value.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the Name object itself.
     */
    public Name withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}