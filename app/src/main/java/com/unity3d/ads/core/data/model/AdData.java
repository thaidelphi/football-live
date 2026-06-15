package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.n;
/* compiled from: AdContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ AdData m27boximpl(String str) {
        return new AdData(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m28constructorimpl(String data) {
        n.f(data, "data");
        return data;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m29equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && n.a(str, ((AdData) obj).m33unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m30equalsimpl0(String str, String str2) {
        return n.a(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m31hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m32toStringimpl(String str) {
        return "AdData(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m29equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m31hashCodeimpl(this.data);
    }

    public String toString() {
        return m32toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m33unboximpl() {
        return this.data;
    }
}
