package gatewayprotocol.v1;

import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: StaticDeviceInfoKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class StaticDeviceInfoKtKt {
    /* renamed from: -initializestaticDeviceInfo  reason: not valid java name */
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo m119initializestaticDeviceInfo(l<? super StaticDeviceInfoKt.Dsl, w> block) {
        n.f(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        n.e(newBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo copy(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, l<? super StaticDeviceInfoKt.Dsl, w> block) {
        n.f(staticDeviceInfo, "<this>");
        n.f(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        n.e(builder, "this.toBuilder()");
        StaticDeviceInfoKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        n.f(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        n.f(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2, l<? super StaticDeviceInfoKt.AndroidKt.Dsl, w> block) {
        n.f(android2, "<this>");
        n.f(block, "block");
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder = android2.toBuilder();
        n.e(builder, "this.toBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, l<? super StaticDeviceInfoKt.IosKt.Dsl, w> block) {
        n.f(ios, "<this>");
        n.f(block, "block");
        StaticDeviceInfoKt.IosKt.Dsl.Companion companion = StaticDeviceInfoKt.IosKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder = ios.toBuilder();
        n.e(builder, "this.toBuilder()");
        StaticDeviceInfoKt.IosKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
