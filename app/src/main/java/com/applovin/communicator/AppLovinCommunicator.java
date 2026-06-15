package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.w4;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: e  reason: collision with root package name */
    private static AppLovinCommunicator f6447e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f6448f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private j f6449a;

    /* renamed from: b  reason: collision with root package name */
    private n f6450b;

    /* renamed from: c  reason: collision with root package name */
    private final w4 f6451c = new w4();

    /* renamed from: d  reason: collision with root package name */
    private final MessagingServiceImpl f6452d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f6448f) {
            if (f6447e == null) {
                f6447e = new AppLovinCommunicator();
            }
        }
        return f6447e;
    }

    public void a(j jVar) {
        this.f6449a = jVar;
        this.f6450b = jVar.I();
        a("Attached SDK instance: " + jVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f6452d;
    }

    public boolean hasSubscriber(String str) {
        return this.f6451c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f6449a.q().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f6449a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f6451c.a(appLovinCommunicatorSubscriber, str)) {
                this.f6452d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f6451c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f6450b == null || !n.a()) {
            return;
        }
        this.f6450b.a("AppLovinCommunicator", str);
    }
}
