package com.unity3d.mediation;

import com.ironsource.am;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayAdInfo {

    /* renamed from: a  reason: collision with root package name */
    private final String f23759a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23760b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23761c;

    /* renamed from: d  reason: collision with root package name */
    private final ImpressionData f23762d;

    /* renamed from: e  reason: collision with root package name */
    private final am f23763e;

    /* renamed from: f  reason: collision with root package name */
    private final LevelPlayAdSize f23764f;

    /* renamed from: g  reason: collision with root package name */
    private final String f23765g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(LevelPlayAdInfo adInfo, String str) {
        this(adInfo.f23759a, adInfo.f23760b, adInfo.f23761c, adInfo.f23762d, adInfo.f23763e, adInfo.f23764f, str);
        n.f(adInfo, "adInfo");
    }

    public LevelPlayAdInfo(String adId, String adUnitId, String adFormat, ImpressionData impressionData, am amVar, LevelPlayAdSize levelPlayAdSize, String str) {
        n.f(adId, "adId");
        n.f(adUnitId, "adUnitId");
        n.f(adFormat, "adFormat");
        this.f23759a = adId;
        this.f23760b = adUnitId;
        this.f23761c = adFormat;
        this.f23762d = impressionData;
        this.f23763e = amVar;
        this.f23764f = levelPlayAdSize;
        this.f23765g = str;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, ImpressionData impressionData, am amVar, LevelPlayAdSize levelPlayAdSize, String str4, int i10, h hVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : impressionData, (i10 & 16) != 0 ? null : amVar, (i10 & 32) != 0 ? null : levelPlayAdSize, (i10 & 64) != 0 ? null : str4);
    }

    private final String a() {
        return this.f23759a;
    }

    private final String b() {
        return this.f23760b;
    }

    private final String c() {
        return this.f23761c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, ImpressionData impressionData, am amVar, LevelPlayAdSize levelPlayAdSize, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = levelPlayAdInfo.f23759a;
        }
        if ((i10 & 2) != 0) {
            str2 = levelPlayAdInfo.f23760b;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = levelPlayAdInfo.f23761c;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            impressionData = levelPlayAdInfo.f23762d;
        }
        ImpressionData impressionData2 = impressionData;
        if ((i10 & 16) != 0) {
            amVar = levelPlayAdInfo.f23763e;
        }
        am amVar2 = amVar;
        if ((i10 & 32) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f23764f;
        }
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        if ((i10 & 64) != 0) {
            str4 = levelPlayAdInfo.f23765g;
        }
        return levelPlayAdInfo.copy(str, str5, str6, impressionData2, amVar2, levelPlayAdSize2, str4);
    }

    private final ImpressionData d() {
        return this.f23762d;
    }

    private final am e() {
        return this.f23763e;
    }

    private final LevelPlayAdSize f() {
        return this.f23764f;
    }

    private final String g() {
        return this.f23765g;
    }

    public final LevelPlayAdInfo copy(String adId, String adUnitId, String adFormat, ImpressionData impressionData, am amVar, LevelPlayAdSize levelPlayAdSize, String str) {
        n.f(adId, "adId");
        n.f(adUnitId, "adUnitId");
        n.f(adFormat, "adFormat");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, impressionData, amVar, levelPlayAdSize, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LevelPlayAdInfo) {
            LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
            return n.a(this.f23759a, levelPlayAdInfo.f23759a) && n.a(this.f23760b, levelPlayAdInfo.f23760b) && n.a(this.f23761c, levelPlayAdInfo.f23761c) && n.a(this.f23762d, levelPlayAdInfo.f23762d) && n.a(this.f23763e, levelPlayAdInfo.f23763e) && n.a(this.f23764f, levelPlayAdInfo.f23764f) && n.a(this.f23765g, levelPlayAdInfo.f23765g);
        }
        return false;
    }

    public final String getAb() {
        ImpressionData impressionData = this.f23762d;
        String ab = impressionData != null ? impressionData.getAb() : null;
        return ab == null ? "" : ab;
    }

    public final String getAdFormat() {
        ImpressionData impressionData = this.f23762d;
        String adFormat = impressionData != null ? impressionData.getAdFormat() : null;
        return adFormat == null ? this.f23761c : adFormat;
    }

    public final String getAdId() {
        return this.f23759a;
    }

    public final String getAdNetwork() {
        ImpressionData impressionData = this.f23762d;
        String adNetwork = impressionData != null ? impressionData.getAdNetwork() : null;
        return adNetwork == null ? "" : adNetwork;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f23764f;
    }

    public final String getAdUnitId() {
        ImpressionData impressionData = this.f23762d;
        String mediationAdUnitId = impressionData != null ? impressionData.getMediationAdUnitId() : null;
        return mediationAdUnitId == null ? this.f23760b : mediationAdUnitId;
    }

    public final String getAdUnitName() {
        ImpressionData impressionData = this.f23762d;
        String mediationAdUnitName = impressionData != null ? impressionData.getMediationAdUnitName() : null;
        return mediationAdUnitName == null ? "" : mediationAdUnitName;
    }

    public final String getAuctionId() {
        ImpressionData impressionData = this.f23762d;
        String auctionId = impressionData != null ? impressionData.getAuctionId() : null;
        return auctionId == null ? "" : auctionId;
    }

    public final String getCountry() {
        ImpressionData impressionData = this.f23762d;
        String country = impressionData != null ? impressionData.getCountry() : null;
        return country == null ? "" : country;
    }

    public final String getCreativeId() {
        ImpressionData impressionData = this.f23762d;
        String creativeId = impressionData != null ? impressionData.getCreativeId() : null;
        return creativeId == null ? "" : creativeId;
    }

    public final String getEncryptedCPM() {
        ImpressionData impressionData = this.f23762d;
        String encryptedCPM = impressionData != null ? impressionData.getEncryptedCPM() : null;
        return encryptedCPM == null ? "" : encryptedCPM;
    }

    public final String getInstanceId() {
        ImpressionData impressionData = this.f23762d;
        String instanceId = impressionData != null ? impressionData.getInstanceId() : null;
        return instanceId == null ? "" : instanceId;
    }

    public final String getInstanceName() {
        ImpressionData impressionData = this.f23762d;
        String instanceName = impressionData != null ? impressionData.getInstanceName() : null;
        return instanceName == null ? "" : instanceName;
    }

    public final String getPlacementName() {
        String str = this.f23765g;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        String c10;
        am amVar = this.f23763e;
        if (amVar == null || (c10 = amVar.c()) == null) {
            ImpressionData impressionData = this.f23762d;
            String precision = impressionData != null ? impressionData.getPrecision() : null;
            return precision == null ? "" : precision;
        }
        return c10;
    }

    public final double getRevenue() {
        am amVar = this.f23763e;
        if (amVar != null) {
            return amVar.d();
        }
        ImpressionData impressionData = this.f23762d;
        Double revenue = impressionData != null ? impressionData.getRevenue() : null;
        if (revenue != null) {
            return revenue.doubleValue();
        }
        return 0.0d;
    }

    public final String getSegmentName() {
        ImpressionData impressionData = this.f23762d;
        String segmentName = impressionData != null ? impressionData.getSegmentName() : null;
        return segmentName == null ? "" : segmentName;
    }

    public int hashCode() {
        int hashCode = ((((this.f23759a.hashCode() * 31) + this.f23760b.hashCode()) * 31) + this.f23761c.hashCode()) * 31;
        ImpressionData impressionData = this.f23762d;
        int hashCode2 = (hashCode + (impressionData == null ? 0 : impressionData.hashCode())) * 31;
        am amVar = this.f23763e;
        int hashCode3 = (hashCode2 + (amVar == null ? 0 : amVar.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f23764f;
        int hashCode4 = (hashCode3 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f23765g;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f23764f + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }
}
