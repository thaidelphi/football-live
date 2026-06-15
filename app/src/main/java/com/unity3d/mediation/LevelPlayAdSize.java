package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.f3;
import com.ironsource.l1;
import com.ironsource.mediationsdk.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayAdSize {

    /* renamed from: f  reason: collision with root package name */
    private static final int f23766f = 320;

    /* renamed from: g  reason: collision with root package name */
    private static final int f23767g = 50;

    /* renamed from: h  reason: collision with root package name */
    private static final int f23768h = 320;

    /* renamed from: i  reason: collision with root package name */
    private static final int f23769i = 90;

    /* renamed from: k  reason: collision with root package name */
    private static final int f23771k = 250;

    /* renamed from: m  reason: collision with root package name */
    private static final int f23773m = 90;

    /* renamed from: a  reason: collision with root package name */
    private int f23774a;

    /* renamed from: b  reason: collision with root package name */
    private int f23775b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23776c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f23777d;

    /* renamed from: e  reason: collision with root package name */
    private final LevelPlayAdSize f23778e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, "BANNER", false, null, 16, null);

    /* renamed from: j  reason: collision with root package name */
    private static final int f23770j = 300;
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(f23770j, 250, l.f18876g, false, null, 16, null);

    /* renamed from: l  reason: collision with root package name */
    private static final int f23772l = 728;
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f23772l, 90, l.f18873d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, l.f18871b, false, null, 16, null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        public final LevelPlayAdSize createAdSize$mediationsdk_release(String adSize) {
            n.f(adSize, "adSize");
            int hashCode = adSize.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && adSize.equals("BANNER")) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(l.f18873d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(l.f18871b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(l.f18876g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            n.f(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            n.f(context, "context");
            return new f3(new l1()).a(context, num);
        }

        public final LevelPlayAdSize createCustomBanner(int i10, int i11) {
            return createCustomSize(i10, i11);
        }

        public final LevelPlayAdSize createCustomSize(int i10, int i11) {
            return new LevelPlayAdSize(i10, i11, l.f18875f, false, null, 16, null);
        }
    }

    public LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize) {
        this.f23774a = i10;
        this.f23775b = i11;
        this.f23776c = str;
        this.f23777d = z10;
        this.f23778e = levelPlayAdSize;
    }

    public /* synthetic */ LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize, int i12, h hVar) {
        this(i10, i11, (i12 & 4) != 0 ? null : str, z10, (i12 & 16) != 0 ? null : levelPlayAdSize);
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public static final LevelPlayAdSize createCustomBanner(int i10, int i11) {
        return Companion.createCustomBanner(i10, i11);
    }

    public static final LevelPlayAdSize createCustomSize(int i10, int i11) {
        return Companion.createCustomSize(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (n.a(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            n.d(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            return this.f23774a == levelPlayAdSize.f23774a && this.f23775b == levelPlayAdSize.f23775b && n.a(this.f23776c, levelPlayAdSize.f23776c);
        }
        return false;
    }

    public final String getDescription() {
        return String.valueOf(this.f23776c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f23778e;
    }

    public final int getHeight() {
        return this.f23775b;
    }

    public final int getWidth() {
        return this.f23774a;
    }

    public int hashCode() {
        int i10 = ((this.f23774a * 31) + this.f23775b) * 31;
        String str = this.f23776c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f23777d;
    }

    public String toString() {
        return this.f23776c + ' ' + this.f23774a + 'x' + this.f23775b;
    }
}
