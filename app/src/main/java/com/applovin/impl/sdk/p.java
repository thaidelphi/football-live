package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f9132a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private final Object f9133b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9133b) {
            if (b() <= 25) {
                this.f9132a.offer(appLovinAdImpl);
            } else {
                n.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        int size;
        synchronized (this.f9133b) {
            size = this.f9132a.size();
        }
        return size;
    }

    boolean c() {
        boolean z10;
        synchronized (this.f9133b) {
            z10 = b() == 0;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f9133b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f9132a.peek();
        }
        return appLovinAdImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f9133b) {
            this.f9132a.remove(appLovinAdImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f9133b) {
            appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f9132a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
