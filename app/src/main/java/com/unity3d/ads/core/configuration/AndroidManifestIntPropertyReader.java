package com.unity3d.ads.core.configuration;

import android.content.Context;
import kotlin.jvm.internal.n;
/* compiled from: AndroidManifestIntPropertyReader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        n.f(context, "context");
        this.context = context;
    }

    public final Integer getPropertyByName(String propertyName) {
        n.f(propertyName, "propertyName");
        try {
            return Integer.valueOf(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.getInt(propertyName));
        } catch (Exception unused) {
            return null;
        }
    }
}
