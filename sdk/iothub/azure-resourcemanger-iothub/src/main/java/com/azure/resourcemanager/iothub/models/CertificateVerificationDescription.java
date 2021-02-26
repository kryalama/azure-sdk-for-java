// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON-serialized leaf certificate. */
@Fluent
public final class CertificateVerificationDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateVerificationDescription.class);

    /*
     * base-64 representation of X509 certificate .cer file or just .pem file
     * content.
     */
    @JsonProperty(value = "certificate")
    private String certificate;

    /**
     * Get the certificate property: base-64 representation of X509 certificate .cer file or just .pem file content.
     *
     * @return the certificate value.
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: base-64 representation of X509 certificate .cer file or just .pem file content.
     *
     * @param certificate the certificate value to set.
     * @return the CertificateVerificationDescription object itself.
     */
    public CertificateVerificationDescription setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
