package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.ng;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class lg extends ng.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18192b;

        a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18191a = str;
            this.f18192b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            lg.this.a(this.f18191a, "onInterstitialAdReady()");
            this.f18192b.onInterstitialAdReady(this.f18191a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18194a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceError f18195b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18196c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18194a = str;
            this.f18195b = ironSourceError;
            this.f18196c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            lg lgVar = lg.this;
            String str = this.f18194a;
            lgVar.a(str, "onInterstitialAdLoadFailed() error = " + this.f18195b.getErrorMessage());
            this.f18196c.onInterstitialAdLoadFailed(this.f18194a, this.f18195b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18198a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18199b;

        c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18198a = str;
            this.f18199b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            lg.this.a(this.f18198a, "onInterstitialAdOpened()");
            this.f18199b.onInterstitialAdOpened(this.f18198a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceError f18202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18203c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18201a = str;
            this.f18202b = ironSourceError;
            this.f18203c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            lg lgVar = lg.this;
            String str = this.f18201a;
            lgVar.a(str, "onInterstitialAdShowFailed() error = " + this.f18202b.getErrorMessage());
            this.f18203c.onInterstitialAdShowFailed(this.f18201a, this.f18202b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18205a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18206b;

        e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18205a = str;
            this.f18206b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            lg.this.a(this.f18205a, "onInterstitialAdClicked()");
            this.f18206b.onInterstitialAdClicked(this.f18205a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f18209b;

        f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f18208a = str;
            this.f18209b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            lg.this.a(this.f18208a, "onInterstitialAdClosed()");
            this.f18209b.onInterstitialAdClosed(this.f18208a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public lg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public lg(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener a10 = a();
        a(new e(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener a10 = a();
        a(new f(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a10 = a();
        a(new b(str, ironSourceError, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener a10 = a();
        a(new c(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener a10 = a();
        a(new a(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a10 = a();
        a(new d(str, ironSourceError, a10), a10 != null);
    }
}
