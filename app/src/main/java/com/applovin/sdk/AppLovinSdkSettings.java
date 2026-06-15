package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.d7;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9962a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9963b;

    /* renamed from: f  reason: collision with root package name */
    private String f9967f;

    /* renamed from: g  reason: collision with root package name */
    private String f9968g;

    /* renamed from: h  reason: collision with root package name */
    private String f9969h;

    /* renamed from: l  reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f9973l;

    /* renamed from: m  reason: collision with root package name */
    private j f9974m;

    /* renamed from: n  reason: collision with root package name */
    private String f9975n;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9966e = true;
    private final Map<String, Object> localSettings = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private List f9970i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    private List f9971j = Collections.emptyList();

    /* renamed from: k  reason: collision with root package name */
    private final Map f9972k = Collections.synchronizedMap(new HashMap());

    /* renamed from: c  reason: collision with root package name */
    private boolean f9964c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9965d = true;

    public AppLovinSdkSettings(Context context) {
        this.f9975n = "";
        if (context == null) {
            n.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context d10 = d7.d(context);
        this.f9962a = d7.k(d10);
        this.f9973l = q0.a(d10);
        this.f9975n = d10.getPackageName();
        a(d10);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String a10 = d7.a(identifier, context, (j) null);
        this.f9972k.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(a10) ? JsonUtils.jsonObjectFromJsonString(a10, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(j jVar) {
        this.f9974m = jVar;
        if (StringUtils.isValidString(this.f9967f)) {
            jVar.k0().a(Arrays.asList(this.f9967f.split(",")));
            this.f9967f = null;
        }
        if (this.f9968g != null) {
            jVar.I();
            if (n.a()) {
                n I = jVar.I();
                I.a("AppLovinSdkSettings", "Setting user id: " + this.f9968g);
            }
            jVar.o0().a(this.f9968g);
            this.f9968g = null;
        }
        if (StringUtils.isValidString(this.f9969h)) {
            k.a(this.f9969h, jVar);
            this.f9969h = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f9972k) {
            map = CollectionUtils.map(this.f9972k);
        }
        return map;
    }

    @Deprecated
    public List<String> getInitializationAdUnitIds() {
        return this.f9971j;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f9973l;
    }

    @Deprecated
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f9970i;
    }

    public String getUserIdentifier() {
        j jVar = this.f9974m;
        return jVar == null ? this.f9968g : jVar.o0().c();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f9964c;
    }

    @Deprecated
    public boolean isExceptionHandlerEnabled() {
        return this.f9965d;
    }

    public boolean isMuted() {
        return this.f9963b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f9962a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        n.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f9964c == z10) {
            return;
        }
        this.f9964c = z10;
        j jVar = this.f9974m;
        if (jVar == null) {
            return;
        }
        if (z10) {
            jVar.v().l();
        } else {
            jVar.v().k();
        }
    }

    @Deprecated
    public void setExceptionHandlerEnabled(boolean z10) {
        n.e("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
        this.f9965d = z10;
    }

    public void setExtraParameter(String str, String str2) {
        n.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            n.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f9974m != null) {
                if (StringUtils.isValidString(trim)) {
                    this.f9974m.k0().a(Arrays.asList(trim.split(",")));
                } else {
                    this.f9974m.k0().a((String) null);
                }
            } else {
                this.f9967f = trim;
            }
        } else if (!"fan".equals(str) && !"esc".equals(str)) {
            if ("disable_all_logs".equals(str)) {
                n.a(Boolean.parseBoolean(trim));
            } else if ("package_name_override".equals(str)) {
                j jVar = this.f9974m;
                if (jVar != null) {
                    k.a(trim, jVar);
                } else {
                    this.f9969h = trim;
                }
            }
        } else if (!this.f9975n.startsWith("com.unity.")) {
            return;
        }
        this.f9972k.put(str, trim);
    }

    @Deprecated
    public void setInitializationAdUnitIds(List<String> list) {
        n.e("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        n.h("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f9971j = arrayList;
            return;
        }
        this.f9971j = Collections.emptyList();
    }

    public void setMuted(boolean z10) {
        n.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f9963b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        n.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f9966e = z10;
    }

    @Deprecated
    public void setTestDeviceAdvertisingIds(List<String> list) {
        n.e("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str != null && str.length() == 36) {
                    arrayList.add(str);
                } else {
                    n.h("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.f9970i = arrayList;
            return;
        }
        this.f9970i = Collections.emptyList();
    }

    public void setUserIdentifier(String str) {
        n.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > d7.b(8)) {
            n.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + d7.b(8) + " maximum)");
        }
        j jVar = this.f9974m;
        if (jVar != null) {
            jVar.I();
            if (n.a()) {
                n I = this.f9974m.I();
                I.a("AppLovinSdkSettings", "Setting user id: " + str);
            }
            this.f9974m.o0().a(str);
            return;
        }
        this.f9968g = str;
    }

    public void setVerboseLogging(boolean z10) {
        n.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (d7.k()) {
            n.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (d7.k(null) != z10) {
                n.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f9962a = z10;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f9966e;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f9962a + ", muted=" + this.f9963b + ", testDeviceAdvertisingIds=" + this.f9970i.toString() + ", initializationAdUnitIds=" + this.f9971j.toString() + ", creativeDebuggerEnabled=" + this.f9964c + ", exceptionHandlerEnabled=" + this.f9965d + '}';
    }
}
