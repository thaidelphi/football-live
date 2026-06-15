package com.google.gson.internal.bind;

import com.ironsource.b9;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class TypeAdapters {
    public static final b7.t<String> A;
    public static final b7.t<BigDecimal> B;
    public static final b7.t<BigInteger> C;
    public static final b7.u D;
    public static final b7.t<StringBuilder> E;
    public static final b7.u F;
    public static final b7.t<StringBuffer> G;
    public static final b7.u H;
    public static final b7.t<URL> I;
    public static final b7.u J;
    public static final b7.t<URI> K;
    public static final b7.u L;
    public static final b7.t<InetAddress> M;
    public static final b7.u N;
    public static final b7.t<UUID> O;
    public static final b7.u P;
    public static final b7.t<Currency> Q;
    public static final b7.u R;
    public static final b7.u S;
    public static final b7.t<Calendar> T;
    public static final b7.u U;
    public static final b7.t<Locale> V;
    public static final b7.u W;
    public static final b7.t<b7.j> X;
    public static final b7.u Y;
    public static final b7.u Z;

    /* renamed from: a  reason: collision with root package name */
    public static final b7.t<Class> f15163a;

    /* renamed from: b  reason: collision with root package name */
    public static final b7.u f15164b;

    /* renamed from: c  reason: collision with root package name */
    public static final b7.t<BitSet> f15165c;

    /* renamed from: d  reason: collision with root package name */
    public static final b7.u f15166d;

    /* renamed from: e  reason: collision with root package name */
    public static final b7.t<Boolean> f15167e;

    /* renamed from: f  reason: collision with root package name */
    public static final b7.t<Boolean> f15168f;

    /* renamed from: g  reason: collision with root package name */
    public static final b7.u f15169g;

    /* renamed from: h  reason: collision with root package name */
    public static final b7.t<Number> f15170h;

    /* renamed from: i  reason: collision with root package name */
    public static final b7.u f15171i;

    /* renamed from: j  reason: collision with root package name */
    public static final b7.t<Number> f15172j;

    /* renamed from: k  reason: collision with root package name */
    public static final b7.u f15173k;

    /* renamed from: l  reason: collision with root package name */
    public static final b7.t<Number> f15174l;

    /* renamed from: m  reason: collision with root package name */
    public static final b7.u f15175m;

    /* renamed from: n  reason: collision with root package name */
    public static final b7.t<AtomicInteger> f15176n;

    /* renamed from: o  reason: collision with root package name */
    public static final b7.u f15177o;

    /* renamed from: p  reason: collision with root package name */
    public static final b7.t<AtomicBoolean> f15178p;

    /* renamed from: q  reason: collision with root package name */
    public static final b7.u f15179q;

    /* renamed from: r  reason: collision with root package name */
    public static final b7.t<AtomicIntegerArray> f15180r;

    /* renamed from: s  reason: collision with root package name */
    public static final b7.u f15181s;

    /* renamed from: t  reason: collision with root package name */
    public static final b7.t<Number> f15182t;

    /* renamed from: u  reason: collision with root package name */
    public static final b7.t<Number> f15183u;

    /* renamed from: v  reason: collision with root package name */
    public static final b7.t<Number> f15184v;

    /* renamed from: w  reason: collision with root package name */
    public static final b7.t<Number> f15185w;

    /* renamed from: x  reason: collision with root package name */
    public static final b7.u f15186x;

    /* renamed from: y  reason: collision with root package name */
    public static final b7.t<Character> f15187y;

    /* renamed from: z  reason: collision with root package name */
    public static final b7.u f15188z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    final class AnonymousClass31 implements b7.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g7.a f15191a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b7.t f15192b;

        @Override // b7.u
        public <T> b7.t<T> c(b7.e eVar, g7.a<T> aVar) {
            if (aVar.equals(this.f15191a)) {
                return this.f15192b;
            }
            return null;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class a extends b7.t<AtomicIntegerArray> {
        a() {
        }

        @Override // b7.t
        /* renamed from: e */
        public AtomicIntegerArray b(h7.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.E()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.P()));
                } catch (NumberFormatException e8) {
                    throw new b7.r(e8);
                }
            }
            aVar.t();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.f();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.C0(atomicIntegerArray.get(i10));
            }
            cVar.t();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class a0 extends b7.t<Number> {
        a0() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.P());
            } catch (NumberFormatException e8) {
                throw new b7.r(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            cVar.G0(number);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class b extends b7.t<Number> {
        b() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            try {
                return Long.valueOf(aVar.R());
            } catch (NumberFormatException e8) {
                throw new b7.r(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            cVar.G0(number);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class b0 extends b7.t<AtomicInteger> {
        b0() {
        }

        @Override // b7.t
        /* renamed from: e */
        public AtomicInteger b(h7.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.P());
            } catch (NumberFormatException e8) {
                throw new b7.r(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.C0(atomicInteger.get());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class c extends b7.t<Number> {
        c() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return Float.valueOf((float) aVar.L());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            cVar.G0(number);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class c0 extends b7.t<AtomicBoolean> {
        c0() {
        }

        @Override // b7.t
        /* renamed from: e */
        public AtomicBoolean b(h7.a aVar) throws IOException {
            return new AtomicBoolean(aVar.K());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.I0(atomicBoolean.get());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class d extends b7.t<Number> {
        d() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return Double.valueOf(aVar.L());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            cVar.G0(number);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class d0<T extends Enum<T>> extends b7.t<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f15205a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f15206b = new HashMap();

        public d0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String name = t10.name();
                    c7.c cVar = (c7.c) cls.getField(name).getAnnotation(c7.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f15205a.put(str, t10);
                        }
                    }
                    this.f15205a.put(name, t10);
                    this.f15206b.put(t10, name);
                }
            } catch (NoSuchFieldException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // b7.t
        /* renamed from: e */
        public T b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return this.f15205a.get(aVar.y0());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, T t10) throws IOException {
            cVar.H0(t10 == null ? null : this.f15206b.get(t10));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class e extends b7.t<Number> {
        e() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            h7.b C0 = aVar.C0();
            int i10 = v.f15207a[C0.ordinal()];
            if (i10 == 1 || i10 == 3) {
                return new d7.e(aVar.y0());
            }
            if (i10 == 4) {
                aVar.n0();
                return null;
            }
            throw new b7.r("Expecting number, got: " + C0);
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            cVar.G0(number);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class f extends b7.t<Character> {
        f() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Character b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            String y02 = aVar.y0();
            if (y02.length() == 1) {
                return Character.valueOf(y02.charAt(0));
            }
            throw new b7.r("Expecting character, got: " + y02);
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Character ch) throws IOException {
            cVar.H0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class g extends b7.t<String> {
        g() {
        }

        @Override // b7.t
        /* renamed from: e */
        public String b(h7.a aVar) throws IOException {
            h7.b C0 = aVar.C0();
            if (C0 == h7.b.NULL) {
                aVar.n0();
                return null;
            } else if (C0 == h7.b.BOOLEAN) {
                return Boolean.toString(aVar.K());
            } else {
                return aVar.y0();
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, String str) throws IOException {
            cVar.H0(str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class h extends b7.t<BigDecimal> {
        h() {
        }

        @Override // b7.t
        /* renamed from: e */
        public BigDecimal b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            try {
                return new BigDecimal(aVar.y0());
            } catch (NumberFormatException e8) {
                throw new b7.r(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.G0(bigDecimal);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class i extends b7.t<BigInteger> {
        i() {
        }

        @Override // b7.t
        /* renamed from: e */
        public BigInteger b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            try {
                return new BigInteger(aVar.y0());
            } catch (NumberFormatException e8) {
                throw new b7.r(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, BigInteger bigInteger) throws IOException {
            cVar.G0(bigInteger);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class j extends b7.t<StringBuilder> {
        j() {
        }

        @Override // b7.t
        /* renamed from: e */
        public StringBuilder b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return new StringBuilder(aVar.y0());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, StringBuilder sb) throws IOException {
            cVar.H0(sb == null ? null : sb.toString());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class k extends b7.t<Class> {
        k() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Class b(h7.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class l extends b7.t<StringBuffer> {
        l() {
        }

        @Override // b7.t
        /* renamed from: e */
        public StringBuffer b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return new StringBuffer(aVar.y0());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.H0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class m extends b7.t<URL> {
        m() {
        }

        @Override // b7.t
        /* renamed from: e */
        public URL b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            String y02 = aVar.y0();
            if ("null".equals(y02)) {
                return null;
            }
            return new URL(y02);
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, URL url) throws IOException {
            cVar.H0(url == null ? null : url.toExternalForm());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class n extends b7.t<URI> {
        n() {
        }

        @Override // b7.t
        /* renamed from: e */
        public URI b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            try {
                String y02 = aVar.y0();
                if ("null".equals(y02)) {
                    return null;
                }
                return new URI(y02);
            } catch (URISyntaxException e8) {
                throw new b7.k(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, URI uri) throws IOException {
            cVar.H0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class o extends b7.t<InetAddress> {
        o() {
        }

        @Override // b7.t
        /* renamed from: e */
        public InetAddress b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return InetAddress.getByName(aVar.y0());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, InetAddress inetAddress) throws IOException {
            cVar.H0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class p extends b7.t<UUID> {
        p() {
        }

        @Override // b7.t
        /* renamed from: e */
        public UUID b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return UUID.fromString(aVar.y0());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, UUID uuid) throws IOException {
            cVar.H0(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class q extends b7.t<Currency> {
        q() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Currency b(h7.a aVar) throws IOException {
            return Currency.getInstance(aVar.y0());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Currency currency) throws IOException {
            cVar.H0(currency.getCurrencyCode());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class r extends b7.t<Calendar> {
        r() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Calendar b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            aVar.b();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.C0() != h7.b.END_OBJECT) {
                String S = aVar.S();
                int P = aVar.P();
                if ("year".equals(S)) {
                    i10 = P;
                } else if ("month".equals(S)) {
                    i11 = P;
                } else if ("dayOfMonth".equals(S)) {
                    i12 = P;
                } else if ("hourOfDay".equals(S)) {
                    i13 = P;
                } else if ("minute".equals(S)) {
                    i14 = P;
                } else if ("second".equals(S)) {
                    i15 = P;
                }
            }
            aVar.w();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.K();
                return;
            }
            cVar.j();
            cVar.G("year");
            cVar.C0(calendar.get(1));
            cVar.G("month");
            cVar.C0(calendar.get(2));
            cVar.G("dayOfMonth");
            cVar.C0(calendar.get(5));
            cVar.G("hourOfDay");
            cVar.C0(calendar.get(11));
            cVar.G("minute");
            cVar.C0(calendar.get(12));
            cVar.G("second");
            cVar.C0(calendar.get(13));
            cVar.w();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class s extends b7.t<Locale> {
        s() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Locale b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.y0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Locale locale) throws IOException {
            cVar.H0(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class t extends b7.t<b7.j> {
        t() {
        }

        @Override // b7.t
        /* renamed from: e */
        public b7.j b(h7.a aVar) throws IOException {
            switch (v.f15207a[aVar.C0().ordinal()]) {
                case 1:
                    return new b7.o(new d7.e(aVar.y0()));
                case 2:
                    return new b7.o(Boolean.valueOf(aVar.K()));
                case 3:
                    return new b7.o(aVar.y0());
                case 4:
                    aVar.n0();
                    return b7.l.f5273a;
                case 5:
                    b7.g gVar = new b7.g();
                    aVar.a();
                    while (aVar.E()) {
                        gVar.h(b(aVar));
                    }
                    aVar.t();
                    return gVar;
                case 6:
                    b7.m mVar = new b7.m();
                    aVar.b();
                    while (aVar.E()) {
                        mVar.h(aVar.S(), b(aVar));
                    }
                    aVar.w();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, b7.j jVar) throws IOException {
            if (jVar != null && !jVar.e()) {
                if (jVar.g()) {
                    b7.o c10 = jVar.c();
                    if (c10.q()) {
                        cVar.G0(c10.m());
                        return;
                    } else if (c10.o()) {
                        cVar.I0(c10.h());
                        return;
                    } else {
                        cVar.H0(c10.n());
                        return;
                    }
                } else if (jVar.d()) {
                    cVar.f();
                    Iterator<b7.j> it = jVar.a().iterator();
                    while (it.hasNext()) {
                        d(cVar, it.next());
                    }
                    cVar.t();
                    return;
                } else if (jVar.f()) {
                    cVar.j();
                    for (Map.Entry<String, b7.j> entry : jVar.b().i()) {
                        cVar.G(entry.getKey());
                        d(cVar, entry.getValue());
                    }
                    cVar.w();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
                }
            }
            cVar.K();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class u extends b7.t<BitSet> {
        u() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
            if (r8.P() != 0) goto L15;
         */
        @Override // b7.t
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet b(h7.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                h7.b r1 = r8.C0()
                r2 = 0
                r3 = r2
            Le:
                h7.b r4 = h7.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.v.f15207a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.y0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                b7.r r8 = new b7.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                b7.r r8 = new b7.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.K()
                goto L69
            L63:
                int r1 = r8.P()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                h7.b r1 = r8.C0()
                goto Le
            L75:
                r8.t()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.u.b(h7.a):java.util.BitSet");
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, BitSet bitSet) throws IOException {
            cVar.f();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.C0(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class v {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15207a;

        static {
            int[] iArr = new int[h7.b.values().length];
            f15207a = iArr;
            try {
                iArr[h7.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15207a[h7.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15207a[h7.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15207a[h7.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15207a[h7.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15207a[h7.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15207a[h7.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15207a[h7.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15207a[h7.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15207a[h7.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class w extends b7.t<Boolean> {
        w() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Boolean b(h7.a aVar) throws IOException {
            h7.b C0 = aVar.C0();
            if (C0 == h7.b.NULL) {
                aVar.n0();
                return null;
            } else if (C0 == h7.b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.y0()));
            } else {
                return Boolean.valueOf(aVar.K());
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Boolean bool) throws IOException {
            cVar.D0(bool);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class x extends b7.t<Boolean> {
        x() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Boolean b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return Boolean.valueOf(aVar.y0());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Boolean bool) throws IOException {
            cVar.H0(bool == null ? "null" : bool.toString());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class y extends b7.t<Number> {
        y() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.P());
            } catch (NumberFormatException e8) {
                throw new b7.r(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            cVar.G0(number);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class z extends b7.t<Number> {
        z() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.P());
            } catch (NumberFormatException e8) {
                throw new b7.r(e8);
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            cVar.G0(number);
        }
    }

    static {
        b7.t<Class> a10 = new k().a();
        f15163a = a10;
        f15164b = a(Class.class, a10);
        b7.t<BitSet> a11 = new u().a();
        f15165c = a11;
        f15166d = a(BitSet.class, a11);
        w wVar = new w();
        f15167e = wVar;
        f15168f = new x();
        f15169g = b(Boolean.TYPE, Boolean.class, wVar);
        y yVar = new y();
        f15170h = yVar;
        f15171i = b(Byte.TYPE, Byte.class, yVar);
        z zVar = new z();
        f15172j = zVar;
        f15173k = b(Short.TYPE, Short.class, zVar);
        a0 a0Var = new a0();
        f15174l = a0Var;
        f15175m = b(Integer.TYPE, Integer.class, a0Var);
        b7.t<AtomicInteger> a12 = new b0().a();
        f15176n = a12;
        f15177o = a(AtomicInteger.class, a12);
        b7.t<AtomicBoolean> a13 = new c0().a();
        f15178p = a13;
        f15179q = a(AtomicBoolean.class, a13);
        b7.t<AtomicIntegerArray> a14 = new a().a();
        f15180r = a14;
        f15181s = a(AtomicIntegerArray.class, a14);
        f15182t = new b();
        f15183u = new c();
        f15184v = new d();
        e eVar = new e();
        f15185w = eVar;
        f15186x = a(Number.class, eVar);
        f fVar = new f();
        f15187y = fVar;
        f15188z = b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = a(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = a(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        b7.t<Currency> a15 = new q().a();
        Q = a15;
        R = a(Currency.class, a15);
        S = new b7.u() { // from class: com.google.gson.internal.bind.TypeAdapters.26

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            class a extends b7.t<Timestamp> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b7.t f15189a;

                a(b7.t tVar) {
                    this.f15189a = tVar;
                }

                @Override // b7.t
                /* renamed from: e */
                public Timestamp b(h7.a aVar) throws IOException {
                    Date date = (Date) this.f15189a.b(aVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // b7.t
                /* renamed from: f */
                public void d(h7.c cVar, Timestamp timestamp) throws IOException {
                    this.f15189a.d(cVar, timestamp);
                }
            }

            @Override // b7.u
            public <T> b7.t<T> c(b7.e eVar2, g7.a<T> aVar) {
                if (aVar.c() != Timestamp.class) {
                    return null;
                }
                return new a(eVar2.l(Date.class));
            }
        };
        r rVar = new r();
        T = rVar;
        U = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        V = sVar;
        W = a(Locale.class, sVar);
        t tVar = new t();
        X = tVar;
        Y = d(b7.j.class, tVar);
        Z = new b7.u() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // b7.u
            public <T> b7.t<T> c(b7.e eVar2, g7.a<T> aVar) {
                Class c10 = aVar.c();
                if (!Enum.class.isAssignableFrom(c10) || c10 == Enum.class) {
                    return null;
                }
                if (!c10.isEnum()) {
                    c10 = (Class<? super Object>) c10.getSuperclass();
                }
                return new d0(c10);
            }
        };
    }

    public static <TT> b7.u a(final Class<TT> cls, final b7.t<TT> tVar) {
        return new b7.u() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // b7.u
            public <T> b7.t<T> c(b7.e eVar, g7.a<T> aVar) {
                if (aVar.c() == cls) {
                    return tVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + tVar + b9.i.f16698e;
            }
        };
    }

    public static <TT> b7.u b(final Class<TT> cls, final Class<TT> cls2, final b7.t<? super TT> tVar) {
        return new b7.u() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // b7.u
            public <T> b7.t<T> c(b7.e eVar, g7.a<T> aVar) {
                Class<? super T> c10 = aVar.c();
                if (c10 == cls || c10 == cls2) {
                    return tVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + tVar + b9.i.f16698e;
            }
        };
    }

    public static <TT> b7.u c(final Class<TT> cls, final Class<? extends TT> cls2, final b7.t<? super TT> tVar) {
        return new b7.u() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // b7.u
            public <T> b7.t<T> c(b7.e eVar, g7.a<T> aVar) {
                Class<? super T> c10 = aVar.c();
                if (c10 == cls || c10 == cls2) {
                    return tVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + tVar + b9.i.f16698e;
            }
        };
    }

    public static <T1> b7.u d(final Class<T1> cls, final b7.t<T1> tVar) {
        return new b7.u() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* JADX INFO: Add missing generic type declarations: [T1] */
            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            class a<T1> extends b7.t<T1> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Class f15203a;

                a(Class cls) {
                    this.f15203a = cls;
                }

                @Override // b7.t
                public T1 b(h7.a aVar) throws IOException {
                    T1 t12 = (T1) tVar.b(aVar);
                    if (t12 == null || this.f15203a.isInstance(t12)) {
                        return t12;
                    }
                    throw new b7.r("Expected a " + this.f15203a.getName() + " but was " + t12.getClass().getName());
                }

                @Override // b7.t
                public void d(h7.c cVar, T1 t12) throws IOException {
                    tVar.d(cVar, t12);
                }
            }

            @Override // b7.u
            public <T2> b7.t<T2> c(b7.e eVar, g7.a<T2> aVar) {
                Class<? super T2> c10 = aVar.c();
                if (cls.isAssignableFrom(c10)) {
                    return new a(c10);
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + tVar + b9.i.f16698e;
            }
        };
    }
}
