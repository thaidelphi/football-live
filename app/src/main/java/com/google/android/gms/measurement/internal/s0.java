package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class s0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzaw f13134a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f13135b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzgq f13136c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.f13136c = zzgqVar;
        this.f13134a = zzawVar;
        this.f13135b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        byte[] bArr;
        zzkz zzkzVar3;
        b4 b4Var;
        a1 a1Var;
        com.google.android.gms.internal.measurement.zzfz zzfzVar;
        String str;
        Bundle bundle;
        zzgb zzgbVar;
        String str2;
        i c10;
        long j10;
        zzkzVar = this.f13136c.f13582a;
        zzkzVar.a();
        zzkzVar2 = this.f13136c.f13582a;
        z1 Y = zzkzVar2.Y();
        zzaw zzawVar = this.f13134a;
        String str3 = this.f13135b;
        Y.c();
        zzfy.o();
        Preconditions.m(zzawVar);
        Preconditions.g(str3);
        if (!Y.f13220a.u().w(str3, zzeb.U)) {
            Y.f13220a.zzay().l().b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if (!"_iap".equals(zzawVar.f13312a) && !"_iapx".equals(zzawVar.f13312a)) {
            Y.f13220a.zzay().l().c("Generating a payload for this event is not available. package_name, event_name", str3, zzawVar.f13312a);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzfz zza = zzga.zza();
            Y.f13125b.R().Z();
            try {
                a1 M = Y.f13125b.R().M(str3);
                if (M == null) {
                    Y.f13220a.zzay().l().b("Log and bundle not available. package_name", str3);
                    bArr = new byte[0];
                    zzkzVar3 = Y.f13125b;
                } else if (!M.J()) {
                    Y.f13220a.zzay().l().b("Log and bundle disabled. package_name", str3);
                    bArr = new byte[0];
                    zzkzVar3 = Y.f13125b;
                } else {
                    zzgb zzt = zzgc.zzt();
                    zzt.zzad(1);
                    zzt.zzZ("android");
                    if (!TextUtils.isEmpty(M.d0())) {
                        zzt.zzD(M.d0());
                    }
                    if (!TextUtils.isEmpty(M.f0())) {
                        zzt.zzF((String) Preconditions.m(M.f0()));
                    }
                    if (!TextUtils.isEmpty(M.g0())) {
                        zzt.zzG((String) Preconditions.m(M.g0()));
                    }
                    if (M.L() != -2147483648L) {
                        zzt.zzH((int) M.L());
                    }
                    zzt.zzV(M.W());
                    zzt.zzP(M.U());
                    String i02 = M.i0();
                    String b02 = M.b0();
                    if (!TextUtils.isEmpty(i02)) {
                        zzt.zzU(i02);
                    } else if (!TextUtils.isEmpty(b02)) {
                        zzt.zzC(b02);
                    }
                    zzai Q = Y.f13125b.Q(str3);
                    zzt.zzM(M.T());
                    if (Y.f13220a.j() && Y.f13220a.u().x(zzt.zzap()) && Q.i(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzt.zzO(null);
                    }
                    zzt.zzL(Q.h());
                    if (Q.i(zzah.AD_STORAGE) && M.I()) {
                        Pair i10 = Y.f13125b.Z().i(M.d0(), Q);
                        if (M.I() && !TextUtils.isEmpty((CharSequence) i10.first)) {
                            try {
                                zzt.zzae(z1.a((String) i10.first, Long.toString(zzawVar.f13315d)));
                                Object obj = i10.second;
                                if (obj != null) {
                                    zzt.zzX(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e8) {
                                Y.f13220a.zzay().l().b("Resettable device id encryption failed", e8.getMessage());
                                bArr = new byte[0];
                                zzkzVar3 = Y.f13125b;
                            }
                        }
                    }
                    Y.f13220a.v().f();
                    zzt.zzN(Build.MODEL);
                    Y.f13220a.v().f();
                    zzt.zzY(Build.VERSION.RELEASE);
                    zzt.zzaj((int) Y.f13220a.v().k());
                    zzt.zzan(Y.f13220a.v().l());
                    try {
                        if (Q.i(zzah.ANALYTICS_STORAGE) && M.e0() != null) {
                            zzt.zzE(z1.a((String) Preconditions.m(M.e0()), Long.toString(zzawVar.f13315d)));
                        }
                        if (!TextUtils.isEmpty(M.h0())) {
                            zzt.zzT((String) Preconditions.m(M.h0()));
                        }
                        String d02 = M.d0();
                        List X = Y.f13125b.R().X(d02);
                        Iterator it = X.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                b4Var = null;
                                break;
                            }
                            b4Var = (b4) it.next();
                            if ("_lte".equals(b4Var.f12886c)) {
                                break;
                            }
                        }
                        if (b4Var == null || b4Var.f12888e == null) {
                            b4 b4Var2 = new b4(d02, "auto", "_lte", Y.f13220a.zzav().a(), 0L);
                            X.add(b4Var2);
                            Y.f13125b.R().s(b4Var2);
                        }
                        zzlb b03 = Y.f13125b.b0();
                        b03.f13220a.zzay().q().a("Checking account type status for ad personalization signals");
                        if (b03.f13220a.v().n()) {
                            String d03 = M.d0();
                            Preconditions.m(d03);
                            if (M.I() && b03.f13125b.V().w(d03)) {
                                b03.f13220a.zzay().l().a("Turning off ad personalization due to account type");
                                Iterator it2 = X.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((b4) it2.next()).f12886c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                X.add(new b4(d03, "auto", "_npa", b03.f13220a.zzav().a(), 1L));
                            }
                        }
                        zzgl[] zzglVarArr = new zzgl[X.size()];
                        for (int i11 = 0; i11 < X.size(); i11++) {
                            zzgk zzd = zzgl.zzd();
                            zzd.zzf(((b4) X.get(i11)).f12886c);
                            zzd.zzg(((b4) X.get(i11)).f12887d);
                            Y.f13125b.b0().F(zzd, ((b4) X.get(i11)).f12888e);
                            zzglVarArr[i11] = (zzgl) zzd.zzaE();
                        }
                        zzt.zzj(Arrays.asList(zzglVarArr));
                        zzep b10 = zzep.b(zzawVar);
                        Y.f13220a.I().u(b10.f13496d, Y.f13125b.R().L(str3));
                        Y.f13220a.I().v(b10, Y.f13220a.u().i(str3));
                        Bundle bundle2 = b10.f13496d;
                        bundle2.putLong("_c", 1L);
                        Y.f13220a.zzay().l().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.f13314c);
                        if (Y.f13220a.I().O(zzt.zzap())) {
                            Y.f13220a.I().x(bundle2, "_dbg", 1L);
                            Y.f13220a.I().x(bundle2, "_r", 1L);
                        }
                        i Q2 = Y.f13125b.R().Q(str3, zzawVar.f13312a);
                        if (Q2 == null) {
                            zzgbVar = zzt;
                            a1Var = M;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            c10 = new i(str3, zzawVar.f13312a, 0L, 0L, 0L, zzawVar.f13315d, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            a1Var = M;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            zzgbVar = zzt;
                            str2 = null;
                            long j11 = Q2.f13001f;
                            c10 = Q2.c(zzawVar.f13315d);
                            j10 = j11;
                        }
                        Y.f13125b.R().l(c10);
                        zzar zzarVar = new zzar(Y.f13220a, zzawVar.f13314c, str, zzawVar.f13312a, zzawVar.f13315d, j10, bundle);
                        zzfr zze = zzfs.zze();
                        zze.zzm(zzarVar.f13308d);
                        zze.zzi(zzarVar.f13306b);
                        zze.zzl(zzarVar.f13309e);
                        j jVar = new j(zzarVar.f13310f);
                        while (jVar.hasNext()) {
                            String next = jVar.next();
                            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                            zze2.zzj(next);
                            Object z02 = zzarVar.f13310f.z0(next);
                            if (z02 != null) {
                                Y.f13125b.b0().E(zze2, z02);
                                zze.zze(zze2);
                            }
                        }
                        zzgb zzgbVar2 = zzgbVar;
                        zzgbVar2.zzk(zze);
                        zzgd zza2 = zzgf.zza();
                        zzft zza3 = zzfu.zza();
                        zza3.zza(c10.f12998c);
                        zza3.zzb(zzawVar.f13312a);
                        zza2.zza(zza3);
                        zzgbVar2.zzaa(zza2);
                        zzgbVar2.zzf(Y.f13125b.O().h(a1Var.d0(), Collections.emptyList(), zzgbVar2.zzat(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzgbVar2.zzai(zze.zzc());
                            zzgbVar2.zzQ(zze.zzc());
                        }
                        long X2 = a1Var.X();
                        int i12 = (X2 > 0L ? 1 : (X2 == 0L ? 0 : -1));
                        if (i12 != 0) {
                            zzgbVar2.zzab(X2);
                        }
                        long Z = a1Var.Z();
                        if (Z != 0) {
                            zzgbVar2.zzac(Z);
                        } else if (i12 != 0) {
                            zzgbVar2.zzac(X2);
                        }
                        String b11 = a1Var.b();
                        zzoz.zzc();
                        if (Y.f13220a.u().w(str2, zzeb.f13443t0) && b11 != null) {
                            zzgbVar2.zzah(b11);
                        }
                        a1Var.e();
                        zzgbVar2.zzI((int) a1Var.Y());
                        Y.f13220a.u().l();
                        zzgbVar2.zzal(73000L);
                        zzgbVar2.zzak(Y.f13220a.zzav().a());
                        zzgbVar2.zzag(true);
                        if (Y.f13220a.u().w(str2, zzeb.B0)) {
                            Y.f13125b.c(zzgbVar2.zzap(), zzgbVar2);
                        }
                        com.google.android.gms.internal.measurement.zzfz zzfzVar2 = zzfzVar;
                        zzfzVar2.zza(zzgbVar2);
                        a1 a1Var2 = a1Var;
                        a1Var2.C(zzgbVar2.zzd());
                        a1Var2.z(zzgbVar2.zzc());
                        Y.f13125b.R().k(a1Var2);
                        Y.f13125b.R().j();
                        try {
                            return Y.f13125b.b0().J(((zzga) zzfzVar2.zzaE()).zzbv());
                        } catch (IOException e10) {
                            Y.f13220a.zzay().m().c("Data loss. Failed to bundle and serialize. appId", zzeo.u(str), e10);
                            return str2;
                        }
                    } catch (SecurityException e11) {
                        Y.f13220a.zzay().l().b("app instance id encryption failed", e11.getMessage());
                        bArr = new byte[0];
                        zzkzVar3 = Y.f13125b;
                    }
                }
                zzkzVar3.R().a0();
                return bArr;
            } finally {
                Y.f13125b.R().a0();
            }
        }
    }
}
