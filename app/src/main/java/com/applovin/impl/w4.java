package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w4 {

    /* renamed from: a  reason: collision with root package name */
    private final Set f9513a = new HashSet(32);

    /* renamed from: b  reason: collision with root package name */
    private final Object f9514b = new Object();

    public boolean a(String str) {
        synchronized (this.f9514b) {
            for (x4 x4Var : this.f9513a) {
                if (str.equals(x4Var.b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        x4 a10;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f9514b) {
                a10 = a(str, appLovinCommunicatorSubscriber);
            }
            if (a10 != null) {
                a10.a(false);
                AppLovinBroadcastManager.unregisterReceiver(a10);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f9514b) {
                x4 a10 = a(str, appLovinCommunicatorSubscriber);
                if (a10 != null) {
                    com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!a10.c()) {
                        a10.a(true);
                        AppLovinBroadcastManager.registerReceiver(a10, new IntentFilter(str));
                    }
                    return true;
                }
                x4 x4Var = new x4(str, appLovinCommunicatorSubscriber);
                this.f9513a.add(x4Var);
                AppLovinBroadcastManager.registerReceiver(x4Var, new IntentFilter(str));
                return true;
            }
        }
        com.applovin.impl.sdk.n.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private x4 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (x4 x4Var : this.f9513a) {
            if (str.equals(x4Var.b()) && appLovinCommunicatorSubscriber.equals(x4Var.a())) {
                return x4Var;
            }
        }
        return null;
    }
}
