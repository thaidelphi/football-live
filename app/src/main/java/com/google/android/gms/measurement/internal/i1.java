package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f13009a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f13010b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(zzid zzidVar, Bundle bundle) {
        this.f13010b = zzidVar;
        this.f13009a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzid zzidVar = this.f13010b;
        Bundle bundle = this.f13009a;
        zzidVar.c();
        zzidVar.d();
        Preconditions.m(bundle);
        String g10 = Preconditions.g(bundle.getString("name"));
        if (!zzidVar.f13220a.j()) {
            zzidVar.f13220a.zzay().q().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzidVar.f13220a.G().n(new zzac(bundle.getString("app_id"), "", new zzlc(g10, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), zzidVar.f13220a.I().r0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
