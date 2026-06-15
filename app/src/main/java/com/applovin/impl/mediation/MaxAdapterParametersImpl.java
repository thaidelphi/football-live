package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.d3;
import com.applovin.impl.u2;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a  reason: collision with root package name */
    private String f7539a;

    /* renamed from: b  reason: collision with root package name */
    private Map f7540b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f7541c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f7542d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f7543e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f7544f;

    /* renamed from: g  reason: collision with root package name */
    private String f7545g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7546h;

    /* renamed from: i  reason: collision with root package name */
    private String f7547i;

    /* renamed from: j  reason: collision with root package name */
    private String f7548j;

    /* renamed from: k  reason: collision with root package name */
    private long f7549k;

    /* renamed from: l  reason: collision with root package name */
    private MaxAdFormat f7550l;

    private MaxAdapterParametersImpl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(u2 u2Var) {
        MaxAdapterParametersImpl a10 = a((d3) u2Var);
        a10.f7547i = u2Var.U();
        a10.f7548j = u2Var.E();
        a10.f7549k = u2Var.D();
        return a10;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f7550l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f7539a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f7549k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f7548j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f7545g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f7542d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f7540b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f7541c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f7547i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f7543e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f7544f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f7546h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(u4 u4Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a10 = a(u4Var);
        a10.f7539a = str;
        a10.f7550l = maxAdFormat;
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MaxAdapterParametersImpl a(d3 d3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f7539a = d3Var.getAdUnitId();
        maxAdapterParametersImpl.f7543e = d3Var.n();
        maxAdapterParametersImpl.f7544f = d3Var.o();
        maxAdapterParametersImpl.f7545g = d3Var.d();
        maxAdapterParametersImpl.f7540b = d3Var.i();
        maxAdapterParametersImpl.f7541c = d3Var.l();
        maxAdapterParametersImpl.f7542d = d3Var.f();
        maxAdapterParametersImpl.f7546h = d3Var.p();
        return maxAdapterParametersImpl;
    }
}
