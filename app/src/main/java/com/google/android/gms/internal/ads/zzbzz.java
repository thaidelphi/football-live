package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.xn;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbzz extends FrameLayout implements zzbzq {
    final zzcan zza;
    private final zzcal zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcb zze;
    private final long zzf;
    private final zzbzr zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzbzz(Context context, zzcal zzcalVar, int i10, boolean z10, zzbcb zzbcbVar, zzcak zzcakVar) {
        super(context);
        zzbzr zzbzpVar;
        this.zzb = zzcalVar;
        this.zze = zzbcbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.m(zzcalVar.zzj());
        zzbzs zzbzsVar = zzcalVar.zzj().zza;
        zzcam zzcamVar = new zzcam(context, zzcalVar.zzm(), zzcalVar.zzs(), zzbcbVar, zzcalVar.zzk());
        if (i10 == 3) {
            zzbzpVar = new zzcdf(context, zzcamVar);
        } else if (i10 == 2) {
            zzbzpVar = new zzcbd(context, zzcamVar, zzcalVar, z10, zzbzs.zza(zzcalVar), zzcakVar);
        } else {
            zzbzpVar = new zzbzp(context, zzcalVar, z10, zzbzs.zza(zzcalVar), zzcakVar, new zzcam(context, zzcalVar.zzm(), zzcalVar.zzs(), zzbcbVar, zzcalVar.zzk()));
        }
        this.zzg = zzbzpVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzbzpVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzS)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzP)).booleanValue()) {
            zzp();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzU)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzR)).booleanValue();
        this.zzk = booleanValue;
        if (zzbcbVar != null) {
            zzbcbVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcan(this);
        zzbzpVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzbzr zzbzrVar = this.zzg;
            if (zzbzrVar != null) {
                zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzr.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzv
            @Override // java.lang.Runnable
            public final void run() {
                zzbzz.this.zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbzq
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzbzy(this, z10));
    }

    public final void zzA(int i10) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzz(i10);
    }

    public final void zzB(int i10) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzA(i10);
    }

    public final void zzC(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzS)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzB(i10);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f10) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzb.zze(f10);
        zzbzrVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar != null) {
            zzbzrVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzb.zzd(false);
        zzbzrVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzca)).booleanValue()) {
            this.zza.zza();
        }
        zzK(b9.h.f16651g0, new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzb(String str, String str2) {
        zzK(xn.a.f21422g, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzca)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z10 = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzf() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar != null && this.zzm == 0) {
            zzbzr zzbzrVar2 = this.zzg;
            zzK("canplaythrough", IronSourceConstants.EVENTS_DURATION, String.valueOf(zzbzrVar.zzc() / 1000.0f), "videoWidth", String.valueOf(zzbzrVar2.zze()), "videoHeight", String.valueOf(zzbzrVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzu
            @Override // java.lang.Runnable
            public final void run() {
                zzbzz.this.zzK("firstFrameRendered", new String[0]);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzbzw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzbzx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbbd zzbbdVar = zzbbm.zzT;
            int max = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long b10 = com.google.android.gms.ads.internal.zzv.zzC().b();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long b11 = com.google.android.gms.ads.internal.zzv.zzC().b() - b10;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + b11 + "ms");
        }
        if (b11 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbcb zzbcbVar = this.zze;
            if (zzbcbVar != null) {
                zzbcbVar.zzd("spinner_jank", Long.toString(b11));
            }
        }
    }

    public final Integer zzl() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar != null) {
            return zzbzrVar.zzw();
        }
        return null;
    }

    public final void zzp() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        TextView textView = new TextView(zzbzrVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        textView.setText(String.valueOf(zze == null ? "AdMob - " : zze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzq() {
        this.zza.zza();
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar != null) {
            zzbzrVar.zzt();
        }
        zzJ();
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzC(this.zzn, this.zzo, num);
        } else {
            zzK("no_src", new String[0]);
        }
    }

    public final void zzs() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzb.zzd(true);
        zzbzrVar.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        long zza = zzbzrVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f10 = ((float) zza) / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzo();
    }

    public final void zzv() {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzp();
    }

    public final void zzw(int i10) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzq(i10);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i10) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzbzr zzbzrVar = this.zzg;
        if (zzbzrVar == null) {
            return;
        }
        zzbzrVar.zzy(i10);
    }
}
