package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.ironsource.b9;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr f13266a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ServiceConnection f13267b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzff f13268c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(zzff zzffVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f13268c = zzffVar;
        this.f13266a = zzbrVar;
        this.f13267b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzff zzffVar = this.f13268c;
        zzfg zzfgVar = zzffVar.f13521b;
        str = zzffVar.f13520a;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.f13266a;
        ServiceConnection serviceConnection = this.f13267b;
        zzfgVar.f13522a.zzaz().c();
        Bundle bundle = new Bundle();
        bundle.putString(b9.h.V, str);
        Bundle bundle2 = null;
        try {
            Bundle zzd = zzbrVar.zzd(bundle);
            if (zzd == null) {
                zzfgVar.f13522a.zzay().m().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd;
            }
        } catch (Exception e8) {
            zzfgVar.f13522a.zzay().m().b("Exception occurred while retrieving the Install Referrer", e8.getMessage());
        }
        zzfgVar.f13522a.zzaz().c();
        zzfy.o();
        if (bundle2 != null) {
            long j10 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                zzfgVar.f13522a.zzay().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    zzfgVar.f13522a.zzay().q().b("InstallReferrer API result", string);
                    Bundle o02 = zzfgVar.f13522a.I().o0(Uri.parse("?".concat(string)));
                    if (o02 == null) {
                        zzfgVar.f13522a.zzay().m().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = o02.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                zzfgVar.f13522a.zzay().m().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                o02.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == zzfgVar.f13522a.A().f13232f.a()) {
                            zzfgVar.f13522a.zzay().q().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfgVar.f13522a.j()) {
                            zzfgVar.f13522a.A().f13232f.b(j10);
                            zzfgVar.f13522a.zzay().q().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            o02.putString("_cis", "referrer API v2");
                            zzfgVar.f13522a.D().o("auto", "_cmp", o02, str);
                        }
                    }
                } else {
                    zzfgVar.f13522a.zzay().m().a("No referrer defined in Install Referrer response");
                }
            }
        }
        ConnectionTracker.b().c(zzfgVar.f13522a.zzau(), serviceConnection);
    }
}
