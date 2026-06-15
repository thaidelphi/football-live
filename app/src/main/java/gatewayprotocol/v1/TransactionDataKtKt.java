package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: TransactionDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TransactionDataKtKt {
    /* renamed from: -initializetransactionData  reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionData m123initializetransactionData(l<? super TransactionDataKt.Dsl, w> block) {
        n.f(block, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder newBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        n.e(newBuilder, "newBuilder()");
        TransactionDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionData copy(TransactionEventRequestOuterClass.TransactionData transactionData, l<? super TransactionDataKt.Dsl, w> block) {
        n.f(transactionData, "<this>");
        n.f(block, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builder = transactionData.toBuilder();
        n.e(builder, "this.toBuilder()");
        TransactionDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Timestamp getTimestampOrNull(TransactionEventRequestOuterClass.TransactionDataOrBuilder transactionDataOrBuilder) {
        n.f(transactionDataOrBuilder, "<this>");
        if (transactionDataOrBuilder.hasTimestamp()) {
            return transactionDataOrBuilder.getTimestamp();
        }
        return null;
    }
}
