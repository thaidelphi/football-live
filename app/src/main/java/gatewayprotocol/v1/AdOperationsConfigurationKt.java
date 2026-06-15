package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AdOperationsConfigurationKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AdOperationsConfigurationKt {
    public static final AdOperationsConfigurationKt INSTANCE = new AdOperationsConfigurationKt();

    /* compiled from: AdOperationsConfigurationKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.AdOperationsConfiguration.Builder _builder;

        /* compiled from: AdOperationsConfigurationKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.AdOperationsConfiguration _build() {
            NativeConfigurationOuterClass.AdOperationsConfiguration build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearGetTokenTimeoutMs() {
            this._builder.clearGetTokenTimeoutMs();
        }

        public final void clearLoadTimeoutMs() {
            this._builder.clearLoadTimeoutMs();
        }

        public final void clearShowTimeoutMs() {
            this._builder.clearShowTimeoutMs();
        }

        public final int getGetTokenTimeoutMs() {
            return this._builder.getGetTokenTimeoutMs();
        }

        public final int getLoadTimeoutMs() {
            return this._builder.getLoadTimeoutMs();
        }

        public final int getShowTimeoutMs() {
            return this._builder.getShowTimeoutMs();
        }

        public final void setGetTokenTimeoutMs(int i10) {
            this._builder.setGetTokenTimeoutMs(i10);
        }

        public final void setLoadTimeoutMs(int i10) {
            this._builder.setLoadTimeoutMs(i10);
        }

        public final void setShowTimeoutMs(int i10) {
            this._builder.setShowTimeoutMs(i10);
        }
    }

    private AdOperationsConfigurationKt() {
    }
}
