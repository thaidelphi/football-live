package com.google.android.gms.common;

import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: b  reason: collision with root package name */
    private final int f12024b;

    public GooglePlayServicesRepairableException(int i10, String str, Intent intent) {
        super(str, intent);
        this.f12024b = i10;
    }
}
