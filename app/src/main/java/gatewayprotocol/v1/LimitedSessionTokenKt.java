package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: LimitedSessionTokenKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LimitedSessionTokenKt {
    public static final LimitedSessionTokenKt INSTANCE = new LimitedSessionTokenKt();

    /* compiled from: LimitedSessionTokenKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        /* compiled from: LimitedSessionTokenKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.LimitedSessionToken _build() {
            UniversalRequestOuterClass.LimitedSessionToken build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            n.e(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            n.e(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            n.e(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            n.e(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            n.e(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            n.e(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            n.e(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            n.e(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            n.e(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            n.e(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            n.e(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        public final void setCustomMediationName(String value) {
            n.f(value, "value");
            this._builder.setCustomMediationName(value);
        }

        public final void setDeviceMake(String value) {
            n.f(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            n.f(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setGameId(String value) {
            n.f(value, "value");
            this._builder.setGameId(value);
        }

        public final void setIdfi(String value) {
            n.f(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider value) {
            n.f(value, "value");
            this._builder.setMediationProvider(value);
        }

        public final void setMediationVersion(String value) {
            n.f(value, "value");
            this._builder.setMediationVersion(value);
        }

        public final void setOsVersion(String value) {
            n.f(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform value) {
            n.f(value, "value");
            this._builder.setPlatform(value);
        }

        public final void setSdkVersion(int i10) {
            this._builder.setSdkVersion(i10);
        }

        public final void setSdkVersionName(String value) {
            n.f(value, "value");
            this._builder.setSdkVersionName(value);
        }

        public final void setSessionId(ByteString value) {
            n.f(value, "value");
            this._builder.setSessionId(value);
        }
    }

    private LimitedSessionTokenKt() {
    }
}
