package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class PQ implements InterfaceC1580ej {
    public static byte[] A07;
    public static String[] A08 = {"Z16lAJXikWhNEVLB7TbNlTWIkixZt69O", "x8BWvnJKkZY12LRW0xsaLDyjlvFaKZ9M", "YkkZSyZAuNxQWrRbBjAJwsc9pw0lbB9X", "uC0LA2AdDEeMxSQcCwrePMe78jx1NV8D", "2OnTtgLqSvUHSfgCuCeaYEqbPB9dHKR8", "qLyOsF0aZf4uxPzAqdSdr5x7hsuXUpsQ", "SGOKETwnnHRPULmcUin3YwIngjuAXgpx", "dTnXmBnDqMR0i06QWD3fpNeqUSszGkXO"};
    public C1587eq A00;
    public boolean A01;
    public final C1591eu A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{24, 28, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C1579ei> hashMap) throws IOException {
        try {
            C1590et A03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C1587eq(A03);
            } else {
                this.A00.A00(A03);
            }
            C1587eq c1587eq = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c1587eq);
            dataOutputStream.writeInt(2);
            boolean z10 = this.A06;
            String[] strArr = A08;
            if (strArr[4].charAt(15) == strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "X3FBm64xbPi7kLcoCSztdikMVUSOqSUd";
            strArr2[1] = "sQ5XcoQVEYuAfLxtC1B2xUlG5tj4rnIK";
            dataOutputStream.writeInt(z10 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) AbstractC1672gE.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) AbstractC1672gE.A0f(this.A04)).init(1, (Key) AbstractC1672gE.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c1587eq, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e8) {
                    throw new IllegalStateException(e8);
                }
            }
            dataOutputStream.writeInt(hashMap.size());
            int i10 = 0;
            for (C1579ei c1579ei : hashMap.values()) {
                A04(c1579ei, dataOutputStream);
                i10 += A00(c1579ei, 2);
            }
            dataOutputStream.writeInt(i10);
            this.A02.A06(dataOutputStream);
            AbstractC1672gE.A10(null);
        } catch (Throwable th) {
            AbstractC1672gE.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C1579ei> hashMap, SparseArray<String> sparseArray) {
        if (this.A02.A07()) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
                DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
                int readInt = dataInputStream.readInt();
                if (readInt < 0 || readInt > 2) {
                    AbstractC1672gE.A10(dataInputStream);
                    return false;
                }
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (this.A04 == null) {
                        AbstractC1672gE.A10(dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        this.A04.init(2, (Key) AbstractC1672gE.A0f(this.A05), new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e8) {
                        throw new IllegalStateException(e8);
                    }
                } else if (this.A06) {
                    this.A01 = true;
                }
                int readInt2 = dataInputStream.readInt();
                int i10 = 0;
                for (int i11 = 0; i11 < readInt2; i11++) {
                    C1579ei A01 = A01(readInt, dataInputStream);
                    hashMap.put(A01.A02, A01);
                    sparseArray.put(A01.A01, A01.A02);
                    i10 += A00(A01, readInt);
                }
                int readInt3 = dataInputStream.readInt();
                boolean z10 = dataInputStream.read() == -1;
                if (readInt3 == i10 && z10) {
                    AbstractC1672gE.A10(dataInputStream);
                    return true;
                }
                AbstractC1672gE.A10(dataInputStream);
                return false;
            } catch (IOException unused) {
                if (0 != 0) {
                    AbstractC1672gE.A10(null);
                }
                return false;
            } catch (Throwable th) {
                if (0 != 0) {
                    AbstractC1672gE.A10(null);
                }
                throw th;
            }
        }
        return true;
    }

    static {
        A03();
    }

    public PQ(File file, byte[] bArr, boolean z10) {
        AbstractC1589es.A08((bArr == null && z10) ? false : true);
        Cipher cipher = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC1589es.A07(bArr.length == 16);
            try {
                cipher = C1581ek.A06();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 114));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
                throw new IllegalStateException(e8);
            }
        } else {
            AbstractC1589es.A07(!z10);
        }
        this.A06 = z10;
        this.A04 = cipher;
        this.A05 = secretKeySpec;
        this.A03 = z10 ? new SecureRandom() : null;
        this.A02 = new C1591eu(file);
    }

    private int A00(C1579ei c1579ei, int i10) {
        int result = c1579ei.A01;
        int i11 = result * 31;
        int result2 = c1579ei.A02.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long A00 = AbstractC1582el.A00(c1579ei.A03());
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + c1579ei.A03().hashCode();
    }

    private C1579ei A01(int i10, DataInputStream dataInputStream) throws IOException {
        PO A02;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i10 < 2) {
            long length = dataInputStream.readLong();
            C1584en c1584en = new C1584en();
            C1584en.A00(c1584en, length);
            A02 = PO.A03.A05(c1584en);
        } else {
            A02 = C1581ek.A02(dataInputStream);
        }
        return new C1579ei(readInt, readUTF, A02);
    }

    private void A04(C1579ei c1579ei, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c1579ei.A01);
        dataOutputStream.writeUTF(c1579ei.A02);
        C1581ek.A08(c1579ei.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void A5f() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final boolean A6I() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AA5(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AAh(HashMap<String, C1579ei> hashMap, SparseArray<String> idToKey) {
        AbstractC1589es.A08(!this.A01);
        if (!A06(hashMap, idToKey)) {
            hashMap.clear();
            idToKey.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AEn(C1579ei c1579ei, boolean z10) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AFS(C1579ei c1579ei) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AJN(HashMap<String, C1579ei> hashMap) throws IOException {
        A05(hashMap);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1580ej
    public final void AJO(HashMap<String, C1579ei> hashMap) throws IOException {
        if (!this.A01) {
            return;
        }
        AJN(hashMap);
    }
}
