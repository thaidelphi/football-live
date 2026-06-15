package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: TimestampsKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TimestampsKtKt {
    /* renamed from: -initializetimestamps  reason: not valid java name */
    public static final TimestampsOuterClass.Timestamps m121initializetimestamps(l<? super TimestampsKt.Dsl, w> block) {
        n.f(block, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder newBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        n.e(newBuilder, "newBuilder()");
        TimestampsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps copy(TimestampsOuterClass.Timestamps timestamps, l<? super TimestampsKt.Dsl, w> block) {
        n.f(timestamps, "<this>");
        n.f(block, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder builder = timestamps.toBuilder();
        n.e(builder, "this.toBuilder()");
        TimestampsKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Timestamp getTimestampOrNull(TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        n.f(timestampsOrBuilder, "<this>");
        if (timestampsOrBuilder.hasTimestamp()) {
            return timestampsOrBuilder.getTimestamp();
        }
        return null;
    }
}
