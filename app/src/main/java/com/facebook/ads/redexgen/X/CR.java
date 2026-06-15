package com.facebook.ads.redexgen.X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class CR implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass85 A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, 33, 42, 61, 38, 44, 43, 41, 56, 31, 60, 32, 37, 56, 2, 45, 33, 41, 43, 41, 56, 24, 53, 60, 41, 73, 75, 90, 120, 79, 66, 91, 75, 29, 28, 49, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public CR(int i10, LinkedBlockingQueue linkedBlockingQueue, AnonymousClass85 anonymousClass85) {
        this.A00 = i10;
        this.A02 = linkedBlockingQueue;
        this.A01 = anonymousClass85;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c10 : (List) objArr[0]) {
                    String str = (String) c10.getClass().getMethod(A00(7, 12, 120), new Class[0]).invoke(c10, new Object[0]);
                    int intValue = ((Integer) c10.getClass().getMethod(A00(19, 7, 120), new Class[0]).invoke(c10, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c10.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c10, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t10) {
            this.A01.A08().AAu(A00(0, 7, 123), AbstractC06048a.A1G, new C06058b(t10));
        }
        return null;
    }
}
