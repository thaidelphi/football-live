package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.ck;
import com.ironsource.yn;
import com.ironsource.yp;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RewardedAdRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f23746a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23747b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f23748c;

    /* renamed from: d  reason: collision with root package name */
    private final yp f23749d;

    /* renamed from: e  reason: collision with root package name */
    private final String f23750e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String f23751a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23752b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f23753c;

        public Builder(String instanceId, String adm) {
            n.f(instanceId, "instanceId");
            n.f(adm, "adm");
            this.f23751a = instanceId;
            this.f23752b = adm;
        }

        public final RewardedAdRequest build() {
            return new RewardedAdRequest(this.f23751a, this.f23752b, this.f23753c, null);
        }

        public final String getAdm() {
            return this.f23752b;
        }

        public final String getInstanceId() {
            return this.f23751a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            n.f(extraParams, "extraParams");
            this.f23753c = extraParams;
            return this;
        }
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f23746a = str;
        this.f23747b = str2;
        this.f23748c = bundle;
        this.f23749d = new yn(str);
        String b10 = ck.b();
        n.e(b10, "generateMultipleUniqueInstanceId()");
        this.f23750e = b10;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, h hVar) {
        this(str, str2, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f23750e;
    }

    public final String getAdm() {
        return this.f23747b;
    }

    public final Bundle getExtraParams() {
        return this.f23748c;
    }

    public final String getInstanceId() {
        return this.f23746a;
    }

    public final yp getProviderName$mediationsdk_release() {
        return this.f23749d;
    }
}
