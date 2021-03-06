/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A recommended sensitivity label update operation.
 */
@JsonFlatten
public class RecommendedSensitivityLabelUpdate extends ProxyResource {
    /**
     * Possible values include: 'enable', 'disable'.
     */
    @JsonProperty(value = "properties.op", required = true)
    private RecommendedSensitivityLabelUpdateKind op;

    /**
     * Schema name of the column to update.
     */
    @JsonProperty(value = "properties.schema", required = true)
    private String schema;

    /**
     * Table name of the column to update.
     */
    @JsonProperty(value = "properties.table", required = true)
    private String table;

    /**
     * Column name to update.
     */
    @JsonProperty(value = "properties.column", required = true)
    private String column;

    /**
     * Get possible values include: 'enable', 'disable'.
     *
     * @return the op value
     */
    public RecommendedSensitivityLabelUpdateKind op() {
        return this.op;
    }

    /**
     * Set possible values include: 'enable', 'disable'.
     *
     * @param op the op value to set
     * @return the RecommendedSensitivityLabelUpdate object itself.
     */
    public RecommendedSensitivityLabelUpdate withOp(RecommendedSensitivityLabelUpdateKind op) {
        this.op = op;
        return this;
    }

    /**
     * Get schema name of the column to update.
     *
     * @return the schema value
     */
    public String schema() {
        return this.schema;
    }

    /**
     * Set schema name of the column to update.
     *
     * @param schema the schema value to set
     * @return the RecommendedSensitivityLabelUpdate object itself.
     */
    public RecommendedSensitivityLabelUpdate withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get table name of the column to update.
     *
     * @return the table value
     */
    public String table() {
        return this.table;
    }

    /**
     * Set table name of the column to update.
     *
     * @param table the table value to set
     * @return the RecommendedSensitivityLabelUpdate object itself.
     */
    public RecommendedSensitivityLabelUpdate withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get column name to update.
     *
     * @return the column value
     */
    public String column() {
        return this.column;
    }

    /**
     * Set column name to update.
     *
     * @param column the column value to set
     * @return the RecommendedSensitivityLabelUpdate object itself.
     */
    public RecommendedSensitivityLabelUpdate withColumn(String column) {
        this.column = column;
        return this;
    }

}
