package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.ironsource.dp;
import com.ironsource.ug;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleApiAvailabilityLight {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public static final int f12020a = GooglePlayServicesUtilLight.f12026a;

    /* renamed from: b  reason: collision with root package name */
    private static final GoogleApiAvailabilityLight f12021b = new GoogleApiAvailabilityLight();

    @ShowFirstParty
    @KeepForSdk
    public static GoogleApiAvailabilityLight h() {
        return f12021b;
    }

    @KeepForSdk
    public void a(Context context) {
        GooglePlayServicesUtilLight.a(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int b(Context context) {
        return GooglePlayServicesUtilLight.c(context);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public Intent c(int i10) {
        return d(null, i10, null);
    }

    @ShowFirstParty
    @KeepForSdk
    public Intent d(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && DeviceProperties.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f12020a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(Wrappers.a(context).f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(ug.f21009x, "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage(dp.f17077b);
            intent3.addFlags(524288);
            return intent3;
        }
    }

    @KeepForSdk
    public PendingIntent e(Context context, int i10, int i11) {
        return f(context, i10, i11, null);
    }

    @ShowFirstParty
    @KeepForSdk
    public PendingIntent f(Context context, int i10, int i11, String str) {
        Intent d10 = d(context, i10, str);
        if (d10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, d10, com.google.android.gms.internal.common.zzd.zza | 134217728);
    }

    @KeepForSdk
    public String g(int i10) {
        return GooglePlayServicesUtilLight.d(i10);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @KeepForSdk
    public int i(Context context) {
        return j(context, f12020a);
    }

    @KeepForSdk
    public int j(Context context, int i10) {
        int h10 = GooglePlayServicesUtilLight.h(context, i10);
        if (GooglePlayServicesUtilLight.i(context, h10)) {
            return 18;
        }
        return h10;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean k(Context context, int i10) {
        return GooglePlayServicesUtilLight.i(context, i10);
    }

    @KeepForSdk
    public boolean l(Context context, String str) {
        return GooglePlayServicesUtilLight.m(context, str);
    }

    @KeepForSdk
    public boolean m(int i10) {
        return GooglePlayServicesUtilLight.k(i10);
    }

    @KeepForSdk
    public void n(Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.b(context, i10);
    }
}
