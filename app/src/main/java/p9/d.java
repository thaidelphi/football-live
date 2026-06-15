package p9;

import com.ironsource.b9;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import v9.g;
import y9.l;
import y9.r;
import y9.s;
/* compiled from: DiskLruCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: u  reason: collision with root package name */
    static final Pattern f29926u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a  reason: collision with root package name */
    final u9.a f29927a;

    /* renamed from: b  reason: collision with root package name */
    final File f29928b;

    /* renamed from: c  reason: collision with root package name */
    private final File f29929c;

    /* renamed from: d  reason: collision with root package name */
    private final File f29930d;

    /* renamed from: e  reason: collision with root package name */
    private final File f29931e;

    /* renamed from: f  reason: collision with root package name */
    private final int f29932f;

    /* renamed from: g  reason: collision with root package name */
    private long f29933g;

    /* renamed from: h  reason: collision with root package name */
    final int f29934h;

    /* renamed from: j  reason: collision with root package name */
    y9.d f29936j;

    /* renamed from: l  reason: collision with root package name */
    int f29938l;

    /* renamed from: m  reason: collision with root package name */
    boolean f29939m;

    /* renamed from: n  reason: collision with root package name */
    boolean f29940n;

    /* renamed from: o  reason: collision with root package name */
    boolean f29941o;

    /* renamed from: p  reason: collision with root package name */
    boolean f29942p;

    /* renamed from: q  reason: collision with root package name */
    boolean f29943q;

    /* renamed from: s  reason: collision with root package name */
    private final Executor f29945s;

    /* renamed from: i  reason: collision with root package name */
    private long f29935i = 0;

    /* renamed from: k  reason: collision with root package name */
    final LinkedHashMap<String, C0340d> f29937k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: r  reason: collision with root package name */
    private long f29944r = 0;

    /* renamed from: t  reason: collision with root package name */
    private final Runnable f29946t = new a();

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f29940n) || dVar.f29941o) {
                    return;
                }
                try {
                    dVar.S();
                } catch (IOException unused) {
                    d.this.f29942p = true;
                }
                try {
                    if (d.this.E()) {
                        d.this.L();
                        d.this.f29938l = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f29943q = true;
                    dVar2.f29936j = l.c(l.b());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class b extends p9.e {
        b(r rVar) {
            super(rVar);
        }

        @Override // p9.e
        protected void a(IOException iOException) {
            d.this.f29939m = true;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        final C0340d f29949a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f29950b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f29951c;

        /* compiled from: DiskLruCache.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        class a extends p9.e {
            a(r rVar) {
                super(rVar);
            }

            @Override // p9.e
            protected void a(IOException iOException) {
                synchronized (d.this) {
                    c.this.c();
                }
            }
        }

        c(C0340d c0340d) {
            this.f29949a = c0340d;
            this.f29950b = c0340d.f29958e ? null : new boolean[d.this.f29934h];
        }

        public void a() throws IOException {
            synchronized (d.this) {
                if (!this.f29951c) {
                    if (this.f29949a.f29959f == this) {
                        d.this.b(this, false);
                    }
                    this.f29951c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void b() throws IOException {
            synchronized (d.this) {
                if (!this.f29951c) {
                    if (this.f29949a.f29959f == this) {
                        d.this.b(this, true);
                    }
                    this.f29951c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        void c() {
            if (this.f29949a.f29959f != this) {
                return;
            }
            int i10 = 0;
            while (true) {
                d dVar = d.this;
                if (i10 < dVar.f29934h) {
                    try {
                        dVar.f29927a.h(this.f29949a.f29957d[i10]);
                    } catch (IOException unused) {
                    }
                    i10++;
                } else {
                    this.f29949a.f29959f = null;
                    return;
                }
            }
        }

        public r d(int i10) {
            synchronized (d.this) {
                if (!this.f29951c) {
                    C0340d c0340d = this.f29949a;
                    if (c0340d.f29959f != this) {
                        return l.b();
                    }
                    if (!c0340d.f29958e) {
                        this.f29950b[i10] = true;
                    }
                    try {
                        return new a(d.this.f29927a.f(c0340d.f29957d[i10]));
                    } catch (FileNotFoundException unused) {
                        return l.b();
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: p9.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class C0340d {

        /* renamed from: a  reason: collision with root package name */
        final String f29954a;

        /* renamed from: b  reason: collision with root package name */
        final long[] f29955b;

        /* renamed from: c  reason: collision with root package name */
        final File[] f29956c;

        /* renamed from: d  reason: collision with root package name */
        final File[] f29957d;

        /* renamed from: e  reason: collision with root package name */
        boolean f29958e;

        /* renamed from: f  reason: collision with root package name */
        c f29959f;

        /* renamed from: g  reason: collision with root package name */
        long f29960g;

        C0340d(String str) {
            this.f29954a = str;
            int i10 = d.this.f29934h;
            this.f29955b = new long[i10];
            this.f29956c = new File[i10];
            this.f29957d = new File[i10];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i11 = 0; i11 < d.this.f29934h; i11++) {
                sb.append(i11);
                this.f29956c[i11] = new File(d.this.f29928b, sb.toString());
                sb.append(".tmp");
                this.f29957d[i11] = new File(d.this.f29928b, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        void b(String[] strArr) throws IOException {
            if (strArr.length == d.this.f29934h) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f29955b[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
                return;
            }
            throw a(strArr);
        }

        e c() {
            if (Thread.holdsLock(d.this)) {
                s[] sVarArr = new s[d.this.f29934h];
                long[] jArr = (long[]) this.f29955b.clone();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i11 < dVar.f29934h) {
                            sVarArr[i11] = dVar.f29927a.e(this.f29956c[i11]);
                            i11++;
                        } else {
                            return new e(this.f29954a, this.f29960g, sVarArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i10 < dVar2.f29934h && sVarArr[i10] != null) {
                                o9.c.g(sVarArr[i10]);
                                i10++;
                            } else {
                                try {
                                    dVar2.R(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        void d(y9.d dVar) throws IOException {
            for (long j10 : this.f29955b) {
                dVar.j0(32).Z(j10);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class e implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final String f29962a;

        /* renamed from: b  reason: collision with root package name */
        private final long f29963b;

        /* renamed from: c  reason: collision with root package name */
        private final s[] f29964c;

        /* renamed from: d  reason: collision with root package name */
        private final long[] f29965d;

        e(String str, long j10, s[] sVarArr, long[] jArr) {
            this.f29962a = str;
            this.f29963b = j10;
            this.f29964c = sVarArr;
            this.f29965d = jArr;
        }

        public c a() throws IOException {
            return d.this.t(this.f29962a, this.f29963b);
        }

        public s b(int i10) {
            return this.f29964c[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (s sVar : this.f29964c) {
                o9.c.g(sVar);
            }
        }
    }

    d(u9.a aVar, File file, int i10, int i11, long j10, Executor executor) {
        this.f29927a = aVar;
        this.f29928b = file;
        this.f29932f = i10;
        this.f29929c = new File(file, "journal");
        this.f29930d = new File(file, "journal.tmp");
        this.f29931e = new File(file, "journal.bkp");
        this.f29934h = i11;
        this.f29933g = j10;
        this.f29945s = executor;
    }

    private y9.d F() throws FileNotFoundException {
        return l.c(new b(this.f29927a.c(this.f29929c)));
    }

    private void G() throws IOException {
        this.f29927a.h(this.f29930d);
        Iterator<C0340d> it = this.f29937k.values().iterator();
        while (it.hasNext()) {
            C0340d next = it.next();
            int i10 = 0;
            if (next.f29959f == null) {
                while (i10 < this.f29934h) {
                    this.f29935i += next.f29955b[i10];
                    i10++;
                }
            } else {
                next.f29959f = null;
                while (i10 < this.f29934h) {
                    this.f29927a.h(next.f29956c[i10]);
                    this.f29927a.h(next.f29957d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void J() throws IOException {
        y9.e d10 = l.d(this.f29927a.e(this.f29929c));
        try {
            String I = d10.I();
            String I2 = d10.I();
            String I3 = d10.I();
            String I4 = d10.I();
            String I5 = d10.I();
            if (!"libcore.io.DiskLruCache".equals(I) || !"1".equals(I2) || !Integer.toString(this.f29932f).equals(I3) || !Integer.toString(this.f29934h).equals(I4) || !"".equals(I5)) {
                throw new IOException("unexpected journal header: [" + I + ", " + I2 + ", " + I4 + ", " + I5 + b9.i.f16698e);
            }
            int i10 = 0;
            while (true) {
                try {
                    K(d10.I());
                    i10++;
                } catch (EOFException unused) {
                    this.f29938l = i10 - this.f29937k.size();
                    if (!d10.i0()) {
                        L();
                    } else {
                        this.f29936j = F();
                    }
                    o9.c.g(d10);
                    return;
                }
            }
        } catch (Throwable th) {
            o9.c.g(d10);
            throw th;
        }
    }

    private void K(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f29937k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            C0340d c0340d = this.f29937k.get(substring);
            if (c0340d == null) {
                c0340d = new C0340d(substring);
                this.f29937k.put(substring, c0340d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c0340d.f29958e = true;
                c0340d.f29959f = null;
                c0340d.b(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c0340d.f29959f = new c(c0340d);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void X(String str) {
        if (f29926u.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    private synchronized void a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static d f(u9.a aVar, File file, int i10, int i11, long j10) {
        if (j10 > 0) {
            if (i11 > 0) {
                return new d(aVar, file, i10, i11, j10, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), o9.c.G("OkHttp DiskLruCache", true)));
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    boolean E() {
        int i10 = this.f29938l;
        return i10 >= 2000 && i10 >= this.f29937k.size();
    }

    synchronized void L() throws IOException {
        y9.d dVar = this.f29936j;
        if (dVar != null) {
            dVar.close();
        }
        y9.d c10 = l.c(this.f29927a.f(this.f29930d));
        c10.B("libcore.io.DiskLruCache").j0(10);
        c10.B("1").j0(10);
        c10.Z(this.f29932f).j0(10);
        c10.Z(this.f29934h).j0(10);
        c10.j0(10);
        for (C0340d c0340d : this.f29937k.values()) {
            if (c0340d.f29959f != null) {
                c10.B("DIRTY").j0(32);
                c10.B(c0340d.f29954a);
                c10.j0(10);
            } else {
                c10.B("CLEAN").j0(32);
                c10.B(c0340d.f29954a);
                c0340d.d(c10);
                c10.j0(10);
            }
        }
        c10.close();
        if (this.f29927a.b(this.f29929c)) {
            this.f29927a.g(this.f29929c, this.f29931e);
        }
        this.f29927a.g(this.f29930d, this.f29929c);
        this.f29927a.h(this.f29931e);
        this.f29936j = F();
        this.f29939m = false;
        this.f29943q = false;
    }

    public synchronized boolean P(String str) throws IOException {
        z();
        a();
        X(str);
        C0340d c0340d = this.f29937k.get(str);
        if (c0340d == null) {
            return false;
        }
        boolean R = R(c0340d);
        if (R && this.f29935i <= this.f29933g) {
            this.f29942p = false;
        }
        return R;
    }

    boolean R(C0340d c0340d) throws IOException {
        c cVar = c0340d.f29959f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i10 = 0; i10 < this.f29934h; i10++) {
            this.f29927a.h(c0340d.f29956c[i10]);
            long j10 = this.f29935i;
            long[] jArr = c0340d.f29955b;
            this.f29935i = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f29938l++;
        this.f29936j.B("REMOVE").j0(32).B(c0340d.f29954a).j0(10);
        this.f29937k.remove(c0340d.f29954a);
        if (E()) {
            this.f29945s.execute(this.f29946t);
        }
        return true;
    }

    void S() throws IOException {
        while (this.f29935i > this.f29933g) {
            R(this.f29937k.values().iterator().next());
        }
        this.f29942p = false;
    }

    synchronized void b(c cVar, boolean z10) throws IOException {
        C0340d c0340d = cVar.f29949a;
        if (c0340d.f29959f == cVar) {
            if (z10 && !c0340d.f29958e) {
                for (int i10 = 0; i10 < this.f29934h; i10++) {
                    if (cVar.f29950b[i10]) {
                        if (!this.f29927a.b(c0340d.f29957d[i10])) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f29934h; i11++) {
                File file = c0340d.f29957d[i11];
                if (z10) {
                    if (this.f29927a.b(file)) {
                        File file2 = c0340d.f29956c[i11];
                        this.f29927a.g(file, file2);
                        long j10 = c0340d.f29955b[i11];
                        long d10 = this.f29927a.d(file2);
                        c0340d.f29955b[i11] = d10;
                        this.f29935i = (this.f29935i - j10) + d10;
                    }
                } else {
                    this.f29927a.h(file);
                }
            }
            this.f29938l++;
            c0340d.f29959f = null;
            if (c0340d.f29958e | z10) {
                c0340d.f29958e = true;
                this.f29936j.B("CLEAN").j0(32);
                this.f29936j.B(c0340d.f29954a);
                c0340d.d(this.f29936j);
                this.f29936j.j0(10);
                if (z10) {
                    long j11 = this.f29944r;
                    this.f29944r = 1 + j11;
                    c0340d.f29960g = j11;
                }
            } else {
                this.f29937k.remove(c0340d.f29954a);
                this.f29936j.B("REMOVE").j0(32);
                this.f29936j.B(c0340d.f29954a);
                this.f29936j.j0(10);
            }
            this.f29936j.flush();
            if (this.f29935i > this.f29933g || E()) {
                this.f29945s.execute(this.f29946t);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f29940n && !this.f29941o) {
            for (C0340d c0340d : (C0340d[]) this.f29937k.values().toArray(new C0340d[this.f29937k.size()])) {
                c cVar = c0340d.f29959f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            S();
            this.f29936j.close();
            this.f29936j = null;
            this.f29941o = true;
            return;
        }
        this.f29941o = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f29940n) {
            a();
            S();
            this.f29936j.flush();
        }
    }

    public synchronized boolean isClosed() {
        return this.f29941o;
    }

    public void j() throws IOException {
        close();
        this.f29927a.a(this.f29928b);
    }

    public c k(String str) throws IOException {
        return t(str, -1L);
    }

    synchronized c t(String str, long j10) throws IOException {
        z();
        a();
        X(str);
        C0340d c0340d = this.f29937k.get(str);
        if (j10 == -1 || (c0340d != null && c0340d.f29960g == j10)) {
            if (c0340d == null || c0340d.f29959f == null) {
                if (!this.f29942p && !this.f29943q) {
                    this.f29936j.B("DIRTY").j0(32).B(str).j0(10);
                    this.f29936j.flush();
                    if (this.f29939m) {
                        return null;
                    }
                    if (c0340d == null) {
                        c0340d = new C0340d(str);
                        this.f29937k.put(str, c0340d);
                    }
                    c cVar = new c(c0340d);
                    c0340d.f29959f = cVar;
                    return cVar;
                }
                this.f29945s.execute(this.f29946t);
                return null;
            }
            return null;
        }
        return null;
    }

    public synchronized e w(String str) throws IOException {
        z();
        a();
        X(str);
        C0340d c0340d = this.f29937k.get(str);
        if (c0340d != null && c0340d.f29958e) {
            e c10 = c0340d.c();
            if (c10 == null) {
                return null;
            }
            this.f29938l++;
            this.f29936j.B("READ").j0(32).B(str).j0(10);
            if (E()) {
                this.f29945s.execute(this.f29946t);
            }
            return c10;
        }
        return null;
    }

    public synchronized void z() throws IOException {
        if (this.f29940n) {
            return;
        }
        if (this.f29927a.b(this.f29931e)) {
            if (this.f29927a.b(this.f29929c)) {
                this.f29927a.h(this.f29931e);
            } else {
                this.f29927a.g(this.f29931e, this.f29929c);
            }
        }
        if (this.f29927a.b(this.f29929c)) {
            try {
                J();
                G();
                this.f29940n = true;
                return;
            } catch (IOException e8) {
                g l10 = g.l();
                l10.t(5, "DiskLruCache " + this.f29928b + " is corrupt: " + e8.getMessage() + ", removing", e8);
                j();
                this.f29941o = false;
            }
        }
        L();
        this.f29940n = true;
    }
}
