package com.startapp.sdk.ads.video.vast;

import com.ironsource.j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public enum VASTErrorCodes {
    ErrorNone(0),
    XMLParsingError(100),
    /* JADX INFO: Fake field, exist only in values array */
    SchemaValidationError(101),
    /* JADX INFO: Fake field, exist only in values array */
    VersionOfResponseNotSupported(102),
    /* JADX INFO: Fake field, exist only in values array */
    TraffickingError(200),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentLinearity(j3.c.b.f17911b),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentDuration(j3.c.b.f17912c),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentSize(j3.c.b.f17913d),
    /* JADX INFO: Fake field, exist only in values array */
    AdCategoryRequired(204),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralWrapperError(300),
    WrapperTimeout(301),
    /* JADX INFO: Fake field, exist only in values array */
    WrapperLimitReached(302),
    WrapperNoReponse(303),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(304),
    GeneralLinearError(CommonGatewayClient.CODE_400),
    FileNotFound(j3.a.b.f17897b),
    TimeoutMediaFileURI(402),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(j3.a.b.f17898c),
    MediaFileDisplayError(j3.a.b.f17900e),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(j3.a.b.f17901f),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(j3.a.b.f17902g),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(j3.a.b.f17903h),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(j3.a.b.f17904i),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(j3.a.b.f17905j),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(j3.a.b.f17906k),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(503),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(600),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED),
    UndefinedError(900),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(901),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS),
    SAProcessSuccess(20000);
    
    private int value;

    VASTErrorCodes(int i10) {
        this.value = i10;
    }

    public final int a() {
        return this.value;
    }
}
