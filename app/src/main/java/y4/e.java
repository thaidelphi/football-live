package y4;

import a5.p0;
import a5.x;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import n3.m1;
/* compiled from: DefaultTrackNameProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f33068a;

    public e(Resources resources) {
        this.f33068a = (Resources) a5.a.e(resources);
    }

    private String b(m1 m1Var) {
        int i10 = m1Var.f28198y;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 6 || i10 == 7) {
                    return this.f33068a.getString(m.f33125t);
                }
                if (i10 != 8) {
                    return this.f33068a.getString(m.f33124s);
                }
                return this.f33068a.getString(m.f33126u);
            }
            return this.f33068a.getString(m.f33123r);
        }
        return this.f33068a.getString(m.f33115j);
    }

    private String c(m1 m1Var) {
        int i10 = m1Var.f28181h;
        return i10 == -1 ? "" : this.f33068a.getString(m.f33114i, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(m1 m1Var) {
        return TextUtils.isEmpty(m1Var.f28175b) ? "" : m1Var.f28175b;
    }

    private String e(m1 m1Var) {
        String j10 = j(f(m1Var), h(m1Var));
        return TextUtils.isEmpty(j10) ? d(m1Var) : j10;
    }

    private String f(m1 m1Var) {
        String str = m1Var.f28176c;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale forLanguageTag = p0.f482a >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale P = p0.P();
        String displayName = forLanguageTag.getDisplayName(P);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(P) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(m1 m1Var) {
        int i10 = m1Var.f28190q;
        int i11 = m1Var.f28191r;
        return (i10 == -1 || i11 == -1) ? "" : this.f33068a.getString(m.f33116k, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(m1 m1Var) {
        String string = (m1Var.f28178e & 2) != 0 ? this.f33068a.getString(m.f33117l) : "";
        if ((m1Var.f28178e & 4) != 0) {
            string = j(string, this.f33068a.getString(m.f33120o));
        }
        if ((m1Var.f28178e & 8) != 0) {
            string = j(string, this.f33068a.getString(m.f33119n));
        }
        return (m1Var.f28178e & 1088) != 0 ? j(string, this.f33068a.getString(m.f33118m)) : string;
    }

    private static int i(m1 m1Var) {
        int k10 = x.k(m1Var.f28185l);
        if (k10 != -1) {
            return k10;
        }
        if (x.n(m1Var.f28182i) != null) {
            return 2;
        }
        if (x.c(m1Var.f28182i) != null) {
            return 1;
        }
        if (m1Var.f28190q == -1 && m1Var.f28191r == -1) {
            return (m1Var.f28198y == -1 && m1Var.f28199z == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f33068a.getString(m.f33113h, str, str2);
            }
        }
        return str;
    }

    @Override // y4.o
    public String a(m1 m1Var) {
        String e8;
        int i10 = i(m1Var);
        if (i10 == 2) {
            e8 = j(h(m1Var), g(m1Var), c(m1Var));
        } else if (i10 == 1) {
            e8 = j(e(m1Var), b(m1Var), c(m1Var));
        } else {
            e8 = e(m1Var);
        }
        return e8.length() == 0 ? this.f33068a.getString(m.f33127v) : e8;
    }
}
