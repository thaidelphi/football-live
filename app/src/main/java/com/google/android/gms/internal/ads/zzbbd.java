package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbbd {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbbd(int i10, String str, Object obj, Object obj2, zzbbc zzbbcVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zza().zzd(this);
    }

    public static zzbbd zzf(int i10, String str, float f10, float f11) {
        return new zzbba(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbbd zzg(int i10, String str, int i11, int i12) {
        return new zzbay(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbbd zzh(int i10, String str, long j10, long j11) {
        return new zzbaz(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzbbd zzi(int i10, String str) {
        zzbbb zzbbbVar = new zzbbb(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zza().zzc(zzbbbVar);
        return zzbbbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzj() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(this);
    }

    public final Object zzk() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzf() ? this.zzd : this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}
