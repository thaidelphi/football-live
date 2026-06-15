package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IronSourceQaProperties {

    /* renamed from: a  reason: collision with root package name */
    private static IronSourceQaProperties f20634a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f20635b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f20634a == null) {
            f20634a = new IronSourceQaProperties();
        }
        return f20634a;
    }

    public static boolean isInitialized() {
        return f20634a != null;
    }

    public Map<String, String> getParameters() {
        return f20635b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f20635b.put(str, str2);
    }
}
