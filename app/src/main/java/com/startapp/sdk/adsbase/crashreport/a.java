package com.startapp.sdk.adsbase.crashreport;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import com.startapp.sdk.adsbase.crashreport.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements b.d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23086a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23087b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23088c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23089d;

    public a(Context context, boolean z10, boolean z11, boolean z12) {
        this.f23086a = context;
        this.f23087b = z10;
        this.f23088c = z11;
        this.f23089d = z12;
    }

    @Override // com.startapp.sdk.adsbase.crashreport.b.d
    public final boolean a(String str, long j10) {
        HashSet hashSet;
        ThreadsState.a aVar = new ThreadsState.a();
        aVar.f23080a = "com.startapp.";
        aVar.f23084e = this.f23087b;
        aVar.f23085f = this.f23088c;
        aVar.f23083d = j10;
        aVar.f23081b = str;
        if (this.f23089d) {
            hashSet = new HashSet();
            hashSet.add("android.webkit.WebView.loadDataWithBaseURL");
            hashSet.add("android.webkit.WebView.<init>");
            hashSet.add("android.webkit.WebView.stopLoading");
            hashSet.add("android.webkit.WebView.loadUrl");
            hashSet.add("libcore.icu.LocaleData.initLocaleData");
            hashSet.add("android.os.BinderProxy.transact");
            hashSet.add("android.hardware.SystemSensorManager.registerListenerImpl");
            hashSet.add("android.hardware.SystemSensorManager.<init>");
            hashSet.add("java.lang.Thread.<init>");
            hashSet.add("android.content.ContextWrapper.checkSelfPermission");
        } else {
            hashSet = null;
        }
        aVar.f23082c = hashSet;
        ThreadsState threadsState = new ThreadsState(aVar);
        if (threadsState.d() != null) {
            g2.a(this.f23086a, "StartappAnrTrace", threadsState);
            return true;
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.crashreport.b.d
    public final void remove() {
        if (new File(g2.b(this.f23086a, "StartappAnrTrace")).exists()) {
            Context context = this.f23086a;
            g2.a(new File(g2.b(context, "StartappAnrTrace")));
            g2.a(new File(g2.a(context, "StartappAnrTrace")));
        }
    }

    @Override // com.startapp.sdk.adsbase.crashreport.b.d
    public final void a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        StackTraceElement stackTraceElement;
        if (new File(g2.b(this.f23086a, "StartappAnrTrace")).exists() && (threadsState = (ThreadsState) g2.c(this.f23086a, "StartappAnrTrace")) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(o9.a(byteArrayOutputStream));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.b());
            printWriter.println('\"');
            if (!TextUtils.isEmpty(threadsState.c())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.c());
                printWriter.println('\"');
            }
            Map<String, ThreadsState.ShrunkStackTraceElement[]> d10 = threadsState.d();
            if (d10 == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry<String, ThreadsState.ShrunkStackTraceElement[]> entry : d10.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = entry.getValue();
                    }
                    ThreadsState.ShrunkStackTraceElement[] value = entry.getValue();
                    printWriter.print('\"');
                    printWriter.print(entry.getKey());
                    printWriter.println('\"');
                    for (ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement : value) {
                        if (shrunkStackTraceElement.a() != 0) {
                            printWriter.print('\t');
                            printWriter.println(shrunkStackTraceElement.a());
                        }
                        StackTraceElement b10 = shrunkStackTraceElement.b();
                        if (b10 != null) {
                            printWriter.print('\t');
                            printWriter.print("at ");
                            printWriter.print(b10.getClassName());
                            printWriter.print('.');
                            printWriter.print(b10.getMethodName());
                            printWriter.print('(');
                            printWriter.print(b10.getFileName());
                            printWriter.print(':');
                            printWriter.print(b10.getLineNumber());
                            printWriter.println(')');
                        }
                    }
                }
            }
            printWriter.close();
            if (shrunkStackTraceElementArr == null) {
                return;
            }
            int length = shrunkStackTraceElementArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    stackTraceElement = null;
                    break;
                }
                StackTraceElement b11 = shrunkStackTraceElementArr[i10].b();
                if (b11 != null && b11.getClassName().startsWith("com.startapp.")) {
                    stackTraceElement = b11;
                    break;
                }
                i10++;
            }
            if (stackTraceElement == null) {
                return;
            }
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            l3 l3Var = new l3(m3.f22278h);
            l3Var.f22228d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
            l3Var.f22229e = byteArrayOutputStream2;
            l3Var.a();
        }
    }
}
