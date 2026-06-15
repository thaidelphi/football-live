package com.ironsource;

import com.ironsource.ls;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ti {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20843a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20843a = iArr;
        }
    }

    public final IronSourceError a(mr error) {
        kotlin.jvm.internal.n.f(error, "error");
        return (error.c() == 2070 || error.c() == 2110) ? wb.f21282a.b() : (error.c() == 2080 || error.c() == 2100) ? wb.f21282a.c() : error.c() == 2090 ? wb.f21282a.a() : new IronSourceError(510, error.d());
    }

    public final void a(long j10, ls.a responseOrigin) {
        kotlin.jvm.internal.n.f(responseOrigin, "responseOrigin");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("isMultipleAdObjects", 1);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j10);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.a());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        ar.i().a(new zb(IronSourceConstants.SDK_INIT_SUCCESS, mediationAdditionalData));
    }

    public final void a(mr error, long j10) {
        kotlin.jvm.internal.n.f(error, "error");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            mediationAdditionalData.put("reason", error.d());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j10);
            mediationAdditionalData.put("isMultipleAdObjects", 1);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        ar.i().a(new zb(IronSourceConstants.SDK_INIT_FAILED, mediationAdditionalData));
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        hg.a(hg.f17676a, runnable, 0L, 2, null);
    }

    public final IronSource.AD_UNIT[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        IronSource.AD_UNIT ad_unit;
        kotlin.jvm.internal.n.f(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (IronSourceAds.AdFormat adFormat : adFormats) {
            int i10 = a.f20843a[adFormat.ordinal()];
            if (i10 == 1) {
                ad_unit = IronSource.AD_UNIT.BANNER;
            } else if (i10 == 2) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            } else if (i10 == 3) {
                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            }
            arrayList.add(ad_unit);
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }

    public final void b(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        hg.f17676a.a(callback);
    }
}
