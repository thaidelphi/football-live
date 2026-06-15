package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfh;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AppMeasurementReceiver extends i0.a implements zzfh.zza {

    /* renamed from: c  reason: collision with root package name */
    private zzfh f12823c;

    @Override // com.google.android.gms.measurement.internal.zzfh.zza
    public void a(Context context, Intent intent) {
        i0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f12823c == null) {
            this.f12823c = new zzfh(this);
        }
        this.f12823c.a(context, intent);
    }
}
