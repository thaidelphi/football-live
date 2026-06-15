package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbbm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzcb {

    /* renamed from: a  reason: collision with root package name */
    private final Map f11462a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final List f11463b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Context f11464c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcb(Context context) {
        this.f11464c = context;
    }

    final synchronized void b(String str) {
        SharedPreferences sharedPreferences;
        if (this.f11462a.containsKey(str)) {
            return;
        }
        if (Objects.equals(str, "__default__")) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f11464c);
        } else {
            sharedPreferences = this.f11464c.getSharedPreferences(str, 0);
        }
        zzca zzcaVar = new zzca(this, str);
        this.f11462a.put(str, zzcaVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
    }

    final synchronized void c(zzbz zzbzVar) {
        this.f11463b.add(zzbzVar);
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkp)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            Map zzw = zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzku));
            for (String str : zzw.keySet()) {
                b(str);
            }
            c(new zzbz(zzw));
        }
    }
}
