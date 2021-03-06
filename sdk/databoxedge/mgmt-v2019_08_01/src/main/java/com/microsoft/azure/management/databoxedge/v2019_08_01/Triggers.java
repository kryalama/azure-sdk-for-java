/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.TriggersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Triggers.
 */
public interface Triggers extends SupportsCreating<Trigger.DefinitionStages.Blank>, HasInner<TriggersInner> {
    /**
     * Get a specific trigger by name.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Trigger> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Lists all the triggers configured in the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Trigger> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

    /**
     * Deletes the trigger on the gateway device.
     *
     * @param deviceName The device name.
     * @param name The trigger name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String name, String resourceGroupName);

}
