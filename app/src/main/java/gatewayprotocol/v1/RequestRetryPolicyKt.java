package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: RequestRetryPolicyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RequestRetryPolicyKt {
    public static final RequestRetryPolicyKt INSTANCE = new RequestRetryPolicyKt();

    /* compiled from: RequestRetryPolicyKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestRetryPolicy.Builder _builder;

        /* compiled from: RequestRetryPolicyKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestRetryPolicy _build() {
            NativeConfigurationOuterClass.RequestRetryPolicy build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearMaxDuration() {
            this._builder.clearMaxDuration();
        }

        public final void clearRetryJitterPct() {
            this._builder.clearRetryJitterPct();
        }

        public final void clearRetryMaxInterval() {
            this._builder.clearRetryMaxInterval();
        }

        public final void clearRetryScalingFactor() {
            this._builder.clearRetryScalingFactor();
        }

        public final void clearRetryWaitBase() {
            this._builder.clearRetryWaitBase();
        }

        public final void clearShouldStoreLocally() {
            this._builder.clearShouldStoreLocally();
        }

        public final int getMaxDuration() {
            return this._builder.getMaxDuration();
        }

        public final float getRetryJitterPct() {
            return this._builder.getRetryJitterPct();
        }

        public final int getRetryMaxInterval() {
            return this._builder.getRetryMaxInterval();
        }

        public final float getRetryScalingFactor() {
            return this._builder.getRetryScalingFactor();
        }

        public final int getRetryWaitBase() {
            return this._builder.getRetryWaitBase();
        }

        public final boolean getShouldStoreLocally() {
            return this._builder.getShouldStoreLocally();
        }

        public final void setMaxDuration(int i10) {
            this._builder.setMaxDuration(i10);
        }

        public final void setRetryJitterPct(float f10) {
            this._builder.setRetryJitterPct(f10);
        }

        public final void setRetryMaxInterval(int i10) {
            this._builder.setRetryMaxInterval(i10);
        }

        public final void setRetryScalingFactor(float f10) {
            this._builder.setRetryScalingFactor(f10);
        }

        public final void setRetryWaitBase(int i10) {
            this._builder.setRetryWaitBase(i10);
        }

        public final void setShouldStoreLocally(boolean z10) {
            this._builder.setShouldStoreLocally(z10);
        }
    }

    private RequestRetryPolicyKt() {
    }
}
