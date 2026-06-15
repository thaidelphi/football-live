package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.ironsource.b9;
import com.ironsource.fe;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a  reason: collision with root package name */
    private String f5689a = "";

    /* renamed from: b  reason: collision with root package name */
    private f1 f5690b = new f1();

    /* renamed from: c  reason: collision with root package name */
    private AdColonyUserMetadata f5691c;

    public AdColonyAppOptions() {
        setOriginStore(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork(MOPUB, "unknown");
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    String str3 = split[0];
                    str3.hashCode();
                    if (str3.equals(b9.h.U)) {
                        mediationNetwork.setOriginStore(split[1]);
                    } else if (!str3.equals("version")) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split[1]);
                    }
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAppOptions a(String str) {
        if (str == null) {
            return this;
        }
        this.f5689a = str;
        c0.a(this.f5690b, "app_id", str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 b() {
        return this.f5690b;
    }

    public int getAppOrientation() {
        return c0.a(this.f5690b, "app_orientation", -1);
    }

    public String getAppVersion() {
        return c0.h(this.f5690b, "app_version");
    }

    @Deprecated
    public String getGDPRConsentString() {
        return c0.h(this.f5690b, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return c0.b(this.f5690b, "gdpr_required");
    }

    public boolean getIsChildDirectedApp() {
        return c0.b(this.f5690b, com.ironsource.mediationsdk.metadata.a.f18919b);
    }

    public boolean getKeepScreenOn() {
        return c0.b(this.f5690b, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        f1 b10 = c0.b();
        c0.a(b10, "name", c0.h(this.f5690b, "mediation_network"));
        c0.a(b10, "version", c0.h(this.f5690b, "mediation_network_version"));
        return b10.a();
    }

    public boolean getMultiWindowEnabled() {
        return c0.b(this.f5690b, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return c0.g(this.f5690b, str);
    }

    public String getOriginStore() {
        return c0.h(this.f5690b, "origin_store");
    }

    public JSONObject getPluginInfo() {
        f1 b10 = c0.b();
        c0.a(b10, "name", c0.h(this.f5690b, fe.K));
        c0.a(b10, "version", c0.h(this.f5690b, "plugin_version"));
        return b10.a();
    }

    public String getPrivacyConsentString(String str) {
        f1 f1Var = this.f5690b;
        return c0.h(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        f1 f1Var = this.f5690b;
        return c0.b(f1Var, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return c0.a(this.f5690b, "orientation", -1);
    }

    public boolean getTestModeEnabled() {
        return c0.b(this.f5690b, "test_mode");
    }

    public String getUserID() {
        return c0.h(this.f5690b, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f5691c;
    }

    public boolean isPrivacyFrameworkRequiredSet(String str) {
        f1 f1Var = this.f5690b;
        return f1Var.a(str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    public AdColonyAppOptions setAppOrientation(int i10) {
        setOption("app_orientation", i10);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption("app_version", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        c0.a(this.f5690b, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z10) {
        setOption("gdpr_required", z10);
        return this;
    }

    public AdColonyAppOptions setIsChildDirectedApp(boolean z10) {
        setOption(com.ironsource.mediationsdk.metadata.a.f18919b, z10);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z10) {
        c0.b(this.f5690b, "keep_screen_on", z10);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        c0.a(this.f5690b, "mediation_network", str);
        c0.a(this.f5690b, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z10) {
        c0.b(this.f5690b, "multi_window_enabled", z10);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z10) {
        c0.b(this.f5690b, str, z10);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        c0.a(this.f5690b, fe.K, str);
        c0.a(this.f5690b, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        f1 f1Var = this.f5690b;
        c0.a(f1Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z10) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z10);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i10) {
        setOption("orientation", i10);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z10) {
        c0.b(this.f5690b, "test_mode", z10);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f5691c = adColonyUserMetadata;
        c0.a(this.f5690b, "user_metadata", adColonyUserMetadata.f5735b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context) {
        a(context);
        Boolean g10 = this.f5690b.g("use_forced_controller");
        if (g10 != null) {
            l.H = g10.booleanValue();
        }
        if (this.f5690b.f("use_staging_launch_server")) {
            k.Z = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b10 = z0.b(context, "IABUSPrivacy_String");
        String b11 = z0.b(context, AndroidTcfDataSource.TCF_TCSTRING_KEY);
        int a10 = z0.a(context, "IABTCF_gdprApplies");
        if (b10 != null) {
            c0.a(this.f5690b, "ccpa_consent_string", b10);
        }
        if (b11 != null) {
            c0.a(this.f5690b, "gdpr_consent_string", b11);
        }
        if (a10 == 0 || a10 == 1) {
            c0.b(this.f5690b, "gdpr_required", a10 == 1);
        }
    }

    public AdColonyAppOptions setOption(String str, double d10) {
        c0.a(this.f5690b, str, d10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f5689a;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        c0.a(this.f5690b, str, str2);
        return this;
    }

    private void a(Context context) {
        setOption("bundle_id", z0.d(context));
    }
}
