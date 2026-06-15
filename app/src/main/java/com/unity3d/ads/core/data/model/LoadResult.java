package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: LoadResult.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class LoadResult {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_AD_MARKUP_PARSING = "[UnityAds] Could not parse Ad Markup";
    public static final String MSG_AD_OBJECT = "[UnityAds] Ad not found";
    public static final String MSG_COMMUNICATION_FAILURE = "[UnityAds] Internal communication failure";
    public static final String MSG_COMMUNICATION_FAILURE_WITH_DETAILS = "[UnityAds] Internal communication failure: %s";
    public static final String MSG_COMMUNICATION_TIMEOUT = "[UnityAds] Internal communication timeout";
    public static final String MSG_CREATE_REQUEST = "[UnityAds] Failed to create load request";
    public static final String MSG_INIT_FAILED = "[UnityAds] SDK Initialization Failed";
    public static final String MSG_INIT_FAILURE = "[UnityAds] SDK Initialization Failure";
    public static final String MSG_NOT_INITIALIZED = "[UnityAds] SDK not initialized";
    public static final String MSG_NO_FILL = "[UnityAds] No fill";
    public static final String MSG_OPPORTUNITY_ID = "[UnityAds] Object ID cannot be null";
    public static final String MSG_OPPORTUNITY_ID_USED = "[UnityAds] Object ID already used";
    public static final String MSG_PLACEMENT_NULL = "[UnityAds] Placement ID cannot be null";
    public static final String MSG_TIMEOUT = "[UnityAds] Timeout while loading ";

    /* compiled from: LoadResult.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: LoadResult.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Failure extends LoadResult {
        private final UnityAds.UnityAdsLoadError error;
        private final boolean isScarAd;
        private final String message;
        private final String reason;
        private final String reasonDebug;
        private final Throwable throwable;

        public /* synthetic */ Failure(UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z10, int i10, h hVar) {
            this(unityAdsLoadError, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : th, str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, Throwable th, String str2, String str3, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityAdsLoadError = failure.error;
            }
            if ((i10 & 2) != 0) {
                str = failure.message;
            }
            String str4 = str;
            if ((i10 & 4) != 0) {
                th = failure.throwable;
            }
            Throwable th2 = th;
            if ((i10 & 8) != 0) {
                str2 = failure.reason;
            }
            String str5 = str2;
            if ((i10 & 16) != 0) {
                str3 = failure.reasonDebug;
            }
            String str6 = str3;
            if ((i10 & 32) != 0) {
                z10 = failure.isScarAd;
            }
            return failure.copy(unityAdsLoadError, str4, th2, str5, str6, z10);
        }

        public final UnityAds.UnityAdsLoadError component1() {
            return this.error;
        }

        public final String component2() {
            return this.message;
        }

        public final Throwable component3() {
            return this.throwable;
        }

        public final String component4() {
            return this.reason;
        }

        public final String component5() {
            return this.reasonDebug;
        }

        public final boolean component6() {
            return this.isScarAd;
        }

        public final Failure copy(UnityAds.UnityAdsLoadError error, String str, Throwable th, String reason, String str2, boolean z10) {
            n.f(error, "error");
            n.f(reason, "reason");
            return new Failure(error, str, th, reason, str2, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failure) {
                Failure failure = (Failure) obj;
                return this.error == failure.error && n.a(this.message, failure.message) && n.a(this.throwable, failure.throwable) && n.a(this.reason, failure.reason) && n.a(this.reasonDebug, failure.reasonDebug) && this.isScarAd == failure.isScarAd;
            }
            return false;
        }

        public final UnityAds.UnityAdsLoadError getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.error.hashCode() * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.throwable;
            int hashCode3 = (((hashCode2 + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
            String str2 = this.reasonDebug;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z10 = this.isScarAd;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode4 + i10;
        }

        public final boolean isScarAd() {
            return this.isScarAd;
        }

        public String toString() {
            return "Failure(error=" + this.error + ", message=" + this.message + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", isScarAd=" + this.isScarAd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(UnityAds.UnityAdsLoadError error, String str, Throwable th, String reason, String str2, boolean z10) {
            super(null);
            n.f(error, "error");
            n.f(reason, "reason");
            this.error = error;
            this.message = str;
            this.throwable = th;
            this.reason = reason;
            this.reasonDebug = str2;
            this.isScarAd = z10;
        }
    }

    /* compiled from: LoadResult.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Success extends LoadResult {
        private final AdObject adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(AdObject adObject) {
            super(null);
            n.f(adObject, "adObject");
            this.adObject = adObject;
        }

        public static /* synthetic */ Success copy$default(Success success, AdObject adObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adObject = success.adObject;
            }
            return success.copy(adObject);
        }

        public final AdObject component1() {
            return this.adObject;
        }

        public final Success copy(AdObject adObject) {
            n.f(adObject, "adObject");
            return new Success(adObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && n.a(this.adObject, ((Success) obj).adObject);
        }

        public final AdObject getAdObject() {
            return this.adObject;
        }

        public int hashCode() {
            return this.adObject.hashCode();
        }

        public String toString() {
            return "Success(adObject=" + this.adObject + ')';
        }
    }

    private LoadResult() {
    }

    public /* synthetic */ LoadResult(h hVar) {
        this();
    }
}
