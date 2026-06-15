package com.google.gson.internal.bind;

import b7.g;
import b7.j;
import b7.l;
import b7.m;
import b7.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JsonTreeWriter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b extends h7.c {

    /* renamed from: o  reason: collision with root package name */
    private static final Writer f15214o = new a();

    /* renamed from: p  reason: collision with root package name */
    private static final o f15215p = new o("closed");

    /* renamed from: l  reason: collision with root package name */
    private final List<j> f15216l;

    /* renamed from: m  reason: collision with root package name */
    private String f15217m;

    /* renamed from: n  reason: collision with root package name */
    private j f15218n;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f15214o);
        this.f15216l = new ArrayList();
        this.f15218n = l.f5273a;
    }

    private j L0() {
        List<j> list = this.f15216l;
        return list.get(list.size() - 1);
    }

    private void M0(j jVar) {
        if (this.f15217m != null) {
            if (!jVar.e() || z()) {
                ((m) L0()).h(this.f15217m, jVar);
            }
            this.f15217m = null;
        } else if (this.f15216l.isEmpty()) {
            this.f15218n = jVar;
        } else {
            j L0 = L0();
            if (L0 instanceof g) {
                ((g) L0).h(jVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // h7.c
    public h7.c C0(long j10) throws IOException {
        M0(new o(Long.valueOf(j10)));
        return this;
    }

    @Override // h7.c
    public h7.c D0(Boolean bool) throws IOException {
        if (bool == null) {
            return K();
        }
        M0(new o(bool));
        return this;
    }

    @Override // h7.c
    public h7.c G(String str) throws IOException {
        if (!this.f15216l.isEmpty() && this.f15217m == null) {
            if (L0() instanceof m) {
                this.f15217m = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // h7.c
    public h7.c G0(Number number) throws IOException {
        if (number == null) {
            return K();
        }
        if (!F()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        M0(new o(number));
        return this;
    }

    @Override // h7.c
    public h7.c H0(String str) throws IOException {
        if (str == null) {
            return K();
        }
        M0(new o(str));
        return this;
    }

    @Override // h7.c
    public h7.c I0(boolean z10) throws IOException {
        M0(new o(Boolean.valueOf(z10)));
        return this;
    }

    @Override // h7.c
    public h7.c K() throws IOException {
        M0(l.f5273a);
        return this;
    }

    public j K0() {
        if (this.f15216l.isEmpty()) {
            return this.f15218n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f15216l);
    }

    @Override // h7.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f15216l.isEmpty()) {
            this.f15216l.add(f15215p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // h7.c
    public h7.c f() throws IOException {
        g gVar = new g();
        M0(gVar);
        this.f15216l.add(gVar);
        return this;
    }

    @Override // h7.c, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // h7.c
    public h7.c j() throws IOException {
        m mVar = new m();
        M0(mVar);
        this.f15216l.add(mVar);
        return this;
    }

    @Override // h7.c
    public h7.c t() throws IOException {
        if (!this.f15216l.isEmpty() && this.f15217m == null) {
            if (L0() instanceof g) {
                List<j> list = this.f15216l;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // h7.c
    public h7.c w() throws IOException {
        if (!this.f15216l.isEmpty() && this.f15217m == null) {
            if (L0() instanceof m) {
                List<j> list = this.f15216l;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
