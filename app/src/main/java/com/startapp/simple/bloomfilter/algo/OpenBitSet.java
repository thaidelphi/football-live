package com.startapp.simple.bloomfilter.algo;

import com.google.protobuf.CodedOutputStream;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class OpenBitSet implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f23355a = true;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    public OpenBitSet(long j10) {
        int a10 = a(j10);
        this.wlen = a10;
        int i10 = a10 % CodedOutputStream.DEFAULT_BUFFER_SIZE;
        int i11 = a10 / CodedOutputStream.DEFAULT_BUFFER_SIZE;
        int i12 = (i10 == 0 ? 0 : 1) + i11;
        this.pageCount = i12;
        if (i12 <= 100) {
            this.bits = new long[i12];
            for (int i13 = 0; i13 < i11; i13++) {
                this.bits[i13] = new long[CodedOutputStream.DEFAULT_BUFFER_SIZE];
            }
            if (i10 != 0) {
                long[][] jArr = this.bits;
                jArr[jArr.length - 1] = new long[i10];
                return;
            }
            return;
        }
        throw new RuntimeException("HighPageCountException pageCount = " + i12);
    }

    public static int a(long j10) {
        return (int) (((j10 - 1) >>> 6) + 1);
    }

    public final int a() {
        return this.wlen;
    }

    public final void b(long j10) {
        int i10 = (int) (j10 >> 6);
        if (i10 >= this.wlen) {
            int a10 = a(j10 + 1);
            if (!f23355a && a10 > this.wlen) {
                throw new AssertionError("Growing of paged bitset is not supported");
            }
            this.wlen = i10 + 1;
        }
        long[] jArr = this.bits[i10 / CodedOutputStream.DEFAULT_BUFFER_SIZE];
        int i11 = i10 % CodedOutputStream.DEFAULT_BUFFER_SIZE;
        jArr[i11] = (1 << (((int) j10) & 63)) | jArr[i11];
    }

    public final long c() {
        return this.wlen << 6;
    }

    public final long[] a(int i10) {
        return this.bits[i10];
    }

    public final int b() {
        return this.pageCount;
    }
}
