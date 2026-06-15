package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AdDataRefreshResponseKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdDataRefreshResponseKt {
    public static final AdDataRefreshResponseKt INSTANCE = new AdDataRefreshResponseKt();

    /* compiled from: AdDataRefreshResponseKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder _builder;

        /* compiled from: AdDataRefreshResponseKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ AdDataRefreshResponseOuterClass.AdDataRefreshResponse _build() {
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            n.e(adData, "_builder.getAdData()");
            return adData;
        }

        public final ByteString getAdDataRefreshToken() {
            ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            n.e(adDataRefreshToken, "_builder.getAdDataRefreshToken()");
            return adDataRefreshToken;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            n.e(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            n.f(dsl, "<this>");
            return AdDataRefreshResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            n.e(trackingToken, "_builder.getTrackingToken()");
            return trackingToken;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setAdData(ByteString value) {
            n.f(value, "value");
            this._builder.setAdData(value);
        }

        public final void setAdDataRefreshToken(ByteString value) {
            n.f(value, "value");
            this._builder.setAdDataRefreshToken(value);
        }

        public final void setAdDataVersion(int i10) {
            this._builder.setAdDataVersion(i10);
        }

        public final void setError(ErrorOuterClass.Error value) {
            n.f(value, "value");
            this._builder.setError(value);
        }

        public final void setTrackingToken(ByteString value) {
            n.f(value, "value");
            this._builder.setTrackingToken(value);
        }
    }

    private AdDataRefreshResponseKt() {
    }
}
