package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqb implements zzerv {
    private final zzfap zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzeqb(zzfap zzfapVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfapVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        zzben zzbenVar = this.zza.zzi;
        if (zzbenVar == null || zzbenVar.zzi == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbenVar.zzj);
        bundle.putInt("sccg_dir", this.zza.zzi.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcth zzcthVar = (zzcth) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcthVar.zzb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
        if (r12 == 3) goto L63;
     */
    @Override // com.google.android.gms.internal.ads.zzerv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqb.zzb(java.lang.Object):void");
    }
}
