package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.b9;
import com.ironsource.yk;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfnb implements zzflt {
    private final Object zza;
    private final zzfnc zzb;
    private final zzfnn zzc;
    private final zzflq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnb(Object obj, zzfnc zzfncVar, zzfnn zzfnnVar, zzflq zzflqVar) {
        this.zza = obj;
        this.zzb = zzfncVar;
        this.zzc = zzfnnVar;
        this.zzd = zzflqVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaso zza = zzasp.zza();
        zza.zzc(5);
        zza.zza(zzgvc.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzasp) zza.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e8) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e8);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzflt
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put(yk.f21552b, null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzflt
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put(yk.f21552b, null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzflt
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put(yk.f21552b, null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzflt
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfnl {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put(yk.f21552b, null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e8) {
            throw new zzfnl(2005, e8);
        }
    }

    public final synchronized int zze() throws zzfnl {
        try {
        } catch (Exception e8) {
            throw new zzfnl(2006, e8);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfnc zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfnl {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e8) {
            throw new zzfnl(2003, e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzh() throws zzfnl {
        try {
        } catch (Exception e8) {
            throw new zzfnl(2001, e8);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod(b9.a.f16535f, new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
