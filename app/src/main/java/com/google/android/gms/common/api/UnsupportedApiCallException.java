package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    private final Feature f12077a;

    @KeepForSdk
    public UnsupportedApiCallException(Feature feature) {
        this.f12077a = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f12077a));
    }
}
