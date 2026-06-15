package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* renamed from: a  reason: collision with root package name */
    public final transient String f23075a;

    /* renamed from: b  reason: collision with root package name */
    public final transient boolean f23076b;

    /* renamed from: c  reason: collision with root package name */
    public final transient boolean f23077c;

    /* renamed from: d  reason: collision with root package name */
    public final transient Set<String> f23078d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j10, StackTraceElement stackTraceElement) {
            this.skipBeforeAmount = j10;
            this.stackTraceElement = stackTraceElement;
        }

        public final long a() {
            return this.skipBeforeAmount;
        }

        public final StackTraceElement b() {
            return this.stackTraceElement;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23080a;

        /* renamed from: b  reason: collision with root package name */
        public String f23081b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f23082c;

        /* renamed from: d  reason: collision with root package name */
        public long f23083d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23084e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23085f;
    }

    public ThreadsState(a aVar) {
        this.f23075a = aVar.f23080a;
        this.f23076b = aVar.f23084e;
        this.f23077c = aVar.f23085f;
        this.delay = aVar.f23083d;
        this.handlerDescription = aVar.f23081b;
        this.f23078d = aVar.f23082c;
        a();
    }

    public final void a() {
        Thread thread = Looper.getMainLooper().getThread();
        String str = thread.getName() + " (state = " + thread.getState() + ")";
        boolean z10 = false;
        TreeMap treeMap = new TreeMap(new MainThreadComparator(0));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (value != null && value.length > 0) {
                ShrunkStackTraceElement[] b10 = b(value);
                if (b10 != null && b10.length > 0) {
                    Thread.State state = key.getState();
                    if (key == thread) {
                        if (a(value)) {
                            return;
                        }
                        z10 = true;
                        treeMap.put(str, b10);
                    } else if (!this.f23077c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(key.getName() + " (state = " + key.getState() + ")", b10);
                    }
                } else if (key == thread) {
                    return;
                }
            } else if (key == thread) {
                return;
            }
        }
        if (!z10) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b11 = b(stackTrace);
            if (b11 == null || b11.length <= 0 || a(stackTrace)) {
                return;
            }
            treeMap.put(str, b11);
        }
        this.threadsStackTraces = treeMap;
    }

    public final long b() {
        return this.delay;
    }

    public final String c() {
        return this.handlerDescription;
    }

    public final Map<String, ShrunkStackTraceElement[]> d() {
        return this.threadsStackTraces;
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final transient String f23079a;

        private MainThreadComparator() {
            this.f23079a = Looper.getMainLooper().getThread().getName();
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3.startsWith(this.f23079a)) {
                return -1;
            }
            if (str4.startsWith(this.f23079a)) {
                return 1;
            }
            return str3.compareTo(str4);
        }

        public /* synthetic */ MainThreadComparator(int i10) {
            this();
        }
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        String className;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        StackTraceElement stackTraceElement = null;
        long j10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i10];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z12 = i10 < 3;
                String str = this.f23075a;
                boolean z13 = str == null || className.startsWith(str);
                if (z13) {
                    z10 = true;
                }
                if (!this.f23076b || z13 || z12 || z11) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j10, stackTraceElement));
                        stackTraceElement = null;
                        j10 = 0;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0L, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j10++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z11 = z13;
            }
            i10++;
        }
        if (stackTraceElement != null) {
            shrunkStackTraceElementArr = null;
            arrayList.add(new ShrunkStackTraceElement(j10 + 1, null));
        } else {
            shrunkStackTraceElementArr = null;
        }
        return z10 ? (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]) : shrunkStackTraceElementArr;
    }

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.f23078d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (className != null && methodName != null) {
                if (this.f23078d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
