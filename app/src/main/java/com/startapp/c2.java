package com.startapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* compiled from: Sta */
@TargetApi(14)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c2 {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f21811c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f21812d = {"goldfish"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f21813e = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f21814f = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f21815g = {"fstab.andy", "ueventd.andy.rc"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f21816h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* renamed from: i  reason: collision with root package name */
    public static final u6[] f21817i = {new u6("init.svc.qemud", null), new u6("init.svc.qemu-props", null), new u6("qemu.hw.mainkeys", null), new u6("qemu.sf.fake_camera", null), new u6("qemu.sf.lcd_density", null), new u6("ro.bootloader", "unknown"), new u6("ro.bootmode", "unknown"), new u6("ro.hardware", "goldfish"), new u6("ro.kernel.android.qemud", null), new u6("ro.kernel.qemu.gles", null), new u6("ro.kernel.qemu", "1"), new u6("ro.product.device", "generic"), new u6("ro.product.model", ServiceProvider.NAMED_SDK), new u6("ro.product.name", ServiceProvider.NAMED_SDK), new u6("ro.serialno", null), new u6("ro.build.description", "72656C656173652D6B657973"), new u6("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new u6("net.eth0.dns1", null), new u6("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new u6("ro.radio.use-ppp", null), new u6("gsm.version.baseband", null), new u6("ro.build.tags", "72656C656173652D6B65"), new u6("ro.build.display.id", "746573742D"), new u6("init.svc.console", null)};
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: j  reason: collision with root package name */
    public static c2 f21818j;

    /* renamed from: k  reason: collision with root package name */
    public static Boolean f21819k;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21820a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f21821b;

    public c2(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f21821b = arrayList;
        this.f21820a = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }

    public static boolean b() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i10 = 0; i10 < 2; i10++) {
            File file = fileArr[i10];
            if (file.exists() && file.canRead()) {
                char[] cArr = new char[1024];
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    while (true) {
                        try {
                            int read = bufferedReader2.read(cArr);
                            if (read != -1) {
                                sb.append(cArr, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Exception unused2) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused3) {
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    if (sb.toString().contains(f21812d[0])) {
                        return true;
                    }
                } catch (Exception unused5) {
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r4.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[LOOP:0: B:3:0x0003->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r10, java.lang.String[] r11) {
        /*
            r9 = this;
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L5c
            r3 = r11[r2]
            android.content.Context r4 = r9.f21820a
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            r6 = 1
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L21
            r8 = 23
            if (r7 < r8) goto L19
            int r4 = r4.checkSelfPermission(r5)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L21
            goto L1f
        L19:
            int r4 = r4.checkCallingOrSelfPermission(r5)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L21
        L1f:
            r4 = r6
            goto L22
        L21:
            r4 = r1
        L22:
            if (r4 == 0) goto L4d
            java.lang.String r4 = "/"
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L4d
            java.lang.String r4 = "Nox"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L4d
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            goto L52
        L4d:
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
        L52:
            boolean r3 = r4.exists()
            if (r3 == 0) goto L59
            return r6
        L59:
            int r2 = r2 + 1
            goto L3
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.c2.a(java.lang.String, java.lang.String[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.c2.c():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f21820a
            r1 = 0
            r2 = 1
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r4 = 23
            java.lang.String r5 = "android.permission.INTERNET"
            if (r3 < r4) goto L13
            int r0 = r0.checkSelfPermission(r5)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1b
            goto L19
        L13:
            int r0 = r0.checkCallingOrSelfPermission(r5)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1b
        L19:
            r0 = r2
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L95
            java.lang.String r0 = "/system/bin/netcfg"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.ProcessBuilder r4 = new java.lang.ProcessBuilder     // Catch: java.lang.Exception -> L5a
            r4.<init>(r0)     // Catch: java.lang.Exception -> L5a
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = "/system/bin/"
            r0.<init>(r5)     // Catch: java.lang.Exception -> L5a
            r4.directory(r0)     // Catch: java.lang.Exception -> L5a
            r4.redirectErrorStream(r2)     // Catch: java.lang.Exception -> L5a
            java.lang.Process r0 = r4.start()     // Catch: java.lang.Exception -> L5a
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Exception -> L5a
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L5a
        L47:
            int r5 = r0.read(r4)     // Catch: java.lang.Exception -> L5a
            r6 = -1
            if (r5 == r6) goto L57
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L5a
            r5.<init>(r4)     // Catch: java.lang.Exception -> L5a
            r3.append(r5)     // Catch: java.lang.Exception -> L5a
            goto L47
        L57:
            r0.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            java.lang.String r0 = r3.toString()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L95
            java.lang.String r3 = "\n"
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            r4 = r1
        L6c:
            if (r4 >= r3) goto L95
            r5 = r0[r4]
            java.lang.String r6 = "wlan0"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L88
            java.lang.String r6 = "tunl0"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L88
            java.lang.String r6 = "eth0"
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L92
        L88:
            java.lang.String r6 = "10.0.2.15"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L92
            r1 = r2
            goto L95
        L92:
            int r4 = r4 + 1
            goto L6c
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.c2.a():boolean");
    }
}
