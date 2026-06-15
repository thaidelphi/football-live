package s4;

import a5.c0;
import a5.p0;
import a5.t;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.b;
import n4.g;
import n4.h;
import s4.c;
/* compiled from: SsaDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends g {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f30738t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o  reason: collision with root package name */
    private final boolean f30739o;

    /* renamed from: p  reason: collision with root package name */
    private final b f30740p;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, c> f30741q;

    /* renamed from: r  reason: collision with root package name */
    private float f30742r;

    /* renamed from: s  reason: collision with root package name */
    private float f30743s;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f30742r = -3.4028235E38f;
        this.f30743s = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f30739o = true;
            String C = p0.C(list.get(0));
            a5.a.a(C.startsWith("Format:"));
            this.f30740p = (b) a5.a.e(b.a(C));
            G(new c0(list.get(1)));
            return;
        }
        this.f30739o = false;
        this.f30740p = null;
    }

    private static int B(long j10, List<Long> list, List<List<n4.b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float C(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    private static n4.b D(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        b.C0322b o10 = new b.C0322b().o(spannableString);
        if (cVar != null) {
            if (cVar.f30751c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f30751c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f30758j == 3 && cVar.f30752d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f30752d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f30753e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                o10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f30754f;
            if (z10 && cVar.f30755g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f30755g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f30756h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f30757i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f30774a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f30750b : -1;
        }
        o10.p(M(i10)).l(L(i10)).i(K(i10));
        PointF pointF = bVar.f30775b;
        if (pointF != null && f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
            o10.k(pointF.x / f10);
            o10.h(bVar.f30775b.y / f11, 0);
        } else {
            o10.k(C(o10.d()));
            o10.h(C(o10.c()), 0);
        }
        return o10.a();
    }

    private void E(String str, b bVar, List<List<n4.b>> list, List<Long> list2) {
        int i10;
        a5.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f30748e);
        if (split.length != bVar.f30748e) {
            t.i("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long J = J(split[bVar.f30744a]);
        if (J == -9223372036854775807L) {
            t.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long J2 = J(split[bVar.f30745b]);
        if (J2 == -9223372036854775807L) {
            t.i("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f30741q;
        c cVar = (map == null || (i10 = bVar.f30746c) == -1) ? null : map.get(split[i10].trim());
        String str2 = split[bVar.f30747d];
        n4.b D = D(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f30742r, this.f30743s);
        int B = B(J2, list2, list);
        for (int B2 = B(J, list2, list); B2 < B; B2++) {
            list.get(B2).add(D);
        }
    }

    private void F(c0 c0Var, List<List<n4.b>> list, List<Long> list2) {
        b bVar = this.f30739o ? this.f30740p : null;
        while (true) {
            String o10 = c0Var.o();
            if (o10 == null) {
                return;
            }
            if (o10.startsWith("Format:")) {
                bVar = b.a(o10);
            } else if (o10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    t.i("SsaDecoder", "Skipping dialogue line before complete format: " + o10);
                } else {
                    E(o10, bVar, list, list2);
                }
            }
        }
    }

    private void G(c0 c0Var) {
        while (true) {
            String o10 = c0Var.o();
            if (o10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(o10)) {
                H(c0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(o10)) {
                this.f30741q = I(c0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(o10)) {
                t.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(o10)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H(a5.c0 r5) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.o()
            if (r0 == 0) goto L59
            int r1 = r5.a()
            if (r1 == 0) goto L14
            int r1 = r5.h()
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = x5.a.e(r1)
            r1.hashCode()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f30743s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f30742r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.a.H(a5.c0):void");
    }

    private static Map<String, c> I(c0 c0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String o10 = c0Var.o();
            if (o10 == null || (c0Var.a() != 0 && c0Var.h() == 91)) {
                break;
            } else if (o10.startsWith("Format:")) {
                aVar = c.a.a(o10);
            } else if (o10.startsWith("Style:")) {
                if (aVar == null) {
                    t.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + o10);
                } else {
                    c b10 = c.b(o10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f30749a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long J(String str) {
        Matcher matcher = f30738t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) p0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) p0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) p0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) p0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int K(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 0:
            default:
                t.i("SsaDecoder", "Unknown alignment: " + i10);
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int L(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 0:
            default:
                t.i("SsaDecoder", "Unknown alignment: " + i10);
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment M(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                t.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // n4.g
    protected h z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c0 c0Var = new c0(bArr, i10);
        if (!this.f30739o) {
            G(c0Var);
        }
        F(c0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
