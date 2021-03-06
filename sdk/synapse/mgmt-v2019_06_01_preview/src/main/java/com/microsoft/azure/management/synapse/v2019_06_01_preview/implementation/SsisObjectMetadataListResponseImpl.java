/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.SsisObjectMetadataListResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SsisObjectMetadata;

class SsisObjectMetadataListResponseImpl extends WrapperImpl<SsisObjectMetadataListResponseInner> implements SsisObjectMetadataListResponse {
    private final SynapseManager manager;
    SsisObjectMetadataListResponseImpl(SsisObjectMetadataListResponseInner inner, SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<SsisObjectMetadata> value() {
        return this.inner().value();
    }

}
