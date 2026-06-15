package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ep {

    /* renamed from: a  reason: collision with root package name */
    private final String f17286a;

    public ep(String baseControllerUrl) {
        kotlin.jvm.internal.n.f(baseControllerUrl, "baseControllerUrl");
        this.f17286a = baseControllerUrl;
    }

    public final String a() {
        int O;
        String str = this.f17286a;
        O = b9.p.O(str, "/", 0, false, 6, null);
        String substring = str.substring(0, O);
        kotlin.jvm.internal.n.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
