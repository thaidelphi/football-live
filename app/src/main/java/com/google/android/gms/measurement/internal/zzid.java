package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzoz;
import com.ironsource.b9;
import com.ironsource.cc;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzid extends x {
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    protected x1 f13613c;

    /* renamed from: d  reason: collision with root package name */
    private zzgy f13614d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f13615e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13616f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f13617g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f13618h;

    /* renamed from: i  reason: collision with root package name */
    private zzai f13619i;

    /* renamed from: j  reason: collision with root package name */
    private int f13620j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicLong f13621k;

    /* renamed from: l  reason: collision with root package name */
    private long f13622l;

    /* renamed from: m  reason: collision with root package name */
    private int f13623m;

    /* renamed from: n  reason: collision with root package name */
    final zzs f13624n;
    @VisibleForTesting

    /* renamed from: o  reason: collision with root package name */
    protected boolean f13625o;

    /* renamed from: p  reason: collision with root package name */
    private final c4 f13626p;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzid(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13615e = new CopyOnWriteArraySet();
        this.f13618h = new Object();
        this.f13625o = true;
        this.f13626p = new m1(this);
        this.f13617g = new AtomicReference();
        this.f13619i = new zzai(null, null);
        this.f13620j = 100;
        this.f13622l = -1L;
        this.f13623m = 100;
        this.f13621k = new AtomicLong(0L);
        this.f13624n = new zzs(zzfyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Boolean bool, boolean z10) {
        c();
        d();
        this.f13220a.zzay().l().b("Setting app measurement enabled (FE)", bool);
        this.f13220a.A().n(bool);
        if (z10) {
            y A = this.f13220a.A();
            zzfy zzfyVar = A.f13220a;
            A.c();
            SharedPreferences.Editor edit = A.j().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f13220a.k() || !(bool == null || bool.booleanValue())) {
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        c();
        String a10 = this.f13220a.A().f13239m.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                H("app", "_npa", null, this.f13220a.zzav().a());
            } else {
                H("app", "_npa", Long.valueOf(true != com.ironsource.mediationsdk.metadata.a.f18924g.equals(a10) ? 0L : 1L), this.f13220a.zzav().a());
            }
        }
        if (this.f13220a.j() && this.f13625o) {
            this.f13220a.zzay().l().a("Recording app launch after enabling measurement for the first time (FE)");
            a0();
            zzoe.zzc();
            if (this.f13220a.u().w(null, zzeb.f13415f0)) {
                this.f13220a.H().f13674d.a();
            }
            this.f13220a.zzaz().u(new c1(this));
            return;
        }
        this.f13220a.zzay().l().a("Updating Scion state (FE)");
        this.f13220a.G().r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void W(zzid zzidVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z10;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z10 = false;
                break;
            }
            zzah zzahVar = zzahVarArr[i10];
            if (!zzaiVar2.i(zzahVar) && zzaiVar.i(zzahVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean l10 = zzaiVar.l(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z10 || l10) {
            zzidVar.f13220a.w().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void X(zzid zzidVar, zzai zzaiVar, int i10, long j10, boolean z10, boolean z11) {
        zzidVar.c();
        zzidVar.d();
        if (j10 <= zzidVar.f13622l && zzai.j(zzidVar.f13623m, i10)) {
            zzidVar.f13220a.zzay().p().b("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        y A = zzidVar.f13220a.A();
        zzfy zzfyVar = A.f13220a;
        A.c();
        if (A.r(i10)) {
            SharedPreferences.Editor edit = A.j().edit();
            edit.putString("consent_settings", zzaiVar.h());
            edit.putInt("consent_source", i10);
            edit.apply();
            zzidVar.f13622l = j10;
            zzidVar.f13623m = i10;
            zzidVar.f13220a.G().o(z10);
            if (z11) {
                zzidVar.f13220a.G().N(new AtomicReference());
                return;
            }
            return;
        }
        zzidVar.f13220a.zzay().p().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
    }

    public final void A(Bundle bundle, int i10, long j10) {
        d();
        String g10 = zzai.g(bundle);
        if (g10 != null) {
            this.f13220a.zzay().s().b("Ignoring invalid consent setting", g10);
            this.f13220a.zzay().s().a("Valid consent values are 'granted', 'denied'");
        }
        B(zzai.a(bundle), i10, j10);
    }

    public final void B(zzai zzaiVar, int i10, long j10) {
        zzai zzaiVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        zzai zzaiVar3 = zzaiVar;
        d();
        if (i10 != -10 && zzaiVar.e() == null && zzaiVar.f() == null) {
            this.f13220a.zzay().s().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f13618h) {
            zzaiVar2 = this.f13619i;
            z10 = true;
            z11 = false;
            if (zzai.j(i10, this.f13620j)) {
                boolean k10 = zzaiVar3.k(this.f13619i);
                zzah zzahVar = zzah.ANALYTICS_STORAGE;
                if (zzaiVar3.i(zzahVar) && !this.f13619i.i(zzahVar)) {
                    z11 = true;
                }
                zzaiVar3 = zzaiVar3.d(this.f13619i);
                this.f13619i = zzaiVar3;
                this.f13620j = i10;
                z12 = z11;
                z11 = k10;
            } else {
                z10 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.f13220a.zzay().p().b("Ignoring lower-priority consent settings, proposed settings", zzaiVar3);
            return;
        }
        long andIncrement = this.f13621k.getAndIncrement();
        if (z11) {
            this.f13617g.set(null);
            this.f13220a.zzaz().v(new s1(this, zzaiVar3, j10, i10, andIncrement, z12, zzaiVar2));
            return;
        }
        t1 t1Var = new t1(this, zzaiVar3, i10, andIncrement, z12, zzaiVar2);
        if (i10 != 30 && i10 != -10) {
            this.f13220a.zzaz().u(t1Var);
        } else {
            this.f13220a.zzaz().v(t1Var);
        }
    }

    public final void C(zzgy zzgyVar) {
        zzgy zzgyVar2;
        c();
        d();
        if (zzgyVar != null && zzgyVar != (zzgyVar2 = this.f13614d)) {
            Preconditions.q(zzgyVar2 == null, "EventInterceptor already set.");
        }
        this.f13614d = zzgyVar;
    }

    public final void D(Boolean bool) {
        d();
        this.f13220a.zzaz().u(new r1(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(zzai zzaiVar) {
        c();
        boolean z10 = (zzaiVar.i(zzah.ANALYTICS_STORAGE) && zzaiVar.i(zzah.AD_STORAGE)) || this.f13220a.G().v();
        if (z10 != this.f13220a.k()) {
            this.f13220a.g(z10);
            y A = this.f13220a.A();
            zzfy zzfyVar = A.f13220a;
            A.c();
            Boolean valueOf = A.j().contains("measurement_enabled_from_api") ? Boolean.valueOf(A.j().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                J(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void F(String str, String str2, Object obj, boolean z10) {
        G("auto", "_ldl", obj, true, this.f13220a.zzav().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto La
            java.lang.String r1 = "app"
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L1e
            com.google.android.gms.measurement.internal.zzfy r3 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r3 = r3.I()
            int r3 = r3.i0(r2)
        L1c:
            r11 = r3
            goto L46
        L1e:
            com.google.android.gms.measurement.internal.zzfy r7 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r7 = r7.I()
            java.lang.String r8 = "user property"
            boolean r9 = r7.M(r8, r2)
            if (r9 != 0) goto L2d
        L2c:
            goto L1c
        L2d:
            java.lang.String[] r9 = com.google.android.gms.measurement.internal.zzgx.f13593a
            r10 = 0
            boolean r9 = r7.I(r8, r9, r10, r2)
            if (r9 != 0) goto L39
            r3 = 15
            goto L1c
        L39:
            com.google.android.gms.measurement.internal.zzfy r9 = r7.f13220a
            r9.u()
            boolean r7 = r7.H(r8, r5, r2)
            if (r7 != 0) goto L45
            goto L2c
        L45:
            r11 = r4
        L46:
            r3 = 1
            if (r11 == 0) goto L6e
            com.google.android.gms.measurement.internal.zzfy r0 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r0 = r0.I()
            com.google.android.gms.measurement.internal.zzfy r1 = r6.f13220a
            r1.u()
            java.lang.String r13 = r0.m(r2, r5, r3)
            if (r2 == 0) goto L5e
            int r4 = r17.length()
        L5e:
            r14 = r4
            com.google.android.gms.measurement.internal.zzfy r0 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r8 = r0.I()
            com.google.android.gms.measurement.internal.c4 r9 = r6.f13626p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.w(r9, r10, r11, r12, r13, r14)
            return
        L6e:
            if (r0 == 0) goto Lc0
            com.google.android.gms.measurement.internal.zzfy r7 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r7 = r7.I()
            int r11 = r7.e0(r2, r0)
            if (r11 == 0) goto Lab
            com.google.android.gms.measurement.internal.zzfy r1 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r1 = r1.I()
            com.google.android.gms.measurement.internal.zzfy r7 = r6.f13220a
            r7.u()
            java.lang.String r13 = r1.m(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L93
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L9b
        L93:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L9b:
            r14 = r4
            com.google.android.gms.measurement.internal.zzfy r0 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r8 = r0.I()
            com.google.android.gms.measurement.internal.c4 r9 = r6.f13626p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.w(r9, r10, r11, r12, r13, r14)
            return
        Lab:
            com.google.android.gms.measurement.internal.zzfy r3 = r6.f13220a
            com.google.android.gms.measurement.internal.zzlh r3 = r3.I()
            java.lang.Object r5 = r3.k(r2, r0)
            if (r5 == 0) goto Lbf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.w(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.w(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzid.G(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.g(r9)
            com.google.android.gms.common.internal.Preconditions.g(r10)
            r8.c()
            r8.d()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzfy r10 = r8.f13220a
            com.google.android.gms.measurement.internal.y r10 = r10.A()
            com.google.android.gms.measurement.internal.zzfc r10 = r10.f13239m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.b(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            com.google.android.gms.measurement.internal.zzfy r10 = r8.f13220a
            com.google.android.gms.measurement.internal.y r10 = r10.A()
            com.google.android.gms.measurement.internal.zzfc r10 = r10.f13239m
            java.lang.String r0 = "unset"
            r10.b(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            com.google.android.gms.measurement.internal.zzfy r10 = r8.f13220a
            boolean r10 = r10.j()
            if (r10 != 0) goto L7e
            com.google.android.gms.measurement.internal.zzfy r9 = r8.f13220a
            com.google.android.gms.measurement.internal.zzeo r9 = r9.zzay()
            com.google.android.gms.measurement.internal.zzem r9 = r9.q()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7e:
            com.google.android.gms.measurement.internal.zzfy r10 = r8.f13220a
            boolean r10 = r10.m()
            if (r10 != 0) goto L87
            return
        L87:
            com.google.android.gms.measurement.internal.zzlc r10 = new com.google.android.gms.measurement.internal.zzlc
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzfy r9 = r8.f13220a
            com.google.android.gms.measurement.internal.zzjs r9 = r9.G()
            r9.t(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzid.H(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void I(zzgz zzgzVar) {
        d();
        Preconditions.m(zzgzVar);
        if (this.f13615e.remove(zzgzVar)) {
            return;
        }
        this.f13220a.zzay().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        Preconditions.g(str);
        this.f13220a.u();
        return 25;
    }

    public final Boolean M() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f13220a.zzaz().m(atomicReference, 15000L, "boolean test flag value", new k1(this, atomicReference));
    }

    public final Double N() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f13220a.zzaz().m(atomicReference, 15000L, "double test flag value", new q1(this, atomicReference));
    }

    public final Integer O() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f13220a.zzaz().m(atomicReference, 15000L, "int test flag value", new p1(this, atomicReference));
    }

    public final Long P() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f13220a.zzaz().m(atomicReference, 15000L, "long test flag value", new o1(this, atomicReference));
    }

    public final String Q() {
        return (String) this.f13617g.get();
    }

    public final String R() {
        zzik m7 = this.f13220a.F().m();
        if (m7 != null) {
            return m7.f13633b;
        }
        return null;
    }

    public final String S() {
        zzik m7 = this.f13220a.F().m();
        if (m7 != null) {
            return m7.f13632a;
        }
        return null;
    }

    public final String T() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f13220a.zzaz().m(atomicReference, 15000L, "String test flag value", new n1(this, atomicReference));
    }

    public final ArrayList U(String str, String str2) {
        if (this.f13220a.zzaz().x()) {
            this.f13220a.zzay().m().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f13220a.zzaw();
        if (zzab.a()) {
            this.f13220a.zzay().m().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f13220a.zzaz().m(atomicReference, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, "get conditional user properties", new j1(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f13220a.zzay().m().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzlh.q(list);
    }

    public final Map V(String str, String str2, boolean z10) {
        if (this.f13220a.zzaz().x()) {
            this.f13220a.zzay().m().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f13220a.zzaw();
        if (zzab.a()) {
            this.f13220a.zzay().m().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f13220a.zzaz().m(atomicReference, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT, "get user properties", new l1(this, atomicReference, null, str, str2, z10));
        List<zzlc> list = (List) atomicReference.get();
        if (list == null) {
            this.f13220a.zzay().m().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (zzlc zzlcVar : list) {
            Object X = zzlcVar.X();
            if (X != null) {
                aVar.put(zzlcVar.f13708b, X);
            }
        }
        return aVar;
    }

    public final void a0() {
        c();
        d();
        if (this.f13220a.m()) {
            if (this.f13220a.u().w(null, zzeb.Z)) {
                zzag u10 = this.f13220a.u();
                u10.f13220a.zzaw();
                Boolean o10 = u10.o("google_analytics_deferred_deep_link_enabled");
                if (o10 != null && o10.booleanValue()) {
                    this.f13220a.zzay().l().a("Deferred Deep Link feature enabled.");
                    this.f13220a.zzaz().u(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzid zzidVar = zzid.this;
                            zzidVar.c();
                            if (!zzidVar.f13220a.A().f13244r.b()) {
                                long a10 = zzidVar.f13220a.A().f13245s.a();
                                zzidVar.f13220a.A().f13245s.b(1 + a10);
                                zzidVar.f13220a.u();
                                if (a10 >= 5) {
                                    zzidVar.f13220a.zzay().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    zzidVar.f13220a.A().f13244r.a(true);
                                    return;
                                }
                                zzidVar.f13220a.e();
                                return;
                            }
                            zzidVar.f13220a.zzay().l().a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f13220a.G().J();
            this.f13625o = false;
            y A = this.f13220a.A();
            A.c();
            String string = A.j().getString("previous_os_version", null);
            A.f13220a.v().f();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = A.j().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f13220a.v().f();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            p("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.x
    protected final boolean i() {
        return false;
    }

    public final void j(String str, String str2, Bundle bundle) {
        long a10 = this.f13220a.zzav().a();
        Preconditions.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f13220a.zzaz().u(new i1(this, bundle2));
    }

    public final void k() {
        if (!(this.f13220a.zzau().getApplicationContext() instanceof Application) || this.f13613c == null) {
            return;
        }
        ((Application) this.f13220a.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f13613c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l(Bundle bundle) {
        if (bundle == null) {
            this.f13220a.A().f13249w.b(new Bundle());
            return;
        }
        Bundle a10 = this.f13220a.A().f13249w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f13220a.I().P(obj)) {
                    this.f13220a.I().w(this.f13626p, null, 27, null, null, 0);
                }
                this.f13220a.zzay().s().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlh.R(str)) {
                this.f13220a.zzay().s().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a10.remove(str);
            } else {
                zzlh I = this.f13220a.I();
                this.f13220a.u();
                if (I.K("param", str, 100, obj)) {
                    this.f13220a.I().x(a10, str, obj);
                }
            }
        }
        this.f13220a.I();
        int h10 = this.f13220a.u().h();
        if (a10.size() > h10) {
            int i10 = 0;
            for (String str2 : new TreeSet(a10.keySet())) {
                i10++;
                if (i10 > h10) {
                    a10.remove(str2);
                }
            }
            this.f13220a.I().w(this.f13626p, null, 26, null, null, 0);
            this.f13220a.zzay().s().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f13220a.A().f13249w.b(a10);
        this.f13220a.G().q(a10);
    }

    public final void m(String str, String str2, Bundle bundle) {
        n(str, str2, bundle, true, true, this.f13220a.zzav().a());
    }

    public final void n(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            boolean z12 = true;
            if (z11 && this.f13614d != null && !zzlh.R(str2)) {
                z12 = false;
            }
            v(str3, str2, j10, bundle2, z11, z12, z10, null);
            return;
        }
        this.f13220a.F().z(bundle2, j10);
    }

    public final void o(String str, String str2, Bundle bundle, String str3) {
        zzfy.o();
        v("auto", str2, this.f13220a.zzav().a(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(String str, String str2, Bundle bundle) {
        c();
        q(str, str2, this.f13220a.zzav().a(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(String str, String str2, long j10, Bundle bundle) {
        c();
        r(str, str2, j10, bundle, true, this.f13614d == null || zzlh.R(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        long j11;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        Preconditions.g(str);
        Preconditions.m(bundle);
        c();
        d();
        if (this.f13220a.j()) {
            List p10 = this.f13220a.w().p();
            if (p10 != null && !p10.contains(str2)) {
                this.f13220a.zzay().l().c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f13616f) {
                this.f13616f = true;
                try {
                    if (!this.f13220a.n()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f13220a.zzau().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, this.f13220a.zzau());
                    } catch (Exception e8) {
                        this.f13220a.zzay().r().b("Failed to invoke Tag Manager's initialize() method", e8);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f13220a.zzay().p().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f13220a.zzaw();
                H("auto", "_lgclid", bundle.getString("gclid"), this.f13220a.zzav().a());
            }
            this.f13220a.zzaw();
            if (z10 && zzlh.V(str2)) {
                this.f13220a.I().u(bundle, this.f13220a.A().f13249w.a());
            }
            if (!z12) {
                this.f13220a.zzaw();
                if (!"_iap".equals(str2)) {
                    zzlh I = this.f13220a.I();
                    int i10 = 2;
                    if (I.M("event", str2)) {
                        if (I.I("event", zzgv.f13585a, zzgv.f13586b, str2)) {
                            I.f13220a.u();
                            if (I.H("event", 40, str2)) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 13;
                        }
                    }
                    if (i10 != 0) {
                        this.f13220a.zzay().n().b("Invalid public event name. Event will not be logged (FE)", this.f13220a.y().d(str2));
                        zzlh I2 = this.f13220a.I();
                        this.f13220a.u();
                        this.f13220a.I().w(this.f13626p, null, i10, "_ev", I2.m(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            this.f13220a.zzaw();
            zzik n10 = this.f13220a.F().n(false);
            if (n10 != null && !bundle.containsKey("_sc")) {
                n10.f13635d = true;
            }
            zzlh.t(n10, bundle, z10 && !z12);
            boolean equals = "am".equals(str);
            boolean R = zzlh.R(str2);
            if (!z10 || this.f13614d == null || R) {
                z13 = equals;
            } else if (!equals) {
                this.f13220a.zzay().l().c("Passing event to registered event handler (FE)", this.f13220a.y().d(str2), this.f13220a.y().b(bundle));
                Preconditions.m(this.f13614d);
                this.f13614d.a(str, str2, bundle, j10);
                return;
            } else {
                z13 = true;
            }
            if (this.f13220a.m()) {
                int f02 = this.f13220a.I().f0(str2);
                if (f02 != 0) {
                    this.f13220a.zzay().n().b("Invalid event name. Event will not be logged (FE)", this.f13220a.y().d(str2));
                    zzlh I3 = this.f13220a.I();
                    this.f13220a.u();
                    this.f13220a.I().w(this.f13626p, str3, f02, "_ev", I3.m(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle q02 = this.f13220a.I().q0(str3, str2, bundle, CollectionUtils.b("_o", "_sn", "_sc", "_si"), z12);
                Preconditions.m(q02);
                this.f13220a.zzaw();
                if (this.f13220a.F().n(false) != null && "_ae".equals(str2)) {
                    m3 m3Var = this.f13220a.H().f13675e;
                    long b10 = m3Var.f13085d.f13220a.zzav().b();
                    long j12 = b10 - m3Var.f13083b;
                    m3Var.f13083b = b10;
                    if (j12 > 0) {
                        this.f13220a.I().r(q02, j12);
                    }
                }
                zznv.zzc();
                if (this.f13220a.u().w(null, zzeb.f13413e0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        zzlh I4 = this.f13220a.I();
                        String string = q02.getString("_ffr");
                        if (Strings.a(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!zzlf.a(string, I4.f13220a.A().f13246t.a())) {
                            I4.f13220a.A().f13246t.b(string);
                        } else {
                            I4.f13220a.zzay().l().a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String a10 = this.f13220a.I().f13220a.A().f13246t.a();
                        if (!TextUtils.isEmpty(a10)) {
                            q02.putString("_ffr", a10);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(q02);
                if (this.f13220a.A().f13241o.a() > 0 && this.f13220a.A().q(j10) && this.f13220a.A().f13243q.b()) {
                    this.f13220a.zzay().q().a("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j11 = 0;
                    H("auto", "_sid", null, this.f13220a.zzav().a());
                    H("auto", "_sno", null, this.f13220a.zzav().a());
                    H("auto", "_se", null, this.f13220a.zzav().a());
                } else {
                    str4 = "_ae";
                    j11 = 0;
                }
                if (q02.getLong("extend_session", j11) == 1) {
                    this.f13220a.zzay().q().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f13220a.H().f13674d.b(j10, true);
                }
                ArrayList arrayList2 = new ArrayList(q02.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str7 = (String) arrayList2.get(i11);
                    if (str7 != null) {
                        this.f13220a.I();
                        Object obj = q02.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            q02.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i12);
                    if (i12 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z11) {
                        bundle2 = this.f13220a.I().p0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.f13220a.G().j(new zzaw(str6, new zzau(bundle3), str, j10), str3);
                    if (!z13) {
                        for (zzgz zzgzVar : this.f13615e) {
                            zzgzVar.a(str, str2, new Bundle(bundle3), j10);
                        }
                    }
                }
                this.f13220a.zzaw();
                if (this.f13220a.F().n(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f13220a.H().f13675e.d(true, true, this.f13220a.zzav().b());
                return;
            }
            return;
        }
        this.f13220a.zzay().l().a("Event not sent since app measurement is disabled");
    }

    public final void s(zzgz zzgzVar) {
        d();
        Preconditions.m(zzgzVar);
        if (this.f13615e.add(zzgzVar)) {
            return;
        }
        this.f13220a.zzay().r().a("OnEventListener already registered");
    }

    public final void t(long j10) {
        this.f13617g.set(null);
        this.f13220a.zzaz().u(new g1(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(long j10, boolean z10) {
        c();
        d();
        this.f13220a.zzay().l().a("Resetting analytics data (FE)");
        zzki H = this.f13220a.H();
        H.c();
        H.f13675e.a();
        zzoz.zzc();
        if (this.f13220a.u().w(null, zzeb.f13445u0)) {
            this.f13220a.w().q();
        }
        boolean j11 = this.f13220a.j();
        y A = this.f13220a.A();
        A.f13231e.b(j10);
        if (!TextUtils.isEmpty(A.f13220a.A().f13246t.a())) {
            A.f13246t.b(null);
        }
        zzoe.zzc();
        zzag u10 = A.f13220a.u();
        zzea zzeaVar = zzeb.f13415f0;
        if (u10.w(null, zzeaVar)) {
            A.f13241o.b(0L);
        }
        if (!A.f13220a.u().z()) {
            A.o(!j11);
        }
        A.f13247u.b(null);
        A.f13248v.b(0L);
        A.f13249w.b(null);
        if (z10) {
            this.f13220a.G().l();
        }
        zzoe.zzc();
        if (this.f13220a.u().w(null, zzeaVar)) {
            this.f13220a.H().f13674d.a();
        }
        this.f13625o = !j11;
    }

    protected final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f13220a.zzaz().u(new e1(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    final void w(String str, String str2, long j10, Object obj) {
        this.f13220a.zzaz().u(new f1(this, str, str2, obj, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(String str) {
        this.f13617g.set(str);
    }

    public final void y(Bundle bundle) {
        z(bundle, this.f13220a.zzav().a());
    }

    public final void z(Bundle bundle, long j10) {
        Preconditions.m(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f13220a.zzay().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.m(bundle2);
        zzgu.a(bundle2, "app_id", String.class, null);
        zzgu.a(bundle2, cc.f16874p, String.class, null);
        zzgu.a(bundle2, "name", String.class, null);
        zzgu.a(bundle2, b9.h.X, Object.class, null);
        zzgu.a(bundle2, "trigger_event_name", String.class, null);
        zzgu.a(bundle2, "trigger_timeout", Long.class, 0L);
        zzgu.a(bundle2, "timed_out_event_name", String.class, null);
        zzgu.a(bundle2, "timed_out_event_params", Bundle.class, null);
        zzgu.a(bundle2, "triggered_event_name", String.class, null);
        zzgu.a(bundle2, "triggered_event_params", Bundle.class, null);
        zzgu.a(bundle2, "time_to_live", Long.class, 0L);
        zzgu.a(bundle2, "expired_event_name", String.class, null);
        zzgu.a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.g(bundle2.getString("name"));
        Preconditions.g(bundle2.getString(cc.f16874p));
        Preconditions.m(bundle2.get(b9.h.X));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(b9.h.X);
        if (this.f13220a.I().i0(string) == 0) {
            if (this.f13220a.I().e0(string, obj) == 0) {
                Object k10 = this.f13220a.I().k(string, obj);
                if (k10 == null) {
                    this.f13220a.zzay().m().c("Unable to normalize conditional user property value", this.f13220a.y().f(string), obj);
                    return;
                }
                zzgu.b(bundle2, k10);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f13220a.u();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.f13220a.zzay().m().c("Invalid conditional user property timeout", this.f13220a.y().f(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                this.f13220a.u();
                if (j12 <= 15552000000L && j12 >= 1) {
                    this.f13220a.zzaz().u(new h1(this, bundle2));
                    return;
                } else {
                    this.f13220a.zzay().m().c("Invalid conditional user property time to live", this.f13220a.y().f(string), Long.valueOf(j12));
                    return;
                }
            }
            this.f13220a.zzay().m().c("Invalid conditional user property value", this.f13220a.y().f(string), obj);
            return;
        }
        this.f13220a.zzay().m().b("Invalid conditional user property name", this.f13220a.y().f(string));
    }
}
