package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.n;
/* compiled from: ByteStrings.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i10) {
        n.f(byteString, "<this>");
        return byteString.byteAt(i10);
    }

    public static final ByteString plus(ByteString byteString, ByteString other) {
        n.f(byteString, "<this>");
        n.f(other, "other");
        ByteString concat = byteString.concat(other);
        n.e(concat, "concat(other)");
        return concat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        n.f(bArr, "<this>");
        ByteString copyFrom = ByteString.copyFrom(bArr);
        n.e(copyFrom, "copyFrom(this)");
        return copyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        n.f(str, "<this>");
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        n.e(copyFromUtf8, "copyFromUtf8(this)");
        return copyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        n.f(byteBuffer, "<this>");
        ByteString copyFrom = ByteString.copyFrom(byteBuffer);
        n.e(copyFrom, "copyFrom(this)");
        return copyFrom;
    }
}
