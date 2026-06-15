package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: RequestPolicyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RequestPolicyKt {
    public static final RequestPolicyKt INSTANCE = new RequestPolicyKt();

    /* compiled from: RequestPolicyKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestPolicy.Builder _builder;

        /* compiled from: RequestPolicyKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestPolicy _build() {
            NativeConfigurationOuterClass.RequestPolicy build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearRetryPolicy() {
            this._builder.clearRetryPolicy();
        }

        public final void clearTimeoutPolicy() {
            this._builder.clearTimeoutPolicy();
        }

        public final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
            NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = this._builder.getRetryPolicy();
            n.e(retryPolicy, "_builder.getRetryPolicy()");
            return retryPolicy;
        }

        public final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
            NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = this._builder.getTimeoutPolicy();
            n.e(timeoutPolicy, "_builder.getTimeoutPolicy()");
            return timeoutPolicy;
        }

        public final boolean hasRetryPolicy() {
            return this._builder.hasRetryPolicy();
        }

        public final boolean hasTimeoutPolicy() {
            return this._builder.hasTimeoutPolicy();
        }

        public final void setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy value) {
            n.f(value, "value");
            this._builder.setRetryPolicy(value);
        }

        public final void setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy value) {
            n.f(value, "value");
            this._builder.setTimeoutPolicy(value);
        }
    }

    private RequestPolicyKt() {
    }
}
