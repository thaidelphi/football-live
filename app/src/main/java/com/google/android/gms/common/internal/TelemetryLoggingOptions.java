package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    /* renamed from: b  reason: collision with root package name */
    public static final TelemetryLoggingOptions f12535b = a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f12536a;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f12537a;

        private Builder() {
        }

        /* synthetic */ Builder(zaac zaacVar) {
        }

        @KeepForSdk
        public TelemetryLoggingOptions a() {
            return new TelemetryLoggingOptions(this.f12537a, null);
        }
    }

    /* synthetic */ TelemetryLoggingOptions(String str, zaad zaadVar) {
        this.f12536a = str;
    }

    @KeepForSdk
    public static Builder a() {
        return new Builder(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f12536a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.a(this.f12536a, ((TelemetryLoggingOptions) obj).f12536a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f12536a);
    }
}
