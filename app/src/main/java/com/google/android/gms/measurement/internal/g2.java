package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f12960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f12961b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzq f12962c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f12963d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf f12964e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzjs f12965f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(zzjs zzjsVar, String str, String str2, zzq zzqVar, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.f12965f = zzjsVar;
        this.f12960a = str;
        this.f12961b = str2;
        this.f12962c = zzqVar;
        this.f12963d = z10;
        this.f12964e = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e8;
        zzee zzeeVar;
        Bundle bundle2 = new Bundle();
        try {
            zzjs zzjsVar = this.f12965f;
            zzeeVar = zzjsVar.f13652d;
            if (zzeeVar == null) {
                zzjsVar.f13220a.zzay().m().c("Failed to get user properties; not connected to service", this.f12960a, this.f12961b);
                this.f12965f.f13220a.I().A(this.f12964e, bundle2);
                return;
            }
            Preconditions.m(this.f12962c);
            List<zzlc> p10 = zzeeVar.p(this.f12960a, this.f12961b, this.f12963d, this.f12962c);
            bundle = new Bundle();
            if (p10 != null) {
                for (zzlc zzlcVar : p10) {
                    String str = zzlcVar.f13711e;
                    if (str != null) {
                        bundle.putString(zzlcVar.f13708b, str);
                    } else {
                        Long l10 = zzlcVar.f13710d;
                        if (l10 != null) {
                            bundle.putLong(zzlcVar.f13708b, l10.longValue());
                        } else {
                            Double d10 = zzlcVar.f13713g;
                            if (d10 != null) {
                                bundle.putDouble(zzlcVar.f13708b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f12965f.z();
                    this.f12965f.f13220a.I().A(this.f12964e, bundle);
                } catch (RemoteException e10) {
                    e8 = e10;
                    this.f12965f.f13220a.zzay().m().c("Failed to get user properties; remote exception", this.f12960a, e8);
                    this.f12965f.f13220a.I().A(this.f12964e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f12965f.f13220a.I().A(this.f12964e, bundle2);
                throw th;
            }
        } catch (RemoteException e11) {
            bundle = bundle2;
            e8 = e11;
        } catch (Throwable th2) {
            th = th2;
            this.f12965f.f13220a.I().A(this.f12964e, bundle2);
            throw th;
        }
    }
}
