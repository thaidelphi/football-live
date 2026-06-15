package v1;

import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: GifHeaderParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f31712b;

    /* renamed from: c  reason: collision with root package name */
    private c f31713c;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f31711a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    private int f31714d = 0;

    private boolean b() {
        return this.f31713c.f31699b != 0;
    }

    private int d() {
        try {
            return this.f31712b.get() & 255;
        } catch (Exception unused) {
            this.f31713c.f31699b = 1;
            return 0;
        }
    }

    private void e() {
        this.f31713c.f31701d.f31687a = n();
        this.f31713c.f31701d.f31688b = n();
        this.f31713c.f31701d.f31689c = n();
        this.f31713c.f31701d.f31690d = n();
        int d10 = d();
        boolean z10 = (d10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d10 & 7) + 1);
        b bVar = this.f31713c.f31701d;
        bVar.f31691e = (d10 & 64) != 0;
        if (z10) {
            bVar.f31697k = g(pow);
        } else {
            bVar.f31697k = null;
        }
        this.f31713c.f31701d.f31696j = this.f31712b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f31713c;
        cVar.f31700c++;
        cVar.f31702e.add(cVar.f31701d);
    }

    private void f() {
        int d10 = d();
        this.f31714d = d10;
        if (d10 <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f31714d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f31712b.get(this.f31711a, i10, i11);
                i10 += i11;
            } catch (Exception e8) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f31714d, e8);
                }
                this.f31713c.f31699b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f31712b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e8) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e8);
            }
            this.f31713c.f31699b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f31713c.f31700c <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 == 1) {
                    q();
                } else if (d11 == 249) {
                    this.f31713c.f31701d = new b();
                    j();
                } else if (d11 == 254) {
                    q();
                } else if (d11 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb.append((char) this.f31711a[i11]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d10 == 44) {
                c cVar = this.f31713c;
                if (cVar.f31701d == null) {
                    cVar.f31701d = new b();
                }
                e();
            } else if (d10 != 59) {
                this.f31713c.f31699b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int d10 = d();
        b bVar = this.f31713c.f31701d;
        int i10 = (d10 & 28) >> 2;
        bVar.f31693g = i10;
        if (i10 == 0) {
            bVar.f31693g = 1;
        }
        bVar.f31692f = (d10 & 1) != 0;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        b bVar2 = this.f31713c.f31701d;
        bVar2.f31695i = n10 * 10;
        bVar2.f31694h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f31713c.f31699b = 1;
            return;
        }
        l();
        if (!this.f31713c.f31705h || b()) {
            return;
        }
        c cVar = this.f31713c;
        cVar.f31698a = g(cVar.f31706i);
        c cVar2 = this.f31713c;
        cVar2.f31709l = cVar2.f31698a[cVar2.f31707j];
    }

    private void l() {
        this.f31713c.f31703f = n();
        this.f31713c.f31704g = n();
        int d10 = d();
        c cVar = this.f31713c;
        cVar.f31705h = (d10 & 128) != 0;
        cVar.f31706i = (int) Math.pow(2.0d, (d10 & 7) + 1);
        this.f31713c.f31707j = d();
        this.f31713c.f31708k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f31711a;
            if (bArr[0] == 1) {
                this.f31713c.f31710m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f31714d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f31712b.getShort();
    }

    private void o() {
        this.f31712b = null;
        Arrays.fill(this.f31711a, (byte) 0);
        this.f31713c = new c();
        this.f31714d = 0;
    }

    private void q() {
        int d10;
        do {
            d10 = d();
            this.f31712b.position(Math.min(this.f31712b.position() + d10, this.f31712b.limit()));
        } while (d10 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f31712b = null;
        this.f31713c = null;
    }

    public c c() {
        if (this.f31712b != null) {
            if (b()) {
                return this.f31713c;
            }
            k();
            if (!b()) {
                h();
                c cVar = this.f31713c;
                if (cVar.f31700c < 0) {
                    cVar.f31699b = 1;
                }
            }
            return this.f31713c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f31712b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f31712b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
