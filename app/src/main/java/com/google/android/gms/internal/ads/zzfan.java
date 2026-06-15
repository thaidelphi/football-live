package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfan {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfx zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzben zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcl zzl;
    private zzbky zzn;
    private zzeis zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcp zzu;
    private int zzm = 1;
    private final zzfaa zzo = new zzfaa();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public final zzfan zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfan zzB(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzfan zzC(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzfan zzD(zzben zzbenVar) {
        this.zzh = zzbenVar;
        return this;
    }

    public final zzfan zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfan zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfan zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzb();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfan zzH(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final zzfan zzI(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        this.zzd = zzfxVar;
        return this;
    }

    public final zzfap zzJ() {
        Preconditions.n(this.zzc, "ad unit must not be null");
        Preconditions.n(this.zzb, "ad size must not be null");
        Preconditions.n(this.zza, "ad request must not be null");
        return new zzfap(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfan zzV(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zzu = zzcpVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzh() {
        return this.zzb;
    }

    public final zzfaa zzp() {
        return this.zzo;
    }

    public final zzfan zzq(zzfap zzfapVar) {
        this.zzo.zza(zzfapVar.zzo.zza);
        this.zza = zzfapVar.zzd;
        this.zzb = zzfapVar.zze;
        this.zzu = zzfapVar.zzt;
        this.zzc = zzfapVar.zzf;
        this.zzd = zzfapVar.zza;
        this.zzf = zzfapVar.zzg;
        this.zzg = zzfapVar.zzh;
        this.zzh = zzfapVar.zzi;
        this.zzi = zzfapVar.zzj;
        zzr(zzfapVar.zzl);
        zzG(zzfapVar.zzm);
        this.zzp = zzfapVar.zzp;
        this.zzq = zzfapVar.zzq;
        this.zzr = zzfapVar.zzc;
        this.zzs = zzfapVar.zzr;
        this.zzt = zzfapVar.zzs;
        return this;
    }

    public final zzfan zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfan zzs(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfan zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfan zzu(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfan zzv(zzeis zzeisVar) {
        this.zzr = zzeisVar;
        return this;
    }

    public final zzfan zzw(zzbky zzbkyVar) {
        this.zzn = zzbkyVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfx(false, true, false);
        return this;
    }

    public final zzfan zzx(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzfan zzy(boolean z10) {
        this.zzq = z10;
        return this;
    }

    public final zzfan zzz(boolean z10) {
        this.zzs = true;
        return this;
    }
}
