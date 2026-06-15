package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: InitializationDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationDataKt {
    public static final InitializationDataKt INSTANCE = new InitializationDataKt();

    /* compiled from: InitializationDataKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationDataOuterClass.InitializationData.Builder _builder;

        /* compiled from: InitializationDataKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationDataOuterClass.InitializationData.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationDataOuterClass.InitializationData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationDataOuterClass.InitializationData.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationDataOuterClass.InitializationData _build() {
            InitializationDataOuterClass.InitializationData build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearInitializationRequest() {
            this._builder.clearInitializationRequest();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
            n.e(initializationRequest, "_builder.getInitializationRequest()");
            return initializationRequest;
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(Dsl dsl) {
            n.f(dsl, "<this>");
            return InitializationDataKtKt.getInitializationRequestOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            n.e(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(Dsl dsl) {
            n.f(dsl, "<this>");
            return InitializationDataKtKt.getSharedDataOrNull(dsl._builder);
        }

        public final boolean hasInitializationRequest() {
            return this._builder.hasInitializationRequest();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest value) {
            n.f(value, "value");
            this._builder.setInitializationRequest(value);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData value) {
            n.f(value, "value");
            this._builder.setSharedData(value);
        }
    }

    private InitializationDataKt() {
    }
}
