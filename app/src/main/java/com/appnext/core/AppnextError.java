package com.appnext.core;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppnextError {
    public static final String CONNECTION_ERROR = "Connection Error";
    public static final String INTERNAL_ERROR = "Internal error";
    public static final String NO_ADS = "No Ads";
    public static final String NO_MARKET = "No market installed on the device";
    public static final String NULL_CONTEXT = "Null context";
    public static final String SLOW_CONNECTION = "Too Slow Connection";
    public static final String TIMEOUT = "Timeout";
    private String cY;

    public AppnextError(String str) {
        this.cY = "";
        this.cY = str;
    }

    public String getErrorMessage() {
        return this.cY;
    }
}
