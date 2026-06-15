package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: GetTokenEventRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class GetTokenEventRequestKt {
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    /* compiled from: GetTokenEventRequestKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        /* compiled from: GetTokenEventRequestKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            GetTokenEventRequestOuterClass.GetTokenEventRequest build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final ByteString getBanner() {
            ByteString banner = this._builder.getBanner();
            n.e(banner, "_builder.getBanner()");
            return banner;
        }

        public final ByteString getInterstitial() {
            ByteString interstitial = this._builder.getInterstitial();
            n.e(interstitial, "_builder.getInterstitial()");
            return interstitial;
        }

        public final ByteString getRewarded() {
            ByteString rewarded = this._builder.getRewarded();
            n.e(rewarded, "_builder.getRewarded()");
            return rewarded;
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            n.e(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final void setBanner(ByteString value) {
            n.f(value, "value");
            this._builder.setBanner(value);
        }

        public final void setInterstitial(ByteString value) {
            n.f(value, "value");
            this._builder.setInterstitial(value);
        }

        public final void setRewarded(ByteString value) {
            n.f(value, "value");
            this._builder.setRewarded(value);
        }

        public final void setTokenId(ByteString value) {
            n.f(value, "value");
            this._builder.setTokenId(value);
        }
    }

    private GetTokenEventRequestKt() {
    }
}
