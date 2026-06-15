package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzcq;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ConsentDebugSettings {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14763a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14764b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class Builder {

        /* renamed from: b  reason: collision with root package name */
        private final Context f14766b;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14768d;

        /* renamed from: a  reason: collision with root package name */
        private final List f14765a = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private int f14767c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f14766b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f14765a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzcq.zza(true) && !this.f14765a.contains(zzci.zza(this.f14766b)) && !this.f14768d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.f14767c = i10;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z10) {
            this.f14768d = z10;
            return this;
        }
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder, zza zzaVar) {
        this.f14763a = z10;
        this.f14764b = builder.f14767c;
    }

    public int getDebugGeography() {
        return this.f14764b;
    }

    public boolean isTestDevice() {
        return this.f14763a;
    }
}
