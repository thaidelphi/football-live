package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: InitializationRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    /* compiled from: InitializationRequestKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        /* compiled from: InitializationRequestKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            n.e(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            n.e(auid, "_builder.getAuid()");
            return auid;
        }

        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            n.e(auidString, "_builder.getAuidString()");
            return auidString;
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            n.e(cache, "_builder.getCache()");
            return cache;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            n.e(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            n.e(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            n.e(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            n.e(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            n.e(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            n.e(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            n.e(uadsInitBlob, "_builder.getUadsInitBlob()");
            return uadsInitBlob;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final void setAnalyticsUserId(String value) {
            n.f(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        public final void setAuid(ByteString value) {
            n.f(value, "value");
            this._builder.setAuid(value);
        }

        public final void setAuidString(String value) {
            n.f(value, "value");
            this._builder.setAuidString(value);
        }

        public final void setCache(ByteString value) {
            n.f(value, "value");
            this._builder.setCache(value);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            n.f(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo value) {
            n.f(value, "value");
            this._builder.setDeviceInfo(value);
        }

        public final void setIdfi(String value) {
            n.f(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setIsFirstInit(boolean z10) {
            this._builder.setIsFirstInit(z10);
        }

        public final void setLegacyFlowUserConsent(String value) {
            n.f(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        public final void setPrivacy(ByteString value) {
            n.f(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setSessionId(ByteString value) {
            n.f(value, "value");
            this._builder.setSessionId(value);
        }

        public final void setUadsInitBlob(ByteString value) {
            n.f(value, "value");
            this._builder.setUadsInitBlob(value);
        }
    }

    private InitializationRequestKt() {
    }
}
