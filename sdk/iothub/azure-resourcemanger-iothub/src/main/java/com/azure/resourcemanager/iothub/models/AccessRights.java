// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AccessRights. */
public enum AccessRights {
    /** Enum value RegistryRead. */
    REGISTRY_READ("RegistryRead"),

    /** Enum value RegistryWrite. */
    REGISTRY_WRITE("RegistryWrite"),

    /** Enum value ServiceConnect. */
    SERVICE_CONNECT("ServiceConnect"),

    /** Enum value DeviceConnect. */
    DEVICE_CONNECT("DeviceConnect"),

    /** Enum value RegistryRead, RegistryWrite. */
    REGISTRY_READ_REGISTRY_WRITE("RegistryRead, RegistryWrite"),

    /** Enum value RegistryRead, ServiceConnect. */
    REGISTRY_READ_SERVICE_CONNECT("RegistryRead, ServiceConnect"),

    /** Enum value RegistryRead, DeviceConnect. */
    REGISTRY_READ_DEVICE_CONNECT("RegistryRead, DeviceConnect"),

    /** Enum value RegistryWrite, ServiceConnect. */
    REGISTRY_WRITE_SERVICE_CONNECT("RegistryWrite, ServiceConnect"),

    /** Enum value RegistryWrite, DeviceConnect. */
    REGISTRY_WRITE_DEVICE_CONNECT("RegistryWrite, DeviceConnect"),

    /** Enum value ServiceConnect, DeviceConnect. */
    SERVICE_CONNECT_DEVICE_CONNECT("ServiceConnect, DeviceConnect"),

    /** Enum value RegistryRead, RegistryWrite, ServiceConnect. */
    REGISTRY_READ_REGISTRY_WRITE_SERVICE_CONNECT("RegistryRead, RegistryWrite, ServiceConnect"),

    /** Enum value RegistryRead, RegistryWrite, DeviceConnect. */
    REGISTRY_READ_REGISTRY_WRITE_DEVICE_CONNECT("RegistryRead, RegistryWrite, DeviceConnect"),

    /** Enum value RegistryRead, ServiceConnect, DeviceConnect. */
    REGISTRY_READ_SERVICE_CONNECT_DEVICE_CONNECT("RegistryRead, ServiceConnect, DeviceConnect"),

    /** Enum value RegistryWrite, ServiceConnect, DeviceConnect. */
    REGISTRY_WRITE_SERVICE_CONNECT_DEVICE_CONNECT("RegistryWrite, ServiceConnect, DeviceConnect"),

    /** Enum value RegistryRead, RegistryWrite, ServiceConnect, DeviceConnect. */
    REGISTRY_READ_REGISTRY_WRITE_SERVICE_CONNECT_DEVICE_CONNECT(
            "RegistryRead, RegistryWrite, ServiceConnect, DeviceConnect");

    /** The actual serialized value for a AccessRights instance. */
    private final String value;

    AccessRights(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessRights instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessRights object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessRights fromString(String value) {
        AccessRights[] items = AccessRights.values();
        for (AccessRights item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
