package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* compiled from: BidiFormatter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f2738d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f2739e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f2740f;

    /* renamed from: g  reason: collision with root package name */
    static final a f2741g;

    /* renamed from: h  reason: collision with root package name */
    static final a f2742h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2743a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2744b;

    /* renamed from: c  reason: collision with root package name */
    private final d f2745c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0043a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2746a;

        /* renamed from: b  reason: collision with root package name */
        private int f2747b;

        /* renamed from: c  reason: collision with root package name */
        private d f2748c;

        public C0043a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f2742h : a.f2741g;
        }

        private void c(boolean z10) {
            this.f2746a = z10;
            this.f2748c = a.f2738d;
            this.f2747b = 2;
        }

        public a a() {
            if (this.f2747b == 2 && this.f2748c == a.f2738d) {
                return b(this.f2746a);
            }
            return new a(this.f2746a, this.f2747b, this.f2748c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f2749f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f2750a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2751b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2752c;

        /* renamed from: d  reason: collision with root package name */
        private int f2753d;

        /* renamed from: e  reason: collision with root package name */
        private char f2754e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f2749f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f2750a = charSequence;
            this.f2751b = z10;
            this.f2752c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f2749f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f2753d;
            do {
                int i11 = this.f2753d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2750a;
                int i12 = i11 - 1;
                this.f2753d = i12;
                charAt = charSequence.charAt(i12);
                this.f2754e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f2753d = i10;
            this.f2754e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f2753d;
                if (i10 >= this.f2752c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2750a;
                this.f2753d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f2754e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f2753d;
            while (true) {
                int i11 = this.f2753d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2750a;
                int i12 = i11 - 1;
                this.f2753d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f2754e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f2753d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f2750a;
                            int i14 = i13 - 1;
                            this.f2753d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f2754e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f2753d = i10;
            this.f2754e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f2753d;
            while (true) {
                int i11 = this.f2753d;
                if (i11 < this.f2752c) {
                    CharSequence charSequence = this.f2750a;
                    this.f2753d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f2754e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f2753d;
                            if (i12 < this.f2752c) {
                                CharSequence charSequence2 = this.f2750a;
                                this.f2753d = i12 + 1;
                                charAt = charSequence2.charAt(i12);
                                this.f2754e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2753d = i10;
                    this.f2754e = '<';
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.f2750a.charAt(this.f2753d - 1);
            this.f2754e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2750a, this.f2753d);
                this.f2753d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2753d--;
            byte c10 = c(this.f2754e);
            if (this.f2751b) {
                char c11 = this.f2754e;
                if (c11 == '>') {
                    return h();
                }
                return c11 == ';' ? f() : c10;
            }
            return c10;
        }

        byte b() {
            char charAt = this.f2750a.charAt(this.f2753d);
            this.f2754e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2750a, this.f2753d);
                this.f2753d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2753d++;
            byte c10 = c(this.f2754e);
            if (this.f2751b) {
                char c11 = this.f2754e;
                if (c11 == '<') {
                    return i();
                }
                return c11 == '&' ? g() : c10;
            }
            return c10;
        }

        int d() {
            this.f2753d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f2753d < this.f2752c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                break;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                break;
                            case 18:
                                i12--;
                                i11 = 0;
                                break;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f2753d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f2753d = this.f2752c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f2753d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f2772c;
        f2738d = dVar;
        f2739e = Character.toString((char) 8206);
        f2740f = Character.toString((char) 8207);
        f2741g = new a(false, 2, dVar);
        f2742h = new a(true, 2, dVar);
    }

    a(boolean z10, int i10, d dVar) {
        this.f2743a = z10;
        this.f2744b = i10;
        this.f2745c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0043a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        if (this.f2743a || !(a10 || b(charSequence) == 1)) {
            return this.f2743a ? (!a10 || b(charSequence) == -1) ? f2740f : "" : "";
        }
        return f2739e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        if (this.f2743a || !(a10 || a(charSequence) == 1)) {
            return this.f2743a ? (!a10 || a(charSequence) == -1) ? f2740f : "" : "";
        }
        return f2739e;
    }

    public boolean d() {
        return (this.f2744b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2745c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a10 ? e.f2771b : e.f2770a));
        }
        if (a10 != this.f2743a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a10 ? e.f2771b : e.f2770a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2745c, true);
    }

    public String k(String str, d dVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z10).toString();
    }
}
