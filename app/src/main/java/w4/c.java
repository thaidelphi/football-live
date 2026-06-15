package w4;

import a5.c0;
import a5.p0;
import a5.t;
import android.text.TextUtils;
import com.appnext.banners.BannerAdRequest;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: WebvttCssParser.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f32312c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f32313d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final c0 f32314a = new c0();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f32315b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f32312c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                dVar.z((String) a5.a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] R0 = p0.R0(str, "\\.");
        String str2 = R0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            dVar.y(str2.substring(0, indexOf2));
            dVar.x(str2.substring(indexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (R0.length > 1) {
            dVar.w((String[]) p0.I0(R0, 1, R0.length));
        }
    }

    private static boolean b(c0 c0Var) {
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        byte[] d10 = c0Var.d();
        if (e8 + 2 > f10) {
            return false;
        }
        int i10 = e8 + 1;
        if (d10[e8] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (d10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 < f10) {
                if (((char) d10[i11]) == '*' && ((char) d10[i12]) == '/') {
                    i11 = i12 + 1;
                    f10 = i11;
                } else {
                    i11 = i12;
                }
            } else {
                c0Var.L(f10 - c0Var.e());
                return true;
            }
        }
    }

    private static boolean c(c0 c0Var) {
        char k10 = k(c0Var, c0Var.e());
        if (k10 == '\t' || k10 == '\n' || k10 == '\f' || k10 == '\r' || k10 == ' ') {
            c0Var.L(1);
            return true;
        }
        return false;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f32313d.matcher(x5.a.e(str));
        if (!matcher.matches()) {
            t.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) a5.a.e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.t(3);
                break;
            case 1:
                dVar.t(2);
                break;
            case 2:
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) a5.a.e(matcher.group(1))));
    }

    private static String f(c0 c0Var, StringBuilder sb) {
        boolean z10 = false;
        sb.setLength(0);
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        while (e8 < f10 && !z10) {
            char c10 = (char) c0Var.d()[e8];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                e8++;
                sb.append(c10);
            }
        }
        c0Var.L(e8 - c0Var.e());
        return sb.toString();
    }

    static String g(c0 c0Var, StringBuilder sb) {
        n(c0Var);
        if (c0Var.a() == 0) {
            return null;
        }
        String f10 = f(c0Var, sb);
        if ("".equals(f10)) {
            return "" + ((char) c0Var.z());
        }
        return f10;
    }

    private static String h(c0 c0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int e8 = c0Var.e();
            String g10 = g(c0Var, sb);
            if (g10 == null) {
                return null;
            }
            if (!"}".equals(g10) && !";".equals(g10)) {
                sb2.append(g10);
            } else {
                c0Var.K(e8);
                z10 = true;
            }
        }
        return sb2.toString();
    }

    private static String i(c0 c0Var, StringBuilder sb) {
        n(c0Var);
        if (c0Var.a() >= 5 && "::cue".equals(c0Var.w(5))) {
            int e8 = c0Var.e();
            String g10 = g(c0Var, sb);
            if (g10 == null) {
                return null;
            }
            if ("{".equals(g10)) {
                c0Var.K(e8);
                return "";
            }
            String l10 = "(".equals(g10) ? l(c0Var) : null;
            if (")".equals(g(c0Var, sb))) {
                return l10;
            }
            return null;
        }
        return null;
    }

    private static void j(c0 c0Var, d dVar, StringBuilder sb) {
        n(c0Var);
        String f10 = f(c0Var, sb);
        if (!"".equals(f10) && ":".equals(g(c0Var, sb))) {
            n(c0Var);
            String h10 = h(c0Var, sb);
            if (h10 == null || "".equals(h10)) {
                return;
            }
            int e8 = c0Var.e();
            String g10 = g(c0Var, sb);
            if (!";".equals(g10)) {
                if (!"}".equals(g10)) {
                    return;
                }
                c0Var.K(e8);
            }
            if (b9.h.S.equals(f10)) {
                dVar.q(a5.f.b(h10));
            } else if ("background-color".equals(f10)) {
                dVar.n(a5.f.b(h10));
            } else {
                boolean z10 = true;
                if ("ruby-position".equals(f10)) {
                    if ("over".equals(h10)) {
                        dVar.v(1);
                    } else if ("under".equals(h10)) {
                        dVar.v(2);
                    }
                } else if ("text-combine-upright".equals(f10)) {
                    if (!BannerAdRequest.TYPE_ALL.equals(h10) && !h10.startsWith("digits")) {
                        z10 = false;
                    }
                    dVar.p(z10);
                } else if ("text-decoration".equals(f10)) {
                    if ("underline".equals(h10)) {
                        dVar.A(true);
                    }
                } else if ("font-family".equals(f10)) {
                    dVar.r(h10);
                } else if ("font-weight".equals(f10)) {
                    if ("bold".equals(h10)) {
                        dVar.o(true);
                    }
                } else if ("font-style".equals(f10)) {
                    if ("italic".equals(h10)) {
                        dVar.u(true);
                    }
                } else if ("font-size".equals(f10)) {
                    e(h10, dVar);
                }
            }
        }
    }

    private static char k(c0 c0Var, int i10) {
        return (char) c0Var.d()[i10];
    }

    private static String l(c0 c0Var) {
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        boolean z10 = false;
        while (e8 < f10 && !z10) {
            int i10 = e8 + 1;
            z10 = ((char) c0Var.d()[e8]) == ')';
            e8 = i10;
        }
        return c0Var.w((e8 - 1) - c0Var.e()).trim();
    }

    static void m(c0 c0Var) {
        do {
        } while (!TextUtils.isEmpty(c0Var.o()));
    }

    static void n(c0 c0Var) {
        while (true) {
            for (boolean z10 = true; c0Var.a() > 0 && z10; z10 = false) {
                if (!c(c0Var) && !b(c0Var)) {
                }
            }
            return;
        }
    }

    public List<d> d(c0 c0Var) {
        this.f32315b.setLength(0);
        int e8 = c0Var.e();
        m(c0Var);
        this.f32314a.I(c0Var.d(), c0Var.e());
        this.f32314a.K(e8);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f32314a, this.f32315b);
            if (i10 == null || !"{".equals(g(this.f32314a, this.f32315b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int e10 = this.f32314a.e();
                String g10 = g(this.f32314a, this.f32315b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f32314a.K(e10);
                    j(this.f32314a, dVar, this.f32315b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
