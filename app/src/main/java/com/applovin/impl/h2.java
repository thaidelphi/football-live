package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.p1;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h2 implements AppLovinInterstitialAdDialog {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f7084a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f7085b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f7086c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d  reason: collision with root package name */
    private volatile AppLovinAdLoadListener f7087d;

    /* renamed from: e  reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f7088e;

    /* renamed from: f  reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f7089f;

    /* renamed from: g  reason: collision with root package name */
    private volatile AppLovinAdClickListener f7090g;

    /* renamed from: h  reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f7091h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements AppLovinAdLoadListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            h2.this.b(appLovinAd);
            h2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            h2.this.b(i10);
        }
    }

    public h2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            this.f7084a = appLovinSdk.a();
            this.f7085b = new WeakReference(context);
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    private Context e() {
        return (Context) this.f7085b.get();
    }

    private long g() {
        String str = this.f7084a.f0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f7084a.a(o4.f8070a2)).longValue());
        }
        return 0L;
    }

    private void i() {
        if (this.f7084a.e().a() == null) {
            this.f7084a.C().c(v1.f9444r);
        }
    }

    public AppLovinAdDisplayListener c() {
        return this.f7088e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f7089f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f7091h;
    }

    public Map h() {
        return this.f7086c;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f7090g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f7088e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7087d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f7089f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str != null) {
            this.f7086c.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd a10 = d7.a(appLovinAd, this.f7084a);
        Context e8 = e();
        String a11 = a(a10, appLovinAd, e8);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAd, a11);
        } else {
            a((com.applovin.impl.sdk.ad.b) a10, e8);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    public AppLovinAdClickListener b() {
        return this.f7090g;
    }

    private void b(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f7084a.a0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f7084a.e().a() == null && ((Boolean) this.f7084a.a(o4.f8269z2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.n.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof f2) {
            l2.a(appLovinAdDisplayListener, str);
        } else {
            l2.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        if (viewGroup != null && iVar != null) {
            AppLovinAd a10 = d7.a(appLovinAd, this.f7084a);
            Context e8 = e();
            String a11 = a(a10, appLovinAd, e8);
            if (StringUtils.isValidString(a11)) {
                a(appLovinAd, a11);
                return;
            }
            AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(iVar, this, this.f7084a);
            iVar.a(appLovinFullscreenAdViewObserver);
            a((com.applovin.impl.sdk.ad.b) a10, viewGroup, appLovinFullscreenAdViewObserver, e8);
            return;
        }
        com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements p1.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f7094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f7095c;

        b(Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f7093a = context;
            this.f7094b = appLovinFullscreenAdViewObserver;
            this.f7095c = viewGroup;
        }

        @Override // com.applovin.impl.p1.d
        public void a(p1 p1Var) {
            if (d.a((Activity) this.f7093a)) {
                com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                h2.a(h2.this.f7091h, h2.this.f7088e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                return;
            }
            this.f7094b.setPresenter(p1Var);
            try {
                p1Var.a(this.f7095c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", str);
                h2.a(h2.this.f7091h, h2.this.f7088e, str, null, null);
            }
        }

        @Override // com.applovin.impl.p1.d
        public void a(String str, Throwable th) {
            h2.a(h2.this.f7091h, h2.this.f7088e, str, th, null);
        }
    }

    public void a() {
        this.f7090g = null;
        this.f7087d = null;
        this.f7089f = null;
        this.f7088e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7084a.j().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        } else if (appLovinAd == null) {
            com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        } else if (((AppLovinAdImpl) appLovinAd).hasShown() && ((Boolean) this.f7084a.a(o4.K1)).booleanValue()) {
            com.applovin.impl.sdk.n.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
            return "Attempting to show ad again";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.va
            @Override // java.lang.Runnable
            public final void run() {
                h2.this.a(appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.qa
            @Override // java.lang.Runnable
            public final void run() {
                h2.this.a(i10);
            }
        });
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final Context context) {
        i();
        this.f7084a.f().a(bVar);
        this.f7091h = bVar;
        final long g10 = g();
        this.f7084a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f7084a.I();
            I.a("InterstitialAdDialogWrapper", "Presenting ad with delay " + g10 + "ms...");
        }
        if (((Boolean) this.f7084a.a(o4.X0)).booleanValue()) {
            this.f7084a.g().a(this.f7091h);
        }
        a(bVar, context, new Runnable() { // from class: com.applovin.impl.sa
            @Override // java.lang.Runnable
            public final void run() {
                h2.this.a(context, g10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final Context context, long j10) {
        new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.ra
            @Override // java.lang.Runnable
            public final void run() {
                h2.this.a(context);
            }
        }, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        this.f7084a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f7084a.I().a("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
        }
        b(context);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final Context context) {
        i();
        this.f7084a.f().a(bVar);
        this.f7091h = bVar;
        final long g10 = g();
        this.f7084a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f7084a.I();
            I.a("InterstitialAdDialogWrapper", "Presenting ad with delay " + g10 + "ms...");
        }
        if (((Boolean) this.f7084a.a(o4.X0)).booleanValue()) {
            this.f7084a.g().a(this.f7091h);
        }
        a(bVar, context, new Runnable() { // from class: com.applovin.impl.ta
            @Override // java.lang.Runnable
            public final void run() {
                h2.this.a(context, viewGroup, appLovinFullscreenAdViewObserver, g10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final Context context, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j10) {
        new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.ua
            @Override // java.lang.Runnable
            public final void run() {
                h2.this.a(viewGroup, context, appLovinFullscreenAdViewObserver);
            }
        }, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f7084a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f7084a.I();
            I.a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        p1.a(this.f7091h, this.f7090g, this.f7088e, this.f7089f, this.f7086c, this.f7084a, (Activity) context, new b(context, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context, final Runnable runnable) {
        if (TextUtils.isEmpty(bVar.I()) && bVar.Z0() && !o0.a(context) && (context instanceof Activity)) {
            AlertDialog create = new AlertDialog.Builder(context).setTitle(bVar.P()).setMessage(bVar.O()).setPositiveButton(bVar.N(), (DialogInterface.OnClickListener) null).create();
            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.pa
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
            create.show();
            return;
        }
        runnable.run();
    }

    private void a(AppLovinAd appLovinAd, String str) {
        if (this.f7088e != null) {
            if (this.f7088e instanceof f2) {
                ((f2) this.f7088e).onAdDisplayFailed(str);
            } else {
                this.f7088e.adHidden(appLovinAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f7087d != null) {
            this.f7087d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (this.f7087d != null) {
            this.f7087d.failedToReceiveAd(i10);
        }
    }
}
