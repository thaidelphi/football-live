package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbw extends zzb {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.gms.ads.internal.util.client.zzu f11452a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11453b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.ads.internal.util.client.zzv f11454c;

    public zzbw(Context context, String str, String str2, zzfhg zzfhgVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.f11452a = new com.google.android.gms.ads.internal.util.client.zzu(com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
        this.f11453b = str2;
        this.f11454c = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.f11454c;
        if (zzvVar != null) {
            new zzfhf(zzvVar.zzb(), this.f11452a, zzbyp.zze, null).zzd(this.f11453b);
            return;
        }
        this.f11452a.zza(this.f11453b);
    }
}
