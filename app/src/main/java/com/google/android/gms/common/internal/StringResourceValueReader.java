package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StringResourceValueReader {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f12531a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12532b;

    public StringResourceValueReader(Context context) {
        Preconditions.m(context);
        Resources resources = context.getResources();
        this.f12531a = resources;
        this.f12532b = resources.getResourcePackageName(R.string.f12034a);
    }

    @KeepForSdk
    public String a(String str) {
        int identifier = this.f12531a.getIdentifier(str, "string", this.f12532b);
        if (identifier == 0) {
            return null;
        }
        return this.f12531a.getString(identifier);
    }
}
