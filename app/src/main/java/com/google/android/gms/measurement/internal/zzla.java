package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
@VisibleForTesting
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzla {

    /* renamed from: a  reason: collision with root package name */
    final Context f13706a;

    @VisibleForTesting
    public zzla(Context context) {
        Preconditions.m(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m(applicationContext);
        this.f13706a = applicationContext;
    }
}
