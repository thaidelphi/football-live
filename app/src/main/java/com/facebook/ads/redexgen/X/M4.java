package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class M4 extends AbstractC1896jx<String> {
    public static byte[] A08;
    public static String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", "E"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C8E A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {56, 53, 72, 53, 54, 53, 71, 57};
        if (A09[2].length() == 32) {
            throw new RuntimeException();
        }
        A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
        A08 = bArr;
    }

    static {
        A02();
    }

    public M4(C8E c8e, String str, String str2, int i10, double d10, double d11, String str3, Map map) {
        this.A03 = c8e;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i10;
        this.A01 = d10;
        this.A00 = d11;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8H
    /* renamed from: A00 */
    public final String A03() {
        C1899k0 c1899k0;
        Lock lock;
        Lock lock2;
        C1899k0 c1899k02;
        C1899k0 c1899k03;
        Lock lock3;
        C1899k0 c1899k04;
        C1898jz c1898jz;
        C1897jy c1897jy;
        Lock lock4;
        C1899k0 c1899k05;
        String eventId = A01(0, 8, 90);
        c1899k0 = this.A03.A01;
        c1899k0.A08().A9t(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C8E.A07;
        lock.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c1898jz = this.A03.A02;
                c1897jy = this.A03.A03;
                String A0E = c1898jz.A0E(c1897jy.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e8) {
                        c1899k05 = this.A03.A01;
                        c1899k05.A08().AAu(eventId, AbstractC06048a.A0z, new C06058b(e8));
                    }
                }
                lock4 = C8E.A07;
                lock4.unlock();
                return A0E;
            } catch (Exception e10) {
                A01(C8G.A05);
                c1899k03 = this.A03.A01;
                c1899k03.A08().AAu(eventId, AbstractC06048a.A0y, new C06058b(e10));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e11) {
                        c1899k04 = this.A03.A01;
                        c1899k04.A08().AAu(eventId, AbstractC06048a.A0z, new C06058b(e11));
                    }
                }
                lock3 = C8E.A07;
                lock3.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                boolean isOpen = sQLiteDatabase.isOpen();
                if (A09[5].length() != 7) {
                    throw new RuntimeException();
                }
                A09[2] = "rWG930h";
                if (isOpen) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e12) {
                        c1899k02 = this.A03.A01;
                        c1899k02.A08().AAu(eventId, AbstractC06048a.A0z, new C06058b(e12));
                    }
                }
            }
            lock2 = C8E.A07;
            lock2.unlock();
            throw th;
        }
    }
}
