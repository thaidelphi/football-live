package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<Runnable> f6337a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6338b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {

        /* renamed from: com.adcolony.sdk.w$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0118a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6340a;

            RunnableC0118a(h0 h0Var) {
                this.f6340a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.g(this.f6340a);
                w.this.a();
            }
        }

        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new RunnableC0118a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6343a;

            a(h0 h0Var) {
                this.f6343a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.a(this.f6343a, new File(c0.h(this.f6343a.a(), "filepath")));
                w.this.a();
            }
        }

        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6346a;

            a(h0 h0Var) {
                this.f6346a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.d(this.f6346a);
                w.this.a();
            }
        }

        c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6349a;

            a(h0 h0Var) {
                this.f6349a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.e(this.f6349a);
                w.this.a();
            }
        }

        d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6352a;

            a(h0 h0Var) {
                this.f6352a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.f(this.f6352a);
                w.this.a();
            }
        }

        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6355a;

            a(h0 h0Var) {
                this.f6355a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.b(this.f6355a);
                w.this.a();
            }
        }

        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6358a;

            a(h0 h0Var) {
                this.f6358a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.c(this.f6358a);
                w.this.a();
            }
        }

        g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6361a;

            a(h0 h0Var) {
                this.f6361a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.h(this.f6361a);
                w.this.a();
            }
        }

        h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6364a;

            a(h0 h0Var) {
                this.f6364a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.a(this.f6364a);
                w.this.a();
            }
        }

        i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        try {
            int d10 = c0.d(a10, "offset");
            int d11 = c0.d(a10, "size");
            boolean b11 = c0.b(a10, "gunzip");
            String h11 = c0.h(a10, "output_filepath");
            InputStream w0Var = new w0(new FileInputStream(h10), d10, d11);
            if (b11) {
                w0Var = new GZIPInputStream(w0Var, 1024);
            }
            if (h11.equals("")) {
                StringBuilder sb = new StringBuilder(w0Var.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = w0Var.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, "ISO-8859-1"));
                }
                c0.b(b10, "size", sb.length());
                c0.a(b10, "data", sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(h11);
                byte[] bArr2 = new byte[1024];
                int i10 = 0;
                while (true) {
                    int read2 = w0Var.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i10 += read2;
                }
                fileOutputStream.close();
                c0.b(b10, "size", i10);
            }
            w0Var.close();
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            return true;
        } catch (IOException unused) {
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        } catch (OutOfMemoryError unused2) {
            new e0.a().a("Out of memory error - disabling AdColony.").a(e0.f5980h);
            com.adcolony.sdk.a.b().b(true);
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        String[] list = new File(h10).list();
        if (list != null) {
            e1 a10 = c0.a();
            for (String str : list) {
                f1 b11 = c0.b();
                c0.a(b11, "filename", str);
                if (new File(h10 + str).isDirectory()) {
                    c0.b(b11, "is_folder", true);
                } else {
                    c0.b(b11, "is_folder", false);
                }
                c0.a(a10, b11);
            }
            c0.b(b10, "success", true);
            c0.a(b10, "entries", a10);
            h0Var.a(b10).c();
            return true;
        }
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "filepath");
        String h11 = c0.h(a10, "encoding");
        boolean z10 = h11 != null && h11.equals("utf8");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        try {
            StringBuilder a11 = a(h10, z10);
            c0.b(b10, "success", true);
            c0.a(b10, "data", a11.toString());
            h0Var.a(b10).c();
            return a11.toString();
        } catch (IOException unused) {
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "filepath");
        String h11 = c0.h(a10, "new_filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        try {
            if (new File(h10).renameTo(new File(h11))) {
                c0.b(b10, "success", true);
                h0Var.a(b10).c();
                return true;
            }
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        } catch (Exception unused) {
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h0 h0Var) {
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "filepath");
        String h11 = c0.h(a10, "data");
        boolean equals = c0.h(a10, "encoding").equals("utf8");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        try {
            a(h10, h11, equals);
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            return true;
        } catch (IOException unused) {
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(h0 h0Var) {
        boolean z10;
        f1 a10 = h0Var.a();
        String h10 = c0.h(a10, "filepath");
        String h11 = c0.h(a10, "bundle_path");
        e1 a11 = c0.a(a10, "bundle_filenames");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        try {
            try {
                File file = new File(h11);
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                byte[] bArr = new byte[32];
                randomAccessFile.readInt();
                int readInt = randomAccessFile.readInt();
                e1 e1Var = new e1();
                byte[] bArr2 = new byte[1024];
                int i10 = 0;
                while (i10 < readInt) {
                    File file2 = file;
                    randomAccessFile.seek((i10 * 44) + 8);
                    randomAccessFile.read(bArr);
                    randomAccessFile.readInt();
                    int readInt2 = randomAccessFile.readInt();
                    int readInt3 = randomAccessFile.readInt();
                    e1Var.f(readInt3);
                    try {
                        String str = h10 + a11.a(i10);
                        e1 e1Var2 = a11;
                        String str2 = h10;
                        randomAccessFile.seek(readInt2);
                        FileOutputStream fileOutputStream = new FileOutputStream(str);
                        int i11 = readInt3 / 1024;
                        int i12 = readInt3 % 1024;
                        int i13 = 0;
                        while (i13 < i11) {
                            int i14 = i11;
                            try {
                                randomAccessFile.read(bArr2, 0, 1024);
                                fileOutputStream.write(bArr2, 0, 1024);
                                i13++;
                                i11 = i14;
                            } catch (IOException unused) {
                                z10 = false;
                                new e0.a().a("Failed to find or open ad unit bundle at path: ").a(h11).a(e0.f5981i);
                                c0.b(b10, "success", z10);
                                h0Var.a(b10).c();
                                return z10;
                            }
                        }
                        randomAccessFile.read(bArr2, 0, i12);
                        fileOutputStream.write(bArr2, 0, i12);
                        fileOutputStream.close();
                        i10++;
                        file = file2;
                        a11 = e1Var2;
                        h10 = str2;
                    } catch (JSONException unused2) {
                        new e0.a().a("Couldn't extract file name at index ").a(i10).a(" unpacking ad unit bundle at ").a(h11).a(e0.f5980h);
                        z10 = false;
                        try {
                            c0.b(b10, "success", false);
                            h0Var.a(b10).c();
                            return false;
                        } catch (IOException unused3) {
                            new e0.a().a("Failed to find or open ad unit bundle at path: ").a(h11).a(e0.f5981i);
                            c0.b(b10, "success", z10);
                            h0Var.a(b10).c();
                            return z10;
                        }
                    }
                }
                File file3 = file;
                randomAccessFile.close();
                file3.delete();
                c0.b(b10, "success", true);
                c0.a(b10, "file_sizes", e1Var);
                h0Var.a(b10).c();
                return true;
            } catch (OutOfMemoryError unused4) {
                new e0.a().a("Out of memory error - disabling AdColony.").a(e0.f5980h);
                com.adcolony.sdk.a.b().b(true);
                c0.b(b10, "success", false);
                h0Var.a(b10).c();
                return false;
            }
        } catch (IOException unused5) {
            z10 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        com.adcolony.sdk.a.a("FileSystem.save", new a());
        com.adcolony.sdk.a.a("FileSystem.delete", new b());
        com.adcolony.sdk.a.a("FileSystem.listing", new c());
        com.adcolony.sdk.a.a("FileSystem.load", new d());
        com.adcolony.sdk.a.a("FileSystem.rename", new e());
        com.adcolony.sdk.a.a("FileSystem.exists", new f());
        com.adcolony.sdk.a.a("FileSystem.extract", new g());
        com.adcolony.sdk.a.a("FileSystem.unpack_bundle", new h());
        com.adcolony.sdk.a.a("FileSystem.create_directory", new i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z10) throws IOException {
        BufferedWriter bufferedWriter;
        if (z10) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), com.adcolony.sdk.h.f6025a));
        } else {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        }
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var, File file) {
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        if (a(file)) {
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            return true;
        }
        c0.b(b10, "success", false);
        h0Var.a(b10).c();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        try {
            boolean a10 = a(h10);
            c0.b(b10, "result", a10);
            c0.b(b10, "success", true);
            h0Var.a(b10).c();
            return a10;
        } catch (Exception e8) {
            c0.b(b10, "result", false);
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            e8.printStackTrace();
            return false;
        }
    }

    boolean a(File file) {
        try {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    return file.delete();
                }
                String[] list = file.list();
                if (list.length > 0) {
                    return a(new File(file, list[0]));
                }
                if (file.list().length == 0) {
                    return file.delete();
                }
                return false;
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringBuilder a(String str, boolean z10) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        if (z10) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), com.adcolony.sdk.h.f6025a));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    private boolean a(String str) {
        return new File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 b10 = c0.b();
        try {
            if (new File(h10).mkdir()) {
                c0.b(b10, "success", true);
                h0Var.a(b10).c();
                return true;
            }
            c0.b(b10, "success", false);
            return false;
        } catch (Exception unused) {
            c0.b(b10, "success", false);
            h0Var.a(b10).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        if (this.f6337a.isEmpty() && !this.f6338b) {
            this.f6338b = true;
            runnable.run();
            return;
        }
        this.f6337a.push(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f6338b = false;
        if (this.f6337a.isEmpty()) {
            return;
        }
        this.f6338b = true;
        this.f6337a.removeLast().run();
    }
}
