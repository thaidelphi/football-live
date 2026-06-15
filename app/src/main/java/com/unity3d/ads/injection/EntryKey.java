package com.unity3d.ads.injection;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import z8.c;
/* compiled from: EntryKey.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class EntryKey {
    private final c<?> instanceClass;
    private final String named;

    public EntryKey(String named, c<?> instanceClass) {
        n.f(named, "named");
        n.f(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entryKey.named;
        }
        if ((i10 & 2) != 0) {
            cVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c<?> component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String named, c<?> instanceClass) {
        n.f(named, "named");
        n.f(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EntryKey) {
            EntryKey entryKey = (EntryKey) obj;
            return n.a(this.named, entryKey.named) && n.a(this.instanceClass, entryKey.instanceClass);
        }
        return false;
    }

    public final c<?> getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, c cVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, cVar);
    }
}
