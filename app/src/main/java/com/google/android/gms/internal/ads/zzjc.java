package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzjc implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaax, zzoy, zzwg, zzsw, zzhg, zzhd {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjc(zzjg zzjgVar, zzjf zzjfVar) {
        this.zza = zzjgVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjg.zzM(this.zza, surfaceTexture);
        zzjg.zzL(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjg.zzN(this.zza, null);
        zzjg.zzL(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjg.zzL(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        zzjg.zzL(this.zza, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzjg.zzL(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zza(Exception exc) {
        zzjg.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzb(String str, long j10, long j11) {
        zzjg.zzF(this.zza).zzw(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzc(String str) {
        zzjg.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzd(zzhj zzhjVar) {
        zzjg.zzF(this.zza).zzy(zzhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zze(zzhj zzhjVar) {
        zzjg.zzF(this.zza).zzz(zzhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzf(zzz zzzVar, zzhk zzhkVar) {
        zzjg.zzF(this.zza).zzA(zzzVar, zzhkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzg(long j10) {
        zzjg.zzF(this.zza).zzB(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzh(Exception exc) {
        zzjg.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzi(zzoz zzozVar) {
        zzjg.zzF(this.zza).zzD(zzozVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzj(zzoz zzozVar) {
        zzjg.zzF(this.zza).zzE(zzozVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzk(int i10, long j10, long j11) {
        zzjg.zzF(this.zza).zzF(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzl(int i10, long j10) {
        zzjg.zzF(this.zza).zzG(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzm(Object obj, long j10) {
        zzjg.zzF(this.zza).zzH(obj, j10);
        zzjg zzjgVar = this.zza;
        if (zzjg.zzG(zzjgVar) == obj) {
            zzdm zzD = zzjg.zzD(zzjgVar);
            zzD.zzd(26, new zzdj() { // from class: com.google.android.gms.internal.ads.zzjb
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj2) {
                    zzbe zzbeVar = (zzbe) obj2;
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzn(final boolean z10) {
        zzjg zzjgVar = this.zza;
        if (zzjg.zzO(zzjgVar) == z10) {
            return;
        }
        zzjg.zzK(zzjgVar, z10);
        zzdm zzD = zzjg.zzD(this.zza);
        zzD.zzd(23, new zzdj() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzbe) obj).zzn(z10);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzo(Exception exc) {
        zzjg.zzF(this.zza).zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzp(String str, long j10, long j11) {
        zzjg.zzF(this.zza).zzK(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzq(String str) {
        zzjg.zzF(this.zza).zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzr(zzhj zzhjVar) {
        zzjg.zzF(this.zza).zzM(zzhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzs(zzhj zzhjVar) {
        zzjg.zzF(this.zza).zzN(zzhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzt(long j10, int i10) {
        zzjg.zzF(this.zza).zzO(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzu(zzz zzzVar, zzhk zzhkVar) {
        zzjg.zzF(this.zza).zzP(zzzVar, zzhkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final void zzv(final zzcc zzccVar) {
        zzdm zzD = zzjg.zzD(this.zza);
        zzD.zzd(25, new zzdj() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzbe) obj).zzr(zzcc.this);
            }
        });
        zzD.zzc();
    }
}
