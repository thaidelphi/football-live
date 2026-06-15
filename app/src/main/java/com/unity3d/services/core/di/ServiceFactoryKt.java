package com.unity3d.services.core.di;

import i8.g;
import kotlin.jvm.internal.n;
import t8.a;
/* compiled from: ServiceFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ServiceFactoryKt {
    public static final <T> g<T> factoryOf(a<? extends T> initializer) {
        n.f(initializer, "initializer");
        return new Factory(initializer);
    }
}
