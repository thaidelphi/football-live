package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.ng;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class og extends ng.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f19552b;

        a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f19551a = str;
            this.f19552b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            og.this.a(this.f19551a, "onRewardedVideoAdLoadSuccess()");
            this.f19552b.onRewardedVideoAdLoadSuccess(this.f19551a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19554a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceError f19555b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f19556c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f19554a = str;
            this.f19555b = ironSourceError;
            this.f19556c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            og ogVar = og.this;
            String str = this.f19554a;
            ogVar.a(str, "onRewardedVideoAdLoadFailed() error = " + this.f19555b.getErrorMessage());
            this.f19556c.onRewardedVideoAdLoadFailed(this.f19554a, this.f19555b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f19559b;

        c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f19558a = str;
            this.f19559b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            og.this.a(this.f19558a, "onRewardedVideoAdOpened()");
            this.f19559b.onRewardedVideoAdOpened(this.f19558a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceError f19562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f19563c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f19561a = str;
            this.f19562b = ironSourceError;
            this.f19563c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            og ogVar = og.this;
            String str = this.f19561a;
            ogVar.a(str, "onRewardedVideoAdShowFailed() error = " + this.f19562b.getErrorMessage());
            this.f19563c.onRewardedVideoAdShowFailed(this.f19561a, this.f19562b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f19566b;

        e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f19565a = str;
            this.f19566b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            og.this.a(this.f19565a, "onRewardedVideoAdClicked()");
            this.f19566b.onRewardedVideoAdClicked(this.f19565a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f19569b;

        f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f19568a = str;
            this.f19569b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            og.this.a(this.f19568a, "onRewardedVideoAdRewarded()");
            this.f19569b.onRewardedVideoAdRewarded(this.f19568a);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19571a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f19572b;

        g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f19571a = str;
            this.f19572b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            og.this.a(this.f19571a, "onRewardedVideoAdClosed()");
            this.f19572b.onRewardedVideoAdClosed(this.f19571a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public og() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public og(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener a10 = a();
        a(new e(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener a10 = a();
        a(new g(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener a10 = a();
        a(new b(str, ironSourceError, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener a10 = a();
        a(new a(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener a10 = a();
        a(new c(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener a10 = a();
        a(new f(str, a10), a10 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener a10 = a();
        a(new d(str, ironSourceError, a10), a10 != null);
    }
}
