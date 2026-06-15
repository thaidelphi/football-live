package u1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.ironsource.b9;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: DiskLruCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final File f31275a;

    /* renamed from: b  reason: collision with root package name */
    private final File f31276b;

    /* renamed from: c  reason: collision with root package name */
    private final File f31277c;

    /* renamed from: d  reason: collision with root package name */
    private final File f31278d;

    /* renamed from: e  reason: collision with root package name */
    private final int f31279e;

    /* renamed from: f  reason: collision with root package name */
    private long f31280f;

    /* renamed from: g  reason: collision with root package name */
    private final int f31281g;

    /* renamed from: i  reason: collision with root package name */
    private Writer f31283i;

    /* renamed from: k  reason: collision with root package name */
    private int f31285k;

    /* renamed from: h  reason: collision with root package name */
    private long f31282h = 0;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashMap<String, d> f31284j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l  reason: collision with root package name */
    private long f31286l = 0;

    /* renamed from: m  reason: collision with root package name */
    final ThreadPoolExecutor f31287m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n  reason: collision with root package name */
    private final Callable<Void> f31288n = new CallableC0361a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: u1.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class CallableC0361a implements Callable<Void> {
        CallableC0361a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.f31283i == null) {
                    return null;
                }
                a.this.H0();
                if (a.this.X()) {
                    a.this.C0();
                    a.this.f31285k = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0361a callableC0361a) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final d f31290a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f31291b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f31292c;

        /* synthetic */ c(a aVar, d dVar, CallableC0361a callableC0361a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.G(this, false);
        }

        public void b() {
            if (this.f31292c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            a.this.G(this, true);
            this.f31292c = true;
        }

        public File f(int i10) throws IOException {
            File k10;
            synchronized (a.this) {
                if (this.f31290a.f31299f == this) {
                    if (!this.f31290a.f31298e) {
                        this.f31291b[i10] = true;
                    }
                    k10 = this.f31290a.k(i10);
                    a.this.f31275a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k10;
        }

        private c(d dVar) {
            this.f31290a = dVar;
            this.f31291b = dVar.f31298e ? null : new boolean[a.this.f31281g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f31294a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f31295b;

        /* renamed from: c  reason: collision with root package name */
        File[] f31296c;

        /* renamed from: d  reason: collision with root package name */
        File[] f31297d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f31298e;

        /* renamed from: f  reason: collision with root package name */
        private c f31299f;

        /* renamed from: g  reason: collision with root package name */
        private long f31300g;

        /* synthetic */ d(a aVar, String str, CallableC0361a callableC0361a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length == a.this.f31281g) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f31295b[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i10) {
            return this.f31296c[i10];
        }

        public File k(int i10) {
            return this.f31297d[i10];
        }

        public String l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j10 : this.f31295b) {
                sb.append(' ');
                sb.append(j10);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f31294a = str;
            this.f31295b = new long[a.this.f31281g];
            this.f31296c = new File[a.this.f31281g];
            this.f31297d = new File[a.this.f31281g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < a.this.f31281g; i10++) {
                sb.append(i10);
                this.f31296c[i10] = new File(a.this.f31275a, sb.toString());
                sb.append(".tmp");
                this.f31297d[i10] = new File(a.this.f31275a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f31302a;

        /* renamed from: b  reason: collision with root package name */
        private final long f31303b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f31304c;

        /* renamed from: d  reason: collision with root package name */
        private final File[] f31305d;

        /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0361a callableC0361a) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f31305d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f31302a = str;
            this.f31303b = j10;
            this.f31305d = fileArr;
            this.f31304c = jArr;
        }
    }

    private a(File file, int i10, int i11, long j10) {
        this.f31275a = file;
        this.f31279e = i10;
        this.f31276b = new File(file, "journal");
        this.f31277c = new File(file, "journal.tmp");
        this.f31278d = new File(file, "journal.bkp");
        this.f31281g = i11;
        this.f31280f = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void C0() throws IOException {
        Writer writer = this.f31283i;
        if (writer != null) {
            F(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31277c), u1.c.f31313a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f31279e));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f31281g));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (d dVar : this.f31284j.values()) {
            if (dVar.f31299f != null) {
                bufferedWriter.write("DIRTY " + dVar.f31294a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dVar.f31294a + dVar.l() + '\n');
            }
        }
        F(bufferedWriter);
        if (this.f31276b.exists()) {
            G0(this.f31276b, this.f31278d, true);
        }
        G0(this.f31277c, this.f31276b, false);
        this.f31278d.delete();
        this.f31283i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31276b, true), u1.c.f31313a));
    }

    private void E() {
        if (this.f31283i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void F(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void G(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f31290a;
        if (dVar.f31299f == cVar) {
            if (z10 && !dVar.f31298e) {
                for (int i10 = 0; i10 < this.f31281g; i10++) {
                    if (cVar.f31291b[i10]) {
                        if (!dVar.k(i10).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f31281g; i11++) {
                File k10 = dVar.k(i11);
                if (z10) {
                    if (k10.exists()) {
                        File j10 = dVar.j(i11);
                        k10.renameTo(j10);
                        long j11 = dVar.f31295b[i11];
                        long length = j10.length();
                        dVar.f31295b[i11] = length;
                        this.f31282h = (this.f31282h - j11) + length;
                    }
                } else {
                    K(k10);
                }
            }
            this.f31285k++;
            dVar.f31299f = null;
            if (dVar.f31298e | z10) {
                dVar.f31298e = true;
                this.f31283i.append((CharSequence) "CLEAN");
                this.f31283i.append(' ');
                this.f31283i.append((CharSequence) dVar.f31294a);
                this.f31283i.append((CharSequence) dVar.l());
                this.f31283i.append('\n');
                if (z10) {
                    long j12 = this.f31286l;
                    this.f31286l = 1 + j12;
                    dVar.f31300g = j12;
                }
            } else {
                this.f31284j.remove(dVar.f31294a);
                this.f31283i.append((CharSequence) "REMOVE");
                this.f31283i.append(' ');
                this.f31283i.append((CharSequence) dVar.f31294a);
                this.f31283i.append('\n');
            }
            R(this.f31283i);
            if (this.f31282h > this.f31280f || X()) {
                this.f31287m.submit(this.f31288n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void G0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            K(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() throws IOException {
        while (this.f31282h > this.f31280f) {
            D0(this.f31284j.entrySet().iterator().next().getKey());
        }
    }

    private static void K(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c P(String str, long j10) throws IOException {
        E();
        d dVar = this.f31284j.get(str);
        if (j10 == -1 || (dVar != null && dVar.f31300g == j10)) {
            if (dVar != null) {
                if (dVar.f31299f != null) {
                    return null;
                }
            } else {
                dVar = new d(this, str, null);
                this.f31284j.put(str, dVar);
            }
            c cVar = new c(this, dVar, null);
            dVar.f31299f = cVar;
            this.f31283i.append((CharSequence) "DIRTY");
            this.f31283i.append(' ');
            this.f31283i.append((CharSequence) str);
            this.f31283i.append('\n');
            R(this.f31283i);
            return cVar;
        }
        return null;
    }

    @TargetApi(26)
    private static void R(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean X() {
        int i10 = this.f31285k;
        return i10 >= 2000 && i10 >= this.f31284j.size();
    }

    public static a n0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 > 0) {
            if (i11 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        G0(file2, file3, false);
                    }
                }
                a aVar = new a(file, i10, i11, j10);
                if (aVar.f31276b.exists()) {
                    try {
                        aVar.y0();
                        aVar.o0();
                        return aVar;
                    } catch (IOException e8) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e8.getMessage() + ", removing");
                        aVar.J();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i10, i11, j10);
                aVar2.C0();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void o0() throws IOException {
        K(this.f31277c);
        Iterator<d> it = this.f31284j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f31299f != null) {
                next.f31299f = null;
                while (i10 < this.f31281g) {
                    K(next.j(i10));
                    K(next.k(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.f31281g) {
                    this.f31282h += next.f31295b[i10];
                    i10++;
                }
            }
        }
    }

    private void y0() throws IOException {
        u1.b bVar = new u1.b(new FileInputStream(this.f31276b), u1.c.f31313a);
        try {
            String j10 = bVar.j();
            String j11 = bVar.j();
            String j12 = bVar.j();
            String j13 = bVar.j();
            String j14 = bVar.j();
            if (!"libcore.io.DiskLruCache".equals(j10) || !"1".equals(j11) || !Integer.toString(this.f31279e).equals(j12) || !Integer.toString(this.f31281g).equals(j13) || !"".equals(j14)) {
                throw new IOException("unexpected journal header: [" + j10 + ", " + j11 + ", " + j13 + ", " + j14 + b9.i.f16698e);
            }
            int i10 = 0;
            while (true) {
                try {
                    z0(bVar.j());
                    i10++;
                } catch (EOFException unused) {
                    this.f31285k = i10 - this.f31284j.size();
                    if (bVar.f()) {
                        C0();
                    } else {
                        this.f31283i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31276b, true), u1.c.f31313a));
                    }
                    u1.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            u1.c.a(bVar);
            throw th;
        }
    }

    private void z0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f31284j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = this.f31284j.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring, null);
                this.f31284j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f31298e = true;
                dVar.f31299f = null;
                dVar.n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f31299f = new c(this, dVar, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public synchronized boolean D0(String str) throws IOException {
        E();
        d dVar = this.f31284j.get(str);
        if (dVar != null && dVar.f31299f == null) {
            for (int i10 = 0; i10 < this.f31281g; i10++) {
                File j10 = dVar.j(i10);
                if (j10.exists() && !j10.delete()) {
                    throw new IOException("failed to delete " + j10);
                }
                this.f31282h -= dVar.f31295b[i10];
                dVar.f31295b[i10] = 0;
            }
            this.f31285k++;
            this.f31283i.append((CharSequence) "REMOVE");
            this.f31283i.append(' ');
            this.f31283i.append((CharSequence) str);
            this.f31283i.append('\n');
            this.f31284j.remove(str);
            if (X()) {
                this.f31287m.submit(this.f31288n);
            }
            return true;
        }
        return false;
    }

    public void J() throws IOException {
        close();
        u1.c.b(this.f31275a);
    }

    public c L(String str) throws IOException {
        return P(str, -1L);
    }

    public synchronized e S(String str) throws IOException {
        E();
        d dVar = this.f31284j.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.f31298e) {
            for (File file : dVar.f31296c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f31285k++;
            this.f31283i.append((CharSequence) "READ");
            this.f31283i.append(' ');
            this.f31283i.append((CharSequence) str);
            this.f31283i.append('\n');
            if (X()) {
                this.f31287m.submit(this.f31288n);
            }
            return new e(this, str, dVar.f31300g, dVar.f31296c, dVar.f31295b, null);
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f31283i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f31284j.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f31299f != null) {
                dVar.f31299f.a();
            }
        }
        H0();
        F(this.f31283i);
        this.f31283i = null;
    }
}
