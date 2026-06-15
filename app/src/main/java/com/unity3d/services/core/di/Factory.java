package com.unity3d.services.core.di;

import i8.g;
import kotlin.jvm.internal.n;
import t8.a;
/* compiled from: ServiceFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class Factory<T> implements g<T> {
    private final a<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(a<? extends T> initializer) {
        n.f(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // i8.g
    public T getValue() {
        return this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
