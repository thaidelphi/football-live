package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgq extends zzed {

    /* renamed from: a  reason: collision with root package name */
    private final zzkz f13582a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f13583b;

    /* renamed from: c  reason: collision with root package name */
    private String f13584c;

    public zzgq(zzkz zzkzVar, String str) {
        Preconditions.m(zzkzVar);
        this.f13582a = zzkzVar;
        this.f13584c = null;
    }

    private final void Z(zzaw zzawVar, zzq zzqVar) {
        this.f13582a.a();
        this.f13582a.e(zzawVar, zzqVar);
    }

    private final void y0(zzq zzqVar, boolean z10) {
        Preconditions.m(zzqVar);
        Preconditions.g(zzqVar.f13720a);
        z0(zzqVar.f13720a, false);
        this.f13582a.c0().G(zzqVar.f13721b, zzqVar.f13736q);
    }

    private final void z0(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f13583b == null) {
                        if (!"com.google.android.gms".equals(this.f13584c) && !UidVerifier.a(this.f13582a.zzau(), Binder.getCallingUid()) && !GoogleSignatureVerifier.a(this.f13582a.zzau()).c(Binder.getCallingUid())) {
                            z11 = false;
                            this.f13583b = Boolean.valueOf(z11);
                        }
                        z11 = true;
                        this.f13583b = Boolean.valueOf(z11);
                    }
                    if (this.f13583b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e8) {
                    this.f13582a.zzay().m().b("Measurement Service called with invalid calling package. appId", zzeo.u(str));
                    throw e8;
                }
            }
            if (this.f13584c == null && GooglePlayServicesUtilLight.l(this.f13582a.zzau(), Binder.getCallingUid(), str)) {
                this.f13584c = str;
            }
            if (str.equals(this.f13584c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.f13582a.zzay().m().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void D(zzq zzqVar) {
        y0(zzqVar, false);
        x0(new o0(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void E(final Bundle bundle, zzq zzqVar) {
        y0(zzqVar, false);
        final String str = zzqVar.f13720a;
        Preconditions.m(str);
        x0(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzfz
            @Override // java.lang.Runnable
            public final void run() {
                zzgq.this.w0(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List F(String str, String str2, String str3, boolean z10) {
        z0(str, true);
        try {
            List<b4> list = (List) this.f13582a.zzaz().n(new k0(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b4 b4Var : list) {
                if (z10 || !zzlh.R(b4Var.f12886c)) {
                    arrayList.add(new zzlc(b4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e8) {
            this.f13582a.zzay().m().c("Failed to get user properties as. appId", zzeo.u(str), e8);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final byte[] J(zzaw zzawVar, String str) {
        Preconditions.g(str);
        Preconditions.m(zzawVar);
        z0(str, true);
        this.f13582a.zzay().l().b("Log and bundle. event", this.f13582a.S().d(zzawVar.f13312a));
        long c10 = this.f13582a.zzav().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f13582a.zzaz().o(new s0(this, zzawVar, str)).get();
            if (bArr == null) {
                this.f13582a.zzay().m().b("Log and bundle returned null. appId", zzeo.u(str));
                bArr = new byte[0];
            }
            this.f13582a.zzay().l().d("Log and bundle processed. event, size, time_ms", this.f13582a.S().d(zzawVar.f13312a), Integer.valueOf(bArr.length), Long.valueOf((this.f13582a.zzav().c() / 1000000) - c10));
            return bArr;
        } catch (InterruptedException | ExecutionException e8) {
            this.f13582a.zzay().m().d("Failed to log and bundle. appId, event, error", zzeo.u(str), this.f13582a.S().d(zzawVar.f13312a), e8);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final String K(zzq zzqVar) {
        y0(zzqVar, false);
        return this.f13582a.e0(zzqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List N(String str, String str2, String str3) {
        z0(str, true);
        try {
            return (List) this.f13582a.zzaz().n(new m0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f13582a.zzay().m().b("Failed to get conditional user properties as", e8);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void c(zzac zzacVar) {
        Preconditions.m(zzacVar);
        Preconditions.m(zzacVar.f13275c);
        Preconditions.g(zzacVar.f13273a);
        z0(zzacVar.f13273a, true);
        x0(new i0(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List c0(String str, String str2, zzq zzqVar) {
        y0(zzqVar, false);
        String str3 = zzqVar.f13720a;
        Preconditions.m(str3);
        try {
            return (List) this.f13582a.zzaz().n(new l0(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f13582a.zzay().m().b("Failed to get conditional user properties", e8);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List d(zzq zzqVar, boolean z10) {
        y0(zzqVar, false);
        String str = zzqVar.f13720a;
        Preconditions.m(str);
        try {
            List<b4> list = (List) this.f13582a.zzaz().n(new u0(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b4 b4Var : list) {
                if (z10 || !zzlh.R(b4Var.f12886c)) {
                    arrayList.add(new zzlc(b4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e8) {
            this.f13582a.zzay().m().c("Failed to get user properties. appId", zzeo.u(zzqVar.f13720a), e8);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void i(zzaw zzawVar, zzq zzqVar) {
        Preconditions.m(zzawVar);
        y0(zzqVar, false);
        x0(new q0(this, zzawVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void i0(zzaw zzawVar, String str, String str2) {
        Preconditions.m(zzawVar);
        Preconditions.g(str);
        z0(str, true);
        x0(new r0(this, zzawVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void j(zzq zzqVar) {
        y0(zzqVar, false);
        x0(new v0(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void l(long j10, String str, String str2, String str3) {
        x0(new w0(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void l0(zzac zzacVar, zzq zzqVar) {
        Preconditions.m(zzacVar);
        Preconditions.m(zzacVar.f13275c);
        y0(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.f13273a = zzqVar.f13720a;
        x0(new h0(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void m(zzlc zzlcVar, zzq zzqVar) {
        Preconditions.m(zzlcVar);
        y0(zzqVar, false);
        x0(new t0(this, zzlcVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void o(zzq zzqVar) {
        Preconditions.g(zzqVar.f13720a);
        Preconditions.m(zzqVar.f13741v);
        p0 p0Var = new p0(this, zzqVar);
        Preconditions.m(p0Var);
        if (this.f13582a.zzaz().x()) {
            p0Var.run();
        } else {
            this.f13582a.zzaz().v(p0Var);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List p(String str, String str2, boolean z10, zzq zzqVar) {
        y0(zzqVar, false);
        String str3 = zzqVar.f13720a;
        Preconditions.m(str3);
        try {
            List<b4> list = (List) this.f13582a.zzaz().n(new j0(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b4 b4Var : list) {
                if (z10 || !zzlh.R(b4Var.f12886c)) {
                    arrayList.add(new zzlc(b4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e8) {
            this.f13582a.zzay().m().c("Failed to query user properties. appId", zzeo.u(zzqVar.f13720a), e8);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void s(zzq zzqVar) {
        Preconditions.g(zzqVar.f13720a);
        z0(zzqVar.f13720a, false);
        x0(new n0(this, zzqVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzaw t0(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.f13312a) && (zzauVar = zzawVar.f13313b) != null && zzauVar.zza() != 0) {
            String C0 = zzawVar.f13313b.C0("_cis");
            if ("referrer broadcast".equals(C0) || "referrer API".equals(C0)) {
                this.f13582a.zzay().p().b("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.f13313b, zzawVar.f13314c, zzawVar.f13315d);
            }
        }
        return zzawVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v0(zzaw zzawVar, zzq zzqVar) {
        if (!this.f13582a.V().x(zzqVar.f13720a)) {
            Z(zzawVar, zzqVar);
            return;
        }
        this.f13582a.zzay().q().b("EES config found for", zzqVar.f13720a);
        zzfp V = this.f13582a.V();
        String str = zzqVar.f13720a;
        zzc zzcVar = TextUtils.isEmpty(str) ? null : (zzc) V.f13537j.get(str);
        if (zzcVar != null) {
            try {
                Map D = this.f13582a.b0().D(zzawVar.f13313b.n0(), true);
                String a10 = zzgv.a(zzawVar.f13312a);
                if (a10 == null) {
                    a10 = zzawVar.f13312a;
                }
                if (zzcVar.zze(new zzaa(a10, zzawVar.f13315d, D))) {
                    if (zzcVar.zzg()) {
                        this.f13582a.zzay().q().b("EES edited event", zzawVar.f13312a);
                        Z(this.f13582a.b0().v(zzcVar.zza().zzb()), zzqVar);
                    } else {
                        Z(zzawVar, zzqVar);
                    }
                    if (zzcVar.zzf()) {
                        for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                            this.f13582a.zzay().q().b("EES logging created event", zzaaVar.zzd());
                            Z(this.f13582a.b0().v(zzaaVar), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.f13582a.zzay().m().c("EES error. appId, eventName", zzqVar.f13721b, zzawVar.f13312a);
            }
            this.f13582a.zzay().q().b("EES was not applied to event", zzawVar.f13312a);
            Z(zzawVar, zzqVar);
            return;
        }
        this.f13582a.zzay().q().b("EES not loaded for", zzqVar.f13720a);
        Z(zzawVar, zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void w0(String str, Bundle bundle) {
        f R = this.f13582a.R();
        R.c();
        R.d();
        byte[] zzbv = R.f13125b.b0().w(new zzar(R.f13220a, "", str, "dep", 0L, 0L, bundle)).zzbv();
        R.f13220a.zzay().q().c("Saving default event parameters, appId, data size", R.f13220a.y().d(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbv);
        try {
            if (R.K().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                R.f13220a.zzay().m().b("Failed to insert default event parameters (got -1). appId", zzeo.u(str));
            }
        } catch (SQLiteException e8) {
            R.f13220a.zzay().m().c("Error storing default event parameters. appId", zzeo.u(str), e8);
        }
    }

    @VisibleForTesting
    final void x0(Runnable runnable) {
        Preconditions.m(runnable);
        if (this.f13582a.zzaz().x()) {
            runnable.run();
        } else {
            this.f13582a.zzaz().u(runnable);
        }
    }
}
