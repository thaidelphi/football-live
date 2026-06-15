package com.google.ads.consent;

import c7.c;
import java.util.HashSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class ConsentData {
    private static final String SDK_PLATFORM = "android";
    private static final String SDK_VERSION = "1.0.7";
    @c("consent_source")
    private String consentSource;
    @c("providers")
    private HashSet<AdProvider> adProviders = new HashSet<>();
    @c("consented_providers")
    private HashSet<AdProvider> consentedAdProviders = new HashSet<>();
    @c("pub_ids")
    private HashSet<String> publisherIds = new HashSet<>();
    @c("tag_for_under_age_of_consent")
    private Boolean underAgeOfConsent = Boolean.FALSE;
    @c("consent_state")
    private ConsentStatus consentStatus = ConsentStatus.UNKNOWN;
    @c("is_request_in_eea_or_unknown")
    private boolean isRequestLocationInEeaOrUnknown = false;
    @c("has_any_npa_pub_id")
    private boolean hasNonPersonalizedPublisherId = false;
    @c("version")
    private final String sdkVersionString = SDK_VERSION;
    @c("plat")
    private final String sdkPlatformString = "android";
    @c("raw_response")
    private String rawResponse = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashSet<AdProvider> a() {
        return this.adProviders;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConsentStatus b() {
        return this.consentStatus;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashSet<AdProvider> c() {
        return this.consentedAdProviders;
    }

    public String d() {
        return this.sdkPlatformString;
    }

    public String e() {
        return this.sdkVersionString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.hasNonPersonalizedPublisherId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.isRequestLocationInEeaOrUnknown;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(HashSet<AdProvider> hashSet) {
        this.adProviders = hashSet;
    }

    public void i(String str) {
        this.consentSource = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ConsentStatus consentStatus) {
        this.consentStatus = consentStatus;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(HashSet<AdProvider> hashSet) {
        this.consentedAdProviders = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(boolean z10) {
        this.hasNonPersonalizedPublisherId = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(HashSet<String> hashSet) {
        this.publisherIds = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(String str) {
        this.rawResponse = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10) {
        this.isRequestLocationInEeaOrUnknown = z10;
    }
}
