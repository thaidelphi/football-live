package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.n;
/* compiled from: AdContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m41boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m42constructorimpl(String data) {
        n.f(data, "data");
        return data;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m43equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && n.a(str, ((ImpressionConfig) obj).m47unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m44equalsimpl0(String str, String str2) {
        return n.a(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m45hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m46toStringimpl(String str) {
        return "ImpressionConfig(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m43equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m45hashCodeimpl(this.data);
    }

    public String toString() {
        return m46toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m47unboximpl() {
        return this.data;
    }
}
