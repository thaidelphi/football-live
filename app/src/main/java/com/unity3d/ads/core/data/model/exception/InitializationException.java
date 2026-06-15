package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import d9.x2;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: InitializationException.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* compiled from: InitializationException.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final InitializationException parseFrom(Exception e8) {
            String str;
            n.f(e8, "e");
            if (e8 instanceof x2 ? true : e8 instanceof NetworkTimeoutException) {
                return new InitializationException("Timeout", e8, "timeout", e8.getMessage());
            }
            if (e8 instanceof UnityAdsNetworkException) {
                UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e8;
                if (unityAdsNetworkException.getCode() == null) {
                    str = "network";
                } else {
                    str = "network." + unityAdsNetworkException.getCode();
                }
                return new InitializationException(AndroidInitializeBoldSDK.MSG_NETWORK, e8, str, unityAdsNetworkException.getMessage());
            } else if (!(e8 instanceof GatewayException)) {
                return e8 instanceof InitializationException ? (InitializationException) e8 : new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, e8, "unknown", e8.getMessage());
            } else {
                GatewayException gatewayException = (GatewayException) e8;
                return new InitializationException(AndroidInitializeBoldSDK.MSG_UNKNOWN, gatewayException.getThrowable(), gatewayException.getReason(), gatewayException.getReasonDebug());
            }
        }
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? null : th, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final InitializationException copy(String message, Throwable th, String reason, String str) {
        n.f(message, "message");
        n.f(reason, "reason");
        return new InitializationException(message, th, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitializationException) {
            InitializationException initializationException = (InitializationException) obj;
            return n.a(getMessage(), initializationException.getMessage()) && n.a(this.throwable, initializationException.throwable) && n.a(this.reason, initializationException.reason) && n.a(this.reasonDebug, initializationException.reasonDebug);
        }
        return false;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
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

    public int hashCode() {
        int hashCode = getMessage().hashCode() * 31;
        Throwable th = this.throwable;
        int hashCode2 = (((hashCode + (th == null ? 0 : th.hashCode())) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String message, Throwable th, String reason, String str) {
        super(message);
        n.f(message, "message");
        n.f(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }
}
