package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wb {

    /* renamed from: a  reason: collision with root package name */
    public static final wb f21282a = new wb();

    private wb() {
    }

    private final IronSourceError a(pg pgVar, IronSourceError ironSourceError) {
        String c10;
        if (ironSourceError != null) {
            c10 = pgVar.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ':' + ironSourceError.getErrorMessage() + '\'';
        } else {
            c10 = pgVar.c();
        }
        return new IronSourceError(pgVar.b(), c10);
    }

    private final IronSourceError a(pg pgVar, String str) {
        if (str == null || str.length() == 0) {
            str = pgVar.c();
        }
        return new IronSourceError(pgVar.b(), str);
    }

    static /* synthetic */ IronSourceError a(wb wbVar, pg pgVar, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            ironSourceError = null;
        }
        return wbVar.a(pgVar, ironSourceError);
    }

    public static /* synthetic */ IronSourceError a(wb wbVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return wbVar.a(str);
    }

    public static /* synthetic */ IronSourceError b(wb wbVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return wbVar.b(str);
    }

    public static /* synthetic */ IronSourceError c(wb wbVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return wbVar.d(str);
    }

    public final IronSourceError a() {
        return a(this, pg.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public final IronSourceError a(IronSourceError networkError) {
        kotlin.jvm.internal.n.f(networkError, "networkError");
        return a(pg.ISErrorInitNetworkFailed, networkError);
    }

    public final IronSourceError a(String str) {
        return a(pg.ISErrorBannerLoadNoConfig, str);
    }

    public final IronSourceError b() {
        return a(this, pg.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError b(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        return a(pg.ISErrorLoadNetworkFailed, error);
    }

    public final IronSourceError b(String str) {
        return a(pg.ISErrorInterstitialLoadNoConfig, str);
    }

    public final IronSourceError c() {
        return a(this, pg.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError c(IronSourceError networkError) {
        kotlin.jvm.internal.n.f(networkError, "networkError");
        return a(pg.ISErrorShowNetworkFailed, networkError);
    }

    public final IronSourceError c(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        return a(pg.ISErrorLoadNetworkFailed, description);
    }

    public final IronSourceError d() {
        return a(this, pg.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError d(String str) {
        return a(pg.ISErrorRewardedLoadNoConfig, str);
    }

    public final IronSourceError e() {
        return a(this, pg.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, pg.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, pg.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, pg.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, pg.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, pg.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, pg.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, pg.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, pg.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, pg.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, pg.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, pg.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, pg.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, pg.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, pg.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, pg.ISErrorShowNotReadyToShowAd, null, 2, null);
    }
}
