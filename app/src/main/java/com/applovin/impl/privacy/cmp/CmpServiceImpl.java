package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.d7;
import com.applovin.impl.h0;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.d {

    /* renamed from: a  reason: collision with root package name */
    private final j f8386a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f8387b;

    /* renamed from: f  reason: collision with root package name */
    private AppLovinCmpError f8391f;

    /* renamed from: g  reason: collision with root package name */
    private e f8392g;

    /* renamed from: h  reason: collision with root package name */
    private f f8393h;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8389d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private d f8390e = d.NONE;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f8388c = b();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f8394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f8395b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0129a implements f {
            C0129a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f8394a.onCompleted(appLovinCmpError);
            }
        }

        a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f8394a = onCompletedListener;
            this.f8395b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f8394a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f8395b, new C0129a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f8398a;

        b(Activity activity) {
            this.f8398a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f8388c.b(this.f8398a, CmpServiceImpl.this.f8387b, CmpServiceImpl.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f8400a;

        c(Activity activity) {
            this.f8400a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f8388c.a(this.f8400a, CmpServiceImpl.this.f8387b, CmpServiceImpl.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(j jVar) {
        this.f8386a = jVar;
        this.f8387b = new h0(jVar.u().d());
    }

    private void c() {
        if (hasSupportedCmp()) {
            this.f8388c.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f8388c != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        a();
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        a();
        synchronized (this.f8389d) {
            if (this.f8392g == null) {
                this.f8390e = d.COMPLETED;
                this.f8391f = cmpErrorImpl;
                return;
            }
            this.f8390e = d.NONE;
            a(cmpErrorImpl);
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f8389d) {
            if (this.f8392g == null) {
                this.f8390e = d.COMPLETED;
                return;
            }
            this.f8390e = d.NONE;
            a((AppLovinCmpError) null);
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        a();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f8393h = fVar;
        if (this.f8388c.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f8386a.I();
        if (n.a()) {
            n I = this.f8386a.I();
            I.a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        c();
        loadCmp(activity, new a(onCompletedListener, activity));
    }

    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f8392g;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f8392g = null;
        this.f8391f = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f8393h;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f8393h = null;
    }

    private com.applovin.impl.privacy.cmp.a b() {
        if (d7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f8386a);
        }
        if (this.f8386a.u().j()) {
            n.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
            return null;
        }
        return null;
    }

    private void a(Activity activity, e eVar) {
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        boolean z10 = false;
        synchronized (this.f8389d) {
            if (eVar != null) {
                this.f8392g = eVar;
            }
            d dVar = this.f8390e;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f8390e = d.LOADING;
            } else if (dVar == d.LOADING) {
                return;
            } else {
                this.f8390e = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f8391f);
                return;
            }
            c cVar = new c(activity);
            if (this.f8388c.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    private void a() {
        com.applovin.impl.privacy.cmp.a aVar = this.f8388c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
