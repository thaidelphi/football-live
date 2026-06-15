package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.ironsource.ug;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzis extends x {

    /* renamed from: c  reason: collision with root package name */
    private volatile zzik f13638c;

    /* renamed from: d  reason: collision with root package name */
    private volatile zzik f13639d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    protected zzik f13640e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f13641f;

    /* renamed from: g  reason: collision with root package name */
    private Activity f13642g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f13643h;

    /* renamed from: i  reason: collision with root package name */
    private volatile zzik f13644i;

    /* renamed from: j  reason: collision with root package name */
    private zzik f13645j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13646k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f13647l;

    public zzis(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13647l = new Object();
        this.f13641f = new ConcurrentHashMap();
    }

    private final zzik A(Activity activity) {
        Preconditions.m(activity);
        zzik zzikVar = (zzik) this.f13641f.get(activity);
        if (zzikVar == null) {
            zzik zzikVar2 = new zzik(null, o(activity.getClass(), "Activity"), this.f13220a.I().m0());
            this.f13641f.put(activity, zzikVar2);
            zzikVar = zzikVar2;
        }
        return this.f13644i != null ? this.f13644i : zzikVar;
    }

    private final void B(Activity activity, zzik zzikVar, boolean z10) {
        zzik zzikVar2;
        zzik zzikVar3 = this.f13638c == null ? this.f13639d : this.f13638c;
        if (zzikVar.f13633b == null) {
            zzikVar2 = new zzik(zzikVar.f13632a, activity != null ? o(activity.getClass(), "Activity") : null, zzikVar.f13634c, zzikVar.f13636e, zzikVar.f13637f);
        } else {
            zzikVar2 = zzikVar;
        }
        this.f13639d = this.f13638c;
        this.f13638c = zzikVar2;
        this.f13220a.zzaz().u(new b2(this, zzikVar2, zzikVar3, this.f13220a.zzav().b(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(zzik zzikVar, zzik zzikVar2, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        long j12;
        c();
        boolean z11 = false;
        boolean z12 = (zzikVar2 != null && zzikVar2.f13634c == zzikVar.f13634c && zzil.a(zzikVar2.f13633b, zzikVar.f13633b) && zzil.a(zzikVar2.f13632a, zzikVar.f13632a)) ? false : true;
        if (z10 && this.f13640e != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            zzlh.t(zzikVar, bundle3, true);
            if (zzikVar2 != null) {
                String str = zzikVar2.f13632a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = zzikVar2.f13633b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", zzikVar2.f13634c);
            }
            if (z11) {
                m3 m3Var = this.f13220a.H().f13675e;
                long j13 = j10 - m3Var.f13083b;
                m3Var.f13083b = j10;
                if (j13 > 0) {
                    this.f13220a.I().r(bundle3, j13);
                }
            }
            if (!this.f13220a.u().y()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != zzikVar.f13636e ? "auto" : "app";
            long a10 = this.f13220a.zzav().a();
            if (zzikVar.f13636e) {
                j11 = a10;
                long j14 = zzikVar.f13637f;
                if (j14 != 0) {
                    j12 = j14;
                    this.f13220a.D().q(str3, "_vs", j12, bundle3);
                }
            } else {
                j11 = a10;
            }
            j12 = j11;
            this.f13220a.D().q(str3, "_vs", j12, bundle3);
        }
        if (z11) {
            k(this.f13640e, true, j10);
        }
        this.f13640e = zzikVar;
        if (zzikVar.f13636e) {
            this.f13645j = zzikVar;
        }
        this.f13220a.G().p(zzikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(zzik zzikVar, boolean z10, long j10) {
        this.f13220a.t().i(this.f13220a.zzav().b());
        if (!this.f13220a.H().f13675e.d(zzikVar != null && zzikVar.f13635d, z10, j10) || zzikVar == null) {
            return;
        }
        zzikVar.f13635d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void r(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzisVar.j(zzikVar, zzikVar2, j10, true, zzisVar.f13220a.I().q0(null, "screen_view", bundle, null, false));
    }

    @Override // com.google.android.gms.measurement.internal.x
    protected final boolean i() {
        return false;
    }

    public final zzik m() {
        return this.f13638c;
    }

    public final zzik n(boolean z10) {
        d();
        c();
        if (z10) {
            zzik zzikVar = this.f13640e;
            return zzikVar != null ? zzikVar : this.f13645j;
        }
        return this.f13640e;
    }

    @VisibleForTesting
    final String o(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f13220a.u();
        if (length2 > 100) {
            this.f13220a.u();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void t(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f13220a.u().y() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f13641f.put(activity, new zzik(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(ug.f21009x)));
    }

    public final void u(Activity activity) {
        synchronized (this.f13647l) {
            if (activity == this.f13642g) {
                this.f13642g = null;
            }
        }
        if (this.f13220a.u().y()) {
            this.f13641f.remove(activity);
        }
    }

    public final void v(Activity activity) {
        synchronized (this.f13647l) {
            this.f13646k = false;
            this.f13643h = true;
        }
        long b10 = this.f13220a.zzav().b();
        if (!this.f13220a.u().y()) {
            this.f13638c = null;
            this.f13220a.zzaz().u(new d2(this, b10));
            return;
        }
        zzik A = A(activity);
        this.f13639d = this.f13638c;
        this.f13638c = null;
        this.f13220a.zzaz().u(new e2(this, A, b10));
    }

    public final void w(Activity activity) {
        synchronized (this.f13647l) {
            this.f13646k = true;
            if (activity != this.f13642g) {
                synchronized (this.f13647l) {
                    this.f13642g = activity;
                    this.f13643h = false;
                }
                if (this.f13220a.u().y()) {
                    this.f13644i = null;
                    this.f13220a.zzaz().u(new f2(this));
                }
            }
        }
        if (!this.f13220a.u().y()) {
            this.f13638c = this.f13644i;
            this.f13220a.zzaz().u(new c2(this));
            return;
        }
        B(activity, A(activity), false);
        zzd t10 = this.f13220a.t();
        t10.f13220a.zzaz().u(new l(t10, t10.f13220a.zzav().b()));
    }

    public final void x(Activity activity, Bundle bundle) {
        zzik zzikVar;
        if (!this.f13220a.u().y() || bundle == null || (zzikVar = (zzik) this.f13641f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(ug.f21009x, zzikVar.f13634c);
        bundle2.putString("name", zzikVar.f13632a);
        bundle2.putString("referrer_name", zzikVar.f13633b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzfy r0 = r3.f13220a
            com.google.android.gms.measurement.internal.zzag r0 = r0.u()
            boolean r0 = r0.y()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzfy r4 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.s()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.zzik r0 = r3.f13638c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzfy r4 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.s()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L30:
            java.util.Map r1 = r3.f13641f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.zzfy r4 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.s()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.o(r6, r1)
        L54:
            java.lang.String r1 = r0.f13633b
            boolean r1 = com.google.android.gms.measurement.internal.zzil.a(r1, r6)
            java.lang.String r0 = r0.f13632a
            boolean r0 = com.google.android.gms.measurement.internal.zzil.a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.zzfy r4 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.s()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.zzfy r1 = r3.f13220a
            r1.u()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.zzfy r4 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.s()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.zzfy r1 = r3.f13220a
            r1.u()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.zzfy r4 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.s()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.zzfy r0 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.q()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.google.android.gms.measurement.internal.zzik r0 = new com.google.android.gms.measurement.internal.zzik
            com.google.android.gms.measurement.internal.zzfy r1 = r3.f13220a
            com.google.android.gms.measurement.internal.zzlh r1 = r1.I()
            long r1 = r1.m0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f13641f
            r5.put(r4, r0)
            r5 = 1
            r3.B(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzis.y(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzis.z(android.os.Bundle, long):void");
    }
}
