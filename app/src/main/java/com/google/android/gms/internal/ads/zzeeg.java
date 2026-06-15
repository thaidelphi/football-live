package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeeg {
    private final zzgbj zzc;
    private zzeew zzf;
    private final String zzh;
    private final int zzi;
    private final zzeev zzj;
    private zzezu zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private boolean zzl = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeeg(zzfag zzfagVar, zzeev zzeevVar, zzgbj zzgbjVar) {
        this.zzi = zzfagVar.zzb.zzb.zzr;
        this.zzj = zzeevVar;
        this.zzc = zzgbjVar;
        this.zzh = zzefc.zzc(zzfagVar);
        List list = zzfagVar.zzb.zza;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.put((zzezu) list.get(i10), Integer.valueOf(i10));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzeew zzeewVar = this.zzf;
        if (zzeewVar != null) {
            this.zzc.zzc(zzeewVar);
        } else {
            this.zzc.zzd(new zzeez(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z10) {
        for (zzezu zzezuVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzezuVar);
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (z10 || !this.zze.contains(zzezuVar.zzat)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        boolean z10;
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Integer num = (Integer) this.zza.get((zzezu) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER).intValue() < this.zzg) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean zzi() {
        if (this.zzl) {
            return false;
        }
        if (this.zzb.isEmpty() || !((zzezu) this.zzb.get(0)).zzav || this.zzd.isEmpty()) {
            if (!zzd()) {
                List list = this.zzd;
                if (list.size() < this.zzi) {
                    if (zzf(false)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized zzezu zza() {
        if (zzi()) {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzezu zzezuVar = (zzezu) this.zzb.get(i10);
                String str = zzezuVar.zzat;
                if (!this.zze.contains(str)) {
                    if (zzezuVar.zzav) {
                        this.zzl = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.zze.add(str);
                    }
                    this.zzd.add(zzezuVar);
                    return (zzezu) this.zzb.remove(i10);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzb(Throwable th, zzezu zzezuVar) {
        this.zzl = false;
        this.zzd.remove(zzezuVar);
        this.zze.remove(zzezuVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzc(zzeew zzeewVar, zzezu zzezuVar) {
        this.zzl = false;
        this.zzd.remove(zzezuVar);
        if (zzd()) {
            zzeewVar.zzq();
            return;
        }
        Integer num = (Integer) this.zza.get(zzezuVar);
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzezuVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzeewVar;
        this.zzk = zzezuVar;
        if (zzh()) {
            return;
        }
        zze();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
