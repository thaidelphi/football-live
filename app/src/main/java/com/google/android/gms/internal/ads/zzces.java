package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzces extends com.google.android.gms.ads.internal.client.zzdz {
    private final zzcal zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzed zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbgg zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzces(zzcal zzcalVar, float f10, boolean z10, boolean z11) {
        this.zza = zzcalVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    public static /* synthetic */ void zzd(zzces zzcesVar, int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        com.google.android.gms.ads.internal.client.zzed zzedVar2;
        com.google.android.gms.ads.internal.client.zzed zzedVar3;
        synchronized (zzcesVar.zzb) {
            boolean z14 = zzcesVar.zzg;
            boolean z15 = false;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i11 = 1;
                i12 = 1;
                z12 = true;
            }
            boolean z16 = i10 != i11;
            if (z16 && i12 == 1) {
                z13 = true;
                i12 = 1;
            } else {
                z13 = false;
            }
            boolean z17 = z16 && i12 == 2;
            boolean z18 = z16 && i12 == 3;
            if (z14 || z12) {
                z15 = true;
            }
            zzcesVar.zzg = z15;
            if (z12) {
                try {
                    com.google.android.gms.ads.internal.client.zzed zzedVar4 = zzcesVar.zzf;
                    if (zzedVar4 != null) {
                        zzedVar4.zzi();
                    }
                } catch (RemoteException e8) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                }
            }
            if (z13 && (zzedVar3 = zzcesVar.zzf) != null) {
                zzedVar3.zzh();
            }
            if (z17 && (zzedVar2 = zzcesVar.zzf) != null) {
                zzedVar2.zzg();
            }
            if (z18) {
                com.google.android.gms.ads.internal.client.zzed zzedVar5 = zzcesVar.zzf;
                if (zzedVar5 != null) {
                    zzedVar5.zze();
                }
                zzcesVar.zza.zzw();
            }
            if (z10 != z11 && (zzedVar = zzcesVar.zzf) != null) {
                zzedVar.zzf(z11);
            }
        }
    }

    private final void zzw(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
            @Override // java.lang.Runnable
            public final void run() {
                zzces.zzd(zzces.this, i10, i11, z10, z11);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
            @Override // java.lang.Runnable
            public final void run() {
                zzces.this.zza.zzd("pubVideoCmd", hashMap);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzed zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        synchronized (this.zzb) {
            zzedVar = this.zzf;
        }
        return zzedVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzj(boolean z10) {
        zzx(true != z10 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzm(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        synchronized (this.zzb) {
            this.zzf = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzo() {
        boolean z10;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    public final void zzr(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi && f12 == this.zzk) {
                z11 = false;
            }
            this.zzi = f11;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmG)).booleanValue()) {
                this.zzj = f10;
            }
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z11) {
            try {
                zzbgg zzbggVar = this.zzn;
                if (zzbggVar != null) {
                    zzbggVar.zze();
                }
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        Object obj = this.zzb;
        boolean z10 = zzfxVar.zza;
        boolean z11 = zzfxVar.zzb;
        boolean z12 = zzfxVar.zzc;
        synchronized (obj) {
            this.zzl = z11;
            this.zzm = z12;
        }
        zzx("initialState", CollectionUtils.c("muteStart", true != z10 ? "0" : "1", "customControlsRequested", true != z11 ? "0" : "1", "clickToExpandRequested", true != z12 ? "0" : "1"));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbgg zzbggVar) {
        synchronized (this.zzb) {
            this.zzn = zzbggVar;
        }
    }
}
