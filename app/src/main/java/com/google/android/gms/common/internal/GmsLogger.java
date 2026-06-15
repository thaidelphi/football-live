package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class GmsLogger {

    /* renamed from: a  reason: collision with root package name */
    private final String f12505a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12506b;

    @KeepForSdk
    public GmsLogger(String str, String str2) {
        Preconditions.n(str, "log tag cannot be null");
        Preconditions.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f12505a = str;
        this.f12506b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
