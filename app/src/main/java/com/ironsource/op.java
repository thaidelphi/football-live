package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.bg;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.BasePlacement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class op implements bg, bg.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19602a = "CappingManager.IS_DELIVERY_ENABLED";

    /* renamed from: b  reason: collision with root package name */
    private static final String f19603b = "CappingManager.IS_CAPPING_ENABLED";

    /* renamed from: c  reason: collision with root package name */
    private static final String f19604c = "CappingManager.IS_PACING_ENABLED";

    /* renamed from: d  reason: collision with root package name */
    private static final String f19605d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* renamed from: e  reason: collision with root package name */
    private static final String f19606e = "CappingManager.CAPPING_TYPE";

    /* renamed from: f  reason: collision with root package name */
    private static final String f19607f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* renamed from: g  reason: collision with root package name */
    private static final String f19608g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* renamed from: h  reason: collision with root package name */
    private static final String f19609h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* renamed from: i  reason: collision with root package name */
    private static final String f19610i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19611a;

        static {
            int[] iArr = new int[pp.values().length];
            f19611a = iArr;
            try {
                iArr[pp.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19611a[pp.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    private long a(pp ppVar) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i10 = a.f19611a[ppVar.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private String a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit == IronSource.AD_UNIT.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(Context context, String str, String str2) {
        int i10 = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f19604c, str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, a(str, f19610i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f19603b, str2), false)) {
            String a10 = a(str, f19608g, str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a10, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, a(str, f19606e, str2), pp.PER_DAY.toString());
                pp ppVar = null;
                pp[] values = pp.values();
                int length = values.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    pp ppVar2 = values[i10];
                    if (ppVar2.f19774a.equals(stringFromSharedPrefs)) {
                        ppVar = ppVar2;
                        break;
                    }
                    i10++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, a(str, f19609h, str2), a(ppVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a10, intFromSharedPrefs + 1);
        }
    }

    private void a(Context context, String str, String str2, lp lpVar) {
        boolean e8 = lpVar.e();
        IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f19602a, str2), e8);
        if (e8) {
            boolean d10 = lpVar.d();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f19603b, str2), d10);
            if (d10) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, f19605d, str2), lpVar.b());
                IronSourceUtils.saveStringToSharedPrefs(context, a(str, f19606e, str2), lpVar.a().toString());
            }
            boolean f10 = lpVar.f();
            IronSourceUtils.saveBooleanToSharedPrefs(context, a(str, f19604c, str2), f10);
            if (f10) {
                IronSourceUtils.saveIntToSharedPrefs(context, a(str, f19607f, str2), lpVar.c());
            }
        }
    }

    private b b(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f19602a, str2), true)) {
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f19604c, str2), false)) {
                if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, a(str, f19610i, str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, a(str, f19607f, str2), 0) * 1000) {
                    return b.CAPPED_PER_PACE;
                }
            }
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, a(str, f19603b, str2), false)) {
                int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a(str, f19605d, str2), 0);
                String a10 = a(str, f19608g, str2);
                int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a10, 0);
                String a11 = a(str, f19609h, str2);
                if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a11, 0L)) {
                    IronSourceUtils.saveIntToSharedPrefs(context, a10, 0);
                    IronSourceUtils.saveLongToSharedPrefs(context, a11, 0L);
                } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                    return b.CAPPED_PER_COUNT;
                }
            }
            return b.NOT_CAPPED;
        }
        return b.CAPPED_PER_DELIVERY;
    }

    @Override // com.ironsource.bg
    public synchronized b a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return b.NOT_CAPPED;
        } else if (basePlacement == null) {
            return b.NOT_CAPPED;
        } else {
            String a10 = a(ad_unit);
            if (basePlacement.getPlacementName() == null) {
                return b.NOT_CAPPED;
            } else if (basePlacement.getPlacementAvailabilitySettings() == null) {
                return b.NOT_CAPPED;
            } else {
                return b(context, a10, basePlacement.getPlacementName());
            }
        }
    }

    @Override // com.ironsource.bg.a
    public synchronized void a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(ad_unit), str);
    }

    @Override // com.ironsource.bg
    public synchronized boolean b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        return a(context, basePlacement, ad_unit) != b.NOT_CAPPED;
    }

    @Override // com.ironsource.bg.a
    public synchronized void c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null || basePlacement == null) {
            return;
        }
        lp placementAvailabilitySettings = basePlacement.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        a(context, a(ad_unit), basePlacement.getPlacementName(), placementAvailabilitySettings);
    }
}
