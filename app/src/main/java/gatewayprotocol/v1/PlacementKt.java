package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: PlacementKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class PlacementKt {
    public static final PlacementKt INSTANCE = new PlacementKt();

    /* compiled from: PlacementKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.Placement.Builder _builder;

        /* compiled from: PlacementKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.Placement.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationResponseOuterClass.Placement.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.Placement.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.Placement _build() {
            InitializationResponseOuterClass.Placement build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            n.e(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final void setAdFormat(InitializationResponseOuterClass.AdFormat value) {
            n.f(value, "value");
            this._builder.setAdFormat(value);
        }
    }

    private PlacementKt() {
    }
}
