package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MediationConfiguration {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    /* renamed from: a  reason: collision with root package name */
    private final AdFormat f11601a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f11602b;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.f11601a = adFormat;
        this.f11602b = bundle;
    }

    public AdFormat getFormat() {
        return this.f11601a;
    }

    public Bundle getServerParameters() {
        return this.f11602b;
    }
}
