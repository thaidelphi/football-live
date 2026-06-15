package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f17625a;

    /* renamed from: b  reason: collision with root package name */
    private final NetworkSettings f17626b;

    /* renamed from: c  reason: collision with root package name */
    private final i8.g f17627c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<BaseAdAdapter<?, ?>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w2 f17628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h0 f17629b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w2 w2Var, h0 h0Var) {
            super(0);
            this.f17628a = w2Var;
            this.f17629b = h0Var;
        }

        @Override // t8.a
        /* renamed from: a */
        public final BaseAdAdapter<?, ?> invoke() {
            return this.f17628a.a(this.f17629b.e(), this.f17629b.a(), this.f17629b.d());
        }
    }

    public h0(w2 adTools, w1 adUnitData, NetworkSettings providerSettings) {
        i8.g b10;
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        this.f17625a = adUnitData;
        this.f17626b = providerSettings;
        b10 = i8.i.b(new a(adTools, this));
        this.f17627c = b10;
    }

    public final IronSource.AD_UNIT a() {
        return this.f17625a.b().a();
    }

    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.f17627c.getValue();
    }

    public final String c() {
        String providerName = this.f17626b.getProviderName();
        kotlin.jvm.internal.n.e(providerName, "providerSettings.providerName");
        return providerName;
    }

    public final UUID d() {
        return this.f17625a.b().b();
    }

    public final NetworkSettings e() {
        return this.f17626b;
    }
}
