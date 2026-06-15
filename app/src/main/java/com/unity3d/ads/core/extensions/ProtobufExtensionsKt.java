package com.unity3d.ads.core.extensions;

import android.util.Base64;
import b9.c;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.n;
/* compiled from: ProtobufExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z10) {
        n.f(str, "<this>");
        ByteString copyFrom = ByteString.copyFrom(Base64.decode(str, z10 ? 10 : 2));
        n.e(copyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return copyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return fromBase64(str, z10);
    }

    public static final String toBase64(ByteString byteString, boolean z10) {
        n.f(byteString, "<this>");
        String encodeToString = Base64.encodeToString(byteString.toByteArray(), z10 ? 10 : 2);
        n.e(encodeToString, "encodeToString(this.toByteArray(), flag)");
        return encodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toBase64(byteString, z10);
    }

    public static final ByteString toByteString(UUID uuid) {
        n.f(uuid, "<this>");
        ByteString copyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        n.e(copyFrom, "copyFrom(bytes.array())");
        return copyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        n.f(str, "<this>");
        byte[] bytes = str.getBytes(c.f5288g);
        n.e(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString copyFrom = ByteString.copyFrom(bytes);
        n.e(copyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return copyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        n.f(byteString, "<this>");
        String byteString2 = byteString.toString(c.f5288g);
        n.e(byteString2, "this.toString(Charsets.ISO_8859_1)");
        return byteString2;
    }

    public static final UUID toUUID(ByteString byteString) {
        n.f(byteString, "<this>");
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        n.e(asReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (asReadOnlyByteBuffer.remaining() == 36) {
            UUID fromString = UUID.fromString(byteString.toStringUtf8());
            n.e(fromString, "fromString(uuidString)");
            return fromString;
        } else if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        } else {
            throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
        }
    }
}
