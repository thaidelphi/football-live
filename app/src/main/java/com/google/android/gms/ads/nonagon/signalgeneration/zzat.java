package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzdqk;
import com.google.android.gms.internal.ads.zzgal;
import com.ironsource.mediationsdk.metadata.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzat implements zzgal {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzau f11700a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzat(zzau zzauVar) {
        this.f11700a = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzdqk zzdqkVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzdqkVar = this.f11700a.f11711k;
        atomicInteger = this.f11700a.C;
        zzaa.zzd(zzdqkVar, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", a.f18924g), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjE)).booleanValue()) {
            atomicBoolean = this.f11700a.B;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.f11700a.C;
            if (atomicInteger2.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjF)).intValue()) {
                this.f11700a.I0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdqk zzdqkVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        zzbk zzbkVar = (zzbk) obj;
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjE)).booleanValue()) {
            zzdqkVar = this.f11700a.f11711k;
            atomicInteger = this.f11700a.C;
            zzaa.zzd(zzdqkVar, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", a.f18924g), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.f11700a.B;
            atomicBoolean.set(true);
        }
    }
}
