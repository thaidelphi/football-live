package j4;

import a5.c0;
import a5.l0;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.h2;
import n3.m1;
import s3.q;
import s3.t;
/* compiled from: WebvttExtractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s implements s3.i {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f27064g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f27065h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f27066a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f27067b;

    /* renamed from: d  reason: collision with root package name */
    private s3.k f27069d;

    /* renamed from: f  reason: collision with root package name */
    private int f27071f;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f27068c = new c0();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f27070e = new byte[1024];

    public s(String str, l0 l0Var) {
        this.f27066a = str;
        this.f27067b = l0Var;
    }

    private t e(long j10) {
        t f10 = this.f27069d.f(0, 3);
        f10.a(new m1.b().e0("text/vtt").V(this.f27066a).i0(j10).E());
        this.f27069d.q();
        return f10;
    }

    private void f() throws h2 {
        c0 c0Var = new c0(this.f27070e);
        w4.i.e(c0Var);
        long j10 = 0;
        long j11 = 0;
        for (String o10 = c0Var.o(); !TextUtils.isEmpty(o10); o10 = c0Var.o()) {
            if (o10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f27064g.matcher(o10);
                if (!matcher.find()) {
                    throw h2.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + o10, null);
                }
                Matcher matcher2 = f27065h.matcher(o10);
                if (!matcher2.find()) {
                    throw h2.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + o10, null);
                }
                j11 = w4.i.d((String) a5.a.e(matcher.group(1)));
                j10 = l0.f(Long.parseLong((String) a5.a.e(matcher2.group(1))));
            }
        }
        Matcher a10 = w4.i.a(c0Var);
        if (a10 == null) {
            e(0L);
            return;
        }
        long d10 = w4.i.d((String) a5.a.e(a10.group(1)));
        long b10 = this.f27067b.b(l0.j((j10 + d10) - j11));
        t e8 = e(b10 - d10);
        this.f27068c.I(this.f27070e, this.f27071f);
        e8.d(this.f27068c, this.f27071f);
        e8.e(b10, 1, this.f27071f, 0, null);
    }

    @Override // s3.i
    public int a(s3.j jVar, s3.p pVar) throws IOException {
        a5.a.e(this.f27069d);
        int a10 = (int) jVar.a();
        int i10 = this.f27071f;
        byte[] bArr = this.f27070e;
        if (i10 == bArr.length) {
            this.f27070e = Arrays.copyOf(bArr, ((a10 != -1 ? a10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f27070e;
        int i11 = this.f27071f;
        int b10 = jVar.b(bArr2, i11, bArr2.length - i11);
        if (b10 != -1) {
            int i12 = this.f27071f + b10;
            this.f27071f = i12;
            if (a10 == -1 || i12 != a10) {
                return 0;
            }
        }
        f();
        return -1;
    }

    @Override // s3.i
    public void b(s3.k kVar) {
        this.f27069d = kVar;
        kVar.o(new q.b(-9223372036854775807L));
    }

    @Override // s3.i
    public boolean c(s3.j jVar) throws IOException {
        jVar.c(this.f27070e, 0, 6, false);
        this.f27068c.I(this.f27070e, 6);
        if (w4.i.b(this.f27068c)) {
            return true;
        }
        jVar.c(this.f27070e, 6, 3, false);
        this.f27068c.I(this.f27070e, 9);
        return w4.i.b(this.f27068c);
    }

    @Override // s3.i
    public void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // s3.i
    public void release() {
    }
}
