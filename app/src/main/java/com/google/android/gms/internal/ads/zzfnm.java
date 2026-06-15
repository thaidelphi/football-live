package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfnm {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfnn zzc;
    private final zzflq zzd;
    private final zzfll zze;
    private zzfnb zzf;
    private final Object zzg = new Object();

    public zzfnm(Context context, zzfnn zzfnnVar, zzflq zzflqVar, zzfll zzfllVar) {
        this.zzb = context;
        this.zzc = zzfnnVar;
        this.zzd = zzflqVar;
        this.zze = zzfllVar;
    }

    private final synchronized Class zzd(zzfnc zzfncVar) throws zzfnl {
        String zzk = zzfncVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfncVar.zzc())) {
                try {
                    File zzb = zzfncVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(zzfncVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e8) {
                    throw new zzfnl((int) AdError.REMOTE_ADS_SERVICE_ERROR, e8);
                }
            }
            throw new zzfnl(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e10) {
            throw new zzfnl(2026, e10);
        }
    }

    public final zzflt zza() {
        zzfnb zzfnbVar;
        synchronized (this.zzg) {
            zzfnbVar = this.zzf;
        }
        return zzfnbVar;
    }

    public final zzfnc zzb() {
        synchronized (this.zzg) {
            zzfnb zzfnbVar = this.zzf;
            if (zzfnbVar != null) {
                return zzfnbVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzfnc zzfncVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfnb zzfnbVar = new zzfnb(zzd(zzfncVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfncVar.zze(), null, new Bundle(), 2), zzfncVar, this.zzc, this.zzd);
                if (zzfnbVar.zzh()) {
                    int zze = zzfnbVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfnb zzfnbVar2 = this.zzf;
                            if (zzfnbVar2 != null) {
                                try {
                                    zzfnbVar2.zzg();
                                } catch (zzfnl e8) {
                                    this.zzd.zzc(e8.zza(), -1L, e8);
                                }
                            }
                            this.zzf = zzfnbVar;
                        }
                        this.zzd.zzd(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfnl((int) IronSourceConstants.NT_LOAD, "ci: " + zze);
                }
                throw new zzfnl(4000, "init failed");
            } catch (Exception e10) {
                throw new zzfnl(2004, e10);
            }
        } catch (zzfnl e11) {
            this.zzd.zzc(e11.zza(), System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        }
    }
}
