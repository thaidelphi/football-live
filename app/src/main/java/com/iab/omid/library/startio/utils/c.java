package com.iab.omid.library.startio.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.startio.adsession.OutputDeviceStatus;
import com.iab.omid.library.startio.walking.a;
import com.ironsource.b9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static WindowManager f16023a;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f16024b = {"x", "y", "width", "height"};

    /* renamed from: c  reason: collision with root package name */
    static float f16025c = Resources.getSystem().getDisplayMetrics().density;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16026a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f16026a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final float f16027a;

        /* renamed from: b  reason: collision with root package name */
        final float f16028b;

        public b(float f10, float f11) {
            this.f16027a = f10;
            this.f16028b = f11;
        }
    }

    public static float a(int i10) {
        return i10 / f16025c;
    }

    private static b a(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            if (f16023a != null) {
                Point point = new Point(0, 0);
                f16023a.getDefaultDisplay().getRealSize(point);
                f11 = a(point.x);
                f10 = a(point.y);
            }
            f10 = 0.0f;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f12 = 0.0f;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f11 = Math.max(f11, (float) (optDouble + optDouble3));
                        f12 = Math.max(f12, (float) (optDouble2 + optDouble4));
                    }
                }
                f10 = f12;
            }
            f10 = 0.0f;
        }
        return new b(f11, f10);
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put("width", a(i12));
            jSONObject.put("height", a(i13));
        } catch (JSONException e8) {
            d.a("Error with creating viewStateObject", e8);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            f16025c = context.getResources().getDisplayMetrics().density;
            f16023a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e8) {
            d.a("Error with setting output device status", e8);
        }
    }

    public static void a(JSONObject jSONObject, a.C0212a c0212a) {
        com.iab.omid.library.startio.internal.e a10 = c0212a.a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c0212a.b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a10.d());
            jSONObject.put("friendlyObstructionPurpose", a10.b());
            jSONObject.put("friendlyObstructionReason", a10.a());
        } catch (JSONException e8) {
            d.a("Error with setting friendly obstruction", e8);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e8) {
            d.a("Error with setting has window focus", e8);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e8) {
            d.a("Error with setting ad session id", e8);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e8) {
            d.a("JSONException during JSONObject.put for name [" + str + b9.i.f16698e, e8);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f16026a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static void b(JSONObject jSONObject) {
        b a10 = a(jSONObject);
        try {
            jSONObject.put("width", a10.f16027a);
            jSONObject.put("height", a10.f16028b);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e8) {
            d.a("Error with setting not visible reason", e8);
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (a(optJSONArray, optJSONArray2)) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                if (!h(optJSONArray.optJSONObject(i10), optJSONArray2.optJSONObject(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (a(optJSONArray, optJSONArray2)) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                if (!optJSONArray.optString(i10, "").equals(optJSONArray2.optString(i10, ""))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f16024b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }
}
