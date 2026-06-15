package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utf8.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static final b f15537a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Utf8.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!m(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !m(b12) && !m(b13)) {
                int r10 = ((b10 & 7) << 18) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
                cArr[i10] = l(r10);
                cArr[i10 + 1] = q(r10);
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!m(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !m(b12)))) {
                cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b10 >= -62 && !m(b11)) {
                cArr[i10] = (char) (((b10 & 31) << 6) | r(b11));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        private static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        private static boolean m(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b10) {
            return b10 < -32;
        }

        private static char q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        private static int r(byte b10) {
            return b10 & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class b {
        b() {
        }

        private static int m(ByteBuffer byteBuffer, int i10, int i11) {
            int m7 = i10 + u0.m(byteBuffer, i10, i11);
            while (m7 < i11) {
                int i12 = m7 + 1;
                byte b10 = byteBuffer.get(m7);
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 < -62 || byteBuffer.get(i12) > -65) {
                            return -1;
                        }
                        i12++;
                    } else if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return u0.q(byteBuffer, b10, i12, i11 - i12);
                        }
                        int i13 = i12 + 1;
                        byte b11 = byteBuffer.get(i12);
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i13 + 1;
                            if (byteBuffer.get(i13) <= -65) {
                                i12 = i14 + 1;
                                if (byteBuffer.get(i14) > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i12 >= i11 - 1) {
                        return u0.q(byteBuffer, b10, i12, i11 - i12);
                    } else {
                        int i15 = i12 + 1;
                        byte b12 = byteBuffer.get(i12);
                        if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || byteBuffer.get(i15) > -65))) {
                            return -1;
                        }
                        m7 = i15 + 1;
                    }
                }
                m7 = i12;
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
            } else if (byteBuffer.isDirect()) {
                return d(byteBuffer, i10, i11);
            } else {
                return c(byteBuffer, i10, i11);
            }
        }

        abstract String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        final String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b10 = byteBuffer.get(i10);
                    if (!a.n(b10)) {
                        break;
                    }
                    i10++;
                    a.i(b10, cArr, i13);
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b11 = byteBuffer.get(i10);
                    if (a.n(b11)) {
                        int i16 = i14 + 1;
                        a.i(b11, cArr, i14);
                        while (i15 < i12) {
                            byte b12 = byteBuffer.get(i15);
                            if (!a.n(b12)) {
                                break;
                            }
                            i15++;
                            a.i(b12, cArr, i16);
                            i16++;
                        }
                        i10 = i15;
                        i14 = i16;
                    } else if (a.p(b11)) {
                        if (i15 < i12) {
                            a.k(b11, byteBuffer.get(i15), cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (a.o(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.j(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = byteBuffer.get(i15);
                        int i19 = i18 + 1;
                        a.h(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                        i10 = i19 + 1;
                        i14 = i14 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        abstract String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException;

        abstract int e(CharSequence charSequence, byte[] bArr, int i10, int i11);

        final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(u0.i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                h(charSequence, byteBuffer);
            } else {
                g(charSequence, byteBuffer);
            }
        }

        final void g(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i10 = 0;
            while (i10 < length) {
                try {
                    char charAt = charSequence.charAt(i10);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i10, (byte) charAt);
                    i10++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (position - byteBuffer.position()) + 1)));
                }
            }
            if (i10 == length) {
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position + i10);
                return;
            }
            position += i10;
            while (i10 < length) {
                char charAt2 = charSequence.charAt(i10);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i11 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                        byteBuffer.put(i11, (byte) ((charAt2 & '?') | 128));
                        position = i11;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i11;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (position - byteBuffer.position()) + 1)));
                    }
                } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i13 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i14 = i13 + 1;
                                    byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i15 = i14 + 1;
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i15, (byte) ((codePoint & 63) | 128));
                                    position = i15;
                                    i10 = i12;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i13;
                                    i10 = i12;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new d(i10, length);
                } else {
                    int i16 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position = i16 + 1;
                    byteBuffer.put(i16, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                }
                i10++;
                position++;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
        }

        abstract void h(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean i(ByteBuffer byteBuffer, int i10, int i11) {
            return k(0, byteBuffer, i10, i11) == 0;
        }

        final boolean j(byte[] bArr, int i10, int i11) {
            return l(0, bArr, i10, i11) == 0;
        }

        final int k(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return l(i10, byteBuffer.array(), i11 + arrayOffset, arrayOffset + i12);
            } else if (byteBuffer.isDirect()) {
                return o(i10, byteBuffer, i11, i12);
            } else {
                return n(i10, byteBuffer, i11, i12);
            }
        }

        abstract int l(int i10, byte[] bArr, int i11, int i12);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r8.get(r9) > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
            if (r8.get(r9) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
            if (r8.get(r9) > (-65)) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int n(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L8e
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L8e
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.u0.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L65
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L63
                int r7 = com.google.protobuf.u0.a(r0, r1)
                return r7
            L63:
                r9 = r7
                goto L68
            L65:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L68:
                if (r4 != 0) goto L78
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L77
                int r7 = com.google.protobuf.u0.b(r0, r1, r4)
                return r7
            L77:
                r9 = r7
            L78:
                if (r1 > r3) goto L8d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L8d
                if (r4 > r3) goto L8d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L8d:
                return r2
            L8e:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.b.n(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int o(int i10, ByteBuffer byteBuffer, int i11, int i12);
    }

    /* compiled from: Utf8.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class c extends b {
        c() {
        }

        private static int p(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return q(bArr, i10, i11);
        }

        private static int q(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    } else if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return u0.r(bArr, i12, i11);
                        }
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i13 + 1;
                            if (bArr[i13] <= -65) {
                                i12 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i12 >= i11 - 1) {
                        return u0.r(bArr, i12, i11);
                    } else {
                        int i15 = i12 + 1;
                        byte b12 = bArr[i12];
                        if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                            i10 = i15 + 1;
                            if (bArr[i15] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // com.google.protobuf.u0.b
        String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b10 = bArr[i10];
                    if (!a.n(b10)) {
                        break;
                    }
                    i10++;
                    a.i(b10, cArr, i13);
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (a.n(b11)) {
                        int i16 = i14 + 1;
                        a.i(b11, cArr, i14);
                        while (i15 < i12) {
                            byte b12 = bArr[i15];
                            if (!a.n(b12)) {
                                break;
                            }
                            i15++;
                            a.i(b12, cArr, i16);
                            i16++;
                        }
                        i10 = i15;
                        i14 = i16;
                    } else if (a.p(b11)) {
                        if (i15 < i12) {
                            a.k(b11, bArr[i15], cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (a.o(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = bArr[i15];
                        int i19 = i18 + 1;
                        a.h(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                        i10 = i19 + 1;
                        i14 = i14 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.u0.b
        String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            return c(byteBuffer, i10, i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.protobuf.u0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.c.e(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // com.google.protobuf.u0.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            g(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
            if (r8[r9] > (-65)) goto L51;
         */
        @Override // com.google.protobuf.u0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.u0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.protobuf.u0.a(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = com.google.protobuf.u0.b(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.c.l(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.u0.b
        int o(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            return n(i10, byteBuffer, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* compiled from: Utf8.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class e extends b {
        e() {
        }

        static boolean p() {
            return t0.J() && t0.K();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int q(long r8, int r10) {
            /*
                int r0 = s(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r10 <= 0) goto L1a
                long r4 = r8 + r2
                byte r1 = com.google.protobuf.t0.x(r8)
                if (r1 < 0) goto L19
                int r10 = r10 + (-1)
                r8 = r4
                goto L9
            L19:
                r8 = r4
            L1a:
                if (r10 != 0) goto L1d
                return r0
            L1d:
                int r10 = r10 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r10 != 0) goto L29
                return r1
            L29:
                int r10 = r10 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.t0.x(r8)
                if (r8 <= r4) goto L37
                goto L39
            L37:
                r8 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r10 >= r6) goto L46
                int r8 = u(r8, r1, r10)
                return r8
            L46:
                int r10 = r10 + (-2)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.t0.x(r8)
                if (r8 > r4) goto L63
                r9 = -96
                if (r1 != r0) goto L56
                if (r8 < r9) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r8 >= r9) goto L63
            L5c:
                long r2 = r2 + r6
                byte r8 = com.google.protobuf.t0.x(r6)
                if (r8 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r10 >= r0) goto L6c
                int r8 = u(r8, r1, r10)
                return r8
            L6c:
                int r10 = r10 + (-3)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.t0.x(r8)
                if (r8 > r4) goto L8e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L8e
                long r8 = r6 + r2
                byte r0 = com.google.protobuf.t0.x(r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.t0.x(r8)
                if (r8 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.e.q(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int r(byte[] r8, long r9, int r11) {
            /*
                int r0 = t(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.t0.y(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.t0.y(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = v(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.t0.y(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.t0.y(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = v(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.t0.y(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.t0.y(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.t0.y(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.e.r(byte[], long, int):int");
        }

        private static int s(long j10, int i10) {
            if (i10 < 16) {
                return 0;
            }
            int i11 = (int) ((-j10) & 7);
            int i12 = i11;
            while (i12 > 0) {
                long j11 = 1 + j10;
                if (t0.x(j10) < 0) {
                    return i11 - i12;
                }
                i12--;
                j10 = j11;
            }
            int i13 = i10 - i11;
            while (i13 >= 8 && (t0.E(j10) & (-9187201950435737472L)) == 0) {
                j10 += 8;
                i13 -= 8;
            }
            return i10 - i13;
        }

        private static int t(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            int i12 = 8 - (((int) j10) & 7);
            while (i11 < i12) {
                long j11 = 1 + j10;
                if (t0.y(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 > i10 || (t0.F(bArr, t0.f15520h + j10) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j10 += 8;
                i11 = i13;
            }
            while (i11 < i10) {
                long j12 = j10 + 1;
                if (t0.y(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j12;
            }
            return i10;
        }

        private static int u(long j10, int i10, int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return u0.p(i10, t0.x(j10), t0.x(j10 + 1));
                    }
                    throw new AssertionError();
                }
                return u0.o(i10, t0.x(j10));
            }
            return u0.n(i10);
        }

        private static int v(byte[] bArr, int i10, long j10, int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return u0.p(i10, t0.y(bArr, j10), t0.y(bArr, j10 + 1));
                    }
                    throw new AssertionError();
                }
                return u0.o(i10, t0.y(bArr, j10));
            }
            return u0.n(i10);
        }

        @Override // com.google.protobuf.u0.b
        String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i10, i11, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.u0.b
        String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
                long k10 = t0.k(byteBuffer) + i10;
                long j10 = i11 + k10;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (k10 < j10) {
                    byte x10 = t0.x(k10);
                    if (!a.n(x10)) {
                        break;
                    }
                    k10++;
                    a.i(x10, cArr, i12);
                    i12++;
                }
                while (true) {
                    int i13 = i12;
                    while (k10 < j10) {
                        long j11 = k10 + 1;
                        byte x11 = t0.x(k10);
                        if (a.n(x11)) {
                            int i14 = i13 + 1;
                            a.i(x11, cArr, i13);
                            while (j11 < j10) {
                                byte x12 = t0.x(j11);
                                if (!a.n(x12)) {
                                    break;
                                }
                                j11++;
                                a.i(x12, cArr, i14);
                                i14++;
                            }
                            i13 = i14;
                            k10 = j11;
                        } else if (a.p(x11)) {
                            if (j11 < j10) {
                                k10 = j11 + 1;
                                a.k(x11, t0.x(j11), cArr, i13);
                                i13++;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (a.o(x11)) {
                            if (j11 < j10 - 1) {
                                long j12 = j11 + 1;
                                a.j(x11, t0.x(j11), t0.x(j12), cArr, i13);
                                i13++;
                                k10 = j12 + 1;
                            } else {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                        } else if (j11 < j10 - 2) {
                            long j13 = j11 + 1;
                            byte x13 = t0.x(j11);
                            long j14 = j13 + 1;
                            byte x14 = t0.x(j13);
                            k10 = j14 + 1;
                            a.h(x11, x13, x14, t0.x(j14), cArr, i13);
                            i12 = i13 + 1 + 1;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    return new String(cArr, 0, i13);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.u0.b
        int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            char c11;
            int i12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                c10 = 128;
                j10 = 1;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                t0.R(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 < c10 && j13 < j14) {
                    long j15 = j13 + j10;
                    t0.R(bArr, j13, (byte) charAt2);
                    j12 = j10;
                    j11 = j15;
                    c11 = c10;
                } else if (charAt2 < 2048 && j13 <= j14 - 2) {
                    long j16 = j13 + j10;
                    t0.R(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                    long j17 = j16 + j10;
                    t0.R(bArr, j16, (byte) ((charAt2 & '?') | 128));
                    long j18 = j10;
                    c11 = 128;
                    j11 = j17;
                    j12 = j18;
                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                    if (j13 <= j14 - 4) {
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char charAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j19 = j13 + 1;
                                t0.R(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j20 = j19 + 1;
                                c11 = 128;
                                t0.R(bArr, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j21 = j20 + 1;
                                t0.R(bArr, j20, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 = 1;
                                j11 = j21 + 1;
                                t0.R(bArr, j21, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                        throw new d(i13, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j13);
                    }
                } else {
                    long j22 = j13 + j10;
                    t0.R(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                    long j23 = j22 + j10;
                    t0.R(bArr, j22, (byte) (((charAt2 >>> 6) & 63) | 128));
                    t0.R(bArr, j23, (byte) ((charAt2 & '?') | 128));
                    j11 = j23 + 1;
                    j12 = 1;
                    c11 = 128;
                }
                i13++;
                c10 = c11;
                long j24 = j12;
                j13 = j11;
                j10 = j24;
            }
            return (int) j13;
        }

        @Override // com.google.protobuf.u0.b
        void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            char c10;
            long j10;
            int i10;
            int i11;
            long j11;
            char c11;
            char charAt;
            long k10 = t0.k(byteBuffer);
            long position = byteBuffer.position() + k10;
            long limit = byteBuffer.limit() + k10;
            int length = charSequence.length();
            if (length > limit - position) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i12 = 0;
            while (true) {
                c10 = 128;
                if (i12 >= length || (charAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                t0.Q(position, (byte) charAt);
                i12++;
                position++;
            }
            if (i12 == length) {
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position((int) (position - k10));
                return;
            }
            while (i12 < length) {
                char charAt2 = charSequence.charAt(i12);
                if (charAt2 >= c10 || position >= limit) {
                    if (charAt2 >= 2048 || position > limit - 2) {
                        j10 = k10;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            if (position <= limit - 4) {
                                i11 = i12 + 1;
                                if (i11 != length) {
                                    char charAt3 = charSequence.charAt(i11);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j11 = limit;
                                        long j12 = position + 1;
                                        t0.Q(position, (byte) ((codePoint >>> 18) | 240));
                                        long j13 = j12 + 1;
                                        c11 = 128;
                                        t0.Q(j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j14 = j13 + 1;
                                        t0.Q(j13, (byte) (((codePoint >>> 6) & 63) | 128));
                                        t0.Q(j14, (byte) ((codePoint & 63) | 128));
                                        position = j14 + 1;
                                    } else {
                                        i12 = i11;
                                    }
                                }
                                throw new d(i12 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i12 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                                throw new d(i12, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                        }
                        long j15 = position + 1;
                        t0.Q(position, (byte) ((charAt2 >>> '\f') | 480));
                        long j16 = j15 + 1;
                        t0.Q(j15, (byte) (((charAt2 >>> 6) & 63) | 128));
                        t0.Q(j16, (byte) ((charAt2 & '?') | 128));
                        position = j16 + 1;
                    } else {
                        j10 = k10;
                        long j17 = position + 1;
                        t0.Q(position, (byte) ((charAt2 >>> 6) | 960));
                        t0.Q(j17, (byte) ((charAt2 & '?') | 128));
                        position = j17 + 1;
                    }
                    j11 = limit;
                    i11 = i12;
                    c11 = 128;
                } else {
                    t0.Q(position, (byte) charAt2);
                    j11 = limit;
                    i11 = i12;
                    c11 = c10;
                    position++;
                    j10 = k10;
                }
                c10 = c11;
                k10 = j10;
                limit = j11;
                i12 = i11 + 1;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position((int) (position - k10));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
            if (com.google.protobuf.t0.y(r13, r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
            if (com.google.protobuf.t0.y(r13, r2) > (-65)) goto L56;
         */
        @Override // com.google.protobuf.u0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.e.l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
            if (com.google.protobuf.t0.x(r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
            if (com.google.protobuf.t0.x(r2) > (-65)) goto L56;
         */
        @Override // com.google.protobuf.u0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int o(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.e.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        b cVar;
        if (e.p() && !com.google.protobuf.b.c()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        f15537a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
        return f15537a.a(byteBuffer, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return f15537a.b(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f15537a.e(charSequence, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f15537a.f(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 2048) {
                    i11 += l(charSequence, i10);
                    break;
                }
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    private static int l(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(ByteBuffer byteBuffer, int i10, int i11) {
        int i12 = i11 - 7;
        int i13 = i10;
        while (i13 < i12 && (byteBuffer.getLong(i13) & (-9187201950435737472L)) == 0) {
            i13 += 8;
        }
        return i13 - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return p(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
                }
                throw new AssertionError();
            }
            return o(i10, byteBuffer.get(i11));
        }
        return n(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return p(b10, bArr[i10], bArr[i10 + 1]);
                }
                throw new AssertionError();
            }
            return o(b10, bArr[i10]);
        }
        return n(b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(ByteBuffer byteBuffer) {
        return f15537a.i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t(byte[] bArr) {
        return f15537a.j(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(byte[] bArr, int i10, int i11) {
        return f15537a.j(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        return f15537a.k(i10, byteBuffer, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(int i10, byte[] bArr, int i11, int i12) {
        return f15537a.l(i10, bArr, i11, i12);
    }
}
