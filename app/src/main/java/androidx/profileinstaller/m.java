package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileTranscoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f3775a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f3776b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) throws IOException {
        e.h(inputStream);
        int j10 = e.j(inputStream);
        if (j10 == 6 || j10 == 7) {
            return;
        }
        while (j10 > 0) {
            e.j(inputStream);
            for (int j11 = e.j(inputStream); j11 > 0; j11--) {
                e.h(inputStream);
            }
            j10--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(OutputStream outputStream, byte[] bArr, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, o.f3787a)) {
            N(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f3788b)) {
            M(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f3790d)) {
            K(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f3789c)) {
            L(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f3791e)) {
            J(outputStream, dVarArr);
            return true;
        } else {
            return false;
        }
    }

    private static void C(OutputStream outputStream, d dVar) throws IOException {
        int i10 = 0;
        for (int i11 : dVar.f3756h) {
            Integer valueOf = Integer.valueOf(i11);
            e.p(outputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    private static p D(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i10 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f3751c);
                e.q(byteArrayOutputStream, dVar.f3752d);
                e.q(byteArrayOutputStream, dVar.f3755g);
                String j10 = j(dVar.f3749a, dVar.f3750b, o.f3787a);
                int k10 = e.k(j10);
                e.p(byteArrayOutputStream, k10);
                i10 = i10 + 4 + 4 + 4 + 2 + (k10 * 1);
                e.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                p pVar = new p(f.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return pVar;
            }
            throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f3775a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, d dVar) throws IOException {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(OutputStream outputStream, d dVar, String str) throws IOException {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f3753e);
        e.q(outputStream, dVar.f3754f);
        e.q(outputStream, dVar.f3751c);
        e.q(outputStream, dVar.f3755g);
        e.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, d dVar) throws IOException {
        byte[] bArr = new byte[k(dVar.f3755g)];
        for (Map.Entry<Integer, Integer> entry : dVar.f3757i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, d dVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : dVar.f3757i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                e.p(outputStream, intValue - i10);
                e.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, d[] dVarArr) throws IOException {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j10 = j(dVar.f3749a, dVar.f3750b, o.f3791e);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.f3757i.size());
            e.p(outputStream, dVar.f3756h.length);
            e.q(outputStream, dVar.f3751c);
            e.n(outputStream, j10);
            for (Integer num : dVar.f3757i.keySet()) {
                e.p(outputStream, num.intValue());
            }
            for (int i10 : dVar.f3756h) {
                e.p(outputStream, i10);
            }
        }
    }

    private static void K(OutputStream outputStream, d[] dVarArr) throws IOException {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j10 = j(dVar.f3749a, dVar.f3750b, o.f3790d);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.f3756h.length);
            e.q(outputStream, dVar.f3757i.size() * 4);
            e.q(outputStream, dVar.f3751c);
            e.n(outputStream, j10);
            for (Integer num : dVar.f3757i.keySet()) {
                e.p(outputStream, num.intValue());
                e.p(outputStream, 0);
            }
            for (int i10 : dVar.f3756h) {
                e.p(outputStream, i10);
            }
        }
    }

    private static void L(OutputStream outputStream, d[] dVarArr) throws IOException {
        byte[] b10 = b(dVarArr, o.f3789c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    private static void M(OutputStream outputStream, d[] dVarArr) throws IOException {
        byte[] b10 = b(dVarArr, o.f3788b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    private static void N(OutputStream outputStream, d[] dVarArr) throws IOException {
        O(outputStream, dVarArr);
    }

    private static void O(OutputStream outputStream, d[] dVarArr) throws IOException {
        int length;
        byte[] bArr;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = o.f3787a.length + f3775a.length + 4 + (arrayList.size() * 16);
        e.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p pVar = (p) arrayList.get(i10);
            e.q(outputStream, pVar.f3794a.b());
            e.q(outputStream, length2);
            if (pVar.f3797d) {
                byte[] b10 = e.b(pVar.f3796c);
                arrayList2.add(b10);
                e.q(outputStream, b10.length);
                e.q(outputStream, bArr.length);
                length = b10.length;
            } else {
                arrayList2.add(pVar.f3796c);
                e.q(outputStream, pVar.f3796c.length);
                e.q(outputStream, 0L);
                length = pVar.f3796c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    private static int a(d dVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : dVar.f3757i.entrySet()) {
            i10 |= entry.getValue().intValue();
        }
        return i10;
    }

    private static byte[] b(d[] dVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int i11 = 0;
        for (d dVar : dVarArr) {
            i11 += e.k(j(dVar.f3749a, dVar.f3750b, bArr)) + 16 + (dVar.f3753e * 2) + dVar.f3754f + k(dVar.f3755g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, o.f3789c)) {
            int length = dVarArr.length;
            while (i10 < length) {
                d dVar2 = dVarArr[i10];
                G(byteArrayOutputStream, dVar2, j(dVar2.f3749a, dVar2.f3750b, bArr));
                F(byteArrayOutputStream, dVar2);
                i10++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f3749a, dVar3.f3750b, bArr));
            }
            int length2 = dVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, dVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    private static p c(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            try {
                d dVar = dVarArr[i11];
                e.p(byteArrayOutputStream, i11);
                e.p(byteArrayOutputStream, dVar.f3753e);
                i10 = i10 + 2 + 2 + (dVar.f3753e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            p pVar = new p(f.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static p d(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            try {
                d dVar = dVarArr[i11];
                int a10 = a(dVar);
                byte[] e8 = e(dVar);
                byte[] f10 = f(dVar);
                e.p(byteArrayOutputStream, i11);
                int length = e8.length + 2 + f10.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e8);
                byteArrayOutputStream.write(f10);
                i10 = i10 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            p pVar = new p(f.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            if (dVarArr[i10].f3750b.equals(h10)) {
                return dVarArr[i10];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a10 = o.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + o.a(bArr) + str2;
        }
        return g(str2, a10);
    }

    private static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    private static int l(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw e.c("Unexpected flag: " + i10);
            }
            return i11;
        }
        throw e.c("HOT methods are not stored in the bitmap");
    }

    private static int[] m(InputStream inputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += e.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(l(2, i10, i11)) ? 2 : 0;
        return bitSet.get(l(4, i10, i11)) ? i12 | 4 : i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] o(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, o.f3788b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(InputStream inputStream, d dVar) throws IOException {
        int available = inputStream.available() - dVar.f3754f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += e.h(inputStream);
            dVar.f3757i.put(Integer.valueOf(i10), 1);
            for (int h10 = e.h(inputStream); h10 > 0; h10--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, o.f3792f)) {
            if (!Arrays.equals(o.f3787a, bArr2)) {
                return r(inputStream, bArr, dVarArr);
            }
            throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, o.f3793g)) {
            return t(inputStream, bArr2, dVarArr);
        } else {
            throw e.c("Unsupported meta version");
        }
    }

    static d[] r(InputStream inputStream, byte[] bArr, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, o.f3792f)) {
            int j10 = e.j(inputStream);
            byte[] e8 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e8);
                try {
                    d[] s10 = s(byteArrayInputStream, j10, dVarArr);
                    byteArrayInputStream.close();
                    return s10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw e.c("Content found after the end of file");
        }
        throw e.c("Unsupported meta version");
    }

    private static d[] s(InputStream inputStream, int i10, d[] dVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 == dVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int h10 = e.h(inputStream);
                iArr[i11] = e.h(inputStream);
                strArr[i11] = e.f(inputStream, h10);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                d dVar = dVarArr[i12];
                if (dVar.f3750b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    dVar.f3753e = i13;
                    dVar.f3756h = m(inputStream, i13);
                } else {
                    throw e.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dVarArr;
        }
        throw e.c("Mismatched number of dex files found in metadata");
    }

    static d[] t(InputStream inputStream, byte[] bArr, d[] dVarArr) throws IOException {
        int h10 = e.h(inputStream);
        byte[] e8 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e8);
            try {
                d[] u10 = u(byteArrayInputStream, bArr, h10, dVarArr);
                byteArrayInputStream.close();
                return u10;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw e.c("Content found after the end of file");
    }

    private static d[] u(InputStream inputStream, byte[] bArr, int i10, d[] dVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 == dVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                e.h(inputStream);
                String f10 = e.f(inputStream, e.h(inputStream));
                long i12 = e.i(inputStream);
                int h10 = e.h(inputStream);
                d i13 = i(dVarArr, f10);
                if (i13 == null) {
                    throw e.c("Missing profile key: " + f10);
                }
                i13.f3752d = i12;
                int[] m7 = m(inputStream, h10);
                if (Arrays.equals(bArr, o.f3791e)) {
                    i13.f3753e = h10;
                    i13.f3756h = m7;
                }
            }
            return dVarArr;
        }
        throw e.c("Mismatched number of dex files found in metadata");
    }

    private static void v(InputStream inputStream, d dVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f3755g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = dVar.f3755g;
            if (i10 >= i11) {
                return;
            }
            int n10 = n(valueOf, i10, i11);
            if (n10 != 0) {
                Integer num = dVar.f3757i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                dVar.f3757i.put(Integer.valueOf(i10), Integer.valueOf(n10 | num.intValue()));
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, o.f3788b)) {
            int j10 = e.j(inputStream);
            byte[] e8 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e8);
                try {
                    d[] x10 = x(byteArrayInputStream, str, j10);
                    byteArrayInputStream.close();
                    return x10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw e.c("Content found after the end of file");
        }
        throw e.c("Unsupported version");
    }

    private static d[] x(InputStream inputStream, String str, int i10) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = e.h(inputStream);
            int h11 = e.h(inputStream);
            dVarArr[i11] = new d(str, e.f(inputStream, h10), e.i(inputStream), 0L, h11, (int) e.i(inputStream), (int) e.i(inputStream), new int[h11], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            d dVar = dVarArr[i12];
            p(inputStream, dVar);
            dVar.f3756h = m(inputStream, dVar.f3753e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i10) {
        return ((i10 + 8) - 1) & (-8);
    }

    private static void z(byte[] bArr, int i10, int i11, d dVar) {
        int l10 = l(i10, i11, dVar.f3755g);
        int i12 = l10 / 8;
        bArr[i12] = (byte) ((1 << (l10 % 8)) | bArr[i12]);
    }
}
