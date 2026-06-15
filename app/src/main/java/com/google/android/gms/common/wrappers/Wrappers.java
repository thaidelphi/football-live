package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Wrappers {

    /* renamed from: b  reason: collision with root package name */
    private static final Wrappers f12769b = new Wrappers();

    /* renamed from: a  reason: collision with root package name */
    private PackageManagerWrapper f12770a = null;

    @KeepForSdk
    public static PackageManagerWrapper a(Context context) {
        return f12769b.b(context);
    }

    public final synchronized PackageManagerWrapper b(Context context) {
        if (this.f12770a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f12770a = new PackageManagerWrapper(context);
        }
        return this.f12770a;
    }
}
