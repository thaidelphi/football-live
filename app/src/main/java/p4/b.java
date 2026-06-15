package p4;

import a5.b0;
import a5.p0;
import a5.t;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.b;
/* compiled from: DvbParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f29846h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f29847i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f29848j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f29849a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f29850b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f29851c;

    /* renamed from: d  reason: collision with root package name */
    private final C0336b f29852d;

    /* renamed from: e  reason: collision with root package name */
    private final a f29853e;

    /* renamed from: f  reason: collision with root package name */
    private final h f29854f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f29855g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29856a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f29857b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f29858c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f29859d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f29856a = i10;
            this.f29857b = iArr;
            this.f29858c = iArr2;
            this.f29859d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* renamed from: p4.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0336b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29860a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29861b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29862c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29863d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29864e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29865f;

        public C0336b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f29860a = i10;
            this.f29861b = i11;
            this.f29862c = i12;
            this.f29863d = i13;
            this.f29864e = i14;
            this.f29865f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f29866a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29867b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f29868c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f29869d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f29866a = i10;
            this.f29867b = z10;
            this.f29868c = bArr;
            this.f29869d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f29870a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29871b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29872c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<e> f29873d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f29870a = i10;
            this.f29871b = i11;
            this.f29872c = i12;
            this.f29873d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f29874a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29875b;

        public e(int i10, int i11) {
            this.f29874a = i10;
            this.f29875b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f29876a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29877b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29878c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29879d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29880e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29881f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29882g;

        /* renamed from: h  reason: collision with root package name */
        public final int f29883h;

        /* renamed from: i  reason: collision with root package name */
        public final int f29884i;

        /* renamed from: j  reason: collision with root package name */
        public final int f29885j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray<g> f29886k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f29876a = i10;
            this.f29877b = z10;
            this.f29878c = i11;
            this.f29879d = i12;
            this.f29880e = i13;
            this.f29881f = i14;
            this.f29882g = i15;
            this.f29883h = i16;
            this.f29884i = i17;
            this.f29885j = i18;
            this.f29886k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f29886k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f29886k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f29887a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29888b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29889c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29890d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29891e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29892f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f29887a = i10;
            this.f29888b = i11;
            this.f29889c = i12;
            this.f29890d = i13;
            this.f29891e = i14;
            this.f29892f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DvbParser.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f29893a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29894b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f29895c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f29896d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f29897e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f29898f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f29899g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0336b f29900h;

        /* renamed from: i  reason: collision with root package name */
        public d f29901i;

        public h(int i10, int i11) {
            this.f29893a = i10;
            this.f29894b = i11;
        }

        public void a() {
            this.f29895c.clear();
            this.f29896d.clear();
            this.f29897e.clear();
            this.f29898f.clear();
            this.f29899g.clear();
            this.f29900h = null;
            this.f29901i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f29849a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f29850b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f29851c = new Canvas();
        this.f29852d = new C0336b(719, 575, 0, 719, 0, 575);
        this.f29853e = new a(0, c(), d(), e());
        this.f29854f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, b0 b0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) b0Var.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int g(b0 b0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int h10;
        int h11;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            byte h12 = b0Var.h(2);
            if (h12 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (b0Var.g()) {
                    h10 = b0Var.h(3) + 3;
                    h11 = b0Var.h(2);
                } else {
                    if (b0Var.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int h13 = b0Var.h(2);
                        if (h13 == 0) {
                            z10 = true;
                        } else if (h13 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (h13 == 2) {
                            h10 = b0Var.h(4) + 12;
                            h11 = b0Var.h(2);
                        } else if (h13 != 3) {
                            z10 = z11;
                        } else {
                            h10 = b0Var.h(8) + 29;
                            h11 = b0Var.h(2);
                        }
                        h12 = 0;
                        i12 = 0;
                    }
                    h12 = 0;
                }
                z10 = z11;
                i12 = h10;
                h12 = h11;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    h12 = bArr[h12];
                }
                paint.setColor(iArr[h12]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int h(b0 b0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int h10;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            byte h11 = b0Var.h(4);
            int i14 = 2;
            if (h11 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (!b0Var.g()) {
                int h12 = b0Var.h(3);
                if (h12 != 0) {
                    i14 = h12 + 2;
                    z10 = z11;
                    i12 = i14;
                    h11 = 0;
                } else {
                    z10 = true;
                    h11 = 0;
                    i12 = 0;
                }
            } else {
                if (!b0Var.g()) {
                    h10 = b0Var.h(2) + 4;
                    h11 = b0Var.h(4);
                } else {
                    int h13 = b0Var.h(2);
                    if (h13 != 0) {
                        if (h13 != 1) {
                            if (h13 == 2) {
                                h10 = b0Var.h(4) + 9;
                                h11 = b0Var.h(4);
                            } else if (h13 != 3) {
                                z10 = z11;
                                h11 = 0;
                                i12 = 0;
                            } else {
                                h10 = b0Var.h(8) + 25;
                                h11 = b0Var.h(4);
                            }
                        }
                        z10 = z11;
                        i12 = i14;
                        h11 = 0;
                    } else {
                        z10 = z11;
                        i12 = 1;
                        h11 = 0;
                    }
                }
                z10 = z11;
                i12 = h10;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int i(b0 b0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int h10;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            byte h11 = b0Var.h(8);
            if (h11 != 0) {
                z10 = z11;
                h10 = 1;
            } else if (!b0Var.g()) {
                int h12 = b0Var.h(7);
                if (h12 != 0) {
                    z10 = z11;
                    h10 = h12;
                    h11 = 0;
                } else {
                    z10 = true;
                    h11 = 0;
                    h10 = 0;
                }
            } else {
                z10 = z11;
                h10 = b0Var.h(7);
                h11 = b0Var.h(8);
            }
            if (h10 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i12, i11, i12 + h10, i11 + 1, paint);
            }
            i12 += h10;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        b0 b0Var = new b0(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (b0Var.b() != 0) {
            int h10 = b0Var.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i10 == 3) {
                            bArr3 = bArr5 == null ? f29847i : bArr5;
                        } else if (i10 == 2) {
                            bArr3 = bArr7 == null ? f29846h : bArr7;
                        } else {
                            bArr2 = null;
                            i13 = g(b0Var, iArr, bArr2, i13, i14, paint, canvas);
                            b0Var.c();
                            continue;
                        }
                        bArr2 = bArr3;
                        i13 = g(b0Var, iArr, bArr2, i13, i14, paint, canvas);
                        b0Var.c();
                        continue;
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f29848j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = h(b0Var, iArr, bArr4, i13, i14, paint, canvas);
                        b0Var.c();
                        continue;
                    case 18:
                        i13 = i(b0Var, iArr, null, i13, i14, paint, canvas);
                        continue;
                    default:
                        switch (h10) {
                            case 32:
                                bArr7 = a(4, 4, b0Var);
                                continue;
                            case 33:
                                bArr5 = a(4, 8, b0Var);
                                continue;
                            case 34:
                                bArr6 = a(16, 8, b0Var);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f29859d;
        } else if (i10 == 2) {
            iArr = aVar.f29858c;
        } else {
            iArr = aVar.f29857b;
        }
        int[] iArr2 = iArr;
        j(cVar.f29868c, iArr2, i10, i11, i12, paint, canvas);
        j(cVar.f29869d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static a l(b0 b0Var, int i10) {
        int h10;
        int i11;
        int h11;
        int h12;
        int i12;
        int i13 = 8;
        int h13 = b0Var.h(8);
        b0Var.q(8);
        int i14 = 2;
        int i15 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e8 = e();
        while (i15 > 0) {
            int h14 = b0Var.h(i13);
            int h15 = b0Var.h(i13);
            int i16 = i15 - 2;
            int[] iArr = (h15 & 128) != 0 ? c10 : (h15 & 64) != 0 ? d10 : e8;
            if ((h15 & 1) != 0) {
                h12 = b0Var.h(i13);
                i12 = b0Var.h(i13);
                h10 = b0Var.h(i13);
                h11 = b0Var.h(i13);
                i11 = i16 - 4;
            } else {
                int h16 = b0Var.h(4) << 4;
                h10 = b0Var.h(4) << 4;
                i11 = i16 - 2;
                h11 = b0Var.h(i14) << 6;
                h12 = b0Var.h(6) << i14;
                i12 = h16;
            }
            if (h12 == 0) {
                h11 = 255;
                i12 = 0;
                h10 = 0;
            }
            double d11 = h12;
            double d12 = i12 - 128;
            double d13 = h10 - 128;
            iArr[h14] = f((byte) (255 - (h11 & 255)), p0.q((int) (d11 + (1.402d * d12)), 0, 255), p0.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), p0.q((int) (d11 + (d13 * 1.772d)), 0, 255));
            i15 = i11;
            h13 = h13;
            i13 = 8;
            i14 = 2;
        }
        return new a(h13, c10, d10, e8);
    }

    private static C0336b m(b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        b0Var.q(4);
        boolean g10 = b0Var.g();
        b0Var.q(3);
        int h10 = b0Var.h(16);
        int h11 = b0Var.h(16);
        if (g10) {
            int h12 = b0Var.h(16);
            int h13 = b0Var.h(16);
            int h14 = b0Var.h(16);
            i13 = b0Var.h(16);
            i12 = h13;
            i11 = h14;
            i10 = h12;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = h10;
            i13 = h11;
        }
        return new C0336b(h10, h11, i10, i12, i11, i13);
    }

    private static c n(b0 b0Var) {
        byte[] bArr;
        int h10 = b0Var.h(16);
        b0Var.q(4);
        int h11 = b0Var.h(2);
        boolean g10 = b0Var.g();
        b0Var.q(1);
        byte[] bArr2 = p0.f487f;
        if (h11 == 1) {
            b0Var.q(b0Var.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = b0Var.h(16);
            int h13 = b0Var.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                b0Var.j(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                b0Var.j(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d o(b0 b0Var, int i10) {
        int h10 = b0Var.h(8);
        int h11 = b0Var.h(4);
        int h12 = b0Var.h(2);
        b0Var.q(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = b0Var.h(8);
            b0Var.q(8);
            i11 -= 6;
            sparseArray.put(h13, new e(b0Var.h(16), b0Var.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f p(b0 b0Var, int i10) {
        int h10;
        int h11;
        int h12 = b0Var.h(8);
        b0Var.q(4);
        boolean g10 = b0Var.g();
        b0Var.q(3);
        int i11 = 16;
        int h13 = b0Var.h(16);
        int h14 = b0Var.h(16);
        int h15 = b0Var.h(3);
        int h16 = b0Var.h(3);
        int i12 = 2;
        b0Var.q(2);
        int h17 = b0Var.h(8);
        int h18 = b0Var.h(8);
        int h19 = b0Var.h(4);
        int h20 = b0Var.h(2);
        b0Var.q(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int h21 = b0Var.h(i11);
            int h22 = b0Var.h(i12);
            int h23 = b0Var.h(i12);
            int h24 = b0Var.h(12);
            int i14 = h20;
            b0Var.q(4);
            int h25 = b0Var.h(12);
            i13 -= 6;
            if (h22 == 1 || h22 == 2) {
                i13 -= 2;
                h10 = b0Var.h(8);
                h11 = b0Var.h(8);
            } else {
                h10 = 0;
                h11 = 0;
            }
            sparseArray.put(h21, new g(h22, h23, h24, h25, h10, h11));
            h20 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(h12, g10, h13, h14, h15, h16, h17, h18, h19, h20, sparseArray);
    }

    private static void q(b0 b0Var, h hVar) {
        f fVar;
        int h10 = b0Var.h(8);
        int h11 = b0Var.h(16);
        int h12 = b0Var.h(16);
        int d10 = b0Var.d() + h12;
        if (h12 * 8 > b0Var.b()) {
            t.i("DvbParser", "Data field length exceeds limit");
            b0Var.q(b0Var.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f29893a) {
                    d dVar = hVar.f29901i;
                    d o10 = o(b0Var, h12);
                    if (o10.f29872c != 0) {
                        hVar.f29901i = o10;
                        hVar.f29895c.clear();
                        hVar.f29896d.clear();
                        hVar.f29897e.clear();
                        break;
                    } else if (dVar != null && dVar.f29871b != o10.f29871b) {
                        hVar.f29901i = o10;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f29901i;
                if (h11 == hVar.f29893a && dVar2 != null) {
                    f p10 = p(b0Var, h12);
                    if (dVar2.f29872c == 0 && (fVar = hVar.f29895c.get(p10.f29876a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f29895c.put(p10.f29876a, p10);
                    break;
                }
                break;
            case 18:
                if (h11 == hVar.f29893a) {
                    a l10 = l(b0Var, h12);
                    hVar.f29896d.put(l10.f29856a, l10);
                    break;
                } else if (h11 == hVar.f29894b) {
                    a l11 = l(b0Var, h12);
                    hVar.f29898f.put(l11.f29856a, l11);
                    break;
                }
                break;
            case 19:
                if (h11 == hVar.f29893a) {
                    c n10 = n(b0Var);
                    hVar.f29897e.put(n10.f29866a, n10);
                    break;
                } else if (h11 == hVar.f29894b) {
                    c n11 = n(b0Var);
                    hVar.f29899g.put(n11.f29866a, n11);
                    break;
                }
                break;
            case 20:
                if (h11 == hVar.f29893a) {
                    hVar.f29900h = m(b0Var);
                    break;
                }
                break;
        }
        b0Var.r(d10 - b0Var.d());
    }

    public List<n4.b> b(byte[] bArr, int i10) {
        int i11;
        int i12;
        SparseArray<g> sparseArray;
        b0 b0Var = new b0(bArr, i10);
        while (b0Var.b() >= 48 && b0Var.h(8) == 15) {
            q(b0Var, this.f29854f);
        }
        h hVar = this.f29854f;
        d dVar = hVar.f29901i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0336b c0336b = hVar.f29900h;
        if (c0336b == null) {
            c0336b = this.f29852d;
        }
        Bitmap bitmap = this.f29855g;
        if (bitmap == null || c0336b.f29860a + 1 != bitmap.getWidth() || c0336b.f29861b + 1 != this.f29855g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0336b.f29860a + 1, c0336b.f29861b + 1, Bitmap.Config.ARGB_8888);
            this.f29855g = createBitmap;
            this.f29851c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f29873d;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f29851c.save();
            e valueAt = sparseArray2.valueAt(i13);
            f fVar = this.f29854f.f29895c.get(sparseArray2.keyAt(i13));
            int i14 = valueAt.f29874a + c0336b.f29862c;
            int i15 = valueAt.f29875b + c0336b.f29864e;
            this.f29851c.clipRect(i14, i15, Math.min(fVar.f29878c + i14, c0336b.f29863d), Math.min(fVar.f29879d + i15, c0336b.f29865f));
            a aVar = this.f29854f.f29896d.get(fVar.f29882g);
            if (aVar == null && (aVar = this.f29854f.f29898f.get(fVar.f29882g)) == null) {
                aVar = this.f29853e;
            }
            SparseArray<g> sparseArray3 = fVar.f29886k;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g valueAt2 = sparseArray3.valueAt(i16);
                c cVar = this.f29854f.f29897e.get(keyAt);
                c cVar2 = cVar == null ? this.f29854f.f29899g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i12 = i16;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f29881f, valueAt2.f29889c + i14, i15 + valueAt2.f29890d, cVar2.f29867b ? null : this.f29849a, this.f29851c);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f29877b) {
                int i17 = fVar.f29881f;
                if (i17 == 3) {
                    i11 = aVar.f29859d[fVar.f29883h];
                } else if (i17 == 2) {
                    i11 = aVar.f29858c[fVar.f29884i];
                } else {
                    i11 = aVar.f29857b[fVar.f29885j];
                }
                this.f29850b.setColor(i11);
                this.f29851c.drawRect(i14, i15, fVar.f29878c + i14, fVar.f29879d + i15, this.f29850b);
            }
            arrayList.add(new b.C0322b().f(Bitmap.createBitmap(this.f29855g, i14, i15, fVar.f29878c, fVar.f29879d)).k(i14 / c0336b.f29860a).l(0).h(i15 / c0336b.f29861b, 0).i(0).n(fVar.f29878c / c0336b.f29860a).g(fVar.f29879d / c0336b.f29861b).a());
            this.f29851c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f29851c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f29854f.a();
    }
}
