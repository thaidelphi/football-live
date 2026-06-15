package e4;

import java.util.Arrays;
import java.util.Random;
/* compiled from: ShuffleOrder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface g0 {

    /* compiled from: ShuffleOrder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements g0 {

        /* renamed from: a  reason: collision with root package name */
        private final Random f25046a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f25047b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f25048c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] i(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // e4.g0
        public int a() {
            return this.f25047b.length;
        }

        @Override // e4.g0
        public g0 b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f25047b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f25047b;
                if (i13 < iArr2.length) {
                    if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                        iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                    } else {
                        i14++;
                    }
                    i13++;
                } else {
                    return new a(iArr, new Random(this.f25046a.nextLong()));
                }
            }
        }

        @Override // e4.g0
        public int c(int i10) {
            int i11 = this.f25048c[i10] - 1;
            if (i11 >= 0) {
                return this.f25047b[i11];
            }
            return -1;
        }

        @Override // e4.g0
        public int d(int i10) {
            int i11 = this.f25048c[i10] + 1;
            int[] iArr = this.f25047b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // e4.g0
        public int e() {
            int[] iArr = this.f25047b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // e4.g0
        public g0 f() {
            return new a(0, new Random(this.f25046a.nextLong()));
        }

        @Override // e4.g0
        public int g() {
            int[] iArr = this.f25047b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // e4.g0
        public g0 h(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f25046a.nextInt(this.f25047b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f25046a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f25047b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f25047b;
                if (i12 < iArr4.length + i11) {
                    if (i15 < i11 && i16 == iArr[i15]) {
                        iArr3[i12] = iArr2[i15];
                        i15++;
                    } else {
                        int i17 = i16 + 1;
                        iArr3[i12] = iArr4[i16];
                        if (iArr3[i12] >= i10) {
                            iArr3[i12] = iArr3[i12] + i11;
                        }
                        i16 = i17;
                    }
                    i12++;
                } else {
                    return new a(iArr3, new Random(this.f25046a.nextLong()));
                }
            }
        }

        private a(int i10, Random random) {
            this(i(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f25047b = iArr;
            this.f25046a = random;
            this.f25048c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f25048c[iArr[i10]] = i10;
            }
        }
    }

    /* compiled from: ShuffleOrder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements g0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f25049a;

        public b(int i10) {
            this.f25049a = i10;
        }

        @Override // e4.g0
        public int a() {
            return this.f25049a;
        }

        @Override // e4.g0
        public g0 b(int i10, int i11) {
            return new b((this.f25049a - i11) + i10);
        }

        @Override // e4.g0
        public int c(int i10) {
            int i11 = i10 - 1;
            if (i11 >= 0) {
                return i11;
            }
            return -1;
        }

        @Override // e4.g0
        public int d(int i10) {
            int i11 = i10 + 1;
            if (i11 < this.f25049a) {
                return i11;
            }
            return -1;
        }

        @Override // e4.g0
        public int e() {
            int i10 = this.f25049a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        @Override // e4.g0
        public g0 f() {
            return new b(0);
        }

        @Override // e4.g0
        public int g() {
            return this.f25049a > 0 ? 0 : -1;
        }

        @Override // e4.g0
        public g0 h(int i10, int i11) {
            return new b(this.f25049a + i11);
        }
    }

    int a();

    g0 b(int i10, int i11);

    int c(int i10);

    int d(int i10);

    int e();

    g0 f();

    int g();

    g0 h(int i10, int i11);
}
