// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ConnectionStringType. */
public enum ConnectionStringType {
    /** Enum value MySql. */
    MY_SQL("MySql"),

    /** Enum value SQLServer. */
    SQLSERVER("SQLServer"),

    /** Enum value SQLAzure. */
    SQLAZURE("SQLAzure"),

    /** Enum value Custom. */
    CUSTOM("Custom"),

    /** Enum value NotificationHub. */
    NOTIFICATION_HUB("NotificationHub"),

    /** Enum value ServiceBus. */
    SERVICE_BUS("ServiceBus"),

    /** Enum value EventHub. */
    EVENT_HUB("EventHub"),

    /** Enum value ApiHub. */
    API_HUB("ApiHub"),

    /** Enum value DocDb. */
    DOC_DB("DocDb"),

    /** Enum value RedisCache. */
    REDIS_CACHE("RedisCache"),

    /** Enum value PostgreSQL. */
    POSTGRE_SQL("PostgreSQL");

    /** The actual serialized value for a ConnectionStringType instance. */
    private final String value;

    ConnectionStringType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ConnectionStringType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ConnectionStringType object, or null if unable to parse.
     */
    @JsonCreator
    public static ConnectionStringType fromString(String value) {
        ConnectionStringType[] items = ConnectionStringType.values();
        for (ConnectionStringType item : items) {
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