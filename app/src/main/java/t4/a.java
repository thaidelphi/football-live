package t4;

import a5.c0;
import a5.t;
import a5.u;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.b;
import n4.g;
import n4.h;
/* compiled from: SubripDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends g {

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f31025q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f31026r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f31027o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<String> f31028p;

    public a() {
        super("SubripDecoder");
        this.f31027o = new StringBuilder();
        this.f31028p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private n4.b B(Spanned spanned, String str) {
        char c10;
        char c11;
        b.C0322b o10 = new b.C0322b().o(spanned);
        if (str == null) {
            return o10.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            o10.l(0);
        } else if (c10 != 3 && c10 != 4 && c10 != 5) {
            o10.l(1);
        } else {
            o10.l(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            o10.i(2);
        } else if (c11 != 3 && c11 != 4 && c11 != 5) {
            o10.i(1);
        } else {
            o10.i(0);
        }
        return o10.k(C(o10.d())).h(C(o10.c()), 0).a();
    }

    static float C(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long D(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) a5.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) a5.a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String E(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f31026r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb.replace(start, start + length, "");
            i10 += length;
        }
        return sb.toString();
    }

    @Override // n4.g
    protected h z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        u uVar = new u();
        c0 c0Var = new c0(bArr, i10);
        while (true) {
            String o10 = c0Var.o();
            int i11 = 0;
            if (o10 == null) {
                break;
            } else if (o10.length() != 0) {
                try {
                    Integer.parseInt(o10);
                    String o11 = c0Var.o();
                    if (o11 == null) {
                        t.i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f31025q.matcher(o11);
                    if (matcher.matches()) {
                        uVar.a(D(matcher, 1));
                        uVar.a(D(matcher, 6));
                        this.f31027o.setLength(0);
                        this.f31028p.clear();
                        for (String o12 = c0Var.o(); !TextUtils.isEmpty(o12); o12 = c0Var.o()) {
                            if (this.f31027o.length() > 0) {
                                this.f31027o.append("<br>");
                            }
                            this.f31027o.append(E(o12, this.f31028p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f31027o.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f31028p.size()) {
                                break;
                            }
                            String str2 = this.f31028p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(B(fromHtml, str));
                        arrayList.add(n4.b.f28595r);
                    } else {
                        t.i("SubripDecoder", "Skipping invalid timing: " + o11);
                    }
                } catch (NumberFormatException unused) {
                    t.i("SubripDecoder", "Skipping invalid index: " + o10);
                }
            }
        }
        return new b((n4.b[]) arrayList.toArray(new n4.b[0]), uVar.d());
    }
}
