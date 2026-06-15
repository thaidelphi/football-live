package androidx.core.text;

import java.util.Locale;
/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.core.text.d f2770a = new C0046e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final androidx.core.text.d f2771b = new C0046e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final androidx.core.text.d f2772c;

    /* renamed from: d  reason: collision with root package name */
    public static final androidx.core.text.d f2773d;

    /* renamed from: e  reason: collision with root package name */
    public static final androidx.core.text.d f2774e;

    /* renamed from: f  reason: collision with root package name */
    public static final androidx.core.text.d f2775f;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f2776b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f2777a;

        private a(boolean z10) {
            this.f2777a = z10;
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f2777a) {
                        return 1;
                    }
                } else if (this.f2777a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f2777a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f2778a = new b();

        private b() {
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static abstract class d implements androidx.core.text.d {

        /* renamed from: a  reason: collision with root package name */
        private final c f2779a;

        d(c cVar) {
            this.f2779a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f2779a.a(charSequence, i10, i11);
            if (a10 != 0) {
                if (a10 != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }

        @Override // androidx.core.text.d
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                if (this.f2779a == null) {
                    return b();
                }
                return c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: androidx.core.text.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class C0046e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2780b;

        C0046e(c cVar, boolean z10) {
            super(cVar);
            this.f2780b = z10;
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return this.f2780b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f2781b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return androidx.core.text.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2778a;
        f2772c = new C0046e(bVar, false);
        f2773d = new C0046e(bVar, true);
        f2774e = new C0046e(a.f2776b, false);
        f2775f = f.f2781b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
