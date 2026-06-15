package com.applovin.impl;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.HashSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f8464a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f8465b;

    /* renamed from: c  reason: collision with root package name */
    public static final q4 f8440c = new q4("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: d  reason: collision with root package name */
    public static final q4 f8441d = new q4("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: e  reason: collision with root package name */
    public static final q4 f8442e = new q4("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: f  reason: collision with root package name */
    public static final q4 f8443f = new q4("com.applovin.sdk.install_date", Long.class);

    /* renamed from: g  reason: collision with root package name */
    public static final q4 f8444g = new q4("com.applovin.sdk.user_id", String.class);

    /* renamed from: h  reason: collision with root package name */
    public static final q4 f8445h = new q4("com.applovin.sdk.compass_id", String.class);

    /* renamed from: i  reason: collision with root package name */
    public static final q4 f8446i = new q4("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: j  reason: collision with root package name */
    public static final q4 f8447j = new q4("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: k  reason: collision with root package name */
    public static final q4 f8448k = new q4("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: l  reason: collision with root package name */
    public static final q4 f8449l = new q4("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: m  reason: collision with root package name */
    public static final q4 f8450m = new q4("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: n  reason: collision with root package name */
    public static final q4 f8451n = new q4("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: o  reason: collision with root package name */
    public static final q4 f8452o = new q4("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* renamed from: p  reason: collision with root package name */
    public static final q4 f8453p = new q4("IABTCF_CmpSdkID", Object.class);

    /* renamed from: q  reason: collision with root package name */
    public static final q4 f8454q = new q4("IABTCF_CmpSdkVersion", Object.class);

    /* renamed from: r  reason: collision with root package name */
    public static final q4 f8455r = new q4("IABTCF_gdprApplies", Object.class);

    /* renamed from: s  reason: collision with root package name */
    public static final q4 f8456s = new q4(AndroidTcfDataSource.TCF_TCSTRING_KEY, String.class);

    /* renamed from: t  reason: collision with root package name */
    public static final q4 f8457t = new q4("IABTCF_AddtlConsent", String.class);

    /* renamed from: u  reason: collision with root package name */
    public static final q4 f8458u = new q4("IABTCF_VendorConsents", String.class);

    /* renamed from: v  reason: collision with root package name */
    public static final q4 f8459v = new q4("IABTCF_VendorLegitimateInterests", String.class);

    /* renamed from: w  reason: collision with root package name */
    public static final q4 f8460w = new q4("IABTCF_PurposeConsents", String.class);

    /* renamed from: x  reason: collision with root package name */
    public static final q4 f8461x = new q4("IABTCF_PurposeLegitimateInterests", String.class);

    /* renamed from: y  reason: collision with root package name */
    public static final q4 f8462y = new q4("IABTCF_SpecialFeaturesOptIns", String.class);

    /* renamed from: z  reason: collision with root package name */
    public static final q4 f8463z = new q4("com.applovin.sdk.stats", String.class);
    public static final q4 A = new q4("com.applovin.sdk.task.stats", HashSet.class);
    public static final q4 B = new q4("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final q4 C = new q4("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final q4 D = new q4("com.applovin.sdk.last_video_position", Integer.class);
    public static final q4 E = new q4("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final q4 F = new q4("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final q4 G = new q4("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final q4 H = new q4("com.applovin.sdk.persisted_data", String.class);
    public static final q4 I = new q4("com.applovin.sdk.mediation_provider", String.class);
    public static final q4 J = new q4("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final q4 K = new q4("com.applovin.sdk.user_agent", String.class);
    public static final q4 L = new q4("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final q4 M = new q4("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final q4 N = new q4("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final q4 O = new q4("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final q4 P = new q4("com.applovin.sdk.app_killed_last_ad_data", String.class);

    public q4(String str, Class cls) {
        this.f8464a = str;
        this.f8465b = cls;
    }

    public String a() {
        return this.f8464a;
    }

    public Class b() {
        return this.f8465b;
    }

    public String toString() {
        return "Key{name='" + this.f8464a + "', type=" + this.f8465b + '}';
    }
}
