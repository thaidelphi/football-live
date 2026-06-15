package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: TimestampsKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TimestampsKt {
    public static final TimestampsKt INSTANCE = new TimestampsKt();

    /* compiled from: TimestampsKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TimestampsOuterClass.Timestamps.Builder _builder;

        /* compiled from: TimestampsKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TimestampsOuterClass.Timestamps.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TimestampsOuterClass.Timestamps.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TimestampsOuterClass.Timestamps.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ TimestampsOuterClass.Timestamps _build() {
            TimestampsOuterClass.Timestamps build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearSessionTimestamp() {
            this._builder.clearSessionTimestamp();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final long getSessionTimestamp() {
            return this._builder.getSessionTimestamp();
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            n.e(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setSessionTimestamp(long j10) {
            this._builder.setSessionTimestamp(j10);
        }

        public final void setTimestamp(Timestamp value) {
            n.f(value, "value");
            this._builder.setTimestamp(value);
        }
    }

    private TimestampsKt() {
    }
}
