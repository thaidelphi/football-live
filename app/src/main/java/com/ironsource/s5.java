package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.ng;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class s5 extends ng.a<ISDemandOnlyBannerListener> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceError f20077b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f20078c;

        a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f20076a = str;
            this.f20077b = ironSourceError;
            this.f20078c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5 s5Var = s5.this;
            String str = this.f20076a;
            s5Var.a(str, "onBannerAdLoadFailed() error = " + this.f20077b.getErrorMessage());
            this.f20078c.onBannerAdLoadFailed(this.f20076a, this.f20077b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f20081b;

        b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f20080a = str;
            this.f20081b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f20080a, "onBannerAdLoaded()");
            this.f20081b.onBannerAdLoaded(this.f20080a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f20084b;

        c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f20083a = str;
            this.f20084b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f20083a, "onBannerAdShown()");
            this.f20084b.onBannerAdShown(this.f20083a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f20087b;

        d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f20086a = str;
            this.f20087b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f20086a, "onBannerAdClicked()");
            this.f20087b.onBannerAdClicked(this.f20086a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20089a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f20090b;

        e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f20089a = str;
            this.f20090b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f20089a, "onBannerAdLeftApplication()");
            this.f20090b.onBannerAdLeftApplication(this.f20089a);
        }
    }

    public void a(String str) {
        ISDemandOnlyBannerListener a10 = a();
        a(new d(str, a10), a10 != null);
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener a10 = a();
        a(new a(str, ironSourceError, a10), a10 != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener a10 = a();
        a(new e(str, a10), a10 != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener a10 = a();
        a(new b(str, a10), a10 != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener a10 = a();
        a(new c(str, a10), a10 != null);
    }
}
