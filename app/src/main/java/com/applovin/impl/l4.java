package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l4 {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f7452a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f7453b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f7458a;

        a(int i10) {
            this.f7458a = i10;
        }

        public int b() {
            return this.f7458a;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return DEFAULT;
            }
            if (i10 == 1) {
                return V2;
            }
            return DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f7453b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public static byte[] a(String str, long j10, a aVar, String str2, com.applovin.impl.sdk.j jVar) {
        if (str2 != null) {
            if (str2.length() >= 86) {
                if (TextUtils.isEmpty(str)) {
                    return new byte[0];
                }
                if (a.NONE == aVar) {
                    return str.getBytes();
                }
                if (a.V2 == aVar) {
                    return a(str, j10, false, str2, jVar);
                }
                return a(str, j10, str2, jVar);
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    public static String b(String str, long j10, a aVar, String str2, com.applovin.impl.sdk.j jVar) {
        byte[] a10;
        if (str2 != null) {
            if (str2.length() >= 86) {
                if (TextUtils.isEmpty(str) || a.NONE == aVar) {
                    return str;
                }
                if (a.V2 == aVar) {
                    a10 = a(str, j10, true, str2, jVar);
                } else {
                    a10 = a(str, j10, str2, jVar);
                }
                if (a10 != null) {
                    return new String(a10);
                }
                return null;
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static int c(byte[] bArr, String str, com.applovin.impl.sdk.j jVar) {
        int a10;
        int i10;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (a10 = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f7453b, jVar).getBytes();
        int i11 = a10 + 1;
        int length = bytes.length + i11;
        if (bArr.length > length && bArr[length] == 58 && bArr.length > (i10 = length + 55) && bArr[i10] == 58 && Arrays.equals(Arrays.copyOfRange(bArr, i11, bytes.length + i11), bytes)) {
            int i12 = length + 56;
            if (length + 64 > bArr.length) {
                return 0;
            }
            return i12;
        }
        return 0;
    }

    private static byte[] a(String str, long j10, String str2, com.applovin.impl.sdk.j jVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c10 = ' ';
        try {
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] a10 = a(substring2, f7452a, jVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j10 & 255)) ^ a10[0]);
            byteArrayOutputStream.write(((byte) ((j10 >> 8) & 255)) ^ a10[1]);
            byteArrayOutputStream.write(((byte) ((j10 >> 16) & 255)) ^ a10[2]);
            byteArrayOutputStream.write(((byte) ((j10 >> 24) & 255)) ^ a10[3]);
            byteArrayOutputStream.write(((byte) ((j10 >> 32) & 255)) ^ a10[4]);
            byteArrayOutputStream.write(((byte) ((j10 >> 40) & 255)) ^ a10[5]);
            byteArrayOutputStream.write(((byte) ((j10 >> 48) & 255)) ^ a10[6]);
            byteArrayOutputStream.write(((byte) ((j10 >> 56) & 255)) ^ a10[7]);
            int i17 = 0;
            while (i17 < bytes.length) {
                long j11 = j10 + i17;
                long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                long j14 = j13 ^ (j13 >> c10);
                String str3 = substring;
                byteArrayOutputStream.write((byte) (((i17 >= bytes.length ? (byte) 0 : bytes[i17]) ^ a10[i17 % a10.length]) ^ (j14 & 255)));
                byteArrayOutputStream.write((byte) ((a10[i10 % a10.length] ^ (i17 + 1 >= bytes.length ? (byte) 0 : bytes[i10])) ^ ((j14 >> 8) & 255)));
                byteArrayOutputStream.write((byte) ((a10[i11 % a10.length] ^ (i17 + 2 >= bytes.length ? (byte) 0 : bytes[i11])) ^ ((j14 >> 16) & 255)));
                byteArrayOutputStream.write((byte) ((a10[i12 % a10.length] ^ (i17 + 3 >= bytes.length ? (byte) 0 : bytes[i12])) ^ ((j14 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((a10[i13 % a10.length] ^ (i17 + 4 >= bytes.length ? (byte) 0 : bytes[i13])) ^ ((j14 >> 32) & 255)));
                byteArrayOutputStream.write((byte) ((a10[i14 % a10.length] ^ (i17 + 5 >= bytes.length ? (byte) 0 : bytes[i14])) ^ ((j14 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((a10[i15 % a10.length] ^ (i17 + 6 >= bytes.length ? (byte) 0 : bytes[i15])) ^ ((j14 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((a10[i16 % a10.length] ^ (i17 + 7 >= bytes.length ? (byte) 0 : bytes[i16])) ^ ((j14 >> 56) & 255)));
                i17 += 8;
                substring = str3;
                c10 = ' ';
            }
            String str4 = substring;
            String c11 = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f7452a, jVar) + ":" + str4 + ":" + c11).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e8) {
            jVar.D().a("AppLovinSdk", "encode", e8);
            return null;
        }
    }

    public static String b(byte[] bArr, String str, com.applovin.impl.sdk.j jVar) {
        if (str != null) {
            if (str.length() >= 86) {
                if (bArr == null) {
                    return null;
                }
                if (bArr.length == 0) {
                    return "";
                }
                a b10 = b(bArr);
                if (a.NONE == b10) {
                    return new String(bArr);
                }
                if (b10 == a.V2) {
                    return a(bArr, str, jVar);
                }
                return a(new String(bArr), str, jVar);
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c10 = (char) bArr[0];
            if (c10 == '2') {
                return a.V2;
            }
            if (c10 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j10, boolean z10, String str2, com.applovin.impl.sdk.j jVar) {
        ByteBuffer allocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String substring = str2.substring(32);
            String substring2 = str2.substring(0, 32);
            byte[] bArr = f7453b;
            byte[] a10 = a(substring2, bArr, jVar);
            byte[] bytes2 = String.format("2:%s:%s:", a(bArr, jVar), substring).getBytes();
            ByteBuffer allocate2 = ByteBuffer.allocate(16);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putLong(length);
            allocate2.putLong(d7.c(a10) ^ j10);
            allocate2.flip();
            byte[] a11 = a(d7.a(bytes), j10, a10);
            if (z10) {
                byte[] bytes3 = c(allocate2.array()).getBytes();
                byte[] bytes4 = c(a11).getBytes();
                allocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                allocate.put(bytes2);
                allocate.put(bytes3);
                allocate.put(bytes4);
            } else {
                allocate = ByteBuffer.allocate(bytes2.length + allocate2.remaining() + a11.length);
                allocate.put(bytes2);
                allocate.put(allocate2);
                allocate.put(a11);
            }
            allocate.flip();
            return allocate.array();
        } catch (UnsupportedEncodingException e8) {
            jVar.D().a("AppLovinSdk", "encode2", e8);
            throw new RuntimeException("UTF-8 encoding not found", e8);
        } catch (IOException e10) {
            jVar.D().a("AppLovinSdk", "encode2", e10);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, long j10, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        long j11 = j10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 % 8;
            if (i11 == 0) {
                long j12 = i10 + j10;
                long j13 = (j12 ^ (j12 >>> 33)) * (-4417276706812531889L);
                long j14 = (j13 ^ (j13 >>> 29)) * (-8796714831421723037L);
                j11 = j14 ^ (j14 >>> 32);
            }
            copyOf[i10] = (byte) (copyOf[i10] ^ (((j11 >> (i11 * 8)) & 255) ^ bArr2[i10 % bArr2.length]));
        }
        return copyOf;
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.j jVar) {
        String[] split = str.split(":");
        char c10 = 0;
        try {
            if ("1".equals(split[0]) && split.length == 4) {
                String str3 = split[1];
                String str4 = split[2];
                byte[] b10 = b(split[3]);
                if (str2.endsWith(str4)) {
                    byte[] bArr = f7452a;
                    if (a(bArr, jVar).equals(str3)) {
                        char c11 = ' ';
                        byte[] a10 = a(str2.substring(0, 32), bArr, jVar);
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b10);
                        char c12 = '\b';
                        long read = (((byteArrayInputStream.read() ^ a10[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ a10[0]) & 255) | (((byteArrayInputStream.read() ^ a10[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ a10[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ a10[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ a10[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ a10[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ a10[7]) & 255) << 56);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[8];
                        int read2 = byteArrayInputStream.read(bArr2);
                        int i10 = 0;
                        while (read2 >= 0) {
                            ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                            long j10 = i10 + read;
                            long j11 = (j10 ^ (j10 >> 33)) * (-4417276706812531889L);
                            long j12 = (j11 ^ (j11 >> 29)) * (-8796714831421723037L);
                            long j13 = j12 ^ (j12 >> c11);
                            byteArrayOutputStream.write((byte) ((bArr2[c10] ^ a10[i10 % a10.length]) ^ (j13 & 255)));
                            byteArrayOutputStream.write((byte) ((a10[(i10 + 1) % a10.length] ^ bArr2[1]) ^ ((j13 >> c12) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[(i10 + 2) % a10.length] ^ bArr2[2]) ^ ((j13 >> 16) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[3] ^ a10[(i10 + 3) % a10.length]) ^ ((j13 >> 24) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[(i10 + 4) % a10.length] ^ bArr2[4]) ^ ((j13 >> 32) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[(i10 + 5) % a10.length] ^ bArr2[5]) ^ ((j13 >> 40) & 255)));
                            byteArrayOutputStream.write((byte) ((a10[(i10 + 6) % a10.length] ^ bArr2[6]) ^ ((j13 >> 48) & 255)));
                            byteArrayOutputStream.write((byte) ((bArr2[7] ^ a10[(i10 + 7) % a10.length]) ^ ((j13 >> 56) & 255)));
                            i10 += 8;
                            byteArrayInputStream = byteArrayInputStream2;
                            read2 = byteArrayInputStream2.read(bArr2);
                            read = read;
                            c12 = '\b';
                            c10 = 0;
                            c11 = ' ';
                        }
                        return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (UnsupportedEncodingException e8) {
            jVar.D().a("AppLovinSdk", "decode", e8);
            throw new RuntimeException("UTF-8 encoding not found", e8);
        } catch (IOException e10) {
            com.applovin.impl.sdk.n.b("AppLovinSdk", "Failed to read bytes", e10);
            jVar.D().a("AppLovinSdk", "decode", e10);
            return null;
        }
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.j jVar) {
        try {
            int c10 = c(bArr, str, jVar);
            if (c10 == 0) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, c10, bArr.length);
            if (copyOfRange.length < 16) {
                return null;
            }
            long a10 = d7.a(copyOfRange, 8);
            byte[] a11 = a(str.substring(0, 32), f7453b, jVar);
            return new String(d7.d(a(Arrays.copyOfRange(copyOfRange, 16, copyOfRange.length), a10 ^ d7.c(a11), a11)), "UTF-8");
        } catch (UnsupportedEncodingException e8) {
            jVar.D().a("AppLovinSdk", "decode2", e8);
            throw new RuntimeException("UTF-8 encoding not found", e8);
        } catch (IOException e10) {
            com.applovin.impl.sdk.n.b("AppLovinSdk", "Failed to ungzip decode", e10);
            jVar.D().a("AppLovinSdk", "decode2", e10);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b10) {
        if (bArr != null && bArr.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == b10) {
                    return i10;
                }
            }
        }
        return -1;
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.j jVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e8) {
            jVar.D().a("AppLovinSdk", "SHA256", e8);
            throw new RuntimeException("SHA-256 algorithm not found", e8);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.j jVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e8) {
            jVar.D().a("AppLovinSdk", "SHA1", e8);
            throw new RuntimeException("SHA-1 algorithm not found", e8);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', com.ironsource.cc.T);
    }

    private static String a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace(com.ironsource.cc.T, '*');
    }
}
