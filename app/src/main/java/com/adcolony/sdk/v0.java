package com.adcolony.sdk;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.adcolony.sdk.e0;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private String f6330a;

    /* renamed from: b  reason: collision with root package name */
    private String f6331b;

    /* renamed from: c  reason: collision with root package name */
    private String f6332c;

    /* renamed from: d  reason: collision with root package name */
    private String f6333d;

    /* renamed from: e  reason: collision with root package name */
    private File f6334e;

    /* renamed from: f  reason: collision with root package name */
    private File f6335f;

    /* renamed from: g  reason: collision with root package name */
    private File f6336g;

    private long b(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    private long c(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? d(statFs) : statFs.getBlockSize();
    }

    private long d(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    double a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return a(statFs) * c(statFs);
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        k b10 = a.b();
        this.f6330a = f() + "/adc3/";
        this.f6331b = this.f6330a + "media/";
        File file = new File(this.f6331b);
        this.f6334e = file;
        if (!file.isDirectory()) {
            this.f6334e.delete();
            this.f6334e.mkdirs();
        }
        if (!this.f6334e.isDirectory()) {
            b10.b(true);
            return false;
        } else if (a(this.f6331b) < 2.097152E7d) {
            new e0.a().a("Not enough memory available at media path, disabling AdColony.").a(e0.f5978f);
            b10.b(true);
            return false;
        } else {
            this.f6332c = f() + "/adc3/data/";
            File file2 = new File(this.f6332c);
            this.f6335f = file2;
            if (!file2.isDirectory()) {
                this.f6335f.delete();
            }
            this.f6335f.mkdirs();
            this.f6333d = this.f6330a + "tmp/";
            File file3 = new File(this.f6333d);
            this.f6336g = file3;
            if (!file3.isDirectory()) {
                this.f6336g.delete();
                this.f6336g.mkdirs();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        Context a10 = a.a();
        return a10 == null ? "" : a10.getFilesDir().getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 g() {
        if (new File(a() + "AppVersion").exists()) {
            return c0.c(a() + "AppVersion");
        }
        return c0.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        File file = this.f6334e;
        if (file == null || this.f6335f == null || this.f6336g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f6334e.delete();
        }
        if (!this.f6335f.isDirectory()) {
            this.f6335f.delete();
        }
        if (!this.f6336g.isDirectory()) {
            this.f6336g.delete();
        }
        this.f6334e.mkdirs();
        this.f6335f.mkdirs();
        this.f6336g.mkdirs();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f6332c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f6331b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f6333d;
    }

    private long a(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? b(statFs) : statFs.getAvailableBlocks();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f1 f1Var) {
        c0.j(f1Var, a() + "AppVersion");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f6330a;
    }
}
