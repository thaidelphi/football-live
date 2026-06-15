package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.n;
/* compiled from: ExtendableMessageLiteExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, ExtensionLite<M, ?> extension) {
        n.f(morbt, "<this>");
        n.f(extension, "extension");
        return morbt.hasExtension(extension);
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, ExtensionLite<M, T> extension) {
        n.f(morbt, "<this>");
        n.f(extension, "extension");
        T t10 = (T) morbt.getExtension(extension);
        n.e(t10, "getExtension(extension)");
        return t10;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b10, ExtensionLite<M, T> extension, T value) {
        n.f(b10, "<this>");
        n.f(extension, "extension");
        n.f(value, "value");
        b10.setExtension(extension, value);
    }
}
