package com.applovin.impl.mediation;

import com.applovin.impl.u2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a  reason: collision with root package name */
    private final u2 f7532a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7533b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7534c;

    /* renamed from: d  reason: collision with root package name */
    private final List f7535d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7536e;

    /* renamed from: f  reason: collision with root package name */
    private final List f7537f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7538g;

    public MaxAdWaterfallInfoImpl(u2 u2Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(u2Var, u2Var.W(), u2Var.X(), j10, list, u2Var.V(), str);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f7536e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f7532a;
    }

    public String getMCode() {
        return this.f7538g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f7533b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f7535d;
    }

    public List<String> getPostbackUrls() {
        return this.f7537f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f7534c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f7533b + ", testName=" + this.f7534c + ", networkResponses=" + this.f7535d + ", latencyMillis=" + this.f7536e + '}';
    }

    public MaxAdWaterfallInfoImpl(u2 u2Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.f7532a = u2Var;
        this.f7533b = str;
        this.f7534c = str2;
        this.f7535d = list;
        this.f7536e = j10;
        this.f7537f = list2;
        this.f7538g = str3;
    }
}
