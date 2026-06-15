package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.uj;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f23709a;

        AdFormat(String str) {
            this.f23709a = str;
        }

        public final String getValue() {
            return this.f23709a;
        }
    }

    private IronSourceAds() {
    }

    public static final void init(Context context, InitRequest initRequest, InitListener initializationListener) {
        n.f(context, "context");
        n.f(initRequest, "initRequest");
        n.f(initializationListener, "initializationListener");
        uj.f21030a.a(context, initRequest, initializationListener);
    }
}
