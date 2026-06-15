package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfin {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbod zzd;
    protected com.google.android.gms.ads.internal.client.zzfq zze;
    private final com.google.android.gms.ads.internal.client.zzce zzg;
    private final zzfhv zzi;
    private final ScheduledExecutorService zzk;
    private zzfia zzn;
    private final Clock zzo;
    private final ConcurrentLinkedQueue zzh = new ConcurrentLinkedQueue();
    protected final AtomicBoolean zzf = new AtomicBoolean(true);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicBoolean zzl = new AtomicBoolean(true);
    private final AtomicBoolean zzm = new AtomicBoolean(false);

    public zzfin(ClientApi clientApi, Context context, int i10, zzbod zzbodVar, com.google.android.gms.ads.internal.client.zzfq zzfqVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfhv zzfhvVar, Clock clock) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i10;
        this.zzd = zzbodVar;
        this.zze = zzfqVar;
        this.zzg = zzceVar;
        this.zzk = scheduledExecutorService;
        this.zzi = zzfhvVar;
        this.zzo = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.set(false);
        int i10 = zzeVar.zza;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            zzC(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzfq zzfqVar = this.zze;
        String str = "Preloading " + zzfqVar.zzb + ", for adUnitId:" + zzfqVar.zza + ", Ad load failed. Stop preloading due to non-retriable error:";
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(str);
        this.zzf.set(false);
    }

    private final synchronized void zzB() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((zzfig) it.next()).zzc()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzC(boolean z10) {
        if (this.zzi.zze()) {
            return;
        }
        if (z10) {
            this.zzi.zzb();
        }
        this.zzk.schedule(new zzfij(this), this.zzi.zza(), TimeUnit.MILLISECONDS);
    }

    private static final String zzD(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar instanceof zzcty) {
            return ((zzcty) zzdxVar).zzk();
        }
        return null;
    }

    public static /* synthetic */ void zzh(zzfin zzfinVar) {
        zzfia zzfiaVar = zzfinVar.zzn;
        if (zzfiaVar != null) {
            zzfiaVar.zzc(AdFormat.getAdFormat(zzfinVar.zze.zzb), zzfinVar.zzo.a());
        }
    }

    public static /* synthetic */ void zzj(zzfin zzfinVar, long j10, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        zzfia zzfiaVar = zzfinVar.zzn;
        if (zzfiaVar != null) {
            zzfiaVar.zzb(AdFormat.getAdFormat(zzfinVar.zze.zzb), j10, zzD(zzdxVar));
        }
    }

    private final synchronized void zzu(Object obj) {
        zzfig zzfigVar = new zzfig(obj, this.zzo);
        this.zzh.add(zzfigVar);
        Clock clock = this.zzo;
        final com.google.android.gms.ads.internal.client.zzdx zza = zza(obj);
        final long a10 = clock.a();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfih
            @Override // java.lang.Runnable
            public final void run() {
                zzfin.this.zzx();
            }
        });
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfii
            @Override // java.lang.Runnable
            public final void run() {
                zzfin.zzj(zzfin.this, a10, zza);
            }
        });
        this.zzk.schedule(new zzfij(this), zzfigVar.zza(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzv(Throwable th) {
        this.zzj.set(false);
        if ((th instanceof zzfhr) && ((zzfhr) th).zza() == 0) {
            throw null;
        }
        zzC(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzw(Object obj) {
        this.zzj.set(false);
        if (obj != null) {
            this.zzi.zzc();
            this.zzm.set(true);
            zzu(obj);
        }
        zzC(obj == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzx() {
        if (this.zzl.get()) {
            try {
                this.zzg.zze(this.zze);
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdsAvailable");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzy() {
        if (this.zzl.get()) {
            try {
                this.zzg.zzf(this.zze);
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void zzz() {
        if (this.zzm.get() && this.zzh.isEmpty()) {
            this.zzm.set(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfik
                @Override // java.lang.Runnable
                public final void run() {
                    zzfin.this.zzy();
                }
            });
            this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfil
                @Override // java.lang.Runnable
                public final void run() {
                    zzfin.zzh(zzfin.this);
                }
            });
        }
    }

    protected abstract com.google.android.gms.ads.internal.client.zzdx zza(Object obj);

    protected abstract b6.a zzb(Context context);

    public final synchronized zzfin zzc() {
        this.zzk.submit(new zzfij(this));
        return this;
    }

    protected final synchronized Object zzd() {
        zzfig zzfigVar = (zzfig) this.zzh.peek();
        if (zzfigVar == null) {
            return null;
        }
        return zzfigVar.zzb();
    }

    public final synchronized Object zze() {
        this.zzi.zzc();
        zzfig zzfigVar = (zzfig) this.zzh.poll();
        this.zzm.set(zzfigVar != null);
        zzn();
        if (zzfigVar == null) {
            return null;
        }
        return zzfigVar.zzb();
    }

    public final synchronized String zzf() {
        Object zzd;
        zzd = zzd();
        return zzD(zzd == null ? null : zza(zzd));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzn() {
        b6.a zzb;
        zzB();
        zzz();
        if (!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.zzd) {
            this.zzj.set(true);
            Activity zza = com.google.android.gms.ads.internal.zzv.zzb().zza();
            if (zza == null) {
                String valueOf = String.valueOf(this.zze.zza);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Empty activity context at preloading: ".concat(valueOf));
                zzb = zzb(this.zzb);
            } else {
                zzb = zzb(zza);
            }
            zzgap.zzr(zzb, new zzfim(this), this.zzk);
        }
    }

    public final synchronized void zzo(int i10) {
        Preconditions.a(i10 >= 5);
        this.zzi.zzd(i10);
    }

    public final synchronized void zzp() {
        this.zzf.set(true);
        this.zzl.set(true);
        this.zzk.submit(new zzfij(this));
    }

    public final void zzq(zzfia zzfiaVar) {
        this.zzn = zzfiaVar;
    }

    public final void zzr() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzs(int i10) {
        Preconditions.a(i10 > 0);
        com.google.android.gms.ads.internal.client.zzfq zzfqVar = this.zze;
        String str = zzfqVar.zza;
        int i11 = zzfqVar.zzb;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfqVar.zzc;
        if (i10 <= 0) {
            i10 = zzfqVar.zzd;
        }
        this.zze = new com.google.android.gms.ads.internal.client.zzfq(str, i11, zzmVar, i10);
    }

    public final synchronized boolean zzt() {
        zzB();
        return !this.zzh.isEmpty();
    }
}
