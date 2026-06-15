package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: HeaderBiddingAdMarkupKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HeaderBiddingAdMarkupKt {
    public static final HeaderBiddingAdMarkupKt INSTANCE = new HeaderBiddingAdMarkupKt();

    /* compiled from: HeaderBiddingAdMarkupKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder _builder;

        /* compiled from: HeaderBiddingAdMarkupKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup _build() {
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            n.e(adData, "_builder.getAdData()");
            return adData;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            n.e(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final void setAdData(ByteString value) {
            n.f(value, "value");
            this._builder.setAdData(value);
        }

        public final void setAdDataVersion(int i10) {
            this._builder.setAdDataVersion(i10);
        }

        public final void setConfigurationToken(ByteString value) {
            n.f(value, "value");
            this._builder.setConfigurationToken(value);
        }
    }

    private HeaderBiddingAdMarkupKt() {
    }
}
