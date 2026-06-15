package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataKt;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: MutableDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MutableDataKtKt {
    /* renamed from: -initializemutableData  reason: not valid java name */
    public static final MutableDataOuterClass.MutableData m104initializemutableData(l<? super MutableDataKt.Dsl, w> block) {
        n.f(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder newBuilder = MutableDataOuterClass.MutableData.newBuilder();
        n.e(newBuilder, "newBuilder()");
        MutableDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final MutableDataOuterClass.MutableData copy(MutableDataOuterClass.MutableData mutableData, l<? super MutableDataKt.Dsl, w> block) {
        n.f(mutableData, "<this>");
        n.f(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder builder = mutableData.toBuilder();
        n.e(builder, "this.toBuilder()");
        MutableDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        n.f(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        n.f(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }
}
