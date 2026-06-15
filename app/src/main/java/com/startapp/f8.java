package com.startapp;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f8 {
    public static String a(ArrayList arrayList) {
        d1 d1Var = new d1();
        long currentTimeMillis = System.currentTimeMillis();
        BloomVersion bloomVersion = BloomVersion.f23358c;
        y0 y0Var = ((aa) d1Var.f21868b.f21803a.get(bloomVersion)).f21770b;
        y0Var.getClass();
        OpenBitSet openBitSet = new OpenBitSet(y0Var.f23557a * y0Var.f23558b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ByteBuffer wrap = ByteBuffer.wrap(((String) it.next()).getBytes());
            long c10 = openBitSet.c();
            int i10 = y0Var.f23557a;
            long[] jArr = new long[i10];
            long j10 = c10 / i10;
            long j11 = currentTimeMillis;
            long a10 = x5.a(wrap, wrap.position(), wrap.remaining(), 0L);
            long a11 = x5.a(wrap, wrap.position(), wrap.remaining(), a10);
            Iterator it2 = it;
            int i11 = 0;
            while (i11 < y0Var.f23557a) {
                BloomVersion bloomVersion2 = bloomVersion;
                long j12 = i11;
                jArr[i11] = Math.abs(((j12 * a11) + a10) % j10) + (j12 * j10);
                i11++;
                bloomVersion = bloomVersion2;
                y0Var = y0Var;
            }
            BloomVersion bloomVersion3 = bloomVersion;
            y0 y0Var2 = y0Var;
            for (int i12 = 0; i12 < i10; i12++) {
                openBitSet.b(jArr[i12]);
            }
            bloomVersion = bloomVersion3;
            currentTimeMillis = j11;
            it = it2;
            y0Var = y0Var2;
        }
        long j13 = currentTimeMillis;
        BloomVersion bloomVersion4 = bloomVersion;
        c9 c9Var = d1Var.f21867a;
        c9Var.getClass();
        try {
            String a12 = c9Var.f21850a.a(openBitSet);
            d9 d9Var = ((aa) c9Var.f21851b.f21803a.get(bloomVersion4)).f21769a;
            return j13 + "-" + bloomVersion4.c() + "-" + d9Var.a(a12);
        } catch (Throwable unused) {
            return null;
        }
    }
}
