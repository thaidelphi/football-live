package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8418a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8419b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f8420c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f8421d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f8422e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z10, boolean z11, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f8418a = z10;
        this.f8419b = z11;
        this.f8420c = consentFlowUserGeography;
        this.f8421d = uri;
        this.f8422e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f8420c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f8421d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f8422e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f8418a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        n.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f8420c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z10) {
        n.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z10);
        this.f8418a = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        n.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f8421d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z10) {
        n.g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z10);
        this.f8419b = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        n.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f8422e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.f8419b;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f8418a + ", privacyPolicyUri=" + this.f8421d + ", termsOfServiceUri=" + this.f8422e + '}';
    }
}
