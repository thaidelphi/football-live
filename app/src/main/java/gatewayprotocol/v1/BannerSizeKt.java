package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdRequestOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: BannerSizeKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BannerSizeKt {
    public static final BannerSizeKt INSTANCE = new BannerSizeKt();

    /* compiled from: BannerSizeKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRequestOuterClass.BannerSize.Builder _builder;

        /* compiled from: BannerSizeKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.BannerSize.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(AdRequestOuterClass.BannerSize.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.BannerSize.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.BannerSize _build() {
            AdRequestOuterClass.BannerSize build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        public final int getHeight() {
            return this._builder.getHeight();
        }

        public final int getWidth() {
            return this._builder.getWidth();
        }

        public final void setHeight(int i10) {
            this._builder.setHeight(i10);
        }

        public final void setWidth(int i10) {
            this._builder.setWidth(i10);
        }
    }

    private BannerSizeKt() {
    }
}
