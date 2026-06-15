package com.startapp;

import com.ironsource.cc;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n {

    /* renamed from: m  reason: collision with root package name */
    public static Pattern f22297m;

    /* renamed from: a  reason: collision with root package name */
    public final String f22298a;

    /* renamed from: b  reason: collision with root package name */
    public final e3 f22299b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22300c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22301d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22302e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22303f;

    /* renamed from: g  reason: collision with root package name */
    public long f22304g;

    /* renamed from: h  reason: collision with root package name */
    public long f22305h;

    /* renamed from: i  reason: collision with root package name */
    public long f22306i;

    /* renamed from: j  reason: collision with root package name */
    public long f22307j;

    /* renamed from: k  reason: collision with root package name */
    public int f22308k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22309l;

    public n(String str, e3 e3Var, boolean z10, boolean z11) {
        this.f22298a = str;
        this.f22299b = e3Var;
        this.f22300c = z10;
        this.f22301d = z11;
    }

    public static void a(StringBuilder sb, String str, String str2, boolean z10) {
        if (str != null) {
            sb.append(str);
            sb.append(cc.T);
        }
        if (z10) {
            sb.append('(');
            sb.append(str2);
            sb.append(')');
        } else {
            sb.append(str2);
        }
        sb.append(", ");
    }

    public static void a(StringBuilder sb) {
        if (sb.length() < 2 || !sb.substring(sb.length() - 2, sb.length()).equals(", ")) {
            return;
        }
        sb.delete(sb.length() - 2, sb.length());
    }

    public static String a(long j10) {
        boolean z10 = true;
        String format = String.format(Locale.ENGLISH, "%.3f", Float.valueOf(((float) j10) / 1000000.0f));
        WeakHashMap weakHashMap = o9.f22359a;
        int length = format.length() - 1;
        int i10 = 0;
        while (length >= 0) {
            char charAt = format.charAt(length);
            if (charAt == '0') {
                if (z10) {
                    i10++;
                }
            } else if (charAt == '.') {
                if (!z10) {
                    length = format.length() - i10;
                }
                return format.substring(0, length);
            } else {
                z10 = false;
            }
            length--;
        }
        return format;
    }
}
