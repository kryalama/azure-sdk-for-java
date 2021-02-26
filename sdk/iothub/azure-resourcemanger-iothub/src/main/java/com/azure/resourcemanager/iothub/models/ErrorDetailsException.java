// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with ErrorDetails information. */
public final class ErrorDetailsException extends HttpResponseException {
    /**
     * Initializes a new instance of the ErrorDetailsException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ErrorDetailsException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorDetailsException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ErrorDetailsException(String message, HttpResponse response, ErrorDetails value) {
        super(message, response, value);
    }

    @Override
    public ErrorDetails getValue() {
        return (ErrorDetails) super.getValue();
    }
}
