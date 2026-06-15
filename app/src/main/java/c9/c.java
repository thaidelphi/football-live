package c9;

import java.text.DecimalFormat;
/* compiled from: DurationJvm.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f5605a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f5606b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f5606b = threadLocalArr;
    }

    public static final boolean a() {
        return f5605a;
    }
}
