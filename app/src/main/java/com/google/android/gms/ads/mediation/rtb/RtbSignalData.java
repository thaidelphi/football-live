package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RtbSignalData {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11651a;

    /* renamed from: b  reason: collision with root package name */
    private final List f11652b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f11653c;

    /* renamed from: d  reason: collision with root package name */
    private final AdSize f11654d;

    public RtbSignalData(Context context, List<MediationConfiguration> list, Bundle bundle, AdSize adSize) {
        this.f11651a = context;
        this.f11652b = list;
        this.f11653c = bundle;
        this.f11654d = adSize;
    }

    public AdSize getAdSize() {
        return this.f11654d;
    }

    @Deprecated
    public MediationConfiguration getConfiguration() {
        List list = this.f11652b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (MediationConfiguration) this.f11652b.get(0);
    }

    public List<MediationConfiguration> getConfigurations() {
        return this.f11652b;
    }

    public Context getContext() {
        return this.f11651a;
    }

    public Bundle getNetworkExtras() {
        return this.f11653c;
    }
}
