package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfh {

    /* renamed from: a  reason: collision with root package name */
    private final zza f13523a;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface zza {
        void a(Context context, Intent intent);
    }

    public zzfh(zza zzaVar) {
        Preconditions.m(zzaVar);
        this.f13523a = zzaVar;
    }

    public final void a(Context context, Intent intent) {
        zzfy C = zzfy.C(context, null, null);
        zzeo zzay = C.zzay();
        if (intent == null) {
            zzay.r().a("Receiver called with null intent");
            return;
        }
        C.zzaw();
        String action = intent.getAction();
        zzay.q().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzay.q().a("Starting wakeful intent.");
            this.f13523a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            zzay.r().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
