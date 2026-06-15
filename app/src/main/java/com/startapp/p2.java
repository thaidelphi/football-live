package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f22373a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.remoteconfig.a f22374b;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Boolean f22375a;

        public a(Boolean bool) {
            this.f22375a = bool;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p2.this.f22374b.a(this.f22375a);
        }
    }

    public p2(com.startapp.sdk.adsbase.remoteconfig.a aVar, com.startapp.sdk.components.a aVar2) {
        this.f22374b = aVar;
        this.f22373a = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22373a.f23248x.a().execute(new a(this.f22374b.a()));
    }
}
