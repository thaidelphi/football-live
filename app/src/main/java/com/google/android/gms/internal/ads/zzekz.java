package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzekz implements zzerw {
    private final Context zza;
    private final zzgba zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekz(zzgba zzgbaVar, Context context) {
        this.zzb = zzgbaVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmK)).booleanValue()) {
            return zzgap.zzh(new zzela(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            return zzgap.zzh(new zzela(null, false));
        }
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeky
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzela(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
