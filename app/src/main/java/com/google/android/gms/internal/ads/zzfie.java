package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfie {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfio zzc;
    private final zzfia zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzg;
    private AtomicInteger zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfie(zzfio zzfioVar, zzfia zzfiaVar, Context context, Clock clock) {
        this.zzc = zzfioVar;
        this.zzd = zzfiaVar;
        this.zze = context;
        this.zzg = clock;
    }

    static String zzd(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        return str + "#" + name;
    }

    private final synchronized zzfin zzm(String str, AdFormat adFormat) {
        return (zzfin) this.zza.get(zzd(str, adFormat));
    }

    private final synchronized Object zzn(Class cls, String str, AdFormat adFormat) {
        this.zzd.zzd(adFormat, this.zzg.a());
        zzfin zzm = zzm(str, adFormat);
        if (zzm == null) {
            return null;
        }
        try {
            String zzf = zzm.zzf();
            Object zze = zzm.zze();
            Object cast = zze == null ? null : cls.cast(zze);
            if (cast != null) {
                this.zzd.zze(adFormat, this.zzg.a(), zzf);
            }
            return cast;
        } catch (ClassCastException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e8);
            return null;
        }
    }

    private final synchronized List zzo(List list) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzfq zzfqVar = (com.google.android.gms.ads.internal.client.zzfq) it.next();
            String zzd = zzd(zzfqVar.zza, AdFormat.getAdFormat(zzfqVar.zzb));
            hashSet.add(zzd);
            zzfin zzfinVar = (zzfin) this.zza.get(zzd);
            if (zzfinVar != null) {
                if (!zzfinVar.zze.equals(zzfqVar)) {
                    this.zzb.put(zzd, zzfinVar);
                    this.zza.remove(zzd);
                } else {
                    zzfinVar.zzs(zzfqVar.zzd);
                }
            } else if (this.zzb.containsKey(zzd)) {
                zzfin zzfinVar2 = (zzfin) this.zzb.get(zzd);
                if (zzfinVar2.zze.equals(zzfqVar)) {
                    zzfinVar2.zzs(zzfqVar.zzd);
                    zzfinVar2.zzp();
                    this.zza.put(zzd, zzfinVar2);
                    this.zzb.remove(zzd);
                }
            } else {
                arrayList.add(zzfqVar);
            }
        }
        Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains((String) entry.getKey())) {
                this.zzb.put((String) entry.getKey(), (zzfin) entry.getValue());
                it2.remove();
            }
        }
        Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            zzfin zzfinVar3 = (zzfin) ((Map.Entry) it3.next()).getValue();
            zzfinVar3.zzr();
            if (!zzfinVar3.zzt()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized void zzp(String str, zzfin zzfinVar) {
        zzfinVar.zzc();
        this.zza.put(str, zzfinVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzq(boolean z10) {
        if (z10) {
            for (zzfin zzfinVar : this.zza.values()) {
                zzfinVar.zzp();
            }
        } else {
            for (zzfin zzfinVar2 : this.zza.values()) {
                zzfinVar2.zzf.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzr(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzt)).booleanValue()) {
            zzq(z10);
        }
    }

    private final synchronized boolean zzs(String str, AdFormat adFormat) {
        boolean z10;
        long a10 = this.zzg.a();
        zzfin zzm = zzm(str, adFormat);
        z10 = false;
        if (zzm != null && zzm.zzt()) {
            z10 = true;
        }
        this.zzd.zza(adFormat, a10, z10 ? Long.valueOf(this.zzg.a()) : null, zzm == null ? null : zzm.zzf());
        return z10;
    }

    public final synchronized zzaze zza(String str) {
        return (zzaze) zzn(zzaze.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzb(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzn(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }

    public final synchronized zzbvi zzc(String str) {
        return (zzbvi) zzn(zzbvi.class, str, AdFormat.REWARDED);
    }

    public final void zzg() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e8) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get connectivity manager", e8);
                    }
                }
            }
        }
        if (PlatformVersion.i() && this.zzf != null) {
            try {
                this.zzf.registerDefaultNetworkCallback(new zzfid(this));
                return;
            } catch (RuntimeException e10) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e10);
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzy)).intValue());
                return;
            }
        }
        this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzy)).intValue());
    }

    public final void zzh(zzbod zzbodVar) {
        this.zzc.zzb(zzbodVar);
    }

    public final synchronized void zzi(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        List<com.google.android.gms.ads.internal.client.zzfq> zzo = zzo(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzfq zzfqVar : zzo) {
            String str = zzfqVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzfqVar.zzb);
            zzfin zza = this.zzc.zza(zzfqVar, zzceVar);
            if (adFormat != null && zza != null) {
                AtomicInteger atomicInteger = this.zzh;
                if (atomicInteger != null) {
                    zza.zzo(atomicInteger.get());
                }
                zza.zzq(this.zzd);
                zzp(zzd(str, adFormat), zza);
                enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zze(enumMap, adFormat, 0)).intValue() + 1));
            }
        }
        this.zzd.zzf(enumMap, this.zzg.a());
        com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzfic(this));
    }

    public final synchronized boolean zzj(String str) {
        return zzs(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzk(String str) {
        return zzs(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzl(String str) {
        return zzs(str, AdFormat.REWARDED);
    }
}
