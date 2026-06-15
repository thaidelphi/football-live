package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzd {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f11786a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences.Editor f11787b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f11788c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f11789d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(Context context) {
        this.f11788c = context;
    }

    private final void a() {
        synchronized (this.f11789d) {
            if (this.f11786a != null) {
                return;
            }
            SharedPreferences sharedPreferences = this.f11788c.getSharedPreferences("query_info_shared_prefs", 0);
            this.f11786a = sharedPreferences;
            this.f11787b = sharedPreferences.edit();
        }
    }

    public final int zza() {
        int i10;
        a();
        synchronized (this.f11789d) {
            i10 = this.f11786a.getInt("aav", -1);
        }
        return i10;
    }

    public final int zzb() {
        int i10;
        a();
        synchronized (this.f11789d) {
            i10 = this.f11786a.getInt("vc", -1);
        }
        return i10;
    }

    public final String zzc(String str) {
        String string;
        a();
        synchronized (this.f11789d) {
            string = this.f11786a.getString(str, null);
            this.f11787b.remove(str).commit();
        }
        return string;
    }

    public final String zzd() {
        String string;
        a();
        synchronized (this.f11789d) {
            string = this.f11786a.getString("dm", null);
        }
        return string;
    }

    public final String zze() {
        String string;
        a();
        synchronized (this.f11789d) {
            string = this.f11786a.getString("pn", null);
        }
        return string;
    }

    public final Map zzf() {
        HashMap hashMap;
        a();
        synchronized (this.f11789d) {
            Map<String, ?> all = this.f11786a.getAll();
            hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return hashMap;
    }

    public final void zzg() {
        a();
        synchronized (this.f11789d) {
            this.f11787b.clear().commit();
        }
    }

    public final void zzh(String str, String str2) {
        a();
        synchronized (this.f11789d) {
            this.f11787b.putString(str, str2).commit();
        }
    }

    public final void zzi(String str, int i10, String str2, int i11) {
        a();
        synchronized (this.f11789d) {
            this.f11787b.putString("pn", str).putInt("vc", i10).putString("dm", str2).putInt("aav", i11).commit();
        }
    }

    public final boolean zzj(String str) {
        boolean contains;
        a();
        synchronized (this.f11789d) {
            contains = this.f11786a.contains(str);
        }
        return contains;
    }
}
