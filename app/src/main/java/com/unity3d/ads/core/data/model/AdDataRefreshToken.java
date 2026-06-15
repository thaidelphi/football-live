package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.n;
/* compiled from: AdContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m34boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m35constructorimpl(String data) {
        n.f(data, "data");
        return data;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && n.a(str, ((AdDataRefreshToken) obj).m40unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37equalsimpl0(String str, String str2) {
        return n.a(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m39toStringimpl(String str) {
        return "AdDataRefreshToken(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m36equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m38hashCodeimpl(this.data);
    }

    public String toString() {
        return m39toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m40unboximpl() {
        return this.data;
    }
}
