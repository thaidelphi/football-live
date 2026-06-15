package i9;

import i8.o;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: StackTraceRecovery.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class j0 {

    /* renamed from: a */
    private static final StackTraceElement f26661a = new a.a().a();

    /* renamed from: b */
    private static final String f26662b;

    /* renamed from: c */
    private static final String f26663c;

    static {
        Object b10;
        Object b11;
        try {
            o.a aVar = i8.o.f26626b;
            b10 = i8.o.b(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            o.a aVar2 = i8.o.f26626b;
            b10 = i8.o.b(i8.p.a(th));
        }
        if (i8.o.d(b10) != null) {
            b10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f26662b = (String) b10;
        try {
            o.a aVar3 = i8.o.f26626b;
            b11 = i8.o.b(j0.class.getCanonicalName());
        } catch (Throwable th2) {
            o.a aVar4 = i8.o.f26626b;
            b11 = i8.o.b(i8.p.a(th2));
        }
        if (i8.o.d(b11) != null) {
            b11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f26663c = (String) b11;
    }

    public static final /* synthetic */ Throwable a(Throwable th, kotlin.coroutines.jvm.internal.e eVar) {
        return i(th, eVar);
    }

    private static final <E extends Throwable> i8.n<E, StackTraceElement[]> b(E e8) {
        boolean z10;
        Throwable cause = e8.getCause();
        if (cause != null && kotlin.jvm.internal.n.a(cause.getClass(), e8.getClass())) {
            StackTraceElement[] stackTrace = e8.getStackTrace();
            int length = stackTrace.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                } else if (g(stackTrace[i10])) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                return i8.s.a(cause, stackTrace);
            }
            return i8.s.a(e8, new StackTraceElement[0]);
        }
        return i8.s.a(e8, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E c(E e8, E e10, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f26661a);
        StackTraceElement[] stackTrace = e8.getStackTrace();
        int f10 = f(stackTrace, f26662b);
        int i10 = 0;
        if (f10 == -1) {
            e10.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e10;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + f10];
        for (int i11 = 0; i11 < f10; i11++) {
            stackTraceElementArr[i11] = stackTrace[i11];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i10 + f10] = it.next();
            i10++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    private static final ArrayDeque<StackTraceElement> d(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.n.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.n.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.n.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (kotlin.jvm.internal.n.a(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final boolean g(StackTraceElement stackTraceElement) {
        boolean r10;
        r10 = b9.o.r(stackTraceElement.getClassName(), a.b.c(), false, 2, null);
        return r10;
    }

    private static final void h(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (g(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 > length2) {
            return;
        }
        while (true) {
            if (e(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i11) {
                return;
            }
            length2--;
        }
    }

    public static final <E extends Throwable> E i(E e8, kotlin.coroutines.jvm.internal.e eVar) {
        i8.n b10 = b(e8);
        Throwable th = (Throwable) b10.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b10.b();
        Throwable g10 = n.g(th);
        if (g10 == null) {
            return e8;
        }
        ArrayDeque<StackTraceElement> d10 = d(eVar);
        if (d10.isEmpty()) {
            return e8;
        }
        if (th != e8) {
            h(stackTraceElementArr, d10);
        }
        return (E) c(th, g10, d10);
    }

    public static final <E extends Throwable> E j(E e8) {
        Throwable g10;
        return (d9.s0.d() && (g10 = n.g(e8)) != null) ? (E) k(g10) : e8;
    }

    private static final <E extends Throwable> E k(E e8) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e8.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i10 = length2 - 1;
                if (kotlin.jvm.internal.n.a(f26663c, stackTrace[length2].getClassName())) {
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length2 = i10;
                }
            }
        }
        length2 = -1;
        int i11 = length2 + 1;
        int f10 = f(stackTrace, f26662b);
        int i12 = (length - length2) - (f10 == -1 ? 0 : length - f10);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == 0) {
                stackTraceElement = f26661a;
            } else {
                stackTraceElement = stackTrace[(i11 + i13) - 1];
            }
            stackTraceElementArr[i13] = stackTraceElement;
        }
        e8.setStackTrace(stackTraceElementArr);
        return e8;
    }

    public static final <E extends Throwable> E l(E e8) {
        E e10 = (E) e8.getCause();
        if (e10 != null && kotlin.jvm.internal.n.a(e10.getClass(), e8.getClass())) {
            StackTraceElement[] stackTrace = e8.getStackTrace();
            int length = stackTrace.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (g(stackTrace[i10])) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                return e10;
            }
        }
        return e8;
    }
}
