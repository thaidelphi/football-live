package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: MutableDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MutableDataKt {
    public static final MutableDataKt INSTANCE = new MutableDataKt();

    /* compiled from: MutableDataKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MutableDataOuterClass.MutableData.Builder _builder;

        /* compiled from: MutableDataKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MutableDataOuterClass.MutableData.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(MutableDataOuterClass.MutableData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(MutableDataOuterClass.MutableData.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ MutableDataOuterClass.MutableData _build() {
            MutableDataOuterClass.MutableData build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this._builder.getAllowedPii();
            n.e(allowedPii, "_builder.getAllowedPii()");
            return allowedPii;
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(Dsl dsl) {
            n.f(dsl, "<this>");
            return MutableDataKtKt.getAllowedPiiOrNull(dsl._builder);
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            n.e(cache, "_builder.getCache()");
            return cache;
        }

        public final ByteString getCurrentState() {
            ByteString currentState = this._builder.getCurrentState();
            n.e(currentState, "_builder.getCurrentState()");
            return currentState;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            n.e(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getPrivacyFsm() {
            ByteString privacyFsm = this._builder.getPrivacyFsm();
            n.e(privacyFsm, "_builder.getPrivacyFsm()");
            return privacyFsm;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            n.e(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(Dsl dsl) {
            n.f(dsl, "<this>");
            return MutableDataKtKt.getSessionCountersOrNull(dsl._builder);
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            n.e(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        public final void setAllowedPii(AllowedPiiOuterClass.AllowedPii value) {
            n.f(value, "value");
            this._builder.setAllowedPii(value);
        }

        public final void setCache(ByteString value) {
            n.f(value, "value");
            this._builder.setCache(value);
        }

        public final void setCurrentState(ByteString value) {
            n.f(value, "value");
            this._builder.setCurrentState(value);
        }

        public final void setPrivacy(ByteString value) {
            n.f(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setPrivacyFsm(ByteString value) {
            n.f(value, "value");
            this._builder.setPrivacyFsm(value);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            n.f(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setSessionToken(ByteString value) {
            n.f(value, "value");
            this._builder.setSessionToken(value);
        }
    }

    private MutableDataKt() {
    }
}
