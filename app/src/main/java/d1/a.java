package d1;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ApiFeature.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a implements d1.g {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<a> f23878c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f23879a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23880b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ApiFeature.java */
    /* renamed from: d1.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0259a {

        /* renamed from: a  reason: collision with root package name */
        static final Set<String> f23881a = new HashSet(Arrays.asList(q.d().a()));
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class g extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class h extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class i extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f23879a = str;
        this.f23880b = str2;
        f23878c.add(this);
    }

    public static Set<a> d() {
        return Collections.unmodifiableSet(f23878c);
    }

    @Override // d1.g
    public String a() {
        return this.f23879a;
    }

    public abstract boolean b();

    public boolean c() {
        return z9.a.b(C0259a.f23881a, this.f23880b);
    }

    @Override // d1.g
    public boolean isSupported() {
        return b() || c();
    }
}
