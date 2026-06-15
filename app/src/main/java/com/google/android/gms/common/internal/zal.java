package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zal {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f12588a;

    /* renamed from: b  reason: collision with root package name */
    private GoogleApiAvailabilityLight f12589b;

    public zal() {
        this(GoogleApiAvailability.q());
    }

    public final int a(Context context, int i10) {
        return this.f12588a.get(i10, -1);
    }

    public final int b(Context context, Api.Client client) {
        Preconditions.m(context);
        Preconditions.m(client);
        int i10 = 0;
        if (client.requiresGooglePlayServices()) {
            int minApkVersion = client.getMinApkVersion();
            int a10 = a(context, minApkVersion);
            if (a10 == -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f12588a.size()) {
                        i10 = -1;
                        break;
                    }
                    int keyAt = this.f12588a.keyAt(i11);
                    if (keyAt > minApkVersion && this.f12588a.get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                }
                a10 = i10 == -1 ? this.f12589b.j(context, minApkVersion) : i10;
                this.f12588a.put(minApkVersion, a10);
            }
            return a10;
        }
        return 0;
    }

    public final void c() {
        this.f12588a.clear();
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f12588a = new SparseIntArray();
        Preconditions.m(googleApiAvailabilityLight);
        this.f12589b = googleApiAvailabilityLight;
    }
}
