package com.unity3d.ads.core.extensions;

import b9.c;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.n;
import y9.f;
/* compiled from: StringExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        n.f(str, "<this>");
        byte[] bytes = str.getBytes(c.f5283b);
        n.e(bytes, "this as java.lang.String).getBytes(charset)");
        String k10 = f.m(Arrays.copyOf(bytes, bytes.length)).q().k();
        n.e(k10, "bytes.sha256().hex()");
        return k10;
    }

    public static final String guessMimeType(String str) {
        n.f(str, "<this>");
        String guessMimeType = URLConnection.guessContentTypeFromName(str);
        n.e(guessMimeType, "guessMimeType");
        return guessMimeType;
    }
}
