package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxg {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbws zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxg(Context context, zzbws zzbwsVar) {
        this.zzc = context;
        this.zzd = zzbwsVar;
    }

    public static /* synthetic */ void zzb(zzbxg zzbxgVar, Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            zzbxgVar.zzd.zzd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzc(String str) {
        SharedPreferences sharedPreferences;
        if (this.zza.containsKey(str)) {
            return;
        }
        if (Objects.equals(str, "__default__")) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        } else {
            sharedPreferences = this.zzc.getSharedPreferences(str, 0);
        }
        zzbxf zzbxfVar = new zzbxf(this, str);
        this.zza.put(str, zzbxfVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzbxfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzd(zzbxe zzbxeVar) {
        this.zzb.add(zzbxeVar);
    }
}
