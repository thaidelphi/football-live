package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.ck;
import com.ironsource.yn;
import com.ironsource.yp;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BannerAdRequest {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23714a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23715b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23716c;

    /* renamed from: d  reason: collision with root package name */
    private final AdSize f23717d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f23718e;

    /* renamed from: f  reason: collision with root package name */
    private final yp f23719f;

    /* renamed from: g  reason: collision with root package name */
    private final String f23720g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final Context f23721a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23722b;

        /* renamed from: c  reason: collision with root package name */
        private final String f23723c;

        /* renamed from: d  reason: collision with root package name */
        private final AdSize f23724d;

        /* renamed from: e  reason: collision with root package name */
        private Bundle f23725e;

        public Builder(Context context, String instanceId, String adm, AdSize size) {
            n.f(context, "context");
            n.f(instanceId, "instanceId");
            n.f(adm, "adm");
            n.f(size, "size");
            this.f23721a = context;
            this.f23722b = instanceId;
            this.f23723c = adm;
            this.f23724d = size;
        }

        public final BannerAdRequest build() {
            return new BannerAdRequest(this.f23721a, this.f23722b, this.f23723c, this.f23724d, this.f23725e, null);
        }

        public final String getAdm() {
            return this.f23723c;
        }

        public final Context getContext() {
            return this.f23721a;
        }

        public final String getInstanceId() {
            return this.f23722b;
        }

        public final AdSize getSize() {
            return this.f23724d;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            n.f(extraParams, "extraParams");
            this.f23725e = extraParams;
            return this;
        }
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f23714a = context;
        this.f23715b = str;
        this.f23716c = str2;
        this.f23717d = adSize;
        this.f23718e = bundle;
        this.f23719f = new yn(str);
        String b10 = ck.b();
        n.e(b10, "generateMultipleUniqueInstanceId()");
        this.f23720g = b10;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, h hVar) {
        this(context, str, str2, adSize, bundle);
    }

    public final String getAdId$mediationsdk_release() {
        return this.f23720g;
    }

    public final String getAdm() {
        return this.f23716c;
    }

    public final Context getContext() {
        return this.f23714a;
    }

    public final Bundle getExtraParams() {
        return this.f23718e;
    }

    public final String getInstanceId() {
        return this.f23715b;
    }

    public final yp getProviderName$mediationsdk_release() {
        return this.f23719f;
    }

    public final AdSize getSize() {
        return this.f23717d;
    }
}
