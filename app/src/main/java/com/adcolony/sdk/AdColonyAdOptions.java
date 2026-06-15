package com.adcolony.sdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyAdOptions {

    /* renamed from: a  reason: collision with root package name */
    boolean f5655a;

    /* renamed from: b  reason: collision with root package name */
    boolean f5656b;

    /* renamed from: c  reason: collision with root package name */
    AdColonyUserMetadata f5657c;

    /* renamed from: d  reason: collision with root package name */
    f1 f5658d = c0.b();

    public AdColonyAdOptions enableConfirmationDialog(boolean z10) {
        this.f5655a = z10;
        c0.b(this.f5658d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z10) {
        this.f5656b = z10;
        c0.b(this.f5658d, "results_enabled", true);
        return this;
    }

    public Object getOption(String str) {
        return c0.g(this.f5658d, str);
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f5657c;
    }

    public AdColonyAdOptions setOption(String str, boolean z10) {
        if (z0.e(str)) {
            c0.b(this.f5658d, str, z10);
        }
        return this;
    }

    @Deprecated
    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f5657c = adColonyUserMetadata;
        c0.a(this.f5658d, "user_metadata", adColonyUserMetadata.f5735b);
        return this;
    }

    public AdColonyAdOptions setOption(String str, double d10) {
        if (z0.e(str)) {
            c0.a(this.f5658d, str, d10);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null) {
            c0.a(this.f5658d, str, str2);
        }
        return this;
    }
}
