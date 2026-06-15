package com.appnext.core.ra;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.b.b;
import com.appnext.core.i;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {
    private static final String eo = "https://cdn.appnext.com/tools/sdk/confign/sdk_core/" + i.Y() + "/sdk_config.json";
    private static volatile a ep;
    private Context aO;
    private JSONObject eq;

    private a(Context context) {
        try {
            this.aO = context;
            String c10 = b.N().c("config_store", null);
            if (TextUtils.isEmpty(c10)) {
                return;
            }
            this.eq = new JSONObject(c10);
        } catch (Throwable th) {
            com.appnext.base.a.a("RAConfigManager$RAConfigManager", th);
        }
    }

    private synchronized long an() {
        return c("send_rc_int", 240);
    }

    private synchronized long ao() {
        return c("config_int", 14400);
    }

    private JSONObject ap() {
        try {
            String aq = aq();
            if (TextUtils.isEmpty(aq)) {
                return null;
            }
            if (!TextUtils.isEmpty(aq)) {
                b.N().d("config_store", aq);
            }
            JSONObject jSONObject = new JSONObject(aq);
            this.eq = jSONObject;
            return jSONObject;
        } catch (Throwable th) {
            com.appnext.base.a.a("RAConfigManager$downloadConfigFileAndStore", th);
            return null;
        }
    }

    private String aq() {
        try {
            return i.a(this.aO, eo, null);
        } catch (Throwable th) {
            com.appnext.base.a.a("RAConfigManager$downloadConfigFile", th);
            return null;
        }
    }

    private long c(String str, int i10) {
        try {
            if (this.eq != null) {
                return d(str, i10);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("RAConfigManager$getLongValue", th);
        }
        return i10;
    }

    private long d(String str, int i10) {
        try {
            JSONObject jSONObject = this.eq;
            if (jSONObject != null && jSONObject.has(str)) {
                return this.eq.getLong(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return i10;
    }

    private String m(String str, String str2) {
        try {
            JSONObject jSONObject = this.eq;
            if (jSONObject != null && jSONObject != null) {
                return n(str, str2);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("RAConfigManager$getStringValue", th);
        }
        return str2;
    }

    private String n(String str, String str2) {
        try {
            JSONObject jSONObject = this.eq;
            if (jSONObject != null && jSONObject.has(str)) {
                return this.eq.getString(str);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("RAConfigManager$getStringValueFromLocalJson", th);
        }
        return str2;
    }

    public static a r(Context context) {
        if (ep == null) {
            synchronized (a.class) {
                if (ep == null) {
                    ep = new a(context);
                }
            }
        }
        return ep;
    }

    public final boolean al() {
        if (this.eq == null) {
            ap();
        }
        String m7 = m("rc_send", "on");
        return m7 != null && m7.equalsIgnoreCase("on");
    }

    public final void am() {
        try {
            ap();
            com.appnext.core.ra.services.a.s(this.aO).a(ao());
            if (al()) {
                com.appnext.core.ra.services.a.s(this.aO).b(an());
            } else {
                com.appnext.core.ra.services.a.s(this.aO).aB();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("RRAConfigManager$downloadConfigFileFromServer", th);
        }
    }
}
