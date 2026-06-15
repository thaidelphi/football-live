package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbrh;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzdqe;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzeag;
import com.google.android.gms.internal.ads.zzeah;
import com.google.android.gms.internal.ads.zzeaz;
import com.google.android.gms.internal.ads.zzebb;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzftm;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class zzm extends zzbsc implements zzag {

    /* renamed from: w  reason: collision with root package name */
    static final int f11327w = Color.argb(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    protected final Activity f11328a;

    /* renamed from: b  reason: collision with root package name */
    AdOverlayInfoParcel f11329b;

    /* renamed from: c  reason: collision with root package name */
    zzcdq f11330c;

    /* renamed from: d  reason: collision with root package name */
    zzi f11331d;

    /* renamed from: e  reason: collision with root package name */
    zzu f11332e;

    /* renamed from: g  reason: collision with root package name */
    FrameLayout f11334g;

    /* renamed from: h  reason: collision with root package name */
    WebChromeClient.CustomViewCallback f11335h;

    /* renamed from: k  reason: collision with root package name */
    zzh f11338k;

    /* renamed from: o  reason: collision with root package name */
    private Runnable f11342o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11343p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11344q;

    /* renamed from: u  reason: collision with root package name */
    private Toolbar f11348u;

    /* renamed from: f  reason: collision with root package name */
    boolean f11333f = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f11336i = false;

    /* renamed from: j  reason: collision with root package name */
    boolean f11337j = false;

    /* renamed from: l  reason: collision with root package name */
    boolean f11339l = false;

    /* renamed from: v  reason: collision with root package name */
    int f11349v = 1;

    /* renamed from: m  reason: collision with root package name */
    private final Object f11340m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private final View.OnClickListener f11341n = new zzf(this);

    /* renamed from: r  reason: collision with root package name */
    private boolean f11345r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11346s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11347t = true;

    public zzm(Activity activity) {
        this.f11328a = activity;
    }

    private final void t0(View view) {
        zzebb zzQ;
        zzeaz zzP;
        zzcdq zzcdqVar = this.f11330c;
        if (zzcdqVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && (zzP = zzcdqVar.zzP()) != null) {
            zzP.zza(view);
        } else if (((Boolean) zzbd.zzc().zzb(zzbbm.zzfi)).booleanValue() && (zzQ = zzcdqVar.zzQ()) != null && zzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzQ.zza(), view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzaQ)).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzaP)).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u0(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f11329b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzl r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.f11328a
            com.google.android.gms.ads.internal.util.zzaa r4 = com.google.android.gms.ads.internal.zzv.zzr()
            boolean r6 = r4.zzd(r3, r6)
            boolean r3 = r5.f11337j
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzaQ
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbbd r6 = com.google.android.gms.internal.ads.zzbbm.zzaP
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r0.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = r2
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f11329b
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzl r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.f11328a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzbn
            com.google.android.gms.internal.ads.zzbbk r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.u0(android.content.res.Configuration):void");
    }

    private static final void v0(zzebb zzebbVar, View view) {
        if (zzebbVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzfi)).booleanValue() && zzebbVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzebbVar.zza(), view);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void Z(boolean r27) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.Z(boolean):void");
    }

    public final void zzA(int i10) {
        if (this.f11328a.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzb(zzbbm.zzfR)).intValue()) {
            if (this.f11328a.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzb(zzbbm.zzfS)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzbd.zzc().zzb(zzbbm.zzfT)).intValue()) {
                    if (i11 <= ((Integer) zzbd.zzc().zzb(zzbbm.zzfU)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f11328a.setRequestedOrientation(i10);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z10) {
        if (z10) {
            this.f11338k.setBackgroundColor(0);
        } else {
            this.f11338k.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f11328a);
        this.f11334g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f11334g.addView(view, -1, -1);
        this.f11328a.setContentView(this.f11334g);
        this.f11344q = true;
        this.f11335h = customViewCallback;
        this.f11333f = true;
    }

    public final void zzE() {
        synchronized (this.f11340m) {
            this.f11343p = true;
            Runnable runnable = this.f11342o;
            if (runnable != null) {
                zzfpe zzfpeVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfpeVar.removeCallbacks(runnable);
                zzfpeVar.post(this.f11342o);
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.f11328a.isFinishing() || this.f11345r) {
            return;
        }
        this.f11345r = true;
        zzcdq zzcdqVar = this.f11330c;
        if (zzcdqVar != null) {
            zzcdqVar.zzZ(this.f11349v - 1);
            synchronized (this.f11340m) {
                if (!this.f11343p && this.f11330c.zzaC()) {
                    if (((Boolean) zzbd.zzc().zzb(zzbbm.zzeU)).booleanValue() && !this.f11346s && (adOverlayInfoParcel = this.f11329b) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzdo();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzm.this.zzc();
                        }
                    };
                    this.f11342o = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbd.zzc().zzb(zzbbm.zzbg)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.f11348u;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final boolean zzH() {
        this.f11349v = 1;
        if (this.f11330c == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && this.f11330c.canGoBack()) {
            this.f11330c.goBack();
            return false;
        }
        boolean zzaH = this.f11330c.zzaH();
        if (!zzaH) {
            this.f11330c.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaH;
    }

    public final void zzb() {
        this.f11349v = 3;
        this.f11328a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11329b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.f11328a.overridePendingTransition(0, 0);
        zzcdq zzcdqVar = this.f11330c;
        if (zzcdqVar != null) {
            zzcdqVar.zzai(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        zzcdq zzcdqVar;
        zzr zzrVar;
        if (this.f11346s) {
            return;
        }
        this.f11346s = true;
        zzcdq zzcdqVar2 = this.f11330c;
        if (zzcdqVar2 != null) {
            this.f11338k.removeView(zzcdqVar2.zzF());
            zzi zziVar = this.f11331d;
            if (zziVar != null) {
                this.f11330c.zzan(zziVar.zzd);
                this.f11330c.zzaq(false);
                if (((Boolean) zzbd.zzc().zzb(zzbbm.zzmB)).booleanValue() && this.f11330c.getParent() != null) {
                    ((ViewGroup) this.f11330c.getParent()).removeView(this.f11330c.zzF());
                }
                ViewGroup viewGroup = this.f11331d.zzc;
                View zzF = this.f11330c.zzF();
                zzi zziVar2 = this.f11331d;
                viewGroup.addView(zzF, zziVar2.zza, zziVar2.zzb);
                this.f11331d = null;
            } else if (this.f11328a.getApplicationContext() != null) {
                this.f11330c.zzan(this.f11328a.getApplicationContext());
            }
            this.f11330c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11329b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzds(this.f11349v);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f11329b;
        if (adOverlayInfoParcel2 == null || (zzcdqVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        v0(zzcdqVar.zzQ(), this.f11329b.zzd.zzF());
    }

    public final void zzd() {
        this.f11338k.f11325b = true;
    }

    protected final void zze() {
        this.f11330c.zzaa();
    }

    public final void zzf(zzeah zzeahVar) throws zzg, RemoteException {
        zzbrw zzbrwVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11329b;
        if (adOverlayInfoParcel != null && (zzbrwVar = adOverlayInfoParcel.zzv) != null) {
            zzbrwVar.zzg(ObjectWrapper.u0(zzeahVar));
            return;
        }
        throw new zzg("noioou");
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11329b;
        if (adOverlayInfoParcel != null && this.f11333f) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.f11334g != null) {
            this.f11328a.setContentView(this.f11338k);
            this.f11344q = true;
            this.f11334g.removeAllViews();
            this.f11334g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f11335h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f11335h = null;
        }
        this.f11333f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzh(int i10, int i11, Intent intent) {
        zzdqf zze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            zzbbd zzbbdVar = zzbbm.zzmW;
            if (((Boolean) zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Callback from intent launch with requestCode: 236 and resultCode: " + i11);
                zzcdq zzcdqVar = this.f11330c;
                if (zzcdqVar == null || zzcdqVar.zzN() == null || (zze = zzcdqVar.zzN().zze()) == null || (adOverlayInfoParcel = this.f11329b) == null || !((Boolean) zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                    return;
                }
                zzdqe zza = zze.zza();
                zza.zzb("action", "hilca");
                zza.zzb("gqi", zzftm.zzc(adOverlayInfoParcel.zzq));
                StringBuilder sb = new StringBuilder();
                sb.append(i11);
                zza.zzb("hilr", sb.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zza.zzb("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zza.zzb("hills", stringExtra2);
                    }
                }
                zza.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzi() {
        this.f11349v = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
        this.f11349v = 2;
        this.f11328a.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzk(IObjectWrapper iObjectWrapper) {
        u0((Configuration) ObjectWrapper.t0(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[Catch: zzg -> 0x0116, TryCatch #0 {zzg -> 0x0116, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0039, B:20:0x0044, B:22:0x004f, B:23:0x0051, B:25:0x0059, B:26:0x0067, B:28:0x006e, B:34:0x007b, B:36:0x007f, B:38:0x0084, B:41:0x0092, B:43:0x0096, B:45:0x009c, B:46:0x009f, B:48:0x00a5, B:49:0x00a8, B:51:0x00ae, B:53:0x00b2, B:54:0x00b5, B:56:0x00bb, B:57:0x00be, B:64:0x00ed, B:66:0x00f1, B:67:0x00f8, B:68:0x00f9, B:70:0x00fd, B:72:0x010a, B:31:0x0075, B:33:0x0079, B:39:0x008e, B:74:0x010e, B:75:0x0115), top: B:79:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a A[Catch: zzg -> 0x0116, TryCatch #0 {zzg -> 0x0116, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0039, B:20:0x0044, B:22:0x004f, B:23:0x0051, B:25:0x0059, B:26:0x0067, B:28:0x006e, B:34:0x007b, B:36:0x007f, B:38:0x0084, B:41:0x0092, B:43:0x0096, B:45:0x009c, B:46:0x009f, B:48:0x00a5, B:49:0x00a8, B:51:0x00ae, B:53:0x00b2, B:54:0x00b5, B:56:0x00bb, B:57:0x00be, B:64:0x00ed, B:66:0x00f1, B:67:0x00f8, B:68:0x00f9, B:70:0x00fd, B:72:0x010a, B:31:0x0075, B:33:0x0079, B:39:0x008e, B:74:0x010e, B:75:0x0115), top: B:79:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbsd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzm() {
        zzcdq zzcdqVar = this.f11330c;
        if (zzcdqVar != null) {
            try {
                this.f11338k.removeView(zzcdqVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f11339l) {
            this.f11339l = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzo() {
        zzr zzrVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11329b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdi();
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbbm.zzeW)).booleanValue() && this.f11330c != null && (!this.f11328a.isFinishing() || this.f11331d == null)) {
            this.f11330c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.f11328a;
            zzeag zze = zzeah.zze();
            zze.zza(activity);
            zze.zzb(this.f11329b.zzk == 5 ? this : null);
            try {
                this.f11329b.zzv.zzf(strArr, iArr, ObjectWrapper.u0(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzr() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11329b;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdE();
        }
        u0(this.f11328a.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzeW)).booleanValue()) {
            return;
        }
        zzcdq zzcdqVar = this.f11330c;
        if (zzcdqVar != null && !zzcdqVar.zzaE()) {
            this.f11330c.onResume();
            return;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f11336i);
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzt() {
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzeW)).booleanValue()) {
            zzcdq zzcdqVar = this.f11330c;
            if (zzcdqVar != null && !zzcdqVar.zzaE()) {
                this.f11330c.onResume();
                return;
            }
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzu() {
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzeW)).booleanValue() && this.f11330c != null && (!this.f11328a.isFinishing() || this.f11331d == null)) {
            this.f11330c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzv() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f11329b;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdr();
    }

    public final void zzw(boolean z10) {
        if (this.f11329b.zzw) {
            return;
        }
        int intValue = ((Integer) zzbd.zzc().zzb(zzbbm.zzeZ)).intValue();
        boolean z11 = ((Boolean) zzbd.zzc().zzb(zzbbm.zzbj)).booleanValue() || z10;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z11 ? 0 : intValue;
        zztVar.zzb = true != z11 ? intValue : 0;
        zztVar.zzc = intValue;
        this.f11332e = new zzu(this.f11328a, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        zzy(z10, this.f11329b.zzg);
        this.f11338k.addView(this.f11332e, layoutParams);
        t0(this.f11332e);
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzx() {
        this.f11344q = true;
    }

    public final void zzy(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) zzbd.zzc().zzb(zzbbm.zzbh)).booleanValue() && (adOverlayInfoParcel2 = this.f11329b) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z14 = ((Boolean) zzbd.zzc().zzb(zzbbm.zzbi)).booleanValue() && (adOverlayInfoParcel = this.f11329b) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z10 && z11 && z13 && !z14) {
            new zzbrh(this.f11330c, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.f11332e;
        if (zzuVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzuVar.zzb(z12);
        }
    }

    public final void zzz() {
        this.f11338k.removeView(this.f11332e);
        zzw(true);
    }
}
