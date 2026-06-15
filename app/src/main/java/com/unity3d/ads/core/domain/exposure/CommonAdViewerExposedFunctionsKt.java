package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import i8.w;
import j8.i0;
import j8.m;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import m8.d;
import m8.i;
import n8.c;
import org.json.JSONObject;
/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonAdViewerExposedFunctionsKt {
    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        n.f(androidAttribution, "androidAttribution");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterClick$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, dVar);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        n.f(androidAttribution, "androidAttribution");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterView$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, dVar);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$clearStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                d b10;
                Object c10;
                b10 = c.b(dVar);
                i iVar = new i(b10);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(iVar));
                Object a10 = iVar.a();
                c10 = n8.d.c();
                if (a10 == c10) {
                    h.c(dVar);
                }
                return a10;
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$deleteStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                d b10;
                Object c10;
                b10 = c.b(dVar);
                i iVar = new i(b10);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(iVar));
                Object a10 = iVar.a();
                c10 = n8.d.c();
                if (a10 == c10) {
                    h.c(dVar);
                }
                return a10;
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        n.f(cacheFile, "cacheFile");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$download$1(cacheFile, adObject);
    }

    /* renamed from: getAdContext-yLuu4LI  reason: not valid java name */
    public static final ExposedFunction m49getAdContextyLuu4LI(AndroidGetAdPlayerContext getAndroidAdPlayerContext, String adData, String impressionConfig, String adDataRefreshToken, IsOMActivated isOMActivated, AdObject adObject) {
        n.f(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        n.f(adData, "adData");
        n.f(impressionConfig, "impressionConfig");
        n.f(adDataRefreshToken, "adDataRefreshToken");
        n.f(isOMActivated, "isOMActivated");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                String encodeToString = Base64.encodeToString(DeviceInfoRepository.this.getAllowedPii().getValue().toByteArray(), 2);
                n.e(encodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return encodeToString;
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getConnectionType$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                DynamicDeviceInfoOuterClass.ConnectionType connectionType = DeviceInfoRepository.this.getDynamicDeviceInfo().getConnectionType();
                n.e(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                return b.b(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                return b.b(DeviceInfoRepository.this.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getKeysStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                d b10;
                Object c10;
                b10 = c.b(dVar);
                i iVar = new i(b10);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(iVar));
                Object a10 = iVar.a();
                c10 = n8.d.c();
                if (a10 == c10) {
                    h.c(dVar);
                }
                return a10;
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenHeight$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                return b.c(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenWidth$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                return b.c(DeviceInfoRepository.this.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getSessionToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                return ProtobufExtensionsKt.toBase64$default(SessionRepository.this.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                d b10;
                Object c10;
                b10 = c.b(dVar);
                i iVar = new i(b10);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(iVar));
                Object a10 = iVar.a();
                c10 = n8.d.c();
                if (a10 == c10) {
                    h.c(dVar);
                }
                return a10;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementStarts$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                SessionRepository.this.incrementTokenStartsCount();
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementWins$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                SessionRepository.this.incrementTokenWinsCount();
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenReset$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                SessionRepository.this.resetTokenCounters();
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                SessionRepository.this.incrementBannerImpressionCount();
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        n.f(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isAttributionAvailable$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                return AndroidAttribution.this.isAvailable(dVar);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIfFileCache) {
        n.f(getIfFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isFileCached$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                return GetIsFileCache.this.invoke((String) obj, dVar);
            }
        };
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        n.f(loadScarAd, "loadScarAd");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$loadScarAd$1(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        n.f(campaignRepository, "campaignRepository");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                CampaignRepository.this.setShowTimestamp(adObject.getOpportunityId());
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        n.f(omFinishSession, "omFinishSession");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omFinishSession$1(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        n.f(getOmData, "getOmData");
        return new CommonAdViewerExposedFunctionsKt$omGetData$1(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        n.f(omImpressionOccurred, "omImpressionOccurred");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omImpression$1(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmStartSession omStartSession, AdObject adObject) {
        n.f(omStartSession, "omStartSession");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$omStartSession$1(omStartSession, adObject);
    }

    public static final ExposedFunction openUrl(final HandleOpenUrl handleOpenUrl) {
        n.f(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                Object o10;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                o10 = m.o(objArr, 1);
                JSONObject jSONObject = o10 instanceof JSONObject ? (JSONObject) o10 : null;
                HandleOpenUrl.this.invoke(str, jSONObject != null ? jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME) : null);
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$readStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                d b10;
                Object c10;
                b10 = c.b(dVar);
                i iVar = new i(b10);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(iVar));
                Object a10 = iVar.a();
                c10 = n8.d.c();
                if (a10 == c10) {
                    h.c(dVar);
                }
                return a10;
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        n.f(refresh, "refresh");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$refreshAdData$1(refresh, adObject);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                Map b10;
                Map a10;
                Object o10;
                String obj;
                Object obj2 = objArr[0];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = objArr[1];
                n.d(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj3;
                b10 = i0.b();
                Iterator<String> keys = jSONObject.keys();
                n.e(keys, "tags.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    b10.put(next, jSONObject.getString(next));
                }
                a10 = i0.a(b10);
                o10 = m.o(objArr, 2);
                SendDiagnosticEvent.DefaultImpls.invoke$default(SendDiagnosticEvent.this, str, (o10 == null || (obj = o10.toString()) == null) ? null : b.b(Double.parseDouble(obj)), a10, null, adObject, 8, null);
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        n.f(getOperativeEventApi, "getOperativeEventApi");
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        n.f(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                AllowedPiiOuterClass.AllowedPii value;
                final AllowedPiiKt.Dsl _create;
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                g9.w<AllowedPiiOuterClass.AllowedPii> allowedPii = DeviceInfoRepository.this.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = value.toBuilder();
                    n.e(builder, "this.toBuilder()");
                    _create = companion._create(builder);
                    new q(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                        @Override // kotlin.jvm.internal.q, z8.i
                        public Object get() {
                            return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                        }

                        @Override // kotlin.jvm.internal.q, z8.g
                        public void set(Object obj2) {
                            ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                        }
                    }.set(b.a(jSONObject.optBoolean("idfa")));
                    new q(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                        @Override // kotlin.jvm.internal.q, z8.i
                        public Object get() {
                            return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                        }

                        @Override // kotlin.jvm.internal.q, z8.g
                        public void set(Object obj2) {
                            ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                        }
                    }.set(b.a(jSONObject.optBoolean("idfv")));
                } while (!allowedPii.i(value, _create._build()));
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        n.f(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$setOrientation$1(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        return new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                d b10;
                Object c10;
                b10 = c.b(dVar);
                i iVar = new i(b10);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(iVar));
                Object a10 = iVar.a();
                c10 = n8.d.c();
                if (a10 == c10) {
                    h.c(dVar);
                }
                return a10;
            }
        };
    }

    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showScarAd$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        n.f(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateTrackingToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<? super w>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<? super w> dVar) {
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String token = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (!(token == null || token.length() == 0)) {
                    AdObject adObject2 = AdObject.this;
                    n.e(token, "token");
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return w.f26638a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$writeStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, t8.p
            public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, d<? super Object> dVar) {
                return invoke2(objArr, (d<Object>) dVar);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, d<Object> dVar) {
                d b10;
                Object c10;
                b10 = c.b(dVar);
                i iVar = new i(b10);
                Object obj = objArr[0];
                n.d(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(iVar));
                Object a10 = iVar.a();
                c10 = n8.d.c();
                if (a10 == c10) {
                    h.c(dVar);
                }
                return a10;
            }
        };
    }
}
