package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c1.h;
import c1.i;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzfpe;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.ug;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcep extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcdq {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzces zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbem zzE;
    private zzbek zzF;
    private zzayy zzG;
    private int zzH;
    private int zzI;
    private zzbby zzJ;
    private final zzbby zzK;
    private zzbby zzL;
    private final zzbbz zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbak zzX;
    private boolean zzY;
    private final zzcfj zzb;
    private final zzauc zzc;
    private final zzfat zzd;
    private final zzbct zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzezu zzk;
    private zzezx zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcdy zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzebb zzq;
    private zzeaz zzr;
    private zzcfk zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcep(zzcfj zzcfjVar, zzcfk zzcfkVar, String str, boolean z10, boolean z11, zzauc zzaucVar, zzbct zzbctVar, VersionInfoParcel versionInfoParcel, zzbcb zzbcbVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbak zzbakVar, zzezu zzezuVar, zzezx zzezxVar, zzfat zzfatVar) {
        super(zzcfjVar);
        zzezx zzezxVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcfjVar;
        this.zzs = zzcfkVar;
        this.zzt = str;
        this.zzw = z10;
        this.zzc = zzaucVar;
        this.zzd = zzfatVar;
        this.zze = zzbctVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzv.zzq();
        DisplayMetrics zzu = com.google.android.gms.ads.internal.util.zzs.zzu(windowManager);
        this.zzi = zzu;
        this.zzj = zzu.density;
        this.zzX = zzbakVar;
        this.zzk = zzezuVar;
        this.zzl = zzezxVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzck(zzcfjVar.zza(), this, this, null);
        this.zzY = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzly)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to enable Javascript.", e8);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlx)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmZ)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzv.zzq().zzc(zzcfjVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzv.zzq();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfpe zzfpeVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaV)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcew(this, new zzcev(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbbz zzbbzVar = new zzbbz(new zzbcb(true, "make_wv", this.zzt));
        this.zzM = zzbbzVar;
        zzbbzVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue() && (zzezxVar2 = this.zzl) != null && zzezxVar2.zzb != null) {
            zzbbzVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbbzVar.zza();
        zzbby zzf = zzbcb.zzf();
        this.zzK = zzf;
        zzbbzVar.zzb("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcg.zza().zzb(zzcfjVar);
        com.google.android.gms.ads.internal.zzv.zzp().zzt();
    }

    private final synchronized void zzba() {
        zzezu zzezuVar = this.zzk;
        if (zzezuVar != null && zzezuVar.zzam) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzv.zzp().zzr();
    }

    private final synchronized void zzbc() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final void zzbd(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(ug.f20996k, true != z10 ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf(String str) {
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(AndroidWebViewClient.BLANK_PAGE) { // from class: com.google.android.gms.internal.ads.zzcek
                public final /* synthetic */ String zzb = AndroidWebViewClient.BLANK_PAGE;

                @Override // java.lang.Runnable
                public final void run() {
                    zzcep zzcepVar = zzcep.this;
                    String str2 = this.zzb;
                    super/*android.webkit.WebView*/.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbbt.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        Map map = this.zzV;
        if (map != null) {
            for (zzcbx zzcbxVar : map.values()) {
                zzcbxVar.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbi() {
        zzbbz zzbbzVar = this.zzM;
        if (zzbbzVar == null) {
            return;
        }
        zzbcb zza2 = zzbbzVar.zza();
        zzbbr zzg = com.google.android.gms.ads.internal.zzv.zzp().zzg();
        if (zzg != null) {
            zzg.zzf(zza2);
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl = com.google.android.gms.ads.internal.zzv.zzp().zzl();
        this.zzy = zzl;
        if (zzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcdq
    public final synchronized void destroy() {
        zzbi();
        this.zzQ.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.zzp.zzm();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzl();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzv) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
        zzbh();
        this.zzv = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkI)).booleanValue()) {
            Activity zza2 = this.zzb.zza();
            if (zza2 != null && zza2.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzbf(AndroidWebViewClient.BLANK_PAGE);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
        zzX();
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkJ)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            zzbyp.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcej
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.evaluateJavascript(str, valueCallback);
                }
            });
        } else {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzl();
                    com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
                    zzbh();
                    zzbb();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcdq
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
            return;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcdq
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaE()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcdq
    public final synchronized void loadUrl(final String str) {
        if (!zzaE()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcem
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.loadUrl(str);
                }
            });
            return;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcdy zzcdyVar = this.zzo;
        if (zzcdyVar != null) {
            zzcdyVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaE()) {
            this.zzQ.zzc();
        }
        if (this.zzY) {
            onResume();
            this.zzY = false;
        }
        boolean z10 = this.zzC;
        zzcdy zzcdyVar = this.zzo;
        if (zzcdyVar != null && zzcdyVar.zzU()) {
            if (!this.zzD) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = true;
            }
            zzaZ();
            z10 = true;
        }
        zzbd(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcdy zzcdyVar;
        synchronized (this) {
            if (!zzaE()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcdyVar = this.zzo) != null && zzcdyVar.zzU() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = false;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkX)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e8) {
            String str5 = "Couldn't find an Activity to view url/mimetype: " + str + " / " + str4;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze(str5);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !zzaZ) {
            return;
        }
        zzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:47:0x008a, B:41:0x007b, B:44:0x0080, B:50:0x0097, B:52:0x009f, B:54:0x00b1, B:57:0x00b6, B:59:0x00d2, B:61:0x00da, B:60:0x00d6, B:64:0x00df, B:66:0x00e7, B:69:0x00f2, B:78:0x0116, B:80:0x011d, B:85:0x0125, B:87:0x0137, B:89:0x0145, B:93:0x0152, B:96:0x0157, B:98:0x01a4, B:99:0x01a8, B:101:0x01af, B:106:0x01bc, B:108:0x01c2, B:109:0x01c5, B:111:0x01c9, B:112:0x01d2, B:115:0x01dd), top: B:121:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137 A[Catch: all -> 0x01e2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:47:0x008a, B:41:0x007b, B:44:0x0080, B:50:0x0097, B:52:0x009f, B:54:0x00b1, B:57:0x00b6, B:59:0x00d2, B:61:0x00da, B:60:0x00d6, B:64:0x00df, B:66:0x00e7, B:69:0x00f2, B:78:0x0116, B:80:0x011d, B:85:0x0125, B:87:0x0137, B:89:0x0145, B:93:0x0152, B:96:0x0157, B:98:0x01a4, B:99:0x01a8, B:101:0x01af, B:106:0x01bc, B:108:0x01c2, B:109:0x01c5, B:111:0x01c9, B:112:0x01d2, B:115:0x01dd), top: B:121:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157 A[Catch: all -> 0x01e2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:47:0x008a, B:41:0x007b, B:44:0x0080, B:50:0x0097, B:52:0x009f, B:54:0x00b1, B:57:0x00b6, B:59:0x00d2, B:61:0x00da, B:60:0x00d6, B:64:0x00df, B:66:0x00e7, B:69:0x00f2, B:78:0x0116, B:80:0x011d, B:85:0x0125, B:87:0x0137, B:89:0x0145, B:93:0x0152, B:96:0x0157, B:98:0x01a4, B:99:0x01a8, B:101:0x01af, B:106:0x01bc, B:108:0x01c2, B:109:0x01c5, B:111:0x01c9, B:112:0x01d2, B:115:0x01dd), top: B:121:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcep.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcdq
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmw)).booleanValue() && i.a("MUTE_AUDIO")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Muting webview");
                h.j(this, true);
            }
        } catch (Exception e8) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not pause webview.", e8);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmz)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcdq
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmw)).booleanValue() && i.a("MUTE_AUDIO")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Unmuting webview");
                h.j(this, false);
            }
        } catch (Exception e8) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not resume webview.", e8);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmz)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdE)).booleanValue() && this.zzo.zzR();
        if ((!this.zzo.zzU() || this.zzo.zzS()) && !z10) {
            zzauc zzaucVar = this.zzc;
            if (zzaucVar != null) {
                zzaucVar.zzd(motionEvent);
            }
            zzbct zzbctVar = this.zze;
            if (zzbctVar != null) {
                zzbctVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbem zzbemVar = this.zzE;
                if (zzbemVar != null) {
                    zzbemVar.zzd(motionEvent);
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcdq
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcdy) {
            this.zzo = (zzcdy) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not stop loading webview.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final synchronized void zzA(int i10) {
        this.zzN = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final synchronized void zzC(zzces zzcesVar) {
        if (this.zzB == null) {
            this.zzB = zzcesVar;
            return;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Attempt to create multiple AdWebViewVideoControllers.");
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcdh
    public final zzezu zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcff
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcfd
    public final zzauc zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized zzayy zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized zzbem zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final /* synthetic */ zzcfi zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcfc
    public final synchronized zzcfk zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized zzeaz zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized zzebb zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcet
    public final zzezx zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final zzfat zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final b6.a zzT() {
        zzbct zzbctVar = this.zze;
        return zzbctVar == null ? zzgap.zzh(null) : zzbctVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzW(zzezu zzezuVar, zzezx zzezxVar) {
        this.zzk = zzezuVar;
        this.zzl = zzezxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzceo(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzZ(int i10) {
        if (i10 == 0) {
            zzbbz zzbbzVar = this.zzM;
            zzbbt.zza(zzbbzVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zza(String str) {
        zzaW(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaA(String str, Predicate predicate) {
        zzcdy zzcdyVar = this.zzo;
        if (zzcdyVar != null) {
            zzcdyVar.zzQ(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaD(final boolean z10, final int i10) {
        destroy();
        this.zzX.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzcel
            @Override // com.google.android.gms.internal.ads.zzbaj
            public final void zza(zzbar.zzt.zza zzaVar) {
                int i11 = zzcep.zza;
                zzbar.zzbl.zza zzb = zzbar.zzbl.zzb();
                boolean zzf = zzb.zzf();
                boolean z11 = z10;
                if (zzf != z11) {
                    zzb.zzd(z11);
                }
                zzb.zze(i10);
                zzaVar.zzab(zzb.zzbr());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        this.zzo.zzv(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaK(String str, String str2, int i10) {
        this.zzo.zzw(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaL(boolean z10, int i10, boolean z11) {
        this.zzo.zzx(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaM(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzo.zzz(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzaN(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zzo.zzA(z10, i10, str, z11, z12);
    }

    public final zzcdy zzaO() {
        return this.zzo;
    }

    final synchronized Boolean zzaP() {
        return this.zzy;
    }

    protected final synchronized void zzaV(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, null);
            return;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaW(String str) {
        if (PlatformVersion.d()) {
            if (zzaP() == null) {
                zzbj();
            }
            if (zzaP().booleanValue()) {
                zzaV(str, null);
                return;
            } else {
                zzaX("javascript:".concat(str));
                return;
            }
        }
        zzaX("javascript:".concat(str));
    }

    protected final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
            return;
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzy(bool);
    }

    public final boolean zzaZ() {
        int i10;
        int i11;
        boolean z10 = false;
        if (this.zzo.zzT() || this.zzo.zzU()) {
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int zzw2 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i10 = zzw;
                i11 = zzw2;
            } else {
                com.google.android.gms.ads.internal.zzv.zzq();
                int[] zzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(zza2);
                com.google.android.gms.ads.internal.client.zzbb.zzb();
                int zzw3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[0]);
                com.google.android.gms.ads.internal.client.zzbb.zzb();
                i11 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[1]);
                i10 = zzw3;
            }
            int i12 = this.zzS;
            if (i12 != zzw || this.zzR != zzw2 || this.zzT != i10 || this.zzU != i11) {
                if (i12 != zzw || this.zzR != zzw2) {
                    z10 = true;
                }
                this.zzS = zzw;
                this.zzR = zzw2;
                this.zzT = i10;
                this.zzU = i11;
                new zzbrh(this, "").zzj(zzw, zzw2, i10, i11, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z10;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbbz zzbbzVar = this.zzM;
            zzbbt.zza(zzbbzVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbby zzf = zzbcb.zzf();
            this.zzJ = zzf;
            this.zzM.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzab() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zza()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(getContext())));
        zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzac(boolean z10) {
        this.zzo.zzm(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        if (!zzaE()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzab);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put(ServiceProvider.NAMED_SDK, "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to build MRAID_ENV", e8);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcfb.zzb(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbby zzf = zzbcb.zzf();
            this.zzL = zzf;
            this.zzM.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzag(String str, zzbio zzbioVar) {
        zzcdy zzcdyVar = this.zzo;
        if (zzcdyVar != null) {
            zzcdyVar.zzB(str, zzbioVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzah() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzaj(zzcfk zzcfkVar) {
        this.zzs = zzcfkVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzak(zzayy zzayyVar) {
        this.zzG = zzayyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzal(boolean z10) {
        this.zzz = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzao(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzT(), z10);
        } else {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzap(zzbek zzbekVar) {
        this.zzF = zzbekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzaq(boolean z10) {
        boolean z11 = this.zzw;
        this.zzw = z10;
        zzba();
        if (z10 != z11) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzac)).booleanValue() || !this.zzs.zzi()) {
                new zzbrh(this, "").zzl(true != z10 ? RewardedVideo.VIDEO_MODE_DEFAULT : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzar(zzbem zzbemVar) {
        this.zzE = zzbemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzas(zzeaz zzeazVar) {
        this.zzr = zzeazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzat(zzebb zzebbVar) {
        this.zzq = zzebbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzau(int i10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzav(boolean z10) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzax(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i10 = this.zzH + (true != z10 ? -1 : 1);
        this.zzH = i10;
        if (i10 > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final synchronized void zzay(boolean z10) {
        if (z10) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdq
    public final void zzaz(String str, zzbio zzbioVar) {
        zzcdy zzcdyVar = this.zzo;
        if (zzcdyVar != null) {
            zzcdyVar.zzP(str, zzbioVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzb(String str, String str2) {
        zzaW(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzbb.zzb().zzk(map));
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzdd() {
        zzcdy zzcdyVar = this.zzo;
        if (zzcdyVar != null) {
            zzcdyVar.zzdd();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzde() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzde();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdf() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzdg() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzdn(zzaxk zzaxkVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzaxkVar.zzj;
            this.zzC = z10;
        }
        zzbd(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(sb2));
        zzaW(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcal
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final zzbby zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final zzbbz zzl() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.internal.ads.zzcal
    public final VersionInfoParcel zzm() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final zzcaa zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final synchronized zzcbx zzo(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcbx) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzp(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final synchronized zzces zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final synchronized String zzr() {
        zzezx zzezxVar = this.zzl;
        if (zzezxVar != null) {
            return zzezxVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final synchronized String zzs() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcdq, com.google.android.gms.internal.ads.zzcal
    public final synchronized void zzt(String str, zzcbx zzcbxVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzcbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzu() {
        zzcdy zzcdyVar = this.zzo;
        if (zzcdyVar != null) {
            zzcdyVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzv(boolean z10, long j10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z10 ? "0" : "1");
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.toString(j10));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final synchronized void zzw() {
        zzbek zzbekVar = this.zzF;
        if (zzbekVar != null) {
            final zzdkv zzdkvVar = (zzdkv) zzbekVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkt
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdkv.this.zzd();
                    } catch (RemoteException e8) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzy(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcal
    public final void zzz(boolean z10) {
        this.zzo.zzE(false);
    }
}
