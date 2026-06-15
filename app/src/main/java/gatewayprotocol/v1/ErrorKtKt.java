package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: ErrorKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ErrorKtKt {
    /* renamed from: -initializeerror  reason: not valid java name */
    public static final ErrorOuterClass.Error m93initializeerror(l<? super ErrorKt.Dsl, w> block) {
        n.f(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder newBuilder = ErrorOuterClass.Error.newBuilder();
        n.e(newBuilder, "newBuilder()");
        ErrorKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, l<? super ErrorKt.Dsl, w> block) {
        n.f(error, "<this>");
        n.f(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        n.e(builder, "this.toBuilder()");
        ErrorKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
