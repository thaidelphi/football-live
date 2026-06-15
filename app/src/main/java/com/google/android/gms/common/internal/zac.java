package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zac {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.collection.h<String, String> f12577a = new androidx.collection.h<>();

    /* renamed from: b  reason: collision with root package name */
    private static Locale f12578b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.f11927g);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(R.string.f11921a);
            }
            return resources.getString(R.string.f11930j);
        }
        return resources.getString(R.string.f11924d);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 == 2) {
                return DeviceProperties.g(context) ? resources.getString(R.string.f11934n) : resources.getString(R.string.f11931k, a10);
            } else if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            if (i10 != 20) {
                                switch (i10) {
                                    case 16:
                                        return h(context, "common_google_play_services_api_unavailable_text", a10);
                                    case 17:
                                        return h(context, "common_google_play_services_sign_in_failed_text", a10);
                                    case 18:
                                        return resources.getString(R.string.f11933m, a10);
                                    default:
                                        return resources.getString(com.google.android.gms.common.R.string.f12034a, a10);
                                }
                            }
                            return h(context, "common_google_play_services_restricted_profile_text", a10);
                        }
                        return resources.getString(R.string.f11929i, a10);
                    }
                    return h(context, "common_google_play_services_network_error_text", a10);
                }
                return h(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                return resources.getString(R.string.f11922b, a10);
            }
        }
        return resources.getString(R.string.f11925e, a10);
    }

    public static String e(Context context, int i10) {
        if (i10 != 6 && i10 != 19) {
            return d(context, i10);
        }
        return h(context, "common_google_play_services_resolution_required_text", a(context));
    }

    public static String f(Context context, int i10) {
        String g10;
        if (i10 == 6) {
            g10 = i(context, "common_google_play_services_resolution_required_title");
        } else {
            g10 = g(context, i10);
        }
        return g10 == null ? context.getResources().getString(R.string.f11928h) : g10;
    }

    public static String g(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.f11926f);
            case 2:
                return resources.getString(R.string.f11932l);
            case 3:
                return resources.getString(R.string.f11923c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i10);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(com.google.android.gms.common.R.string.f12034a);
        }
        return String.format(resources.getConfiguration().locale, i10, str2);
    }

    private static String i(Context context, String str) {
        String str2;
        String str3;
        androidx.collection.h<String, String> hVar = f12577a;
        synchronized (hVar) {
            Locale c10 = androidx.core.os.f.a(context.getResources().getConfiguration()).c(0);
            if (!c10.equals(f12578b)) {
                hVar.clear();
                f12578b = c10;
            }
            String str4 = hVar.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources f10 = GooglePlayServicesUtil.f(context);
            if (f10 == null) {
                return null;
            }
            int identifier = f10.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = f10.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                hVar.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                str2 = "Got empty resource: ".concat(str);
            } else {
                str2 = new String("Got empty resource: ");
            }
            Log.w("GoogleApiAvailability", str2);
            return null;
        }
    }
}
