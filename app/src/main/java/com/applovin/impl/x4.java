package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x4 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b  reason: collision with root package name */
    private final String f9579b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f9580c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f9578a = true;

    /* renamed from: d  reason: collision with root package name */
    private final Set f9581d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    private final Object f9582e = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public x4(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f9579b = str;
        this.f9580c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f9580c.get();
    }

    public String b() {
        return this.f9579b;
    }

    public boolean c() {
        return this.f9578a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x4) {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f9580c.get();
            x4 x4Var = (x4) obj;
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) x4Var.f9580c.get();
            if (b().equals(x4Var.b())) {
                if (appLovinCommunicatorSubscriber != null) {
                    if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                        return true;
                    }
                } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f9579b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f9580c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if (a() == null) {
            com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        boolean z10 = false;
        synchronized (this.f9582e) {
            if (!this.f9581d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f9581d.add(communicatorMessageImpl.getUniqueId());
                z10 = true;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f9578a = z10;
    }
}
