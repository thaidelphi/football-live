package androidx.work;

import android.util.Log;
/* compiled from: Logger.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static p f4812a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f4813b = 20;

    /* compiled from: Logger.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends p {

        /* renamed from: c  reason: collision with root package name */
        private int f4814c;

        public a(int i10) {
            super(i10);
            this.f4814c = i10;
        }

        @Override // androidx.work.p
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f4814c <= 3) {
                if (thArr != null && thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.p
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f4814c <= 6) {
                if (thArr != null && thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // androidx.work.p
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f4814c <= 4) {
                if (thArr != null && thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.p
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f4814c <= 2) {
                if (thArr != null && thArr.length >= 1) {
                    Log.v(str, str2, thArr[0]);
                } else {
                    Log.v(str, str2);
                }
            }
        }

        @Override // androidx.work.p
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f4814c <= 5) {
                if (thArr != null && thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public p(int i10) {
    }

    public static synchronized p c() {
        p pVar;
        synchronized (p.class) {
            if (f4812a == null) {
                f4812a = new a(3);
            }
            pVar = f4812a;
        }
        return pVar;
    }

    public static synchronized void e(p pVar) {
        synchronized (p.class) {
            f4812a = pVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i10 = f4813b;
        if (length >= i10) {
            sb.append(str.substring(0, i10));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
