package gatewayprotocol.v1;

import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: TestDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TestDataKtKt {
    /* renamed from: -initializetestData  reason: not valid java name */
    public static final TestDataOuterClass.TestData m120initializetestData(l<? super TestDataKt.Dsl, w> block) {
        n.f(block, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        n.e(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TestDataOuterClass.TestData copy(TestDataOuterClass.TestData testData, l<? super TestDataKt.Dsl, w> block) {
        n.f(testData, "<this>");
        n.f(block, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder builder = testData.toBuilder();
        n.e(builder, "this.toBuilder()");
        TestDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
