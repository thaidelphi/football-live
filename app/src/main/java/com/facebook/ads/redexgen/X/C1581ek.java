package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.ek  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1581ek {
    public static byte[] A06;
    public static String[] A07 = {"cSBRTynuZC2IGdTGiyywpT6W93mlPPSF", "eY8oEBOaURsaN5tjLd1iqN0KvgC3t", "4VVXMvUaNa4Umjg6qizEZP9MzILQLEzR", "QSlzNCenAFX0X7MHrGTiYpfcSwdEHFAL", "MNeYRoEHzsA8GKinVgk1BAFWsM3hA", "cFMHJtlu6uhUsFXtxeYMb0DEBepk1Qut", "Ud7R6CBFW2YxxOhyrPqbb5OUN0lG96X2", "foWEyjr3aBCL9mZN"};
    public InterfaceC1580ej A00;
    public InterfaceC1580ej A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, C1579ei> A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{-118, -114, -100, 120, -116, -117, -116, 120, -103, -108, -116, -100, 126, -103, -118, -115, -115, -110, -105, -112, -62, -61, -21, 16, 24, 3, 14, 11, 6, -62, 24, 3, 14, 23, 7, -62, 21, 11, 28, 7, -36, -62, -57, -59, -57, -52, -55, -56, -61, -57, -45, -46, -40, -55, -46, -40, -61, -51, -46, -56, -55, -36, -110, -55, -36, -51};
    }

    static {
        A07();
    }

    public C1581ek(InterfaceC1098Sb interfaceC1098Sb, File file, byte[] bArr, boolean z10, boolean z11) {
        AbstractC1589es.A08((interfaceC1098Sb == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        PR pr = interfaceC1098Sb != null ? new PR(interfaceC1098Sb) : null;
        InterfaceC1580ej databaseStorage = file != null ? new PQ(new File(file, A04(42, 24, 41)), bArr, z10) : null;
        if (pr == null || (databaseStorage != null && z11)) {
            InterfaceC1580ej legacyStorage = (InterfaceC1580ej) AbstractC1672gE.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = pr;
            return;
        }
        this.A01 = pr;
        this.A00 = databaseStorage;
    }

    public static int A00(SparseArray<String> idToKey) {
        int id;
        int size = idToKey.size();
        if (size == 0) {
            id = 0;
        } else {
            int size2 = size - 1;
            id = idToKey.keyAt(size2) + 1;
        }
        if (id < 0) {
            id = 0;
            while (id < size) {
                int size3 = idToKey.keyAt(id);
                if (id != size3) {
                    break;
                }
                id++;
            }
        }
        return id;
    }

    private C1579ei A01(String str) {
        int A00 = A00(this.A02);
        C1579ei c1579ei = new C1579ei(A00, str);
        this.A05.put(str, c1579ei);
        this.A02.put(A00, str);
        this.A03.put(A00, true);
        this.A01.AFS(c1579ei);
        return c1579ei;
    }

    public static PO A02(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < readInt; nextBytesToRead++) {
            String readUTF = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i10 = Math.min(bytesRead, 10485760);
                byte[] bArr = AbstractC1672gE.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i10;
                    bArr = Arrays.copyOf(bArr, size);
                    dataInputStream.readFully(bArr, valueSize, i10);
                    valueSize += i10;
                    int size2 = bytesRead - valueSize;
                    i10 = Math.min(size2, 10485760);
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(A04(22, 20, 103) + bytesRead);
            }
        }
        return new PO(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [javax.crypto.Cipher] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i10 = AbstractC1672gE.A02;
        String[] strArr = A07;
        if (strArr[0].charAt(16) != strArr[5].charAt(16)) {
            String[] strArr2 = A07;
            strArr2[4] = "dc8nuHnF6oU8YkLLRwft49yiJZMzL";
            strArr2[1] = "ucRUtoiPYWbI9ztpPHBier9nGhoKN";
            String A04 = A04(0, 20, 14);
            if (i10 == 18) {
                try {
                    A04 = Cipher.getInstance((String) A04, A04(20, 2, 69));
                    return A04;
                } catch (Throwable unused) {
                }
            }
            return Cipher.getInstance(A04);
        }
        throw new RuntimeException();
    }

    public static /* synthetic */ Cipher A06() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher A05 = A05();
        String[] strArr = A07;
        if (strArr[0].charAt(16) != strArr[5].charAt(16)) {
            String[] strArr2 = A07;
            strArr2[6] = "KcwXENcHJRG31YfJrBtz61WaVX8JWAf3";
            strArr2[3] = "Nfu4cn5gavF6JAfurS1ZJWc81Ut1Y69o";
            return A05;
        }
        throw new RuntimeException();
    }

    public static void A08(PO po, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> A062 = po.A06();
        dataOutputStream.writeInt(A062.size());
        for (Map.Entry<String, byte[]> entry : A062) {
            String[] strArr = A07;
            if (strArr[6].charAt(16) != strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "Sow7AuKd9Aku10Q3yio7Gxk1dEr3BqNp";
            strArr2[5] = "9P67w6NKZJt39vzZlXxMu5USdfOVtZj8";
            Map.Entry<String, byte[]> entry2 = entry;
            dataOutputStream.writeUTF(entry2.getKey());
            byte[] value = entry2.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 41));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final C1579ei A0C(String str) {
        return this.A05.get(str);
    }

    public final C1579ei A0D(String str) {
        C1579ei cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final PO A0E(String str) {
        C1579ei cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : PO.A03;
    }

    public final String A0F(int i10) {
        return this.A02.get(i10);
    }

    public final Collection<C1579ei> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    public final void A0H() {
        AbstractC2173oj A0N = OG.A07(this.A05.keySet()).A0N();
        while (A0N.hasNext()) {
            A0K((String) A0N.next());
        }
    }

    public final void A0I() throws IOException {
        this.A01.AJO(this.A05);
        int size = this.A04.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i10);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j10) throws IOException {
        this.A01.AA5(j10);
        if (this.A00 != null) {
            InterfaceC1580ej interfaceC1580ej = this.A00;
            String[] strArr = A07;
            if (strArr[4].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "LgRf2J2oTBbbazCrAHOrhgrGgkYqQ4rK";
            strArr2[5] = "TnbbOezE1fFVsgLXLIcSlcwcUwVVuyQ0";
            interfaceC1580ej.AA5(j10);
        }
        if (!this.A01.A6I() && this.A00 != null && this.A00.A6I()) {
            this.A00.AAh(this.A05, this.A02);
            this.A01.AJN(this.A05);
        } else {
            this.A01.AAh(this.A05, this.A02);
        }
        if (this.A00 != null) {
            this.A00.A5f();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        C1579ei c1579ei = this.A05.get(str);
        if (c1579ei != null && c1579ei.A09() && c1579ei.A0A()) {
            this.A05.remove(str);
            int i10 = c1579ei.A01;
            boolean z10 = this.A03.get(i10);
            this.A01.AEn(c1579ei, z10);
            if (z10) {
                this.A02.remove(i10);
                this.A03.delete(i10);
                return;
            }
            this.A02.put(i10, null);
            this.A04.put(i10, true);
        }
    }

    public final void A0L(String str, C1584en c1584en) {
        C1579ei A0D = A0D(str);
        if (A0D.A0E(c1584en)) {
            this.A01.AFS(A0D);
        }
    }
}
