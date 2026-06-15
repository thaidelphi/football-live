package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdcq;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbm implements zzdcq {

    /* renamed from: a  reason: collision with root package name */
    private final zzb f11773a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11774b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11775c;

    public zzbm(zzb zzbVar, int i10, String str) {
        this.f11773a = zzbVar;
        this.f11774b = i10;
        this.f11775c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zze(final zzbk zzbkVar) {
        if (zzbkVar == null || this.f11774b != 2 || TextUtils.isEmpty(this.f11775c)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
            @Override // java.lang.Runnable
            public final void run() {
                r0.f11773a.zzd(zzbm.this.f11775c, zzbkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf(String str) {
    }
}
