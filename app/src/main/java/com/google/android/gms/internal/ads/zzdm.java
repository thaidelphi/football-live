package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdm {
    private final zzcw zza;
    private final zzdg zzb;
    private final zzdk zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzdm(Looper looper, zzcw zzcwVar, zzdk zzdkVar) {
        this(new CopyOnWriteArraySet(), looper, zzcwVar, zzdkVar, true);
    }

    public static /* synthetic */ boolean zzg(zzdm zzdmVar, Message message) {
        Iterator it = zzdmVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzdl) it.next()).zzb(zzdmVar.zzc);
            if (zzdmVar.zzb.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzcv.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzdm zza(Looper looper, zzdk zzdkVar) {
        return new zzdm(this.zzd, looper, this.zza, zzdkVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzdl(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(1)) {
            zzdg zzdgVar = this.zzb;
            zzdgVar.zzk(zzdgVar.zzb(1));
        }
        boolean z10 = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (z10) {
            return;
        }
        while (!this.zze.isEmpty()) {
            ((Runnable) this.zze.peekFirst()).run();
            this.zze.removeFirst();
        }
    }

    public final void zzd(final int i10, final zzdj zzdjVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdi
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdj zzdjVar2 = zzdjVar;
                    ((zzdl) it.next()).zza(i10, zzdjVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdl) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzdl zzdlVar = (zzdl) it.next();
            if (zzdlVar.zza.equals(obj)) {
                zzdlVar.zzc(this.zzc);
                this.zzd.remove(zzdlVar);
            }
        }
    }

    private zzdm(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzcw zzcwVar, zzdk zzdkVar, boolean z10) {
        this.zza = zzcwVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdkVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzcwVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdh
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzdm.zzg(zzdm.this, message);
                return true;
            }
        });
        this.zzi = z10;
    }
}
