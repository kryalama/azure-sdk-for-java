/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview.implementation;

import com.microsoft.azure.management.avs.v2019_08_09_preview.Sku;
import com.microsoft.azure.management.avs.v2019_08_09_preview.PrivateCloudProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A private cloud resource.
 */
@SkipParentValidation
public class PrivateCloudInner extends Resource {
    /**
     * The private cloud SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The properties of a private cloud resource.
     */
    @JsonProperty(value = "properties")
    private PrivateCloudProperties properties;

    /**
     * Get the private cloud SKU.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the private cloud SKU.
     *
     * @param sku the sku value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties of a private cloud resource.
     *
     * @return the properties value
     */
    public PrivateCloudProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties of a private cloud resource.
     *
     * @param properties the properties value to set
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withProperties(PrivateCloudProperties properties) {
        this.properties = properties;
        return this;
    }

}