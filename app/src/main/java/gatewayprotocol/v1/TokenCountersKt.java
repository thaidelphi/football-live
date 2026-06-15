package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: TokenCountersKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TokenCountersKt {
    public static final TokenCountersKt INSTANCE = new TokenCountersKt();

    /* compiled from: TokenCountersKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingTokenOuterClass.TokenCounters.Builder _builder;

        /* compiled from: TokenCountersKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.TokenCounters _build() {
            HeaderBiddingTokenOuterClass.TokenCounters build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearSeq() {
            this._builder.clearSeq();
        }

        public final void clearStarts() {
            this._builder.clearStarts();
        }

        public final void clearWins() {
            this._builder.clearWins();
        }

        public final int getSeq() {
            return this._builder.getSeq();
        }

        public final int getStarts() {
            return this._builder.getStarts();
        }

        public final int getWins() {
            return this._builder.getWins();
        }

        public final void setSeq(int i10) {
            this._builder.setSeq(i10);
        }

        public final void setStarts(int i10) {
            this._builder.setStarts(i10);
        }

        public final void setWins(int i10) {
            this._builder.setWins(i10);
        }
    }

    private TokenCountersKt() {
    }
}
