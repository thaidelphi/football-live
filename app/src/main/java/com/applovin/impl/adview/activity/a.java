package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.h2;
import com.applovin.impl.p1;
import com.applovin.impl.q;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v5;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final j f6582a;

    /* renamed from: b  reason: collision with root package name */
    private final n f6583b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f6584c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f6585d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private Messenger f6586e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.adview.activity.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0121a implements AppLovinAdLoadListener {
        C0121a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f6584c.get();
            if (appLovinFullscreenActivity != null) {
                n unused = a.this.f6583b;
                if (n.a()) {
                    a.this.f6583b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, null);
                p1.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, a.this.f6582a, appLovinFullscreenActivity, new C0122a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            n unused2 = a.this.f6583b;
            if (n.a()) {
                n nVar = a.this.f6583b;
                nVar.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a.this.a();
        }

        /* renamed from: com.applovin.impl.adview.activity.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0122a implements p1.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f6588a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppLovinAd f6589b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f6590c;

            C0122a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f6588a = appLovinFullscreenActivity;
                this.f6589b = appLovinAd;
                this.f6590c = bVar;
            }

            @Override // com.applovin.impl.p1.d
            public void a(p1 p1Var) {
                this.f6588a.setPresenter(p1Var);
                p1Var.v();
            }

            @Override // com.applovin.impl.p1.d
            public void a(String str, Throwable th) {
                h2.a((com.applovin.impl.sdk.ad.b) this.f6589b, this.f6590c, str, th, this.f6588a);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) {
            a(null, cVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        /* synthetic */ b(a aVar, C0121a c0121a) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) {
            Message obtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.this.f6586e.send(obtain);
            } catch (RemoteException e8) {
                n unused = a.this.f6583b;
                if (n.a()) {
                    n nVar = a.this.f6583b;
                    nVar.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e8);
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f6593a;

        /* synthetic */ c(a aVar, C0121a c0121a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what == FullscreenAdService.c.AD.b() && (aVar = (a) this.f6593a.get()) != null) {
                aVar.a(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            } else {
                super.handleMessage(message);
            }
        }

        private c(a aVar) {
            this.f6593a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, j jVar) {
        this.f6582a = jVar;
        this.f6583b = jVar.I();
        this.f6584c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f6585d.compareAndSet(false, true)) {
            if (n.a()) {
                n nVar = this.f6583b;
                nVar.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f6586e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            obtain.replyTo = new Messenger(new c(this, null));
            try {
                if (n.a()) {
                    this.f6583b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f6586e.send(obtain);
            } catch (RemoteException e8) {
                if (n.a()) {
                    this.f6583b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e8);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f6585d.compareAndSet(true, false) && n.a()) {
            n nVar = this.f6583b;
            nVar.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f6584c.get();
        if (appLovinFullscreenActivity != null) {
            if (n.a()) {
                this.f6583b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (n.a()) {
            this.f6583b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, "zone_id", "");
            if (!TextUtils.isEmpty(string)) {
                this.f6582a.i0().a(new v5(jSONObject, q.a(string), true, new C0121a(), this.f6582a));
                return;
            }
            throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
        } catch (JSONException e8) {
            if (n.a()) {
                n nVar = this.f6583b;
                nVar.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e8);
            }
            a();
        }
    }
}
