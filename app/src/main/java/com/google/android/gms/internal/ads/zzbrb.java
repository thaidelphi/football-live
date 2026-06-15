package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.b9;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbrb extends zzbrh {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcdq zzj;
    private final Activity zzk;
    private zzcfk zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbri zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.f(b9.e.f16597c, b9.e.f16596b, "top-center", "center", b9.e.f16599e, b9.e.f16598d, "bottom-center");
    }

    public zzbrb(zzcdq zzcdqVar, zzbri zzbriVar) {
        super(zzcdqVar, "resize");
        this.zza = b9.e.f16596b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcdqVar;
        this.zzk = zzcdqVar.zzi();
        this.zzo = zzbriVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkL)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkM)).booleanValue()) {
            ViewParent parent = ((View) this.zzj).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.zzj);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkN)).booleanValue()) {
                try {
                    this.zzr.addView((View) this.zzj);
                    this.zzj.zzaj(this.zzl);
                } catch (IllegalStateException e8) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to add webview back to view hierarchy.", e8);
                }
            } else {
                this.zzr.addView((View) this.zzj);
                this.zzj.zzaj(this.zzl);
            }
        }
        if (z10) {
            zzl(RewardedVideo.VIDEO_MODE_DEFAULT);
            zzbri zzbriVar = this.zzo;
            if (zzbriVar != null) {
                zzbriVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(final boolean z10) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkK)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    zzbyp.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbrb.this.zzm(z10);
                        }
                    });
                } else {
                    zzm(z10);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0264 A[Catch: all -> 0x0483, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00fb, B:51:0x0103, B:55:0x0129, B:61:0x0135, B:129:0x0264, B:130:0x0269, B:132:0x026b, B:134:0x028b, B:136:0x028f, B:138:0x029c, B:140:0x02d8, B:172:0x0391, B:179:0x03c0, B:180:0x03d8, B:181:0x03f9, B:183:0x0401, B:184:0x0408, B:185:0x042f, B:188:0x0432, B:190:0x0457, B:191:0x046c, B:173:0x0398, B:174:0x039f, B:175:0x03a6, B:176:0x03ad, B:177:0x03b3, B:178:0x03ba, B:139:0x02d5, B:193:0x046e, B:194:0x0473, B:62:0x013e, B:64:0x0142, B:92:0x0195, B:100:0x01e5, B:102:0x01f0, B:104:0x01f3, B:106:0x01f6, B:108:0x01fa, B:111:0x0200, B:93:0x01a0, B:95:0x01b6, B:97:0x01c1, B:94:0x01ab, B:96:0x01b9, B:98:0x01c6, B:99:0x01da, B:101:0x01e8, B:112:0x0211, B:118:0x023b, B:124:0x024b, B:121:0x0241, B:123:0x0249, B:115:0x0233, B:117:0x0239, B:125:0x0252, B:126:0x025a, B:196:0x0475, B:197:0x047a, B:199:0x047c, B:200:0x0481), top: B:205:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026b A[Catch: all -> 0x0483, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00ef, B:46:0x00f3, B:48:0x00fb, B:51:0x0103, B:55:0x0129, B:61:0x0135, B:129:0x0264, B:130:0x0269, B:132:0x026b, B:134:0x028b, B:136:0x028f, B:138:0x029c, B:140:0x02d8, B:172:0x0391, B:179:0x03c0, B:180:0x03d8, B:181:0x03f9, B:183:0x0401, B:184:0x0408, B:185:0x042f, B:188:0x0432, B:190:0x0457, B:191:0x046c, B:173:0x0398, B:174:0x039f, B:175:0x03a6, B:176:0x03ad, B:177:0x03b3, B:178:0x03ba, B:139:0x02d5, B:193:0x046e, B:194:0x0473, B:62:0x013e, B:64:0x0142, B:92:0x0195, B:100:0x01e5, B:102:0x01f0, B:104:0x01f3, B:106:0x01f6, B:108:0x01fa, B:111:0x0200, B:93:0x01a0, B:95:0x01b6, B:97:0x01c1, B:94:0x01ab, B:96:0x01b9, B:98:0x01c6, B:99:0x01da, B:101:0x01e8, B:112:0x0211, B:118:0x023b, B:124:0x024b, B:121:0x0241, B:123:0x0249, B:115:0x0233, B:117:0x0239, B:125:0x0252, B:126:0x025a, B:196:0x0475, B:197:0x047a, B:199:0x047c, B:200:0x0481), top: B:205:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrb.zzc(java.util.Map):void");
    }

    public final void zzd(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean zzf() {
        boolean z10;
        synchronized (this.zzi) {
            z10 = this.zzp != null;
        }
        return z10;
    }
}
