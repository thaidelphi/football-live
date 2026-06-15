package com.unity3d.ads.core.extensions;

import a9.f;
import b9.p;
import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.n;
import r8.c;
/* compiled from: ExceptionExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th, int i10) {
        CharSequence y02;
        f Q;
        f o10;
        String k10;
        n.f(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            String stringWriter2 = stringWriter.toString();
            n.e(stringWriter2, "stringWriter.toString()");
            y02 = p.y0(stringWriter2);
            Q = p.Q(y02.toString());
            o10 = a9.n.o(Q, i10);
            k10 = a9.n.k(o10, "\n", null, null, 0, null, null, 62, null);
            c.a(printWriter, null);
            c.a(stringWriter, null);
            return k10;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 15;
        }
        return getShortenedStackTrace(th, i10);
    }

    public static final String retrieveUnityCrashValue(Throwable th) {
        StackTraceElement stackTraceElement;
        boolean z10;
        String className;
        n.f(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        n.e(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            stackTraceElement = null;
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i10];
            if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
                z10 = false;
            } else {
                n.e(className, "className");
                z10 = p.w(className, SDKErrorHandler.UNITY_PACKAGE, false, 2, null);
            }
            if (z10) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i10++;
        }
        if (stackTraceElement != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "unknown";
            } else {
                n.e(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
            }
            String str = fileName + '_' + stackTraceElement.getLineNumber();
            return str != null ? str : "unknown";
        }
        return "unknown";
    }
}
