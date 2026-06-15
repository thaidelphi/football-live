package z4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import z4.q0;
/* compiled from: SlidingPercentile.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q0 {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f33598h = new Comparator() { // from class: z4.p0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g10;
            g10 = q0.g((q0.b) obj, (q0.b) obj2);
            return g10;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f33599i = new Comparator() { // from class: z4.o0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h10;
            h10 = q0.h((q0.b) obj, (q0.b) obj2);
            return h10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final int f33600a;

    /* renamed from: e  reason: collision with root package name */
    private int f33604e;

    /* renamed from: f  reason: collision with root package name */
    private int f33605f;

    /* renamed from: g  reason: collision with root package name */
    private int f33606g;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f33602c = new b[5];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f33601b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f33603d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SlidingPercentile.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f33607a;

        /* renamed from: b  reason: collision with root package name */
        public int f33608b;

        /* renamed from: c  reason: collision with root package name */
        public float f33609c;

        private b() {
        }
    }

    public q0(int i10) {
        this.f33600a = i10;
    }

    private void d() {
        if (this.f33603d != 1) {
            Collections.sort(this.f33601b, f33598h);
            this.f33603d = 1;
        }
    }

    private void e() {
        if (this.f33603d != 0) {
            Collections.sort(this.f33601b, f33599i);
            this.f33603d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f33607a - bVar2.f33607a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f33609c, bVar2.f33609c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f33606g;
        if (i11 > 0) {
            b[] bVarArr = this.f33602c;
            int i12 = i11 - 1;
            this.f33606g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f33604e;
        this.f33604e = i13 + 1;
        bVar.f33607a = i13;
        bVar.f33608b = i10;
        bVar.f33609c = f10;
        this.f33601b.add(bVar);
        this.f33605f += i10;
        while (true) {
            int i14 = this.f33605f;
            int i15 = this.f33600a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f33601b.get(0);
            int i17 = bVar2.f33608b;
            if (i17 <= i16) {
                this.f33605f -= i17;
                this.f33601b.remove(0);
                int i18 = this.f33606g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f33602c;
                    this.f33606g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f33608b = i17 - i16;
                this.f33605f -= i16;
            }
        }
    }

    public float f(float f10) {
        ArrayList<b> arrayList;
        e();
        float f11 = f10 * this.f33605f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f33601b.size(); i11++) {
            b bVar = this.f33601b.get(i11);
            i10 += bVar.f33608b;
            if (i10 >= f11) {
                return bVar.f33609c;
            }
        }
        if (this.f33601b.isEmpty()) {
            return Float.NaN;
        }
        return this.f33601b.get(arrayList.size() - 1).f33609c;
    }

    public void i() {
        this.f33601b.clear();
        this.f33603d = -1;
        this.f33604e = 0;
        this.f33605f = 0;
    }
}
