/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TrailingSeparatorPolicy.
 */
public final class TrailingSeparatorPolicy extends ExpandableStringEnum<TrailingSeparatorPolicy> {
    /** Static value NotSpecified for TrailingSeparatorPolicy. */
    public static final TrailingSeparatorPolicy NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value NotAllowed for TrailingSeparatorPolicy. */
    public static final TrailingSeparatorPolicy NOT_ALLOWED = fromString("NotAllowed");

    /** Static value Optional for TrailingSeparatorPolicy. */
    public static final TrailingSeparatorPolicy OPTIONAL = fromString("Optional");

    /** Static value Mandatory for TrailingSeparatorPolicy. */
    public static final TrailingSeparatorPolicy MANDATORY = fromString("Mandatory");

    /**
     * Creates or finds a TrailingSeparatorPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding TrailingSeparatorPolicy
     */
    @JsonCreator
    public static TrailingSeparatorPolicy fromString(String name) {
        return fromString(name, TrailingSeparatorPolicy.class);
    }

    /**
     * @return known TrailingSeparatorPolicy values
     */
    public static Collection<TrailingSeparatorPolicy> values() {
        return values(TrailingSeparatorPolicy.class);
    }
}
