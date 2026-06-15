package com.startapp;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w {

    /* renamed from: c  reason: collision with root package name */
    public static final String f23483c = o9.a(71, 13, -10, 14, -3, -6, -5, -54, 66, -11, 13, -5, -4, 10, 0, -10, 6, -1, -64, 19, 2, 0, 2, 14, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final String f23484d = o9.a(66, 3, 5, -9);

    /* renamed from: e  reason: collision with root package name */
    public static final String f23485e = o9.a(61, 12, -14, 17, 1, -14);

    /* renamed from: f  reason: collision with root package name */
    public static final String f23486f = o9.a(56, -1, 2, 8, -4, 11, -3, 6, -7, -10);

    /* renamed from: g  reason: collision with root package name */
    public static final String f23487g = o9.a(86, -19, 3, -12, -2, 19, -11, 6, -1);

    /* renamed from: a  reason: collision with root package name */
    public final Context f23488a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f23489b = new AtomicInteger(0);

    public w(Context context) {
        this.f23488a = context;
    }

    public final String a() {
        Context context = this.f23488a;
        StringBuilder sb = new StringBuilder();
        String str = f23483c;
        sb.append(str);
        sb.append(f23485e);
        String str2 = f23487g;
        sb.append(str2);
        int[] a10 = o9.a(context, sb.toString(), str + f23484d + str2, str + f23486f + str2);
        StringBuilder sb2 = new StringBuilder(a10.length);
        for (int i10 : a10) {
            sb2.append(i10);
        }
        return sb2.toString();
    }
}
