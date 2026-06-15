package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzgs;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzu;
import com.ironsource.b9;
import com.ironsource.fe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfp extends r3 implements c {

    /* renamed from: d  reason: collision with root package name */
    private final Map f13531d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    final Map f13532e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    final Map f13533f;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    final Map f13534g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f13535h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f13536i;
    @VisibleForTesting

    /* renamed from: j  reason: collision with root package name */
    final androidx.collection.f f13537j;

    /* renamed from: k  reason: collision with root package name */
    final com.google.android.gms.internal.measurement.zzr f13538k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f13539l;

    /* renamed from: m  reason: collision with root package name */
    private final Map f13540m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f13541n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfp(zzkz zzkzVar) {
        super(zzkzVar);
        this.f13531d = new androidx.collection.a();
        this.f13532e = new androidx.collection.a();
        this.f13533f = new androidx.collection.a();
        this.f13534g = new androidx.collection.a();
        this.f13535h = new androidx.collection.a();
        this.f13539l = new androidx.collection.a();
        this.f13540m = new androidx.collection.a();
        this.f13541n = new androidx.collection.a();
        this.f13536i = new androidx.collection.a();
        this.f13537j = new a0(this, 20);
        this.f13538k = new b0(this);
    }

    private final zzfe h(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfe.zzg();
        }
        try {
            zzfe zzfeVar = (zzfe) ((zzfd) zzlb.x(zzfe.zze(), bArr)).zzaE();
            this.f13220a.zzay().q().c("Parsed config. version, gmp_app_id", zzfeVar.zzs() ? Long.valueOf(zzfeVar.zzc()) : null, zzfeVar.zzr() ? zzfeVar.zzh() : null);
            return zzfeVar;
        } catch (com.google.android.gms.internal.measurement.zzko e8) {
            this.f13220a.zzay().r().c("Unable to merge remote config. appId", zzeo.u(str), e8);
            return zzfe.zzg();
        } catch (RuntimeException e10) {
            this.f13220a.zzay().r().c("Unable to merge remote config. appId", zzeo.u(str), e10);
            return zzfe.zzg();
        }
    }

    private final void i(String str, zzfd zzfdVar) {
        HashSet hashSet = new HashSet();
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        if (zzfdVar != null) {
            zzow.zzc();
            if (this.f13220a.u().w(null, zzeb.f13431n0)) {
                for (com.google.android.gms.internal.measurement.zzfa zzfaVar : zzfdVar.zzg()) {
                    hashSet.add(zzfaVar.zzb());
                }
            }
            for (int i10 = 0; i10 < zzfdVar.zza(); i10++) {
                com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzfdVar.zzb(i10).zzby();
                if (zzfbVar.zzc().isEmpty()) {
                    this.f13220a.zzay().r().a("EventConfig contained null event name");
                } else {
                    String zzc = zzfbVar.zzc();
                    String b10 = zzgv.b(zzfbVar.zzc());
                    if (!TextUtils.isEmpty(b10)) {
                        zzfbVar.zzb(b10);
                        zzfdVar.zzd(i10, zzfbVar);
                    }
                    if (zzfbVar.zzf() && zzfbVar.zzd()) {
                        aVar.put(zzc, Boolean.TRUE);
                    }
                    if (zzfbVar.zzg() && zzfbVar.zze()) {
                        aVar2.put(zzfbVar.zzc(), Boolean.TRUE);
                    }
                    if (zzfbVar.zzh()) {
                        if (zzfbVar.zza() >= 2 && zzfbVar.zza() <= 65535) {
                            aVar3.put(zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        } else {
                            this.f13220a.zzay().r().c("Invalid sampling rate. Event name, sample rate", zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        }
                    }
                }
            }
        }
        this.f13532e.put(str, hashSet);
        this.f13533f.put(str, aVar);
        this.f13534g.put(str, aVar2);
        this.f13536i.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfp.j(java.lang.String):void");
    }

    private final void k(final String str, zzfe zzfeVar) {
        if (zzfeVar.zza() != 0) {
            this.f13220a.zzay().q().b("EES programs found", Integer.valueOf(zzfeVar.zza()));
            zzgs zzgsVar = (zzgs) zzfeVar.zzm().get(0);
            try {
                zzc zzcVar = new zzc();
                zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new zzn("internal.remoteConfig", new c0(zzfp.this, str));
                    }
                });
                zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final zzfp zzfpVar = zzfp.this;
                        final String str2 = str;
                        return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzfp zzfpVar2 = zzfp.this;
                                String str3 = str2;
                                a1 M = zzfpVar2.f13125b.R().M(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put(fe.G, "android");
                                hashMap.put(b9.h.V, str3);
                                zzfpVar2.f13220a.u().l();
                                hashMap.put("gmp_version", 73000L);
                                if (M != null) {
                                    String g02 = M.g0();
                                    if (g02 != null) {
                                        hashMap.put("app_version", g02);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(M.L()));
                                    hashMap.put("dynamite_version", Long.valueOf(M.U()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(zzfp.this.f13538k);
                    }
                });
                zzcVar.zzc(zzgsVar);
                this.f13537j.put(str, zzcVar);
                this.f13220a.zzay().q().c("EES program loaded for appId, activities", str, Integer.valueOf(zzgsVar.zza().zza()));
                for (com.google.android.gms.internal.measurement.zzgq zzgqVar : zzgsVar.zza().zzd()) {
                    this.f13220a.zzay().q().b("EES program activity", zzgqVar.zzb());
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.f13220a.zzay().m().b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f13537j.remove(str);
    }

    private static final Map l(zzfe zzfeVar) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (zzfeVar != null) {
            for (com.google.android.gms.internal.measurement.zzfi zzfiVar : zzfeVar.zzn()) {
                aVar.put(zzfiVar.zzb(), zzfiVar.zzc());
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzc n(zzfp zzfpVar, String str) {
        zzfpVar.d();
        Preconditions.g(str);
        if (zzfpVar.x(str)) {
            if (zzfpVar.f13535h.containsKey(str) && zzfpVar.f13535h.get(str) != null) {
                zzfpVar.k(str, (zzfe) zzfpVar.f13535h.get(str));
            } else {
                zzfpVar.j(str);
            }
            return (zzc) zzfpVar.f13537j.snapshot().get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A(String str, String str2) {
        Boolean bool;
        c();
        j(str);
        if (y(str) && zzlh.R(str2)) {
            return true;
        }
        if (B(str) && zzlh.S(str2)) {
            return true;
        }
        Map map = (Map) this.f13533f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C(String str, byte[] bArr, String str2, String str3) {
        d();
        c();
        Preconditions.g(str);
        zzfd zzfdVar = (zzfd) h(str, bArr).zzby();
        if (zzfdVar == null) {
            return false;
        }
        i(str, zzfdVar);
        k(str, (zzfe) zzfdVar.zzaE());
        this.f13535h.put(str, (zzfe) zzfdVar.zzaE());
        this.f13539l.put(str, zzfdVar.zze());
        this.f13540m.put(str, str2);
        this.f13541n.put(str, str3);
        this.f13531d.put(str, l((zzfe) zzfdVar.zzaE()));
        this.f13125b.R().i(str, new ArrayList(zzfdVar.zzf()));
        try {
            zzfdVar.zzc();
            bArr = ((zzfe) zzfdVar.zzaE()).zzbv();
        } catch (RuntimeException e8) {
            this.f13220a.zzay().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", zzeo.u(str), e8);
        }
        f R = this.f13125b.R();
        Preconditions.g(str);
        R.c();
        R.d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (R.f13220a.u().w(null, zzeb.f13453y0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (R.K().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                R.f13220a.zzay().m().b("Failed to update remote config (got 0). appId", zzeo.u(str));
            }
        } catch (SQLiteException e10) {
            R.f13220a.zzay().m().c("Error storing remote config. appId", zzeo.u(str), e10);
        }
        this.f13535h.put(str, (zzfe) zzfdVar.zzaE());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D(String str) {
        c();
        j(str);
        return this.f13532e.get(str) != null && ((Set) this.f13532e.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E(String str) {
        c();
        j(str);
        return this.f13532e.get(str) != null && (((Set) this.f13532e.get(str)).contains("device_model") || ((Set) this.f13532e.get(str)).contains("device_info"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F(String str) {
        c();
        j(str);
        return this.f13532e.get(str) != null && ((Set) this.f13532e.get(str)).contains("enhanced_user_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G(String str) {
        c();
        j(str);
        return this.f13532e.get(str) != null && ((Set) this.f13532e.get(str)).contains("google_signals");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H(String str) {
        c();
        j(str);
        return this.f13532e.get(str) != null && (((Set) this.f13532e.get(str)).contains("os_version") || ((Set) this.f13532e.get(str)).contains("device_info"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I(String str) {
        c();
        j(str);
        return this.f13532e.get(str) != null && ((Set) this.f13532e.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.c
    public final String a(String str, String str2) {
        c();
        j(str);
        Map map = (Map) this.f13531d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.r3
    protected final boolean g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(String str, String str2) {
        Integer num;
        c();
        j(str);
        Map map = (Map) this.f13536i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfe o(String str) {
        d();
        c();
        Preconditions.g(str);
        j(str);
        return (zzfe) this.f13535h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String p(String str) {
        c();
        return (String) this.f13541n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String q(String str) {
        c();
        return (String) this.f13540m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String r(String str) {
        c();
        j(str);
        return (String) this.f13539l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set t(String str) {
        c();
        j(str);
        return (Set) this.f13532e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(String str) {
        c();
        this.f13540m.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(String str) {
        c();
        this.f13535h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(String str) {
        c();
        zzfe o10 = o(str);
        if (o10 == null) {
            return false;
        }
        return o10.zzq();
    }

    public final boolean x(String str) {
        zzfe zzfeVar;
        return (TextUtils.isEmpty(str) || (zzfeVar = (zzfe) this.f13535h.get(str)) == null || zzfeVar.zza() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z(String str, String str2) {
        Boolean bool;
        c();
        j(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f13534g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
