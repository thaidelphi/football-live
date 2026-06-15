package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.ul;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f23755a;

        AdFormat(String str) {
            this.f23755a = str;
        }

        public final String getValue() {
            return this.f23755a;
        }
    }

    private LevelPlay() {
    }

    public static final void init(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener listener) {
        n.f(context, "context");
        n.f(initRequest, "initRequest");
        n.f(listener, "listener");
        ul.f21036a.a(context, initRequest, listener);
    }
}
