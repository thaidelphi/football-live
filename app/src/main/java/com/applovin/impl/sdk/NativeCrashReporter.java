package com.applovin.impl.sdk;

import com.applovin.impl.d7;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeCrashReporter implements g.d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8697a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8698b;

    /* renamed from: c  reason: collision with root package name */
    private static final NativeCrashReporter f8699c = new NativeCrashReporter();

    private NativeCrashReporter() {
    }

    public static void a(j jVar) {
        if (jVar == null) {
            return;
        }
        if (!((Boolean) jVar.a(o4.f8199q4)).booleanValue() && !d7.i(j.m())) {
            if (f8698b) {
                try {
                    g k10 = jVar.k();
                    NativeCrashReporter nativeCrashReporter = f8699c;
                    k10.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                } catch (Throwable th) {
                    jVar.I();
                    if (n.a()) {
                        jVar.I().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    jVar.D().a("NativeCrashReporter", "disableInstance", th);
                }
            }
        } else if (a()) {
            List c10 = jVar.c(o4.f8207r4);
            int[] iArr = new int[c10.size()];
            for (int i10 = 0; i10 < c10.size(); i10++) {
                try {
                    iArr[i10] = Integer.parseInt((String) c10.get(i10));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(j.m().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, jVar);
            } else if (!file.mkdir()) {
                jVar.I();
                if (n.a()) {
                    jVar.I().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f8699c;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) jVar.a(o4.f8215s4)).booleanValue());
                HashSet hashSet = new HashSet();
                hashSet.add(g.c.SHOW);
                hashSet.add(g.c.CLICK);
                hashSet.add(g.c.SHOW_ERROR);
                hashSet.add(g.c.DESTROY);
                jVar.k().a(nativeCrashReporter2, hashSet);
            } catch (Throwable th2) {
                jVar.I();
                if (n.a()) {
                    jVar.I().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                jVar.D().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g.b bVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
        JsonUtils.putString(jSONObject, "ad_format", bVar.g());
        JsonUtils.putString(jSONObject, "network_name", bVar.c());
        JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
        JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
        JsonUtils.putString(jSONObject, "bcode", bVar.e());
        JsonUtils.putString(jSONObject, "creative_id", bVar.f());
        JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
        updateAdInfo(bVar.h(), jSONObject.toString());
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z10);

    private native void removeAdInfo(int i10);

    private native void updateAdInfo(int i10, String str);

    private static boolean a() {
        if (!f8697a) {
            f8697a = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f8698b = true;
            } catch (Throwable th) {
                n.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return f8698b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:9|(8:11|12|13|(1:15)(4:33|(4:36|(2:38|39)(2:41|42)|40|34)|43|44)|16|17|(2:19|(2:21|22)(1:24))(1:25)|23))|50|(1:52)|16|17|(0)(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
        r17.I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
        if (com.applovin.impl.sdk.n.a() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
        r17.I().a("NativeCrashReporter", "Failed to delete native crash report: " + r6.getAbsolutePath(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:32:0x00c1, B:34:0x00c7, B:36:0x00d0), top: B:46:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.io.File r16, com.applovin.impl.sdk.j r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.j):void");
    }

    @Override // com.applovin.impl.sdk.g.d
    public void a(final g.b bVar) {
        if (bVar.i() == g.c.DESTROY) {
            removeAdInfo(bVar.h());
        } else {
            d7.a(new Runnable() { // from class: com.applovin.impl.sdk.z
                @Override // java.lang.Runnable
                public final void run() {
                    NativeCrashReporter.this.b(bVar);
                }
            });
        }
    }
}
