package p3;

import a5.p0;
import android.media.AudioAttributes;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n3.h;
/* compiled from: AudioAttributes.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements n3.h {

    /* renamed from: g  reason: collision with root package name */
    public static final e f29649g = new C0335e().a();

    /* renamed from: h  reason: collision with root package name */
    public static final h.a<e> f29650h = new h.a() { // from class: p3.d
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            e d10;
            d10 = e.d(bundle);
            return d10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f29651a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29652b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29653c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29654d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29655e;

    /* renamed from: f  reason: collision with root package name */
    private d f29656f;

    /* compiled from: AudioAttributes.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes f29657a;

        private d(e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f29651a).setFlags(eVar.f29652b).setUsage(eVar.f29653c);
            int i10 = p0.f482a;
            if (i10 >= 29) {
                b.a(usage, eVar.f29654d);
            }
            if (i10 >= 32) {
                c.a(usage, eVar.f29655e);
            }
            this.f29657a = usage.build();
        }
    }

    /* compiled from: AudioAttributes.java */
    /* renamed from: p3.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0335e {

        /* renamed from: a  reason: collision with root package name */
        private int f29658a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f29659b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f29660c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f29661d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f29662e = 0;

        public e a() {
            return new e(this.f29658a, this.f29659b, this.f29660c, this.f29661d, this.f29662e);
        }

        public C0335e b(int i10) {
            this.f29661d = i10;
            return this;
        }

        public C0335e c(int i10) {
            this.f29658a = i10;
            return this;
        }

        public C0335e d(int i10) {
            this.f29659b = i10;
            return this;
        }

        public C0335e e(int i10) {
            this.f29662e = i10;
            return this;
        }

        public C0335e f(int i10) {
            this.f29660c = i10;
            return this;
        }
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e d(Bundle bundle) {
        C0335e c0335e = new C0335e();
        if (bundle.containsKey(c(0))) {
            c0335e.c(bundle.getInt(c(0)));
        }
        if (bundle.containsKey(c(1))) {
            c0335e.d(bundle.getInt(c(1)));
        }
        if (bundle.containsKey(c(2))) {
            c0335e.f(bundle.getInt(c(2)));
        }
        if (bundle.containsKey(c(3))) {
            c0335e.b(bundle.getInt(c(3)));
        }
        if (bundle.containsKey(c(4))) {
            c0335e.e(bundle.getInt(c(4)));
        }
        return c0335e.a();
    }

    public d b() {
        if (this.f29656f == null) {
            this.f29656f = new d();
        }
        return this.f29656f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f29651a == eVar.f29651a && this.f29652b == eVar.f29652b && this.f29653c == eVar.f29653c && this.f29654d == eVar.f29654d && this.f29655e == eVar.f29655e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f29651a) * 31) + this.f29652b) * 31) + this.f29653c) * 31) + this.f29654d) * 31) + this.f29655e;
    }

    private e(int i10, int i11, int i12, int i13, int i14) {
        this.f29651a = i10;
        this.f29652b = i11;
        this.f29653c = i12;
        this.f29654d = i13;
        this.f29655e = i14;
    }
}
