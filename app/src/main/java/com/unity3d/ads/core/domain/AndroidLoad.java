package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import d9.i;
import d9.j0;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.jvm.internal.n;
/* compiled from: AndroidLoad.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final j0 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SessionRepository sessionRepository;

    public AndroidLoad(j0 defaultDispatcher, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(getAdRequest, "getAdRequest");
        n.f(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(handleGatewayAdResponse, "handleGatewayAdResponse");
        n.f(sessionRepository, "sessionRepository");
        n.f(gatewayClient, "gatewayClient");
        n.f(adRepository, "adRepository");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        boolean z10 = unityAdsNetworkException instanceof NetworkTimeoutException;
        return new LoadResult.Failure(z10 ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR, z10 ? LoadResult.MSG_TIMEOUT : LoadResult.MSG_COMMUNICATION_FAILURE, unityAdsNetworkException, z10 ? "timeout" : "gateway", unityAdsNetworkException.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, m8.d<? super LoadResult> dVar) {
        return i.g(this.defaultDispatcher, new AndroidLoad$invoke$2(this, bannerSize, headerBiddingAdMarkup, str, byteString, unityAdsLoadOptions, context, null), dVar);
    }
}
