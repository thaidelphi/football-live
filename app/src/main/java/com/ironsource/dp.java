package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class dp {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17076a = "com.google.market";

    /* renamed from: b  reason: collision with root package name */
    public static final String f17077b = "com.android.vending";

    /* renamed from: c  reason: collision with root package name */
    public static final String f17078c = "isInstalled";

    /* renamed from: d  reason: collision with root package name */
    private static final String f17079d = "dp";

    /* renamed from: e  reason: collision with root package name */
    private static final ArrayList<String> f17080e = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends ArrayList<String> {
        a() {
            add(dp.f17076a);
            add(dp.f17077b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f17081a;

        b(boolean z10) throws JSONException {
            this.f17081a = z10;
            put("isInstalled", z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum c {
        GOOGLE_PLAY(2, new String[]{dp.f17077b}),
        GOOGLE_MARKET(4, new String[]{dp.f17076a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});
        

        /* renamed from: h  reason: collision with root package name */
        private static final Map<String, c> f17087h = new HashMap();

        /* renamed from: a  reason: collision with root package name */
        private final int f17089a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f17090b;

        static {
            c[] values;
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    f17087h.put(str, cVar);
                }
            }
        }

        c(int i10, String[] strArr) {
            this.f17089a = i10;
            this.f17090b = strArr;
        }

        static /* synthetic */ ArrayList a() {
            return b();
        }

        private static ArrayList<String> b() {
            return new ArrayList<>(f17087h.keySet());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f17089a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.f17090b;
        }
    }

    private static JSONObject a(Context context) {
        return a(context, f17080e);
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b10 = b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                jSONObject.put(next, a(b10.contains(next.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            Log.d(f17079d, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    private static JSONObject a(boolean z10) throws JSONException {
        return new b(z10);
    }

    private static ArrayList<String> b(Context context) {
        List<ApplicationInfo> o10 = mm.S().f().o(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : o10) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer c(Context context) {
        JSONObject a10 = a(context, c.a());
        int i10 = 0;
        for (c cVar : c.values()) {
            String[] d10 = cVar.d();
            int length = d10.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                JSONObject optJSONObject = a10.optJSONObject(d10[i11]);
                if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                    i10 = (int) (i10 + Math.pow(2.0d, cVar.c() - 1));
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static boolean d(Context context) {
        JSONObject a10 = a(context);
        Iterator<String> keys = a10.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a10.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }
}
