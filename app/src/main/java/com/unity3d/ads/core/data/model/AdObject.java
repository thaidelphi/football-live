package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AdObject.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isScarAd;
    private final UnityAdsLoadOptions loadOptions;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private ByteString trackingToken;

    public AdObject(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z10, String str, String str2, String str3, AdPlayer adPlayer, String str4, UnityAdsLoadOptions loadOptions, boolean z11, DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        n.f(opportunityId, "opportunityId");
        n.f(placementId, "placementId");
        n.f(trackingToken, "trackingToken");
        n.f(loadOptions, "loadOptions");
        n.f(adType, "adType");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z10;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.adPlayer = adPlayer;
        this.playerServerId = str4;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z11;
        this.adType = adType;
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final UnityAdsLoadOptions component10() {
        return this.loadOptions;
    }

    public final boolean component11() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component12() {
        return this.adType;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final String component7() {
        return this.scarAdString;
    }

    public final AdPlayer component8() {
        return this.adPlayer;
    }

    public final String component9() {
        return this.playerServerId;
    }

    public final AdObject copy(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z10, String str, String str2, String str3, AdPlayer adPlayer, String str4, UnityAdsLoadOptions loadOptions, boolean z11, DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        n.f(opportunityId, "opportunityId");
        n.f(placementId, "placementId");
        n.f(trackingToken, "trackingToken");
        n.f(loadOptions, "loadOptions");
        n.f(adType, "adType");
        return new AdObject(opportunityId, placementId, trackingToken, z10, str, str2, str3, adPlayer, str4, loadOptions, z11, adType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdObject) {
            AdObject adObject = (AdObject) obj;
            return n.a(this.opportunityId, adObject.opportunityId) && n.a(this.placementId, adObject.placementId) && n.a(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && n.a(this.scarQueryId, adObject.scarQueryId) && n.a(this.scarAdUnitId, adObject.scarAdUnitId) && n.a(this.scarAdString, adObject.scarAdString) && n.a(this.adPlayer, adObject.adPlayer) && n.a(this.playerServerId, adObject.playerServerId) && n.a(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType;
        }
        return false;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z10 = this.isScarAd;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        String str = this.scarQueryId;
        int hashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int hashCode5 = (hashCode4 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str4 = this.playerServerId;
        int hashCode6 = (((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z11 = this.isHeaderBidding;
        return ((hashCode6 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.adType.hashCode();
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setTrackingToken(ByteString byteString) {
        n.f(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions unityAdsLoadOptions, boolean z11, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, int i10, h hVar) {
        this(byteString, str, byteString2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : adPlayer, (i10 & 256) != 0 ? null : str5, unityAdsLoadOptions, z11, diagnosticAdType);
    }
}
