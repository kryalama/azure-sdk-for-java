package com.microsoft.windowsazure.utils;

import java.util.Date;

public class DefaultDateFactory implements DateFactory {
    public Date getDate() {
        return new Date();
    }
}
