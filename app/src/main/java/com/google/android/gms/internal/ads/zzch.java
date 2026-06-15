package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzch implements zzcg {
    protected zzce zzb;
    protected zzce zzc;
    private zzce zzd;
    private zzce zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzch() {
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzce zzceVar = zzce.zza;
        this.zzd = zzceVar;
        this.zze = zzceVar;
        this.zzb = zzceVar;
        this.zzc = zzceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzce zza(zzce zzceVar) throws zzcf {
        this.zzd = zzceVar;
        this.zze = zzi(zzceVar);
        return zzg() ? this.zze : zzce.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzcg.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzc() {
        this.zzg = zzcg.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzf() {
        zzc();
        this.zzf = zzcg.zza;
        zzce zzceVar = zzce.zza;
        this.zzd = zzceVar;
        this.zze = zzceVar;
        this.zzb = zzceVar;
        this.zzc = zzceVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public boolean zzg() {
        return this.zze != zzce.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public boolean zzh() {
        return this.zzh && this.zzg == zzcg.zza;
    }

    protected zzce zzi(zzce zzceVar) throws zzcf {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer zzj(int i10) {
        if (this.zzf.capacity() < i10) {
            this.zzf = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
