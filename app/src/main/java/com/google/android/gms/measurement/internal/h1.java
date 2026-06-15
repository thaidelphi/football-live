package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.b9;
import com.ironsource.cc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f12980a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzid f12981b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(zzid zzidVar, Bundle bundle) {
        this.f12981b = zzidVar;
        this.f12980a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzid zzidVar = this.f12981b;
        Bundle bundle = this.f12980a;
        zzidVar.c();
        zzidVar.d();
        Preconditions.m(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(cc.f16874p);
        Preconditions.g(string);
        Preconditions.g(string2);
        Preconditions.m(bundle.get(b9.h.X));
        if (!zzidVar.f13220a.j()) {
            zzidVar.f13220a.zzay().q().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlc zzlcVar = new zzlc(string, bundle.getLong("triggered_timestamp"), bundle.get(b9.h.X), string2);
        try {
            zzaw r02 = zzidVar.f13220a.I().r0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            zzidVar.f13220a.G().n(new zzac(bundle.getString("app_id"), string2, zzlcVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzidVar.f13220a.I().r0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), r02, bundle.getLong("time_to_live"), zzidVar.f13220a.I().r0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
