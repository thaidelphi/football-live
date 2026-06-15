package r;

import java.util.Arrays;
import java.util.HashSet;
/* compiled from: SolverVariable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i {

    /* renamed from: r  reason: collision with root package name */
    private static int f30254r = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30255a;

    /* renamed from: b  reason: collision with root package name */
    private String f30256b;

    /* renamed from: f  reason: collision with root package name */
    public float f30260f;

    /* renamed from: j  reason: collision with root package name */
    a f30264j;

    /* renamed from: c  reason: collision with root package name */
    public int f30257c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f30258d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f30259e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30261g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f30262h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f30263i = new float[9];

    /* renamed from: k  reason: collision with root package name */
    b[] f30265k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    int f30266l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f30267m = 0;

    /* renamed from: n  reason: collision with root package name */
    boolean f30268n = false;

    /* renamed from: o  reason: collision with root package name */
    int f30269o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f30270p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    HashSet<b> f30271q = null;

    /* compiled from: SolverVariable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f30264j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        f30254r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f30266l;
            if (i10 < i11) {
                if (this.f30265k[i10] == bVar) {
                    return;
                }
                i10++;
            } else {
                b[] bVarArr = this.f30265k;
                if (i11 >= bVarArr.length) {
                    this.f30265k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f30265k;
                int i12 = this.f30266l;
                bVarArr2[i12] = bVar;
                this.f30266l = i12 + 1;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f30266l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f30265k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f30265k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f30266l--;
                return;
            }
            i11++;
        }
    }

    public void d() {
        this.f30256b = null;
        this.f30264j = a.UNKNOWN;
        this.f30259e = 0;
        this.f30257c = -1;
        this.f30258d = -1;
        this.f30260f = 0.0f;
        this.f30261g = false;
        this.f30268n = false;
        this.f30269o = -1;
        this.f30270p = 0.0f;
        int i10 = this.f30266l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f30265k[i11] = null;
        }
        this.f30266l = 0;
        this.f30267m = 0;
        this.f30255a = false;
        Arrays.fill(this.f30263i, 0.0f);
    }

    public void e(d dVar, float f10) {
        this.f30260f = f10;
        this.f30261g = true;
        this.f30268n = false;
        this.f30269o = -1;
        this.f30270p = 0.0f;
        int i10 = this.f30266l;
        this.f30258d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f30265k[i11].A(dVar, this, false);
        }
        this.f30266l = 0;
    }

    public void f(a aVar, String str) {
        this.f30264j = aVar;
    }

    public final void g(d dVar, b bVar) {
        int i10 = this.f30266l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f30265k[i11].B(dVar, bVar, false);
        }
        this.f30266l = 0;
    }

    public String toString() {
        if (this.f30256b != null) {
            return "" + this.f30256b;
        }
        return "" + this.f30257c;
    }
}
