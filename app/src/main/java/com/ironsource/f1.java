package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    private final IronSource.AD_UNIT f17350a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f17351b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17352c;

    /* renamed from: d  reason: collision with root package name */
    private Placement f17353d;

    /* renamed from: e  reason: collision with root package name */
    private final eu f17354e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17355a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17355a = iArr;
        }
    }

    public f1(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId, Placement placement, eu euVar) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        this.f17350a = adFormat;
        this.f17351b = adId;
        this.f17352c = adUnitId;
        this.f17353d = placement;
        this.f17354e = euVar;
    }

    public /* synthetic */ f1(IronSource.AD_UNIT ad_unit, UUID uuid, String str, Placement placement, eu euVar, int i10, kotlin.jvm.internal.h hVar) {
        this(ad_unit, uuid, str, (i10 & 8) != 0 ? null : placement, (i10 & 16) != 0 ? null : euVar);
    }

    public final IronSource.AD_UNIT a() {
        return this.f17350a;
    }

    public final void a(Placement placement) {
        this.f17353d = placement;
    }

    public final UUID b() {
        return this.f17351b;
    }

    public final String c() {
        return this.f17352c;
    }

    public final LevelPlay.AdFormat d() {
        int i10 = a.f17355a[this.f17350a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return LevelPlay.AdFormat.NATIVE_AD;
                    }
                    throw new i8.l();
                }
                return LevelPlay.AdFormat.BANNER;
            }
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        return LevelPlay.AdFormat.REWARDED;
    }

    public final Placement e() {
        return this.f17353d;
    }

    public final eu f() {
        return this.f17354e;
    }
}
