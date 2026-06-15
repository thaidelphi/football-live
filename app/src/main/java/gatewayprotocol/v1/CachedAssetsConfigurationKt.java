package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: CachedAssetsConfigurationKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CachedAssetsConfigurationKt {
    public static final CachedAssetsConfigurationKt INSTANCE = new CachedAssetsConfigurationKt();

    /* compiled from: CachedAssetsConfigurationKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder _builder;

        /* compiled from: CachedAssetsConfigurationKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.CachedAssetsConfiguration _build() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearMaxCachedAssetAgeMs() {
            this._builder.clearMaxCachedAssetAgeMs();
        }

        public final void clearMaxCachedAssetSizeMb() {
            this._builder.clearMaxCachedAssetSizeMb();
        }

        public final long getMaxCachedAssetAgeMs() {
            return this._builder.getMaxCachedAssetAgeMs();
        }

        public final int getMaxCachedAssetSizeMb() {
            return this._builder.getMaxCachedAssetSizeMb();
        }

        public final void setMaxCachedAssetAgeMs(long j10) {
            this._builder.setMaxCachedAssetAgeMs(j10);
        }

        public final void setMaxCachedAssetSizeMb(int i10) {
            this._builder.setMaxCachedAssetSizeMb(i10);
        }
    }

    private CachedAssetsConfigurationKt() {
    }
}
