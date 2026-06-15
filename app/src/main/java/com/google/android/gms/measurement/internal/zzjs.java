package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@VisibleForTesting
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzjs extends x {

    /* renamed from: c  reason: collision with root package name */
    private final zzjr f13651c;

    /* renamed from: d  reason: collision with root package name */
    private zzee f13652d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f13653e;

    /* renamed from: f  reason: collision with root package name */
    private final h f13654f;

    /* renamed from: g  reason: collision with root package name */
    private final o3 f13655g;

    /* renamed from: h  reason: collision with root package name */
    private final List f13656h;

    /* renamed from: i  reason: collision with root package name */
    private final h f13657i;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjs(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13656h = new ArrayList();
        this.f13655g = new o3(zzfyVar.zzav());
        this.f13651c = new zzjr(this);
        this.f13654f = new p2(this, zzfyVar);
        this.f13657i = new r2(this, zzfyVar);
    }

    private final void A(Runnable runnable) throws IllegalStateException {
        c();
        if (u()) {
            runnable.run();
            return;
        }
        int size = this.f13656h.size();
        this.f13220a.u();
        if (size >= 1000) {
            this.f13220a.zzay().m().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f13656h.add(runnable);
        this.f13657i.d(60000L);
        K();
    }

    private final boolean B() {
        this.f13220a.zzaw();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void H(zzjs zzjsVar, ComponentName componentName) {
        zzjsVar.c();
        if (zzjsVar.f13652d != null) {
            zzjsVar.f13652d = null;
            zzjsVar.f13220a.zzay().q().b("Disconnected from device MeasurementService", componentName);
            zzjsVar.c();
            zzjsVar.K();
        }
    }

    private final zzq x(boolean z10) {
        Pair a10;
        this.f13220a.zzaw();
        zzef w10 = this.f13220a.w();
        String str = null;
        if (z10) {
            zzeo zzay = this.f13220a.zzay();
            if (zzay.f13220a.A().f13230d != null && (a10 = zzay.f13220a.A().f13230d.a()) != null && a10 != y.f13228x) {
                str = String.valueOf(a10.second) + ":" + ((String) a10.first);
            }
        }
        return w10.l(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        c();
        this.f13220a.zzay().q().b("Processing queued up service tasks", Integer.valueOf(this.f13656h.size()));
        for (Runnable runnable : this.f13656h) {
            try {
                runnable.run();
            } catch (RuntimeException e8) {
                this.f13220a.zzay().m().b("Task exception while flushing queue", e8);
            }
        }
        this.f13656h.clear();
        this.f13657i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        c();
        this.f13655g.b();
        h hVar = this.f13654f;
        this.f13220a.u();
        hVar.d(((Long) zzeb.K.a(null)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean E() {
        return this.f13653e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J() {
        c();
        d();
        zzq x10 = x(true);
        this.f13220a.x().m();
        A(new l2(this, x10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K() {
        c();
        d();
        if (u()) {
            return;
        }
        if (!w()) {
            if (this.f13220a.u().B()) {
                return;
            }
            this.f13220a.zzaw();
            List<ResolveInfo> queryIntentServices = this.f13220a.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.f13220a.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context zzau = this.f13220a.zzau();
                this.f13220a.zzaw();
                intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f13651c.b(intent);
                return;
            }
            this.f13220a.zzay().m().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.f13651c.c();
    }

    public final void L() {
        c();
        d();
        this.f13651c.d();
        try {
            ConnectionTracker.b().c(this.f13220a.zzau(), this.f13651c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f13652d = null;
    }

    public final void M(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        c();
        d();
        A(new k2(this, x(false), zzcfVar));
    }

    public final void N(AtomicReference atomicReference) {
        c();
        d();
        A(new j2(this, atomicReference, x(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        c();
        d();
        A(new x2(this, str, str2, x(false), zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(AtomicReference atomicReference, String str, String str2, String str3) {
        c();
        d();
        A(new w2(this, atomicReference, null, str2, str3, x(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z10) {
        c();
        d();
        A(new g2(this, str, str2, x(false), z10, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        c();
        d();
        A(new y2(this, atomicReference, null, str2, str3, x(false), z10));
    }

    @Override // com.google.android.gms.measurement.internal.x
    protected final boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(zzaw zzawVar, String str) {
        Preconditions.m(zzawVar);
        c();
        d();
        B();
        A(new u2(this, true, x(true), this.f13220a.x().q(zzawVar), zzawVar, str));
    }

    public final void k(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        c();
        d();
        if (this.f13220a.I().k0(GooglePlayServicesUtilLight.f12026a) != 0) {
            this.f13220a.zzay().r().a("Not bundling data. Service unavailable or out of date");
            this.f13220a.I().B(zzcfVar, new byte[0]);
            return;
        }
        A(new q2(this, zzawVar, str, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        c();
        d();
        zzq x10 = x(false);
        B();
        this.f13220a.x().l();
        A(new i2(this, x10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void m(zzee zzeeVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i10;
        c();
        d();
        B();
        this.f13220a.u();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List k10 = this.f13220a.x().k(100);
            if (k10 != null) {
                arrayList.addAll(k10);
                i10 = k10.size();
            } else {
                i10 = 0;
            }
            if (abstractSafeParcelable != null && i10 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i13);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzeeVar.i((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e8) {
                        this.f13220a.zzay().m().b("Failed to send event to the service", e8);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlc) {
                    try {
                        zzeeVar.m((zzlc) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e10) {
                        this.f13220a.zzay().m().b("Failed to send user property to the service", e10);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzeeVar.l0((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e11) {
                        this.f13220a.zzay().m().b("Failed to send conditional user property to the service", e11);
                    }
                } else {
                    this.f13220a.zzay().m().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(zzac zzacVar) {
        Preconditions.m(zzacVar);
        c();
        d();
        this.f13220a.zzaw();
        A(new v2(this, true, x(true), this.f13220a.x().p(zzacVar), new zzac(zzacVar), zzacVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(boolean z10) {
        c();
        d();
        if (z10) {
            B();
            this.f13220a.x().l();
        }
        if (v()) {
            A(new t2(this, x(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(zzik zzikVar) {
        c();
        d();
        A(new n2(this, zzikVar));
    }

    public final void q(Bundle bundle) {
        c();
        d();
        A(new o2(this, x(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        c();
        d();
        A(new s2(this, x(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final void s(zzee zzeeVar) {
        c();
        Preconditions.m(zzeeVar);
        this.f13652d = zzeeVar;
        z();
        y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(zzlc zzlcVar) {
        c();
        d();
        B();
        A(new h2(this, x(true), this.f13220a.x().r(zzlcVar), zzlcVar));
    }

    public final boolean u() {
        c();
        d();
        return this.f13652d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        c();
        d();
        return !w() || this.f13220a.I().j0() >= ((Integer) zzeb.f13419h0.a(null)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjs.w():boolean");
    }
}
