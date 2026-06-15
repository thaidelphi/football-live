package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
/* renamed from: com.facebook.ads.redexgen.X.0z  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04250z extends AbstractC0760Et implements Handler.Callback {
    public static byte[] A0C;
    public static String[] A0D = {"6V2fjQztmdn6QcOoRwn3w8YkXQrUwfPb", "gLKOasdWHz2avaAyZSrahHSssLuflmhM", "bR75mNlI8UA", "nHhAnxT", "7tJniP93ZGNDIcJIvO2SJ6", "Untzv3yh6Om2HITwrP06gVfusJ8", "QK6WbRXgXI5pYkNKDtOGNEhzfKJ4rfHy", "3TNgAmzMy9qHvv"};
    public int A00;
    public int A01;
    public long A02;
    public V7 A03;
    public List<MP> A04;
    public boolean A05;
    public final Handler A06;
    public final Bi A07;
    public final InterfaceC1271Zc A08;
    public final InterfaceC1273Ze A09;
    public final long[] A0A;
    public final Metadata[] A0B;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0D[1].charAt(8) != 'H') {
                throw new RuntimeException();
            }
            A0D[7] = "nd2M2LhIt1V42b";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
            i13++;
        }
    }

    public static void A02() {
        A0C = new byte[]{-39, 6, 6, 3, 6, -76, -3, 2, -76, 4, -11, 6, 7, -3, 2, -5, -76, -35, -31, -38, -76, 7, 4, -7, -9, -126, -102, -87, -106, -103, -106, -87, -106, -121, -102, -93, -103, -102, -89, -102, -89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.A02(); i10++) {
            ZM A9R = metadata.A03(i10).A9R();
            if (A9R == null || !this.A08.AJS(A9R)) {
                list.add(metadata.A03(i10));
            } else {
                V7 A59 = this.A08.A59(A9R);
                byte[] bArr = (byte[]) AbstractC1589es.A01(metadata.A03(i10).A9Q());
                this.A07.A0A();
                this.A07.A0C(bArr.length);
                ((ByteBuffer) AbstractC1672gE.A0f(this.A07.A02)).put(bArr);
                this.A07.A0B();
                Metadata A5e = A59.A5e(this.A07);
                if (A5e != null) {
                    A07(A5e, list);
                }
            }
        }
    }

    static {
        A02();
    }

    public C04250z(InterfaceC1273Ze interfaceC1273Ze, Looper looper) {
        this(interfaceC1273Ze, looper, InterfaceC1271Zc.A00, null);
    }

    public C04250z(InterfaceC1273Ze interfaceC1273Ze, Looper looper, InterfaceC1271Zc interfaceC1271Zc, String str) {
        super(5);
        this.A09 = (InterfaceC1273Ze) AbstractC1589es.A01(interfaceC1273Ze);
        this.A06 = looper == null ? null : AbstractC1672gE.A0c(looper, this);
        this.A08 = (InterfaceC1271Zc) AbstractC1589es.A01(interfaceC1271Zc);
        this.A07 = new Bi();
        this.A0B = new Metadata[5];
        this.A0A = new long[5];
        A08(str);
    }

    private void A01() {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A03(long j10) {
        if (this.A04 == null) {
            return;
        }
        for (MP mp : this.A04) {
            if (mp.A01 > j10 || mp.A00 >= j10) {
            }
        }
    }

    private void A04(long j10) {
        if (this.A04 == null) {
            return;
        }
        long A01 = O5.A01(j10);
        if (this.A06 != null) {
            this.A06.obtainMessage(1, Long.valueOf(A01)).sendToTarget();
        } else {
            A03(A01);
        }
    }

    private void A05(Metadata metadata, long j10) {
        if (this.A06 != null) {
            this.A06.obtainMessage(0, new Object[]{metadata, Long.valueOf(j10)}).sendToTarget();
        } else {
            A06(metadata, j10);
        }
    }

    private void A06(Metadata metadata, long j10) {
        this.A09.AE8(metadata, j10);
    }

    private void A08(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = MQ.A01(str);
            } catch (JSONException unused) {
                String A00 = A00(25, 16, 5);
                String A002 = A00(0, 25, 100);
                if (A0D[5].length() != 27) {
                    throw new RuntimeException();
                }
                A0D[4] = "hxyGwgOXpwCLhqmkYLEnsz";
                AbstractC1633fb.A05(A00, A002);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1Z() {
        A01();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1a(long j10, boolean z10) {
        A01();
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1c(ZM[] zmArr, long j10, long j11) {
        this.A03 = this.A08.A59(zmArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final boolean AAE() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final boolean AAT() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void AHd(long j10, long j11) {
        A04(j10);
        if (!this.A05 && this.A00 < 5) {
            this.A07.A0A();
            P6 A1U = A1U();
            int A1R = A1R(A1U, this.A07, 0);
            if (A1R == -4) {
                if (this.A07.A05()) {
                    this.A05 = true;
                } else if (!this.A07.A04()) {
                    this.A07.A00 = this.A02;
                    this.A07.A0B();
                    V7 v72 = (V7) AbstractC1672gE.A0f(this.A03);
                    Bi bi = this.A07;
                    if (A0D[4].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0D[7] = "PBA8I2gAt6QzGP";
                    Metadata A5e = v72.A5e(bi);
                    if (A5e != null) {
                        ArrayList arrayList = new ArrayList(A5e.A02());
                        A07(A5e, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i10 = (this.A01 + this.A00) % 5;
                            this.A0B[i10] = metadata;
                            this.A0A[i10] = this.A07.A01;
                            this.A00++;
                        }
                    }
                }
            } else if (A1R == -5) {
                this.A02 = ((ZM) AbstractC1589es.A01(A1U.A00)).A0M;
            }
        }
        if (this.A00 > 0 && this.A0A[this.A01] <= j10) {
            A05((Metadata) AbstractC1672gE.A0f(this.A0B[this.A01]), O5.A01(j10 - this.A0A[this.A01]));
            this.A0B[this.A01] = null;
            this.A01 = (this.A01 + 1) % 5;
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final int AJR(ZM zm) {
        if (this.A08.AJS(zm)) {
            return AbstractC1047Qb.A00(AnonymousClass10.A1G(zm) ? 4 : 2);
        }
        return AbstractC1047Qb.A00(0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq, com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final String getName() {
        return A00(25, 16, 5);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                A06((Metadata) objArr[0], ((Long) objArr[1]).longValue());
                return true;
            case 1:
                Long l10 = (Long) message.obj;
                String[] strArr = A0D;
                if (strArr[6].charAt(29) != strArr[0].charAt(29)) {
                    throw new RuntimeException();
                }
                A0D[3] = "0fwPxOq";
                A03(l10.longValue());
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
