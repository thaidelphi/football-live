package com.unity3d.mediation;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import i8.l;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23788a = new a();

    /* renamed from: com.unity3d.mediation.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class C0256a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23789a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23789a = iArr;
        }
    }

    private a() {
    }

    public static final IronSource.AD_UNIT a(LevelPlay.AdFormat adFormat) {
        n.f(adFormat, "<this>");
        int i10 = C0256a.f23789a[adFormat.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return IronSource.AD_UNIT.NATIVE_AD;
                    }
                    throw new l();
                }
                return IronSource.AD_UNIT.REWARDED_VIDEO;
            }
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        return IronSource.AD_UNIT.BANNER;
    }
}
