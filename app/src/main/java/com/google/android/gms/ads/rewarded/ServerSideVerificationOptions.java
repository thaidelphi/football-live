package com.google.android.gms.ads.rewarded;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ServerSideVerificationOptions {

    /* renamed from: a  reason: collision with root package name */
    private final String f11856a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11857b;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f11858a = "";

        /* renamed from: b  reason: collision with root package name */
        private String f11859b = "";

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String str) {
            this.f11859b = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.f11858a = str;
            return this;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.f11856a = builder.f11858a;
        this.f11857b = builder.f11859b;
    }

    public String getCustomData() {
        return this.f11857b;
    }

    public String getUserId() {
        return this.f11856a;
    }
}
