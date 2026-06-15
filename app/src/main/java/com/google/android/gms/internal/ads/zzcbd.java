package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcbd extends zzbzr implements TextureView.SurfaceTextureListener, zzcab {
    private final zzcal zzc;
    private final zzcam zzd;
    private final zzcak zze;
    private zzbzq zzf;
    private Surface zzg;
    private zzcac zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcaj zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcbd(Context context, zzcam zzcamVar, zzcal zzcalVar, boolean z10, boolean z11, zzcak zzcakVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcalVar;
        this.zzd = zzcamVar;
        this.zzn = z10;
        this.zze = zzcakVar;
        setSurfaceTextureListener(this);
        zzcamVar.zza(this);
    }

    public static /* synthetic */ void zzG(zzcbd zzcbdVar) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzi();
        }
    }

    public static /* synthetic */ void zzH(zzcbd zzcbdVar, int i10) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.onWindowVisibilityChanged(i10);
        }
    }

    public static /* synthetic */ void zzI(zzcbd zzcbdVar, String str) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public static /* synthetic */ void zzJ(zzcbd zzcbdVar) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zze();
        }
    }

    public static /* synthetic */ void zzK(zzcbd zzcbdVar) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zza();
        }
    }

    public static /* synthetic */ void zzL(zzcbd zzcbdVar) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzh();
        }
    }

    public static /* synthetic */ void zzM(zzcbd zzcbdVar) {
        float zza = zzcbdVar.zzb.zza();
        zzcac zzcacVar = zzcbdVar.zzh;
        if (zzcacVar != null) {
            try {
                zzcacVar.zzT(zza, false);
                return;
            } catch (IOException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("", e8);
                return;
            }
        }
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to set volume before player is initialized.");
    }

    public static /* synthetic */ void zzN(zzcbd zzcbdVar) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzd();
        }
    }

    public static /* synthetic */ void zzO(zzcbd zzcbdVar, int i10, int i11) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzj(i10, i11);
        }
    }

    public static /* synthetic */ void zzP(zzcbd zzcbdVar) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzf();
        }
    }

    public static /* synthetic */ void zzQ(zzcbd zzcbdVar, String str) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public static /* synthetic */ void zzS(zzcbd zzcbdVar) {
        zzbzq zzbzqVar = zzcbdVar.zzf;
        if (zzbzqVar != null) {
            zzbzqVar.zzg();
        }
    }

    private static String zzT(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzU() {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            zzcacVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbc
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzP(zzcbd.this);
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z10, Integer num) {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null && !z10) {
            zzcacVar.zzP(num);
        } else if (this.zzi == null || this.zzg == null) {
        } else {
            if (z10) {
                if (zzad()) {
                    zzcacVar.zzU();
                    zzY();
                } else {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcbx zzo = this.zzc.zzo(this.zzi);
                if (zzo instanceof zzccg) {
                    zzcac zza = ((zzccg) zzo).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzo instanceof zzccd) {
                    zzccd zzccdVar = (zzccd) zzo;
                    String zzF = zzF();
                    ByteBuffer zzl = zzccdVar.zzl();
                    boolean zzm = zzccdVar.zzm();
                    String zzk = zzccdVar.zzk();
                    if (zzk == null) {
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcac zzE = zzE(num);
                    this.zzh = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzk)}, zzF, zzl, zzm);
                } else {
                    String valueOf = String.valueOf(this.zzi);
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache miss: ".concat(valueOf));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i14 = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i14 >= strArr.length) {
                        break;
                    }
                    uriArr[i14] = Uri.parse(strArr[i14]);
                    i14++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            zzcacVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcac zzcacVar = this.zzh;
            if (zzcacVar != null) {
                zzcacVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z10) {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            try {
                zzcacVar.zzS(surface, z10);
                return;
            } catch (IOException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("", e8);
                return;
            }
        }
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcac zzcacVar = this.zzh;
        return (zzcacVar == null || !zzcacVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != 0.0f && this.zzm == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcaj zzcajVar = this.zzm;
        if (zzcajVar != null) {
            zzcajVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzn) {
            zzcaj zzcajVar = new zzcaj(getContext());
            this.zzm = zzcajVar;
            zzcajVar.zzd(surfaceTexture, i10, i11);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq != 0 && this.zzr != 0) {
            zzaa();
        } else {
            zzab(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaz
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzL(zzcbd.this);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcaj zzcajVar = this.zzm;
        if (zzcajVar != null) {
            zzcajVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcav
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzG(zzcbd.this);
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzcaj zzcajVar = this.zzm;
        if (zzcajVar != null) {
            zzcajVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcau
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzO(zzcbd.this, i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i10);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcat
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzH(zzcbd.this, i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzA(int i10) {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            zzcacVar.zzN(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzB(int i10) {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            zzcacVar.zzR(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzC(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        boolean z10 = true;
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        if (!this.zze.zzk || str2 == null || str.equals(str2) || this.zzl != 4) {
            z10 = false;
        }
        this.zzi = str;
        zzW(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzD(int i10, int i11) {
        this.zzq = i10;
        this.zzr = i11;
        zzaa();
    }

    final zzcac zzE(Integer num) {
        zzcak zzcakVar = this.zze;
        zzcal zzcalVar = this.zzc;
        zzccy zzccyVar = new zzccy(zzcalVar.getContext(), zzcakVar, zzcalVar, num);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("ExoPlayerAdapter initialized.");
        return zzccyVar;
    }

    final String zzF() {
        zzcal zzcalVar = this.zzc;
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(zzcalVar.getContext(), zzcalVar.zzm().afmaVersion);
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zzb() {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            return zzcacVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final long zzf() {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            return zzcacVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final long zzg() {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            return zzcacVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final long zzh() {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            return zzcacVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzi(final boolean z10, final long j10) {
        if (this.zzc != null) {
            zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbd.this.zzc.zzv(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(zzT);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj(concat);
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcba
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzI(zzcbd.this, zzT);
            }
        });
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(zzT);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj(concat);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcax
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzQ(zzcbd.this, zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzm(int i10) {
        if (this.zzl != i10) {
            this.zzl = i10;
            if (i10 == 3) {
                zzV();
            } else if (i10 != 4) {
            } else {
                if (this.zze.zza) {
                    zzX();
                }
                this.zzd.zze();
                this.zzb.zzc();
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbd.zzK(zzcbd.this);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr, com.google.android.gms.internal.ads.zzcao
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcas
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzM(zzcbd.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcay
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbd.zzN(zzcbd.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcar
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzJ(zzcbd.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzq(int i10) {
        if (zzac()) {
            this.zzh.zzI(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzr(zzbzq zzbzqVar) {
        this.zzf = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzs(String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzu(float f10, float f11) {
        zzcaj zzcajVar = this.zzm;
        if (zzcajVar != null) {
            zzcajVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaq
            @Override // java.lang.Runnable
            public final void run() {
                zzcbd.zzS(zzcbd.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final Integer zzw() {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            return zzcacVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzx(int i10) {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            zzcacVar.zzJ(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzy(int i10) {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            zzcacVar.zzK(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzz(int i10) {
        zzcac zzcacVar = this.zzh;
        if (zzcacVar != null) {
            zzcacVar.zzM(i10);
        }
    }
}
