package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeev {
    private final Clock zza;
    private final zzeex zzb;
    private final zzfhp zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgH)).booleanValue();
    private final zzebl zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzeev(Clock clock, zzeex zzeexVar, zzebl zzeblVar, zzfhp zzfhpVar) {
        this.zza = clock;
        this.zzb = zzeexVar;
        this.zzf = zzeblVar;
        this.zzc = zzfhpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzezu zzezuVar) {
        zzeeu zzeeuVar = (zzeeu) this.zzd.get(zzezuVar);
        if (zzeeuVar == null) {
            return false;
        }
        return zzeeuVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized b6.a zzf(zzfag zzfagVar, zzezu zzezuVar, b6.a aVar, zzfhk zzfhkVar) {
        zzezx zzezxVar = zzfagVar.zzb.zzb;
        long b10 = this.zza.b();
        String str = zzezuVar.zzw;
        if (str != null) {
            this.zzd.put(zzezuVar, new zzeeu(str, zzezuVar.zzaf, 9, 0L, null));
            zzgap.zzr(aVar, new zzeet(this, b10, zzezxVar, zzezuVar, str, zzfhkVar, zzfagVar), zzbyp.zzg);
        }
        return aVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.zzd.entrySet()) {
            zzeeu zzeeuVar = (zzeeu) entry.getValue();
            if (zzeeuVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeeuVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzezu zzezuVar) {
        this.zzh = this.zza.b() - this.zzi;
        if (zzezuVar != null) {
            this.zzf.zze(zzezuVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.b() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzezu zzezuVar = (zzezu) it.next();
            if (!TextUtils.isEmpty(zzezuVar.zzw)) {
                this.zzd.put(zzezuVar, new zzeeu(zzezuVar.zzw, zzezuVar.zzaf, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.b();
    }

    public final synchronized void zzm(zzezu zzezuVar) {
        zzeeu zzeeuVar = (zzeeu) this.zzd.get(zzezuVar);
        if (zzeeuVar == null || this.zzg) {
            return;
        }
        zzeeuVar.zzc = 8;
    }
}
