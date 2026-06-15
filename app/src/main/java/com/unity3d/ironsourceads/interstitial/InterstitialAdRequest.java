package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.ck;
import com.ironsource.yn;
import com.ironsource.yp;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InterstitialAdRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f23733a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23734b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f23735c;

    /* renamed from: d  reason: collision with root package name */
    private final yp f23736d;

    /* renamed from: e  reason: collision with root package name */
    private final String f23737e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String f23738a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23739b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f23740c;

        public Builder(String instanceId, String adm) {
            n.f(instanceId, "instanceId");
            n.f(adm, "adm");
            this.f23738a = instanceId;
            this.f23739b = adm;
        }

        public final InterstitialAdRequest build() {
            return new InterstitialAdRequest(this.f23738a, this.f23739b, this.f23740c, null);
        }

        public final String getAdm() {
            return this.f23739b;
        }

        public final String getInstanceId() {
            return this.f23738a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            n.f(extraParams, "extraParams");
            this.f23740c = extraParams;
            return this;
        }
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f23733a = str;
        this.f23734b = str2;
        this.f23735c = bundle;
        this.f23736d = new yn(str);
        String b10 = ck.b();
        n.e(b10, "generateMultipleUniqueInstanceId()");
        this.f23737e = b10;
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, h hVar) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f23737e;
    }

    public final String getAdm() {
        return this.f23734b;
    }

    public final Bundle getExtraParams() {
        return this.f23735c;
    }

    public final String getInstanceId() {
        return this.f23733a;
    }

    public final yp getProviderName$mediationsdk_release() {
        return this.f23736d;
    }
}
