package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxf implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbxg zza;
    private final String zzb;

    public zzbxf(zzbxg zzbxgVar, String str) {
        this.zza = zzbxgVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbxe> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbxe zzbxeVar : list) {
                zzbxg.zzb(zzbxeVar.zza, zzbxeVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
