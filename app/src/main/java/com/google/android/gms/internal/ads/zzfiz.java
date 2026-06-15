package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfiz extends zzfiv {
    private final zzfix zza;
    private zzflh zzc;
    private zzfkg zzd;
    private final String zzg;
    private final zzfju zzb = new zzfju();
    private boolean zze = false;
    private boolean zzf = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfiz(zzfiw zzfiwVar, zzfix zzfixVar, String str) {
        this.zza = zzfixVar;
        this.zzg = str;
        zzk(null);
        if (zzfixVar.zzd() != zzfiy.HTML && zzfixVar.zzd() != zzfiy.JAVASCRIPT) {
            this.zzd = new zzfkk(str, zzfixVar.zzi(), null);
        } else {
            this.zzd = new zzfkh(str, zzfixVar.zza());
        }
        this.zzd.zzo();
        zzfjq.zza().zzd(this);
        this.zzd.zzf(zzfiwVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzflh(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzb(View view, zzfjc zzfjcVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfjcVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzfjq.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zzd(View view) {
        if (this.zzf || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzb();
        Collection<zzfiz> zzc = zzfjq.zza().zzc();
        if (zzc == null || zzc.isEmpty()) {
            return;
        }
        for (zzfiz zzfizVar : zzc) {
            if (zzfizVar != this && zzfizVar.zzf() == view) {
                zzfizVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final void zze() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfjq.zza().zzf(this);
        this.zzd.zzl(zzfjy.zzb().zza());
        this.zzd.zzg(zzfjo.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfkg zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
