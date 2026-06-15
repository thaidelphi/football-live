package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.d7;
import com.applovin.impl.k6;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.v1;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.ironsource.b9;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l {

    /* renamed from: b  reason: collision with root package name */
    private final j f8965b;

    /* renamed from: c  reason: collision with root package name */
    private final n f8966c;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8969f;

    /* renamed from: a  reason: collision with root package name */
    private final String f8964a = "FileManager";

    /* renamed from: d  reason: collision with root package name */
    private final Object f8967d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Set f8968e = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(j jVar) {
        this.f8965b = jVar;
        this.f8966c = jVar.I();
        this.f8969f = ((Boolean) jVar.a(o4.V0)).booleanValue();
    }

    private boolean f(File file) {
        if (n.a()) {
            n nVar = this.f8966c;
            nVar.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            boolean delete = file.delete();
            if (!delete) {
                this.f8965b.D().a(y1.f9675k0, "removeFile", CollectionUtils.hashMap("path", file.getAbsolutePath()));
            }
            return delete;
        } catch (Throwable th) {
            try {
                if (n.a()) {
                    n nVar2 = this.f8966c;
                    nVar2.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f8965b.D().a("FileManager", "removeFile", th);
                g(file);
                return false;
            } finally {
                g(file);
            }
        }
    }

    private void g(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8967d) {
            if (!this.f8968e.remove(absolutePath)) {
                this.f8965b.D().a(y1.f9675k0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
            }
            this.f8967d.notifyAll();
        }
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public boolean b(InputStream inputStream, File file, boolean z10) {
        return a(inputStream, file, z10, false);
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f8965b.i0().a((z4) new k6(this.f8965b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.b1
            @Override // java.lang.Runnable
            public final void run() {
                l.this.a(bVar, context);
            }
        }), u5.b.CACHING);
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f8965b.i0().a((z4) new k6(this.f8965b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.c1
            @Override // java.lang.Runnable
            public final void run() {
                l.this.b(bVar, context);
            }
        }), u5.b.CACHING);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable, boolean] */
    public String e(File file) {
        Throwable th;
        InputStream inputStream;
        IOException e8;
        FileNotFoundException e10;
        if (file == null) {
            return null;
        }
        if (n.a()) {
            this.f8966c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        ?? booleanValue = ((Boolean) this.f8965b.a(o4.f8258y)).booleanValue();
        try {
            try {
                try {
                    try {
                        if (booleanValue != 0) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    c(file);
                                    String a10 = a(fileInputStream);
                                    r9 = a10 == null;
                                    fileInputStream.close();
                                    if (r9 && ((Boolean) this.f8965b.a(o4.N0)).booleanValue()) {
                                        a(file, "removeFileAfterReadFail");
                                    }
                                    g(file);
                                    return a10;
                                } catch (Throwable th2) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (FileNotFoundException e11) {
                                if (n.a()) {
                                    this.f8966c.d("FileManager", "File not found. " + e11);
                                }
                                this.f8966c.a("FileManager", e11);
                                this.f8965b.D().a("FileManager", "readFileNotFound", e11);
                                if (0 != 0 && ((Boolean) this.f8965b.a(o4.N0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            } catch (IOException e12) {
                                if (n.a()) {
                                    this.f8966c.a("FileManager", "Failed to read file: " + file.getName() + e12);
                                }
                                this.f8966c.a("FileManager", e12);
                                this.f8965b.D().a("FileManager", "readFileIO", e12);
                                if (((Boolean) this.f8965b.a(o4.N0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            }
                        }
                        try {
                            c(file);
                            inputStream = new FileInputStream(file);
                        } catch (FileNotFoundException e13) {
                            e10 = e13;
                            inputStream = null;
                        } catch (IOException e14) {
                            e8 = e14;
                            inputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                        try {
                            String a11 = a(inputStream);
                            r9 = a11 == null;
                            d7.a(inputStream, this.f8965b);
                            if (r9 && ((Boolean) this.f8965b.a(o4.N0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return a11;
                        } catch (FileNotFoundException e15) {
                            e10 = e15;
                            if (n.a()) {
                                this.f8966c.d("FileManager", "File not found. " + e10);
                            }
                            this.f8965b.D().a("FileManager", "readFileNotFound", e10);
                            d7.a(inputStream, this.f8965b);
                            g(file);
                            return null;
                        } catch (IOException e16) {
                            e8 = e16;
                            if (n.a()) {
                                this.f8966c.a("FileManager", "Failed to read file: " + file.getName() + e8);
                            }
                            this.f8965b.D().a("FileManager", "readFileIO", e8);
                            d7.a(inputStream, this.f8965b);
                            if (((Boolean) this.f8965b.a(o4.N0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        } catch (Throwable th5) {
                            th = th5;
                            if (n.a()) {
                                this.f8966c.a("FileManager", "Unknown failure to read file.", th);
                            }
                            this.f8965b.D().a("FileManager", "readFile", th);
                            d7.a(inputStream, this.f8965b);
                            if (((Boolean) this.f8965b.a(o4.N0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    d7.a((Closeable) booleanValue, this.f8965b);
                    if (r9 && ((Boolean) this.f8965b.a(o4.N0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    g(file);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            r9 = true;
            d7.a((Closeable) booleanValue, this.f8965b);
            if (r9) {
                a(file, "removeFileAfterReadFail");
            }
            g(file);
            throw th;
        }
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (n.a()) {
                this.f8966c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (n.a()) {
            n nVar = this.f8966c;
            nVar.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains(b9.h.H0)) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File d10 = d(context);
        File file = new File(d10, str);
        if (z10) {
            try {
                d10.mkdirs();
            } catch (Throwable th) {
                if (n.a()) {
                    n nVar2 = this.f8966c;
                    nVar2.a("FileManager", "Unable to make cache directory at " + d10, th);
                }
                this.f8965b.D().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8967d) {
            boolean add = this.f8968e.add(absolutePath);
            while (!add) {
                try {
                    this.f8967d.wait();
                    add = this.f8968e.add(absolutePath);
                } catch (InterruptedException e8) {
                    if (n.a()) {
                        n nVar = this.f8966c;
                        nVar.a("FileManager", "Lock '" + absolutePath + "' interrupted", e8);
                    }
                    throw new RuntimeException(e8);
                }
            }
        }
    }

    private boolean d(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8967d) {
            if (this.f8968e.contains(absolutePath)) {
                return false;
            }
            c(file);
            return true;
        }
    }

    public void b(Context context) {
        if (this.f8965b.v0()) {
            if (n.a()) {
                this.f8966c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.q0() == null) {
            return;
        }
        f(a(bVar.q0().getLastPathSegment(), context));
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private boolean b(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8967d) {
            contains = this.f8968e.contains(absolutePath);
        }
        return contains;
    }

    private List c(Context context) {
        File[] listFiles;
        File d10 = d(context);
        if (d10.isDirectory() && (listFiles = d10.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    public String a(InputStream inputStream) {
        if (((Boolean) this.f8965b.a(o4.f8258y)).booleanValue()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } catch (Throwable th) {
                this.f8966c.a("FileManager", th);
                this.f8965b.D().a("FileManager", "readInputStreamAsString", th);
                return null;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[8192];
            while (true) {
                int read2 = inputStream.read(bArr2, 0, 8192);
                if (read2 >= 0) {
                    try {
                        byteArrayOutputStream3.write(bArr2, 0, read2);
                    } catch (Throwable th2) {
                        d7.a(byteArrayOutputStream3, this.f8965b);
                        this.f8965b.D().a("FileManager", "readInputStreamAsString", th2);
                        return null;
                    }
                } else {
                    return byteArrayOutputStream3.toString("UTF-8");
                }
            }
        }
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean c(String str, Context context) {
        if (this.f8969f) {
            return b(str, context);
        }
        boolean z10 = false;
        File a10 = a(str, false, context);
        if (d(a10)) {
            if (a10.exists() && !a10.isDirectory()) {
                z10 = true;
            }
            g(a10);
            return z10;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x021c A[Catch: all -> 0x0246, TRY_LEAVE, TryCatch #16 {all -> 0x0246, blocks: (B:153:0x0216, B:155:0x021c), top: B:203:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r18, java.io.File r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (n.a()) {
                n nVar = this.f8966c;
                nVar.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (n.a()) {
                this.f8966c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f8965b.D().a(y1.f9675k0, "createNoMediaFile");
        } catch (IOException e8) {
            if (n.a()) {
                this.f8966c.a("FileManager", "Failed to create .nomedia file", e8);
            }
        }
    }

    public boolean a(File file, String str, List list, int i10) {
        return a(file, str, list, true, i10);
    }

    private boolean a(File file, String str, List list, boolean z10, int i10) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("url", str);
        this.f8965b.D().d(y1.f9694u, hashMap);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i11 = 1; i11 <= i10; i11++) {
            if (a(file, str, list, z10)) {
                a(true, str, i11, elapsedRealtime);
                return true;
            }
        }
        a(false, str, i10, elapsedRealtime);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z10) {
        Boolean bool = (Boolean) this.f8965b.a(o4.W0);
        if (bool.booleanValue()) {
            c(file);
        }
        if (a(file)) {
            if (n.a()) {
                n nVar = this.f8966c;
                nVar.a("FileManager", "File exists for " + str);
            }
            this.f8965b.D().d(y1.f9696v, CollectionUtils.hashMap("url", str));
        } else if (((Boolean) this.f8965b.a(o4.f8258y)).booleanValue()) {
            try {
                InputStream a10 = a(str, list, z10);
                boolean a11 = a(a10, file, bool.booleanValue());
                if (a10 != null) {
                    a10.close();
                }
                if (bool.booleanValue()) {
                    g(file);
                }
                return a11;
            } catch (Throwable th) {
                try {
                    this.f8966c.a("FileManager", th);
                    this.f8965b.D().a("FileManager", "loadAndCacheResource", th);
                    if (bool.booleanValue()) {
                        g(file);
                    }
                    return false;
                } finally {
                    if (bool.booleanValue()) {
                        g(file);
                    }
                }
            }
        } else {
            InputStream inputStream = null;
            try {
                inputStream = a(str, list, z10);
                return a(inputStream, file, bool.booleanValue());
            } finally {
                if (bool.booleanValue()) {
                    g(file);
                }
                d7.a(inputStream, this.f8965b);
            }
        }
    }

    private void a(boolean z10, String str, int i10, long j10) {
        y1 y1Var = z10 ? y1.f9697w : y1.f9698x;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        HashMap hashMap = new HashMap(3);
        hashMap.put("attempt_number", Integer.toString(i10));
        hashMap.put("url", str);
        hashMap.put("duration_ms", String.valueOf(elapsedRealtime));
        this.f8965b.D().d(y1Var, hashMap);
    }

    public InputStream a(String str, List list, boolean z10) {
        HttpURLConnection httpURLConnection;
        if (z10 && !d7.a(str, list)) {
            if (n.a()) {
                this.f8966c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        if (((Boolean) this.f8965b.a(o4.V2)).booleanValue() && !str.contains("https://")) {
            if (n.a()) {
                this.f8966c.k("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (n.a()) {
            this.f8966c.a("FileManager", "Loading " + str + "...");
        }
        this.f8965b.D().d(y1.f9699y, CollectionUtils.hashMap("url", str));
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(((Integer) this.f8965b.a(o4.T2)).intValue());
                httpURLConnection.setReadTimeout(((Integer) this.f8965b.a(o4.U2)).intValue());
                httpURLConnection.setDefaultUseCaches(true);
                httpURLConnection.setUseCaches(true);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                int responseCode = httpURLConnection.getResponseCode();
                this.f8965b.D().a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
                if (responseCode >= 200 && responseCode < 300) {
                    if (n.a()) {
                        this.f8966c.a("FileManager", "Opened stream to resource " + str);
                    }
                    return httpURLConnection.getInputStream();
                }
                if (((Boolean) this.f8965b.a(o4.f8214s3)).booleanValue()) {
                    d7.a(httpURLConnection, this.f8965b);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                try {
                    if (n.a()) {
                        this.f8966c.a("FileManager", "Error loading " + str, th);
                    }
                    this.f8965b.D().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", str));
                    if (((Boolean) this.f8965b.a(o4.f8214s3)).booleanValue()) {
                        d7.a(httpURLConnection, this.f8965b);
                    }
                    return null;
                } finally {
                    if (((Boolean) this.f8965b.a(o4.f8214s3)).booleanValue()) {
                        d7.a(httpURLConnection, this.f8965b);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    private boolean a(InputStream inputStream, File file, boolean z10) {
        if (file == null) {
            return false;
        }
        if (n.a()) {
            n nVar = this.f8966c;
            nVar.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file, false, z10)) {
            if (n.a()) {
                n nVar2 = this.f8966c;
                nVar2.b("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            this.f8965b.D().d(y1.A, CollectionUtils.hashMap("path", file.getAbsolutePath()));
            return false;
        }
        if (n.a()) {
            n nVar3 = this.f8966c;
            nVar3.a("FileManager", "Caching completed for " + file);
        }
        this.f8965b.D().d(y1.f9700z, CollectionUtils.hashMap("path", file.getAbsolutePath()));
        return true;
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List Z = bVar.Z();
        if (bVar.P0() || Z.contains(str)) {
            return bVar.G();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z10, int i10) {
        return a(context, str, str2, list, z10, false, i10);
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, int i10) {
        if (!StringUtils.isValidString(str)) {
            if (n.a()) {
                this.f8966c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f8965b.D().a(y1.f9675k0, "cacheResource");
            return null;
        }
        String a10 = d7.a(Uri.parse(str), str2, this.f8965b);
        File a11 = a(a10, context);
        if (a(a11, str, list, z10, i10)) {
            if (n.a()) {
                n nVar = this.f8966c;
                nVar.a("FileManager", "Caching succeeded for file " + a10);
            }
            return z11 ? Uri.fromFile(a11).toString() : a10;
        }
        return null;
    }

    private long a(Context context) {
        boolean z10;
        long a10 = a();
        boolean z11 = a10 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c10 = this.f8965b.c(o4.I0);
        long j10 = 0;
        for (File file : c(context)) {
            if (!z11 || c10.contains(file.getName()) || b(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= a10) {
                z10 = false;
            } else {
                if (n.a()) {
                    this.f8966c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                z10 = f(file);
            }
            if (z10) {
                this.f8965b.C().c(v1.f9436j);
            } else {
                j10 += file.length();
            }
        }
        return j10;
    }

    private void a(long j10, Context context) {
        long intValue = ((Integer) this.f8965b.a(o4.E0)).intValue();
        if (intValue == -1) {
            if (n.a()) {
                this.f8966c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else if (a(j10) > intValue) {
            if (n.a()) {
                this.f8966c.a("FileManager", "Cache has exceeded maximum size; dropping...");
            }
            for (File file : c(context)) {
                f(file);
            }
            this.f8965b.C().c(v1.f9437k);
        } else if (n.a()) {
            this.f8966c.a("FileManager", "Cache is present but under size limit; not dropping...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList<Uri> arrayList = new ArrayList(bVar.i());
        CollectionUtils.addObjectIfExists(bVar.q0(), arrayList);
        for (Uri uri : arrayList) {
            f(a(uri.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (n.a()) {
            n nVar = this.f8966c;
            nVar.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f8965b.D().a(y1.f9675k0, str, CollectionUtils.hashMap("path", file.getAbsolutePath()));
        } catch (Throwable th) {
            if (n.a()) {
                n nVar2 = this.f8966c;
                nVar2.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f8965b.D().a("FileManager", str, th);
        }
    }

    private long a() {
        long longValue = ((Long) this.f8965b.a(o4.D0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1L;
    }

    private long a(long j10) {
        return j10 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
