package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzca implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f11460a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzcb f11461b;

    public zzca(zzcb zzcbVar, String str) {
        this.f11461b = zzcbVar;
        this.f11460a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbz> list;
        synchronized (this.f11461b) {
            list = this.f11461b.f11463b;
            for (zzbz zzbzVar : list) {
                String str2 = this.f11460a;
                Map map = zzbzVar.zza;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzi().zzE(false);
                }
            }
        }
    }
}
