package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FastParser<T extends FastJsonResponse> {

    /* renamed from: g  reason: collision with root package name */
    private static final char[] f12674g = {'u', 'l', 'l'};

    /* renamed from: h  reason: collision with root package name */
    private static final char[] f12675h = {'r', 'u', 'e'};

    /* renamed from: i  reason: collision with root package name */
    private static final char[] f12676i = {'r', 'u', 'e', '\"'};

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f12677j = {'a', 'l', 's', 'e'};

    /* renamed from: k  reason: collision with root package name */
    private static final char[] f12678k = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f12679l = {'\n'};

    /* renamed from: m  reason: collision with root package name */
    private static final i<Integer> f12680m = new a();

    /* renamed from: n  reason: collision with root package name */
    private static final i<Long> f12681n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final i<Float> f12682o = new c();

    /* renamed from: p  reason: collision with root package name */
    private static final i<Double> f12683p = new d();

    /* renamed from: q  reason: collision with root package name */
    private static final i<Boolean> f12684q = new e();

    /* renamed from: r  reason: collision with root package name */
    private static final i<String> f12685r = new f();

    /* renamed from: s  reason: collision with root package name */
    private static final i<BigInteger> f12686s = new g();

    /* renamed from: t  reason: collision with root package name */
    private static final i<BigDecimal> f12687t = new h();

    /* renamed from: a  reason: collision with root package name */
    private final char[] f12688a = new char[1];

    /* renamed from: b  reason: collision with root package name */
    private final char[] f12689b = new char[32];

    /* renamed from: c  reason: collision with root package name */
    private final char[] f12690c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    private final StringBuilder f12691d = new StringBuilder(32);

    /* renamed from: e  reason: collision with root package name */
    private final StringBuilder f12692e = new StringBuilder(1024);

    /* renamed from: f  reason: collision with root package name */
    private final Stack<Integer> f12693f = new Stack<>();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class ParseException extends Exception {
    }
}
