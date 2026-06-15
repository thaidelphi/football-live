package n9;

import com.ironsource.cc;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: HttpUrl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class s {

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f28913j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    final String f28914a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28915b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28916c;

    /* renamed from: d  reason: collision with root package name */
    final String f28917d;

    /* renamed from: e  reason: collision with root package name */
    final int f28918e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f28919f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f28920g;

    /* renamed from: h  reason: collision with root package name */
    private final String f28921h;

    /* renamed from: i  reason: collision with root package name */
    private final String f28922i;

    /* compiled from: HttpUrl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f28923a;

        /* renamed from: d  reason: collision with root package name */
        String f28926d;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f28928f;

        /* renamed from: g  reason: collision with root package name */
        List<String> f28929g;

        /* renamed from: h  reason: collision with root package name */
        String f28930h;

        /* renamed from: b  reason: collision with root package name */
        String f28924b = "";

        /* renamed from: c  reason: collision with root package name */
        String f28925c = "";

        /* renamed from: e  reason: collision with root package name */
        int f28927e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f28928f = arrayList;
            arrayList.add("");
        }

        private static String b(String str, int i10, int i11) {
            return o9.c.d(s.r(str, i10, i11, false));
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int i(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void k() {
            List<String> list = this.f28928f;
            if (list.remove(list.size() - 1).isEmpty() && !this.f28928f.isEmpty()) {
                List<String> list2 = this.f28928f;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.f28928f.add("");
        }

        private static int m(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private void n(String str, int i10, int i11, boolean z10, boolean z11) {
            String a10 = s.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (f(a10)) {
                return;
            }
            if (g(a10)) {
                k();
                return;
            }
            List<String> list = this.f28928f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f28928f;
                list2.set(list2.size() - 1, a10);
            } else {
                this.f28928f.add(a10);
            }
            if (z10) {
                this.f28928f.add("");
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void p(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f28928f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f28928f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f28928f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = o9.c.o(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.n(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n9.s.a.p(java.lang.String, int, int):void");
        }

        private static int r(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int s(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public s a() {
            if (this.f28923a != null) {
                if (this.f28926d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int c() {
            int i10 = this.f28927e;
            return i10 != -1 ? i10 : s.d(this.f28923a);
        }

        public a d(String str) {
            this.f28929g = str != null ? s.y(s.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a e(String str) {
            Objects.requireNonNull(str, "host == null");
            String b10 = b(str, 0, str.length());
            if (b10 != null) {
                this.f28926d = b10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        a h(s sVar, String str) {
            int r10;
            int o10;
            int i10;
            int E = o9.c.E(str, 0, str.length());
            int F = o9.c.F(str, E, str.length());
            if (r(str, E, F) != -1) {
                if (str.regionMatches(true, E, "https:", 0, 6)) {
                    this.f28923a = HttpRequest.DEFAULT_SCHEME;
                    E += 6;
                } else if (str.regionMatches(true, E, "http:", 0, 5)) {
                    this.f28923a = "http";
                    E += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, r10) + "'");
                }
            } else if (sVar != null) {
                this.f28923a = sVar.f28914a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int s10 = s(str, E, F);
            char c10 = '?';
            char c11 = '#';
            if (s10 < 2 && sVar != null && sVar.f28914a.equals(this.f28923a)) {
                this.f28924b = sVar.j();
                this.f28925c = sVar.f();
                this.f28926d = sVar.f28917d;
                this.f28927e = sVar.f28918e;
                this.f28928f.clear();
                this.f28928f.addAll(sVar.h());
                if (E == F || str.charAt(E) == '#') {
                    d(sVar.i());
                }
            } else {
                boolean z10 = false;
                boolean z11 = false;
                int i11 = E + s10;
                while (true) {
                    o10 = o9.c.o(str, i11, F, "@/\\?#");
                    char charAt = o10 != F ? str.charAt(o10) : (char) 65535;
                    if (charAt == 65535 || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z10) {
                            int n10 = o9.c.n(str, i11, o10, ':');
                            i10 = o10;
                            String a10 = s.a(str, i11, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                a10 = this.f28924b + "%40" + a10;
                            }
                            this.f28924b = a10;
                            if (n10 != i10) {
                                this.f28925c = s.a(str, n10 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        } else {
                            i10 = o10;
                            this.f28925c += "%40" + s.a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i11 = i10 + 1;
                    }
                    c10 = '?';
                    c11 = '#';
                }
                int m7 = m(str, i11, o10);
                int i12 = m7 + 1;
                if (i12 < o10) {
                    this.f28926d = b(str, i11, m7);
                    int i13 = i(str, i12, o10);
                    this.f28927e = i13;
                    if (i13 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i12, o10) + '\"');
                    }
                } else {
                    this.f28926d = b(str, i11, m7);
                    this.f28927e = s.d(this.f28923a);
                }
                if (this.f28926d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i11, m7) + '\"');
                }
                E = o10;
            }
            int o11 = o9.c.o(str, E, F, "?#");
            p(str, E, o11);
            if (o11 < F && str.charAt(o11) == '?') {
                int n11 = o9.c.n(str, o11, F, '#');
                this.f28929g = s.y(s.a(str, o11 + 1, n11, " \"'<>#", true, false, true, true, null));
                o11 = n11;
            }
            if (o11 < F && str.charAt(o11) == '#') {
                this.f28930h = s.a(str, 1 + o11, F, "", true, false, false, false, null);
            }
            return this;
        }

        public a j(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f28925c = s.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a l(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f28927e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        a o() {
            int size = this.f28928f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f28928f.set(i10, s.b(this.f28928f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f28929g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f28929g.get(i11);
                    if (str != null) {
                        this.f28929g.set(i11, s.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f28930h;
            if (str2 != null) {
                this.f28930h = s.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a q(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.f28923a = "http";
            } else if (str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                this.f28923a = HttpRequest.DEFAULT_SCHEME;
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public a t(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f28924b = s.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f28923a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f28924b.isEmpty() || !this.f28925c.isEmpty()) {
                sb.append(this.f28924b);
                if (!this.f28925c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f28925c);
                }
                sb.append('@');
            }
            String str2 = this.f28926d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f28926d);
                    sb.append(']');
                } else {
                    sb.append(this.f28926d);
                }
            }
            if (this.f28927e != -1 || this.f28923a != null) {
                int c10 = c();
                String str3 = this.f28923a;
                if (str3 == null || c10 != s.d(str3)) {
                    sb.append(':');
                    sb.append(c10);
                }
            }
            s.q(sb, this.f28928f);
            if (this.f28929g != null) {
                sb.append('?');
                s.n(sb, this.f28929g);
            }
            if (this.f28930h != null) {
                sb.append('#');
                sb.append(this.f28930h);
            }
            return sb.toString();
        }
    }

    s(a aVar) {
        this.f28914a = aVar.f28923a;
        this.f28915b = s(aVar.f28924b, false);
        this.f28916c = s(aVar.f28925c, false);
        this.f28917d = aVar.f28926d;
        this.f28918e = aVar.c();
        this.f28919f = t(aVar.f28928f, false);
        List<String> list = aVar.f28929g;
        this.f28920g = list != null ? t(list, true) : null;
        String str = aVar.f28930h;
        this.f28921h = str != null ? s(str, false) : null;
        this.f28922i = aVar.toString();
    }

    static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z13)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || v(str, i12, i11)))) && (codePointAt != 43 || !z12))) {
                    i12 += Character.charCount(codePointAt);
                }
            }
            y9.c cVar = new y9.c();
            cVar.N0(str, i10, i12);
            c(cVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return cVar.L();
        }
        return str.substring(i10, i11);
    }

    static String b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }

    static void c(y9.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        y9.c cVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z12) {
                    cVar.B(z10 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z13) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z10 && (!z11 || v(str, i10, i11)))))) {
                    cVar.O0(codePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new y9.c();
                    }
                    if (charset != null && !charset.equals(o9.c.f29481j)) {
                        cVar2.L0(str, i10, Character.charCount(codePointAt) + i10, charset);
                    } else {
                        cVar2.O0(codePointAt);
                    }
                    while (!cVar2.i0()) {
                        int readByte = cVar2.readByte() & 255;
                        cVar.j0(37);
                        char[] cArr = f28913j;
                        cVar.j0(cArr[(readByte >> 4) & 15]);
                        cVar.j0(cArr[readByte & 15]);
                    }
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static s k(String str) {
        return new a().h(null, str).a();
    }

    static void n(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(cc.T);
                sb.append(str2);
            }
        }
    }

    static void q(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append('/');
            sb.append(list.get(i10));
        }
    }

    static String r(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                y9.c cVar = new y9.c();
                cVar.N0(str, i10, i12);
                u(cVar, str, i12, i11, z10);
                return cVar.L();
            }
        }
        return str.substring(i10, i11);
    }

    static String s(String str, boolean z10) {
        return r(str, 0, str.length(), z10);
    }

    private List<String> t(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? s(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void u(y9.c cVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int k10 = o9.c.k(str.charAt(i10 + 1));
                int k11 = o9.c.k(str.charAt(i12));
                if (k10 != -1 && k11 != -1) {
                    cVar.j0((k10 << 4) + k11);
                    i10 = i12;
                }
                cVar.O0(codePointAt);
            } else {
                if (codePointAt == 43 && z10) {
                    cVar.j0(32);
                }
                cVar.O0(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    static boolean v(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && o9.c.k(str.charAt(i10 + 1)) != -1 && o9.c.k(str.charAt(i12)) != -1;
    }

    static List<String> y(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add(null);
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public s A(String str) {
        a p10 = p(str);
        if (p10 != null) {
            return p10.a();
        }
        return null;
    }

    public String B() {
        return this.f28914a;
    }

    public URI C() {
        String aVar = o().o().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e8) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public String e() {
        if (this.f28921h == null) {
            return null;
        }
        return this.f28922i.substring(this.f28922i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f28922i.equals(this.f28922i);
    }

    public String f() {
        if (this.f28916c.isEmpty()) {
            return "";
        }
        int indexOf = this.f28922i.indexOf(64);
        return this.f28922i.substring(this.f28922i.indexOf(58, this.f28914a.length() + 3) + 1, indexOf);
    }

    public String g() {
        int indexOf = this.f28922i.indexOf(47, this.f28914a.length() + 3);
        String str = this.f28922i;
        return this.f28922i.substring(indexOf, o9.c.o(str, indexOf, str.length(), "?#"));
    }

    public List<String> h() {
        int indexOf = this.f28922i.indexOf(47, this.f28914a.length() + 3);
        String str = this.f28922i;
        int o10 = o9.c.o(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < o10) {
            int i10 = indexOf + 1;
            int n10 = o9.c.n(this.f28922i, i10, o10, '/');
            arrayList.add(this.f28922i.substring(i10, n10));
            indexOf = n10;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f28922i.hashCode();
    }

    public String i() {
        if (this.f28920g == null) {
            return null;
        }
        int indexOf = this.f28922i.indexOf(63) + 1;
        String str = this.f28922i;
        return this.f28922i.substring(indexOf, o9.c.n(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.f28915b.isEmpty()) {
            return "";
        }
        int length = this.f28914a.length() + 3;
        String str = this.f28922i;
        return this.f28922i.substring(length, o9.c.o(str, length, str.length(), ":@"));
    }

    public String l() {
        return this.f28917d;
    }

    public boolean m() {
        return this.f28914a.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public a o() {
        a aVar = new a();
        aVar.f28923a = this.f28914a;
        aVar.f28924b = j();
        aVar.f28925c = f();
        aVar.f28926d = this.f28917d;
        aVar.f28927e = this.f28918e != d(this.f28914a) ? this.f28918e : -1;
        aVar.f28928f.clear();
        aVar.f28928f.addAll(h());
        aVar.d(i());
        aVar.f28930h = e();
        return aVar;
    }

    public a p(String str) {
        try {
            return new a().h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f28922i;
    }

    public int w() {
        return this.f28918e;
    }

    public String x() {
        if (this.f28920g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        n(sb, this.f28920g);
        return sb.toString();
    }

    public String z() {
        return p("/...").t("").j("").a().toString();
    }
}
