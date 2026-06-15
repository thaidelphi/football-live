package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ConsentRequestParameters {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14770a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14771b;

    /* renamed from: c  reason: collision with root package name */
    private final ConsentDebugSettings f14772c;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14773a;

        /* renamed from: b  reason: collision with root package name */
        private String f14774b;

        /* renamed from: c  reason: collision with root package name */
        private ConsentDebugSettings f14775c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(String str) {
            this.f14774b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.f14775c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f14773a = z10;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f14770a = builder.f14773a;
        this.f14771b = builder.f14774b;
        this.f14772c = builder.f14775c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f14772c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f14770a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f14771b;
    }
}
