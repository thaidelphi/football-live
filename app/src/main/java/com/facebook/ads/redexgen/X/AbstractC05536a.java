package com.facebook.ads.redexgen.X;

import java.lang.reflect.Proxy;
/* renamed from: com.facebook.ads.redexgen.X.6a  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC05536a {
    public static <T> T A00(T impl, Class<T> clazz) {
        ClassLoader classLoader = impl.getClass().getClassLoader();
        return clazz.cast(Proxy.newProxyInstance(classLoader, new Class[]{clazz}, new C6Z(impl, classLoader)));
    }
}
