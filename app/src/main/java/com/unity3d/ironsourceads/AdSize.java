package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f23699a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23700b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23701c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final AdSize banner() {
            return new AdSize(320, 50, "BANNER", null);
        }

        public final AdSize large() {
            return new AdSize(320, 90, l.f18871b, null);
        }

        public final AdSize leaderboard() {
            return new AdSize(728, 90, l.f18873d, null);
        }

        public final AdSize mediumRectangle() {
            return new AdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, l.f18876g, null);
        }
    }

    private AdSize(int i10, int i11, String str) {
        this.f23699a = i10;
        this.f23700b = i11;
        this.f23701c = str;
    }

    public /* synthetic */ AdSize(int i10, int i11, String str, h hVar) {
        this(i10, i11, str);
    }

    public static final AdSize banner() {
        return Companion.banner();
    }

    public static final AdSize large() {
        return Companion.large();
    }

    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f23700b;
    }

    public final String getSizeDescription() {
        return this.f23701c;
    }

    public final int getWidth() {
        return this.f23699a;
    }
}
