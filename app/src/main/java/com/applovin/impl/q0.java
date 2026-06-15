package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q0 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f8429a;

    /* renamed from: b  reason: collision with root package name */
    private final v0 f8430b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8431a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f8432b;

        /* renamed from: c  reason: collision with root package name */
        private AppLovinCmpError f8433c;

        /* renamed from: d  reason: collision with root package name */
        private p0 f8434d;

        public a() {
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public void b(boolean z10) {
            this.f8431a = z10;
        }

        public boolean c() {
            return this.f8432b;
        }

        public boolean d() {
            return this.f8431a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.a((Object) this) && d() == aVar.d() && c() == aVar.c()) {
                    AppLovinCmpError a10 = a();
                    AppLovinCmpError a11 = aVar.a();
                    if (a10 != null ? a10.equals(a11) : a11 == null) {
                        p0 b10 = b();
                        p0 b11 = aVar.b();
                        return b10 != null ? b10.equals(b11) : b11 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i10 = (((d() ? 79 : 97) + 59) * 59) + (c() ? 79 : 97);
            AppLovinCmpError a10 = a();
            int hashCode = (i10 * 59) + (a10 == null ? 43 : a10.hashCode());
            p0 b10 = b();
            return (hashCode * 59) + (b10 != null ? b10.hashCode() : 43);
        }

        public String toString() {
            return "ConsentFlowManager.FlowCompletionStatus(termsAndPrivacyPolicyAlertShown=" + d() + ", cmpPromptShown=" + c() + ", cmpError=" + a() + ", consentFlowError=" + b() + ")";
        }

        public a(p0 p0Var) {
            this.f8434d = p0Var;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            this.f8433c = appLovinCmpError;
        }

        public p0 b() {
            return this.f8434d;
        }

        public void a(boolean z10) {
            this.f8432b = z10;
        }

        public void a(p0 p0Var) {
            this.f8434d = p0Var;
        }

        public AppLovinCmpError a() {
            return this.f8433c;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(a aVar);
    }

    public q0(com.applovin.impl.sdk.j jVar) {
        this.f8429a = jVar;
        this.f8430b = new v0(jVar);
        if (d7.i(com.applovin.impl.sdk.j.m())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.m()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public static TermsAndPrivacyPolicyFlowSettingsImpl a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("ConsentFlowManager", "Failed to get default Terms and Privacy Policy flow settings.");
            return new TermsAndPrivacyPolicyFlowSettingsImpl(false, false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        String a10 = d7.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.j) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(a10) ? JsonUtils.jsonObjectFromJsonString(a10, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", bool);
        Boolean bool3 = JsonUtils.getBoolean(jSONObject, "consent_flow_show_terms_and_privacy_policy_alert_in_gdpr", bool);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri parse = URLUtil.isValidUrl(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new TermsAndPrivacyPolicyFlowSettingsImpl(bool2.booleanValue(), bool3.booleanValue(), a(string), URLUtil.isValidUrl(string3) ? Uri.parse(string3) : null, parse);
    }

    private TermsAndPrivacyPolicyFlowSettingsImpl c() {
        return (TermsAndPrivacyPolicyFlowSettingsImpl) this.f8429a.f0().getTermsAndPrivacyPolicyFlowSettings();
    }

    public JSONObject b() {
        TermsAndPrivacyPolicyFlowSettingsImpl c10 = c();
        Uri privacyPolicyUri = c10.getPrivacyPolicyUri();
        Uri termsOfServiceUri = c10.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(j()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography d() {
        return c().getDebugUserGeography();
    }

    public String e() {
        Uri f10 = f();
        Uri h10 = h();
        StringBuilder sb = new StringBuilder();
        sb.append("\nConsent Flow Enabled - ");
        sb.append(j());
        sb.append("\nTerms of Service - ");
        if (h10 == null) {
            h10 = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(h10);
        sb.append("\nPrivacy Policy - ");
        if (f10 == null) {
            f10 = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(f10);
        return sb.toString();
    }

    public Uri f() {
        return c().getPrivacyPolicyUri();
    }

    public String g() {
        return "Migrate to the new Terms and Privacy Policy Flow by following these steps:\n\t1. Delete the 'terms_flow_settings' entry from your 'applovin_settings.xml' file.\n\t2. Follow the integration instructions in our documentation: " + a();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public Uri h() {
        return c().getTermsOfServiceUri();
    }

    public boolean i() {
        if (com.applovin.impl.sdk.j.f8884u0.y0()) {
            return this.f8430b.a();
        }
        return false;
    }

    public boolean j() {
        Map<String, String> extraParameters = this.f8429a.f0().getExtraParameters();
        if (extraParameters.containsKey("consent_flow_enabled")) {
            return Boolean.parseBoolean(extraParameters.get("consent_flow_enabled"));
        }
        return c().isEnabled();
    }

    public boolean k() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography d10 = this.f8429a.u().d();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        return this.f8429a.s().getConsentFlowUserGeography() == consentFlowUserGeography || (d10 == consentFlowUserGeography && d7.c(this.f8429a));
    }

    public boolean l() {
        return this.f8429a.f0().getExtraParameters().containsKey("terms_flow_settings");
    }

    public boolean m() {
        return c().shouldShowTermsAndPrivacyPolicyAlertInGdpr();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f8430b.a(this.f8429a.m0(), new b() { // from class: com.applovin.impl.nd
            @Override // com.applovin.impl.q0.b
            public final void a(q0.a aVar) {
                q0.this.a(aVar);
            }
        });
    }

    private void b(final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pd
            @Override // java.lang.Runnable
            public final void run() {
                q0.this.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i10) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public void a(Activity activity, final b bVar) {
        if (!j()) {
            bVar.a(new a(new p0(p0.f8318c, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (c().getPrivacyPolicyUri() == null) {
            b(activity);
        } else {
            this.f8430b.a(activity, new b() { // from class: com.applovin.impl.od
                @Override // com.applovin.impl.q0.b
                public final void a(q0.a aVar) {
                    q0.this.a(bVar, aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, a aVar) {
        if (aVar.f8434d == null) {
            this.f8429a.b(q4.f8452o, Boolean.FALSE);
        }
        bVar.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.m()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        final Uri a10 = a();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.md
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                q0.this.a(a10, dialogInterface, i10);
            }
        }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.ld
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                q0.b(a10, dialogInterface, i10);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i10) {
        b7.a(uri, com.applovin.impl.sdk.j.m(), this.f8429a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    private Uri a() {
        return Uri.parse((String) this.f8429a.a(this.f8429a.z0() ? o4.f8177n6 : o4.f8169m6));
    }
}
