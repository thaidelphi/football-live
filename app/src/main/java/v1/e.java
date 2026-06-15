package v1;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.protobuf.CodedOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import v1.a;
/* compiled from: StandardGifDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements a {

    /* renamed from: u  reason: collision with root package name */
    private static final String f31715u = "e";

    /* renamed from: a  reason: collision with root package name */
    private int[] f31716a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f31717b;

    /* renamed from: c  reason: collision with root package name */
    private final a.InterfaceC0366a f31718c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f31719d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f31720e;

    /* renamed from: f  reason: collision with root package name */
    private short[] f31721f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f31722g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f31723h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f31724i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f31725j;

    /* renamed from: k  reason: collision with root package name */
    private int f31726k;

    /* renamed from: l  reason: collision with root package name */
    private c f31727l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f31728m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f31729n;

    /* renamed from: o  reason: collision with root package name */
    private int f31730o;

    /* renamed from: p  reason: collision with root package name */
    private int f31731p;

    /* renamed from: q  reason: collision with root package name */
    private int f31732q;

    /* renamed from: r  reason: collision with root package name */
    private int f31733r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f31734s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap.Config f31735t;

    public e(a.InterfaceC0366a interfaceC0366a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0366a);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f31731p + i10; i18++) {
            byte[] bArr = this.f31724i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f31716a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f31731p + i20; i21++) {
            byte[] bArr2 = this.f31724i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f31716a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f31725j;
        int i15 = bVar.f31690d;
        int i16 = this.f31731p;
        int i17 = i15 / i16;
        int i18 = bVar.f31688b / i16;
        int i19 = bVar.f31689c / i16;
        int i20 = bVar.f31687a / i16;
        boolean z10 = this.f31726k == 0;
        int i21 = this.f31733r;
        int i22 = this.f31732q;
        byte[] bArr = this.f31724i;
        int[] iArr2 = this.f31716a;
        Boolean bool = this.f31734s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i24 < i17) {
            Boolean bool2 = bool;
            if (bVar.f31691e) {
                if (i25 >= i17) {
                    i10 = i17;
                    int i27 = i26 + 1;
                    if (i27 == 2) {
                        i26 = i27;
                        i25 = 4;
                    } else if (i27 == 3) {
                        i26 = i27;
                        i23 = 4;
                        i25 = 2;
                    } else if (i27 != 4) {
                        i26 = i27;
                    } else {
                        i26 = i27;
                        i25 = 1;
                        i23 = 2;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i25 + i23;
            } else {
                i10 = i17;
                i11 = i25;
                i25 = i24;
            }
            int i28 = i25 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i24 * i16 * bVar.f31689c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 < i31) {
                            int i39 = i(i33, i37, bVar.f31689c);
                            if (i39 != 0) {
                                iArr[i38] = i39;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i33 += i16;
                            i38++;
                            i19 = i13;
                        }
                    }
                    bool = bool2;
                    i24++;
                    i18 = i14;
                    i19 = i13;
                    i17 = i10;
                    i25 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i24++;
            i18 = i14;
            i19 = i13;
            i17 = i10;
            i25 = i12;
        }
        Boolean bool3 = bool;
        if (this.f31734s == null) {
            this.f31734s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f31725j;
        int i10 = bVar2.f31690d;
        int i11 = bVar2.f31688b;
        int i12 = bVar2.f31689c;
        int i13 = bVar2.f31687a;
        boolean z10 = this.f31726k == 0;
        int i14 = this.f31733r;
        byte[] bArr = this.f31724i;
        int[] iArr2 = this.f31716a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f31689c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f31734s;
        this.f31734s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f31734s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void l(b bVar) {
        int i10;
        int i11;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f31719d.position(bVar.f31696j);
        }
        if (bVar == null) {
            c cVar = eVar.f31727l;
            i10 = cVar.f31703f;
            i11 = cVar.f31704g;
        } else {
            i10 = bVar.f31689c;
            i11 = bVar.f31690d;
        }
        int i12 = i10 * i11;
        byte[] bArr = eVar.f31724i;
        if (bArr == null || bArr.length < i12) {
            eVar.f31724i = eVar.f31718c.b(i12);
        }
        byte[] bArr2 = eVar.f31724i;
        if (eVar.f31721f == null) {
            eVar.f31721f = new short[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        }
        short[] sArr = eVar.f31721f;
        if (eVar.f31722g == null) {
            eVar.f31722g = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        }
        byte[] bArr3 = eVar.f31722g;
        if (eVar.f31723h == null) {
            eVar.f31723h = new byte[4097];
        }
        byte[] bArr4 = eVar.f31723h;
        int p10 = p();
        int i13 = 1 << p10;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = p10 + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = eVar.f31720e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (i23 == 0) {
                i23 = o();
                if (i23 <= 0) {
                    eVar.f31730o = 3;
                    break;
                }
                i24 = 0;
            }
            i26 += (bArr5[i24] & 255) << i25;
            i24++;
            i23--;
            int i31 = i25 + 8;
            int i32 = i21;
            int i33 = i20;
            int i34 = i30;
            int i35 = i16;
            int i36 = i28;
            while (true) {
                if (i31 < i33) {
                    i30 = i34;
                    i21 = i32;
                    i25 = i31;
                    eVar = this;
                    i28 = i36;
                    i16 = i35;
                    i20 = i33;
                    break;
                }
                int i37 = i15;
                int i38 = i26 & i22;
                i26 >>= i33;
                i31 -= i33;
                if (i38 == i13) {
                    i22 = i17;
                    i33 = i35;
                    i32 = i37;
                    i15 = i32;
                    i34 = -1;
                } else if (i38 == i14) {
                    i25 = i31;
                    i28 = i36;
                    i21 = i32;
                    i16 = i35;
                    i15 = i37;
                    i30 = i34;
                    i20 = i33;
                    eVar = this;
                    break;
                } else if (i34 == -1) {
                    bArr2[i27] = bArr3[i38];
                    i27++;
                    i18++;
                    i34 = i38;
                    i36 = i34;
                    i15 = i37;
                    i31 = i31;
                } else {
                    if (i38 >= i32) {
                        bArr4[i29] = (byte) i36;
                        i29++;
                        s10 = i34;
                    } else {
                        s10 = i38;
                    }
                    while (s10 >= i13) {
                        bArr4[i29] = bArr3[s10];
                        i29++;
                        s10 = sArr[s10];
                    }
                    i36 = bArr3[s10] & 255;
                    byte b10 = (byte) i36;
                    bArr2[i27] = b10;
                    while (true) {
                        i27++;
                        i18++;
                        if (i29 <= 0) {
                            break;
                        }
                        i29--;
                        bArr2[i27] = bArr4[i29];
                    }
                    byte[] bArr6 = bArr4;
                    if (i32 < 4096) {
                        sArr[i32] = (short) i34;
                        bArr3[i32] = b10;
                        i32++;
                        if ((i32 & i22) == 0 && i32 < 4096) {
                            i33++;
                            i22 += i32;
                        }
                    }
                    i34 = i38;
                    i15 = i37;
                    i31 = i31;
                    bArr4 = bArr6;
                }
            }
        }
        Arrays.fill(bArr2, i27, i12, (byte) 0);
    }

    private Bitmap n() {
        Boolean bool = this.f31734s;
        Bitmap c10 = this.f31718c.c(this.f31733r, this.f31732q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f31735t);
        c10.setHasAlpha(true);
        return c10;
    }

    private int o() {
        int p10 = p();
        if (p10 <= 0) {
            return p10;
        }
        ByteBuffer byteBuffer = this.f31719d;
        byteBuffer.get(this.f31720e, 0, Math.min(p10, byteBuffer.remaining()));
        return p10;
    }

    private int p() {
        return this.f31719d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f31725j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f31728m;
            if (bitmap2 != null) {
                this.f31718c.a(bitmap2);
            }
            this.f31728m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f31693g == 3 && this.f31728m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f31693g) > 0) {
            if (i11 == 2) {
                if (!bVar.f31692f) {
                    c cVar = this.f31727l;
                    int i13 = cVar.f31709l;
                    if (bVar.f31697k == null || cVar.f31707j != bVar.f31694h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f31690d;
                int i15 = this.f31731p;
                int i16 = i14 / i15;
                int i17 = bVar2.f31688b / i15;
                int i18 = bVar2.f31689c / i15;
                int i19 = bVar2.f31687a / i15;
                int i20 = this.f31733r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f31733r;
                }
            } else if (i11 == 3 && (bitmap = this.f31728m) != null) {
                int i25 = this.f31733r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f31732q);
            }
        }
        l(bVar);
        if (!bVar.f31691e && this.f31731p == 1) {
            k(bVar);
        } else {
            j(bVar);
        }
        if (this.f31729n && ((i10 = bVar.f31693g) == 0 || i10 == 1)) {
            if (this.f31728m == null) {
                this.f31728m = n();
            }
            Bitmap bitmap3 = this.f31728m;
            int i26 = this.f31733r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f31732q);
        }
        Bitmap n10 = n();
        int i27 = this.f31733r;
        n10.setPixels(iArr, 0, i27, 0, 0, i27, this.f31732q);
        return n10;
    }

    @Override // v1.a
    public synchronized Bitmap a() {
        if (this.f31727l.f31700c <= 0 || this.f31726k < 0) {
            String str = f31715u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f31727l.f31700c + ", framePointer=" + this.f31726k);
            }
            this.f31730o = 1;
        }
        int i10 = this.f31730o;
        if (i10 != 1 && i10 != 2) {
            this.f31730o = 0;
            if (this.f31720e == null) {
                this.f31720e = this.f31718c.b(255);
            }
            b bVar = this.f31727l.f31702e.get(this.f31726k);
            int i11 = this.f31726k - 1;
            b bVar2 = i11 >= 0 ? this.f31727l.f31702e.get(i11) : null;
            int[] iArr = bVar.f31697k;
            if (iArr == null) {
                iArr = this.f31727l.f31698a;
            }
            this.f31716a = iArr;
            if (iArr == null) {
                String str2 = f31715u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.f31726k);
                }
                this.f31730o = 1;
                return null;
            }
            if (bVar.f31692f) {
                System.arraycopy(iArr, 0, this.f31717b, 0, iArr.length);
                int[] iArr2 = this.f31717b;
                this.f31716a = iArr2;
                iArr2[bVar.f31694h] = 0;
                if (bVar.f31693g == 2 && this.f31726k == 0) {
                    this.f31734s = Boolean.TRUE;
                }
            }
            return r(bVar, bVar2);
        }
        String str3 = f31715u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f31730o);
        }
        return null;
    }

    @Override // v1.a
    public void b() {
        this.f31726k = (this.f31726k + 1) % this.f31727l.f31700c;
    }

    @Override // v1.a
    public int c() {
        return this.f31727l.f31700c;
    }

    @Override // v1.a
    public void clear() {
        this.f31727l = null;
        byte[] bArr = this.f31724i;
        if (bArr != null) {
            this.f31718c.e(bArr);
        }
        int[] iArr = this.f31725j;
        if (iArr != null) {
            this.f31718c.f(iArr);
        }
        Bitmap bitmap = this.f31728m;
        if (bitmap != null) {
            this.f31718c.a(bitmap);
        }
        this.f31728m = null;
        this.f31719d = null;
        this.f31734s = null;
        byte[] bArr2 = this.f31720e;
        if (bArr2 != null) {
            this.f31718c.e(bArr2);
        }
    }

    @Override // v1.a
    public void d(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f31735t = config;
    }

    @Override // v1.a
    public int e() {
        int i10;
        if (this.f31727l.f31700c <= 0 || (i10 = this.f31726k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // v1.a
    public void f() {
        this.f31726k = -1;
    }

    @Override // v1.a
    public int g() {
        return this.f31726k;
    }

    @Override // v1.a
    public ByteBuffer getData() {
        return this.f31719d;
    }

    @Override // v1.a
    public int h() {
        return this.f31719d.limit() + this.f31724i.length + (this.f31725j.length * 4);
    }

    public int m(int i10) {
        if (i10 >= 0) {
            c cVar = this.f31727l;
            if (i10 < cVar.f31700c) {
                return cVar.f31702e.get(i10).f31695i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            int highestOneBit = Integer.highestOneBit(i10);
            this.f31730o = 0;
            this.f31727l = cVar;
            this.f31726k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f31719d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f31719d.order(ByteOrder.LITTLE_ENDIAN);
            this.f31729n = false;
            Iterator<b> it = cVar.f31702e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f31693g == 3) {
                    this.f31729n = true;
                    break;
                }
            }
            this.f31731p = highestOneBit;
            int i11 = cVar.f31703f;
            this.f31733r = i11 / highestOneBit;
            int i12 = cVar.f31704g;
            this.f31732q = i12 / highestOneBit;
            this.f31724i = this.f31718c.b(i11 * i12);
            this.f31725j = this.f31718c.d(this.f31733r * this.f31732q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
    }

    public e(a.InterfaceC0366a interfaceC0366a) {
        this.f31717b = new int[256];
        this.f31735t = Bitmap.Config.ARGB_8888;
        this.f31718c = interfaceC0366a;
        this.f31727l = new c();
    }
}
