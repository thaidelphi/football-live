package t9;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.hm;
import com.ironsource.in;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import y9.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hpack.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final c[] f31095a;

    /* renamed from: b  reason: collision with root package name */
    static final Map<y9.f, Integer> f31096b;

    /* compiled from: Hpack.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f31097a;

        /* renamed from: b  reason: collision with root package name */
        private final y9.e f31098b;

        /* renamed from: c  reason: collision with root package name */
        private final int f31099c;

        /* renamed from: d  reason: collision with root package name */
        private int f31100d;

        /* renamed from: e  reason: collision with root package name */
        c[] f31101e;

        /* renamed from: f  reason: collision with root package name */
        int f31102f;

        /* renamed from: g  reason: collision with root package name */
        int f31103g;

        /* renamed from: h  reason: collision with root package name */
        int f31104h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f31100d;
            int i11 = this.f31104h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f31101e, (Object) null);
            this.f31102f = this.f31101e.length - 1;
            this.f31103g = 0;
            this.f31104h = 0;
        }

        private int c(int i10) {
            return this.f31102f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f31101e.length;
                while (true) {
                    length--;
                    i11 = this.f31102f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f31101e;
                    i10 -= cVarArr[length].f31094c;
                    this.f31104h -= cVarArr[length].f31094c;
                    this.f31103g--;
                    i12++;
                }
                c[] cVarArr2 = this.f31101e;
                System.arraycopy(cVarArr2, i11 + 1, cVarArr2, i11 + 1 + i12, this.f31103g);
                this.f31102f += i12;
            }
            return i12;
        }

        private y9.f f(int i10) throws IOException {
            if (h(i10)) {
                return d.f31095a[i10].f31092a;
            }
            int c10 = c(i10 - d.f31095a.length);
            if (c10 >= 0) {
                c[] cVarArr = this.f31101e;
                if (c10 < cVarArr.length) {
                    return cVarArr[c10].f31092a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10, c cVar) {
            this.f31097a.add(cVar);
            int i11 = cVar.f31094c;
            if (i10 != -1) {
                i11 -= this.f31101e[c(i10)].f31094c;
            }
            int i12 = this.f31100d;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f31104h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f31103g + 1;
                c[] cVarArr = this.f31101e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f31102f = this.f31101e.length - 1;
                    this.f31101e = cVarArr2;
                }
                int i14 = this.f31102f;
                this.f31102f = i14 - 1;
                this.f31101e[i14] = cVar;
                this.f31103g++;
            } else {
                this.f31101e[i10 + c(i10) + d10] = cVar;
            }
            this.f31104h += i11;
        }

        private boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f31095a.length - 1;
        }

        private int i() throws IOException {
            return this.f31098b.readByte() & 255;
        }

        private void l(int i10) throws IOException {
            if (h(i10)) {
                this.f31097a.add(d.f31095a[i10]);
                return;
            }
            int c10 = c(i10 - d.f31095a.length);
            if (c10 >= 0) {
                c[] cVarArr = this.f31101e;
                if (c10 < cVarArr.length) {
                    this.f31097a.add(cVarArr[c10]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void n(int i10) throws IOException {
            g(-1, new c(f(i10), j()));
        }

        private void o() throws IOException {
            g(-1, new c(d.a(j()), j()));
        }

        private void p(int i10) throws IOException {
            this.f31097a.add(new c(f(i10), j()));
        }

        private void q() throws IOException {
            this.f31097a.add(new c(d.a(j()), j()));
        }

        public List<c> e() {
            ArrayList arrayList = new ArrayList(this.f31097a);
            this.f31097a.clear();
            return arrayList;
        }

        y9.f j() throws IOException {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            int m7 = m(i10, 127);
            if (z10) {
                return y9.f.m(k.f().c(this.f31098b.N(m7)));
            }
            return this.f31098b.c0(m7);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k() throws IOException {
            while (!this.f31098b.i0()) {
                int readByte = this.f31098b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    l(m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    o();
                } else if ((readByte & 64) == 64) {
                    n(m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m7 = m(readByte, 31);
                    this.f31100d = m7;
                    if (m7 >= 0 && m7 <= this.f31099c) {
                        a();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f31100d);
                    }
                } else if (readByte != 16 && readByte != 0) {
                    p(m(readByte, 15) - 1);
                } else {
                    q();
                }
            }
        }

        int m(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        a(int i10, int i11, s sVar) {
            this.f31097a = new ArrayList();
            c[] cVarArr = new c[8];
            this.f31101e = cVarArr;
            this.f31102f = cVarArr.length - 1;
            this.f31103g = 0;
            this.f31104h = 0;
            this.f31099c = i10;
            this.f31100d = i11;
            this.f31098b = y9.l.d(sVar);
        }
    }

    /* compiled from: Hpack.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final y9.c f31105a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f31106b;

        /* renamed from: c  reason: collision with root package name */
        private int f31107c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f31108d;

        /* renamed from: e  reason: collision with root package name */
        int f31109e;

        /* renamed from: f  reason: collision with root package name */
        int f31110f;

        /* renamed from: g  reason: collision with root package name */
        c[] f31111g;

        /* renamed from: h  reason: collision with root package name */
        int f31112h;

        /* renamed from: i  reason: collision with root package name */
        int f31113i;

        /* renamed from: j  reason: collision with root package name */
        int f31114j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(y9.c cVar) {
            this(CodedOutputStream.DEFAULT_BUFFER_SIZE, true, cVar);
        }

        private void a() {
            int i10 = this.f31110f;
            int i11 = this.f31114j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f31111g, (Object) null);
            this.f31112h = this.f31111g.length - 1;
            this.f31113i = 0;
            this.f31114j = 0;
        }

        private int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f31111g.length;
                while (true) {
                    length--;
                    i11 = this.f31112h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f31111g;
                    i10 -= cVarArr[length].f31094c;
                    this.f31114j -= cVarArr[length].f31094c;
                    this.f31113i--;
                    i12++;
                }
                c[] cVarArr2 = this.f31111g;
                System.arraycopy(cVarArr2, i11 + 1, cVarArr2, i11 + 1 + i12, this.f31113i);
                c[] cVarArr3 = this.f31111g;
                int i13 = this.f31112h;
                Arrays.fill(cVarArr3, i13 + 1, i13 + 1 + i12, (Object) null);
                this.f31112h += i12;
            }
            return i12;
        }

        private void d(c cVar) {
            int i10 = cVar.f31094c;
            int i11 = this.f31110f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f31114j + i10) - i11);
            int i12 = this.f31113i + 1;
            c[] cVarArr = this.f31111g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f31112h = this.f31111g.length - 1;
                this.f31111g = cVarArr2;
            }
            int i13 = this.f31112h;
            this.f31112h = i13 - 1;
            this.f31111g[i13] = cVar;
            this.f31113i++;
            this.f31114j += i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(int i10) {
            this.f31109e = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f31110f;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f31107c = Math.min(this.f31107c, min);
            }
            this.f31108d = true;
            this.f31110f = min;
            a();
        }

        void f(y9.f fVar) throws IOException {
            if (this.f31106b && k.f().e(fVar) < fVar.r()) {
                y9.c cVar = new y9.c();
                k.f().d(fVar, cVar);
                y9.f J = cVar.J();
                h(J.r(), 127, 128);
                this.f31105a.y0(J);
                return;
            }
            h(fVar.r(), 127, 0);
            this.f31105a.y0(fVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(java.util.List<t9.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t9.d.b.g(java.util.List):void");
        }

        void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f31105a.j0(i10 | i12);
                return;
            }
            this.f31105a.j0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f31105a.j0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f31105a.j0(i13);
        }

        b(int i10, boolean z10, y9.c cVar) {
            this.f31107c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            c[] cVarArr = new c[8];
            this.f31111g = cVarArr;
            this.f31112h = cVarArr.length - 1;
            this.f31113i = 0;
            this.f31114j = 0;
            this.f31109e = i10;
            this.f31110f = i10;
            this.f31106b = z10;
            this.f31105a = cVar;
        }
    }

    static {
        y9.f fVar = c.f31088f;
        y9.f fVar2 = c.f31089g;
        y9.f fVar3 = c.f31090h;
        y9.f fVar4 = c.f31087e;
        f31095a = new c[]{new c(c.f31091i, ""), new c(fVar, in.f17848a), new c(fVar, in.f17849b), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, HttpRequest.DEFAULT_SCHEME), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c(IronSourceSegment.AGE, ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c(hm.f17686a, ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f31096b = b();
    }

    static y9.f a(y9.f fVar) throws IOException {
        int r10 = fVar.r();
        for (int i10 = 0; i10 < r10; i10++) {
            byte j10 = fVar.j(i10);
            if (j10 >= 65 && j10 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.w());
            }
        }
        return fVar;
    }

    private static Map<y9.f, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f31095a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f31095a;
            if (i10 < cVarArr.length) {
                if (!linkedHashMap.containsKey(cVarArr[i10].f31092a)) {
                    linkedHashMap.put(cVarArr[i10].f31092a, Integer.valueOf(i10));
                }
                i10++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
