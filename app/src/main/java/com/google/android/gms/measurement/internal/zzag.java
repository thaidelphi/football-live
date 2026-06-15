package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzag extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f13285b;

    /* renamed from: c  reason: collision with root package name */
    private c f13286c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f13287d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13286c = new c() { // from class: com.google.android.gms.measurement.internal.zzae
            @Override // com.google.android.gms.measurement.internal.c
            public final String a(String str, String str2) {
                return null;
            }
        };
    }

    public static final long D() {
        return ((Long) zzeb.f13412e.a(null)).longValue();
    }

    public static final long d() {
        return ((Long) zzeb.E.a(null)).longValue();
    }

    private final String e(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.m(str3);
            return str3;
        } catch (ClassNotFoundException e8) {
            this.f13220a.zzay().m().b("Could not find SystemProperties class", e8);
            return "";
        } catch (IllegalAccessException e10) {
            this.f13220a.zzay().m().b("Could not access SystemProperties.get()", e10);
            return "";
        } catch (NoSuchMethodException e11) {
            this.f13220a.zzay().m().b("Could not find SystemProperties.get() method", e11);
            return "";
        } catch (InvocationTargetException e12) {
            this.f13220a.zzay().m().b("SystemProperties.get() threw an exception", e12);
            return "";
        }
    }

    public final boolean A(String str) {
        return "1".equals(this.f13286c.a(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B() {
        if (this.f13285b == null) {
            Boolean o10 = o("app_measurement_lite");
            this.f13285b = o10;
            if (o10 == null) {
                this.f13285b = Boolean.FALSE;
            }
        }
        return this.f13285b.booleanValue() || !this.f13220a.n();
    }

    public final boolean C() {
        if (this.f13287d == null) {
            synchronized (this) {
                if (this.f13287d == null) {
                    ApplicationInfo applicationInfo = this.f13220a.zzau().getApplicationInfo();
                    String a10 = ProcessUtils.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(a10)) {
                            z10 = true;
                        }
                        this.f13287d = Boolean.valueOf(z10);
                    }
                    if (this.f13287d == null) {
                        this.f13287d = Boolean.TRUE;
                        this.f13220a.zzay().m().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f13287d.booleanValue();
    }

    public final double f(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Double) zzeaVar.a(null)).doubleValue();
        }
        String a10 = this.f13286c.a(str, zzeaVar.b());
        if (TextUtils.isEmpty(a10)) {
            return ((Double) zzeaVar.a(null)).doubleValue();
        }
        try {
            return ((Double) zzeaVar.a(Double.valueOf(Double.parseDouble(a10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzeaVar.a(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(String str) {
        return k(str, zzeb.I, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, 2000);
    }

    public final int h() {
        zzlh I = this.f13220a.I();
        Boolean E = I.f13220a.G().E();
        if (I.j0() < 201500) {
            return (E == null || E.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int i(String str) {
        return k(str, zzeb.J, 25, 100);
    }

    public final int j(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Integer) zzeaVar.a(null)).intValue();
        }
        String a10 = this.f13286c.a(str, zzeaVar.b());
        if (TextUtils.isEmpty(a10)) {
            return ((Integer) zzeaVar.a(null)).intValue();
        }
        try {
            return ((Integer) zzeaVar.a(Integer.valueOf(Integer.parseInt(a10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzeaVar.a(null)).intValue();
        }
    }

    public final int k(String str, zzea zzeaVar, int i10, int i11) {
        return Math.max(Math.min(j(str, zzeaVar), i11), i10);
    }

    public final long l() {
        this.f13220a.zzaw();
        return 73000L;
    }

    public final long m(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Long) zzeaVar.a(null)).longValue();
        }
        String a10 = this.f13286c.a(str, zzeaVar.b());
        if (TextUtils.isEmpty(a10)) {
            return ((Long) zzeaVar.a(null)).longValue();
        }
        try {
            return ((Long) zzeaVar.a(Long.valueOf(Long.parseLong(a10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzeaVar.a(null)).longValue();
        }
    }

    @VisibleForTesting
    final Bundle n() {
        try {
            if (this.f13220a.zzau().getPackageManager() == null) {
                this.f13220a.zzay().m().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = Wrappers.a(this.f13220a.zzau()).c(this.f13220a.zzau().getPackageName(), 128);
            if (c10 == null) {
                this.f13220a.zzay().m().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c10.metaData;
        } catch (PackageManager.NameNotFoundException e8) {
            this.f13220a.zzay().m().b("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final Boolean o(String str) {
        Preconditions.g(str);
        Bundle n10 = n();
        if (n10 == null) {
            this.f13220a.zzay().m().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (n10.containsKey(str)) {
            return Boolean.valueOf(n10.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String p() {
        return e("debug.firebase.analytics.app", "");
    }

    public final String q() {
        return e("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String r() {
        this.f13220a.zzaw();
        return "FA";
    }

    public final String s(String str, zzea zzeaVar) {
        if (str == null) {
            return (String) zzeaVar.a(null);
        }
        return (String) zzeaVar.a(this.f13286c.a(str, zzeaVar.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List t(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.g(r4)
            android.os.Bundle r0 = r3.n()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzfy r4 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.m()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.zzfy r0 = r3.f13220a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzau()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzfy r0 = r3.f13220a
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.m()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.t(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(c cVar) {
        this.f13286c = cVar;
    }

    public final boolean v() {
        Boolean o10 = o("google_analytics_adid_collection_enabled");
        return o10 == null || o10.booleanValue();
    }

    public final boolean w(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Boolean) zzeaVar.a(null)).booleanValue();
        }
        String a10 = this.f13286c.a(str, zzeaVar.b());
        if (TextUtils.isEmpty(a10)) {
            return ((Boolean) zzeaVar.a(null)).booleanValue();
        }
        return ((Boolean) zzeaVar.a(Boolean.valueOf("1".equals(a10)))).booleanValue();
    }

    public final boolean x(String str) {
        return "1".equals(this.f13286c.a(str, "gaia_collection_enabled"));
    }

    public final boolean y() {
        Boolean o10 = o("google_analytics_automatic_screen_reporting_enabled");
        return o10 == null || o10.booleanValue();
    }

    public final boolean z() {
        this.f13220a.zzaw();
        Boolean o10 = o("firebase_analytics_collection_deactivated");
        return o10 != null && o10.booleanValue();
    }
}
