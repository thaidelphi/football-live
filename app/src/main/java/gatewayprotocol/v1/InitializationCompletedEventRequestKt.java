package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: InitializationCompletedEventRequestKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationCompletedEventRequestKt {
    public static final InitializationCompletedEventRequestKt INSTANCE = new InitializationCompletedEventRequestKt();

    /* compiled from: InitializationCompletedEventRequestKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder _builder;

        /* compiled from: InitializationCompletedEventRequestKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build() {
            InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            n.e(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            n.e(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            n.f(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            n.f(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }
    }

    private InitializationCompletedEventRequestKt() {
    }
}
