package com.ironsource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class kl {

    /* renamed from: a  reason: collision with root package name */
    private final String f18093a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18094b;

    public kl(String str, int i10) {
        this.f18093a = str;
        this.f18094b = i10;
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i10) {
        List d10;
        boolean w10;
        List d11;
        boolean z10;
        boolean z11;
        if (stackTraceElementArr.length > i10) {
            String className = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.n.e(className, "stackTrace[depth]\n              .className");
            List<String> d12 = new b9.e("\\.").d(className, 0);
            if (!d12.isEmpty()) {
                ListIterator<String> listIterator = d12.listIterator(d12.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (!z11) {
                        d10 = j8.o.J(d12, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            d10 = j8.o.d();
            String[] strArr = (String[]) d10.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            w10 = b9.p.w(str, "$", false, 2, null);
            if (w10) {
                List<String> d13 = new b9.e("\\$").d(str, 0);
                if (!d13.isEmpty()) {
                    ListIterator<String> listIterator2 = d13.listIterator(d13.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() == 0) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (!z10) {
                            d11 = j8.o.J(d13, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                d11 = j8.o.d();
                return ((String[]) d11.toArray(new String[0]))[0];
            }
            return str;
        }
        return "";
    }

    private final String b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        kotlin.jvm.internal.n.e(stackTrace, "stackTrace");
        String a10 = a(stackTrace, 6);
        String b10 = b(stackTrace, 6);
        kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{a10, b10}, 2));
        kotlin.jvm.internal.n.e(format, "format(format, *args)");
        return format;
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i10) {
        List d10;
        boolean w10;
        boolean w11;
        int i11;
        List d11;
        String[] strArr;
        boolean z10;
        List d12;
        boolean z11;
        boolean z12;
        if (stackTraceElementArr.length > i10) {
            String className = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.n.e(className, "stackTrace[depth]\n              .className");
            List<String> d13 = new b9.e("\\.").d(className, 0);
            if (!d13.isEmpty()) {
                ListIterator<String> listIterator = d13.listIterator(d13.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z12 = true;
                        continue;
                    } else {
                        z12 = false;
                        continue;
                    }
                    if (!z12) {
                        d10 = j8.o.J(d13, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            d10 = j8.o.d();
            String[] strArr2 = (String[]) d10.toArray(new String[0]);
            String str = strArr2[strArr2.length - 1];
            w10 = b9.p.w(str, "$", false, 2, null);
            if (w10) {
                List<String> d14 = new b9.e("\\$").d(str, 0);
                if (!d14.isEmpty()) {
                    ListIterator<String> listIterator2 = d14.listIterator(d14.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() == 0) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (!z11) {
                            d12 = j8.o.J(d14, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                d12 = j8.o.d();
                return ((String[]) d12.toArray(new String[0]))[1] + '.' + stackTraceElementArr[i10].getMethodName();
            }
            String methodName = stackTraceElementArr[i10].getMethodName();
            kotlin.jvm.internal.n.e(methodName, "stackTrace[depth].methodName");
            w11 = b9.p.w(methodName, "$", false, 2, null);
            if (!w11 || stackTraceElementArr.length <= (i11 = i10 + 1)) {
                String methodName2 = stackTraceElementArr[i10].getMethodName();
                kotlin.jvm.internal.n.e(methodName2, "stackTrace[depth].methodName");
                return methodName2;
            }
            String className2 = stackTraceElementArr[i11].getClassName();
            kotlin.jvm.internal.n.e(className2, "stackTrace[depth + 1]\n                .className");
            List<String> d15 = new b9.e("\\$").d(className2, 0);
            if (!d15.isEmpty()) {
                ListIterator<String> listIterator3 = d15.listIterator(d15.size());
                while (listIterator3.hasPrevious()) {
                    if (listIterator3.previous().length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        d11 = j8.o.J(d15, listIterator3.nextIndex() + 1);
                        break;
                    }
                }
            }
            d11 = j8.o.d();
            if (((String[]) d11.toArray(new String[0])).length <= 1) {
                String methodName3 = stackTraceElementArr[i11].getMethodName();
                kotlin.jvm.internal.n.e(methodName3, "{\n              stackTra….methodName\n            }");
                return methodName3;
            }
            return strArr[1] + '.' + stackTraceElementArr[i11].getMethodName();
        }
        return "";
    }

    public final int a() {
        return this.f18094b;
    }

    public final String c() {
        String str = this.f18093a;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.f18093a;
    }
}
