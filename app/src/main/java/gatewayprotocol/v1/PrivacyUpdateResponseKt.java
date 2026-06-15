package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: PrivacyUpdateResponseKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class PrivacyUpdateResponseKt {
    public static final PrivacyUpdateResponseKt INSTANCE = new PrivacyUpdateResponseKt();

    /* compiled from: PrivacyUpdateResponseKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder _builder;

        /* compiled from: PrivacyUpdateResponseKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse _build() {
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final ByteString getContent() {
            ByteString content = this._builder.getContent();
            n.e(content, "_builder.getContent()");
            return content;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setContent(ByteString value) {
            n.f(value, "value");
            this._builder.setContent(value);
        }

        public final void setVersion(int i10) {
            this._builder.setVersion(i10);
        }
    }

    private PrivacyUpdateResponseKt() {
    }
}
