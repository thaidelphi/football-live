package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.s7;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class vt {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<IronSource.AD_UNIT, q1> f21188a = new HashMap();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21189a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f21190b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f21190b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21190b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21190b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21190b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.AD_UNIT.values().length];
            f21189a = iArr2;
            try {
                iArr2[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21189a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21189a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21189a[IronSource.AD_UNIT.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final IronSource.AD_UNIT f21191a;

        public b(IronSource.AD_UNIT ad_unit) {
            this.f21191a = ad_unit;
        }

        private String b() {
            IronSource.AD_UNIT ad_unit = this.f21191a;
            return ad_unit != null ? ad_unit.name() : "";
        }

        public String a() {
            return a(null);
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a(String str, String str2) {
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " - " + str2;
            }
            sb.append(str3);
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(str)) {
                return sb2;
            }
            return sb2 + " - " + str;
        }
    }

    public static IronSourceSegment a() {
        return com.ironsource.mediationsdk.p.m().t();
    }

    private static q1 a(w1 w1Var) {
        Map<IronSource.AD_UNIT, q1> map = f21188a;
        if (map.containsKey(w1Var.b().a())) {
            return map.get(w1Var.b().a());
        }
        q1 q1Var = new q1();
        map.put(w1Var.b().a(), q1Var);
        return q1Var;
    }

    public static s2 a(w1 w1Var, int i10) {
        return a(w1Var).a(w1Var.b().c(), w1Var.m(), i10);
    }

    public static b a(IronSource.AD_UNIT ad_unit) {
        return new b(ad_unit);
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f21190b[adFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : "nativeAd" : "banner" : "interstitial" : "rewarded";
    }

    public static void a(int i10, JSONObject jSONObject) {
        ar.i().a(new zb(i10, mk.a(IronSourceUtils.getMediationAdditionalData(false), jSONObject)));
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        a((int) IronSourceConstants.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        a((int) IronSourceConstants.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null && (adapterBaseInterface instanceof AdapterSettingsInterface) && ((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            ironLog.verbose(str + " - is using activity before impression and activity is null");
            return true;
        }
        return false;
    }

    public static int b(IronSource.AD_UNIT ad_unit) {
        int i10 = a.f21189a[ad_unit.ordinal()];
        return (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? s7.e.NOT_SUPPORTED : s7.e.BANNER : s7.e.NATIVE_AD : s7.e.INTERSTITIAL : s7.e.REWARDED_VIDEO).a();
    }
}
