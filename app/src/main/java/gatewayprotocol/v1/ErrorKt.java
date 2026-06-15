package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: ErrorKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* compiled from: ErrorKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        /* compiled from: ErrorKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            n.e(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final void setErrorText(String value) {
            n.f(value, "value");
            this._builder.setErrorText(value);
        }
    }

    private ErrorKt() {
    }
}
