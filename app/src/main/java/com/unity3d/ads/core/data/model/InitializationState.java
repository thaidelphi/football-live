package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.n;
/* compiled from: InitializationState.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    @Override // java.lang.Enum
    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        n.e(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
