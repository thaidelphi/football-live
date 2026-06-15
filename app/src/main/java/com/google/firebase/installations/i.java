package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: Utils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f14874b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f14875c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static i f14876d;

    /* renamed from: a  reason: collision with root package name */
    private final v6.a f14877a;

    private i(v6.a aVar) {
        this.f14877a = aVar;
    }

    public static i c() {
        return d(v6.b.b());
    }

    public static i d(v6.a aVar) {
        if (f14876d == null) {
            f14876d = new i(aVar);
        }
        return f14876d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return f14875c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f14877a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(t6.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f14874b;
    }
}
