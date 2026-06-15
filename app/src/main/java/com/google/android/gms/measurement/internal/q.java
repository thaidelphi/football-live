package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f13110a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13111b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f13112c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Object f13113d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Object f13114e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzeo f13115f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(zzeo zzeoVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f13115f = zzeoVar;
        this.f13110a = i10;
        this.f13111b = str;
        this.f13112c = obj;
        this.f13113d = obj2;
        this.f13114e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        y A = this.f13115f.f13220a.A();
        if (A.i()) {
            zzeo zzeoVar = this.f13115f;
            c10 = zzeoVar.f13481c;
            if (c10 == 0) {
                if (zzeoVar.f13220a.u().C()) {
                    zzeo zzeoVar2 = this.f13115f;
                    zzeoVar2.f13220a.zzaw();
                    zzeoVar2.f13481c = 'C';
                } else {
                    zzeo zzeoVar3 = this.f13115f;
                    zzeoVar3.f13220a.zzaw();
                    zzeoVar3.f13481c = 'c';
                }
            }
            zzeo zzeoVar4 = this.f13115f;
            j10 = zzeoVar4.f13482d;
            if (j10 < 0) {
                zzeoVar4.f13220a.u().l();
                zzeoVar4.f13482d = 73000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f13110a);
            zzeo zzeoVar5 = this.f13115f;
            c11 = zzeoVar5.f13481c;
            j11 = zzeoVar5.f13482d;
            String str = CommonGetHeaderBiddingToken.HB_TOKEN_VERSION + charAt + c11 + j11 + ":" + zzeo.v(true, this.f13111b, this.f13112c, this.f13113d, this.f13114e);
            if (str.length() > 1024) {
                str = this.f13111b.substring(0, 1024);
            }
            zzfb zzfbVar = A.f13230d;
            if (zzfbVar != null) {
                zzfbVar.b(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f13115f.x(), "Persisted config not initialized. Not logging error/warn");
    }
}
