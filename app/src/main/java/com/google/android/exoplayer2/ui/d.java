package com.google.android.exoplayer2.ui;

import a5.p0;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.ui.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import y5.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f10996a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f10997a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, String> f10998b;

        private b(String str, Map<String, String> map) {
            this.f10997a = str;
            this.f10998b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        private static final Comparator<c> f10999e = new Comparator() { // from class: com.google.android.exoplayer2.ui.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e8;
                e8 = d.c.e((d.c) obj, (d.c) obj2);
                return e8;
            }
        };

        /* renamed from: f  reason: collision with root package name */
        private static final Comparator<c> f11000f = new Comparator() { // from class: com.google.android.exoplayer2.ui.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f10;
                f10 = d.c.f((d.c) obj, (d.c) obj2);
                return f10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final int f11001a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11002b;

        /* renamed from: c  reason: collision with root package name */
        public final String f11003c;

        /* renamed from: d  reason: collision with root package name */
        public final String f11004d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f11002b, cVar.f11002b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f11003c.compareTo(cVar2.f11003c);
            return compareTo != 0 ? compareTo : cVar.f11004d.compareTo(cVar2.f11004d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int f(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f11001a, cVar.f11001a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f11003c.compareTo(cVar.f11003c);
            return compareTo != 0 ? compareTo : cVar2.f11004d.compareTo(cVar.f11004d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f11001a = i10;
            this.f11002b = i11;
            this.f11003c = str;
            this.f11004d = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpannedToHtmlConverter.java */
    /* renamed from: com.google.android.exoplayer2.ui.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0177d {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f11005a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<c> f11006b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", r.j());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), r.j());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            hashMap.put(com.google.android.exoplayer2.ui.b.a("bg_" + intValue), p0.B("background-color:%s;", com.google.android.exoplayer2.ui.b.b(intValue)));
        }
        SparseArray<C0177d> c10 = c(spanned, f10);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < c10.size()) {
            int keyAt = c10.keyAt(i10);
            sb.append(b(spanned.subSequence(i11, keyAt)));
            C0177d c0177d = c10.get(keyAt);
            Collections.sort(c0177d.f11006b, c.f11000f);
            for (c cVar : c0177d.f11006b) {
                sb.append(cVar.f11004d);
            }
            Collections.sort(c0177d.f11005a, c.f10999e);
            for (c cVar2 : c0177d.f11005a) {
                sb.append(cVar2.f11003c);
            }
            i10++;
            i11 = keyAt;
        }
        sb.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb.toString(), hashMap);
    }

    private static String b(CharSequence charSequence) {
        return f10996a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<C0177d> c(Spanned spanned, float f10) {
        Object[] spans;
        SparseArray<C0177d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e8 = e(obj, f10);
            String d10 = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e8 != null) {
                a5.a.e(d10);
                c cVar = new c(spanStart, spanEnd, e8, d10);
                f(sparseArray, spanStart).f11005a.add(cVar);
                f(sparseArray, spanEnd).f11006b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof r4.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof r4.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else if (obj instanceof r4.c) {
            return "<rt>" + b(((r4.c) obj).f30381a) + "</rt></ruby>";
        } else if (obj instanceof UnderlineSpan) {
            return "</u>";
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return p0.B("<span style='color:%s;'>", com.google.android.exoplayer2.ui.b.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return p0.B("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof r4.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f10;
            }
            return p0.B("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        } else if (obj instanceof RelativeSizeSpan) {
            return p0.B("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        } else {
            if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family != null) {
                    return p0.B("<span style='font-family:\"%s\";'>", family);
                }
                return null;
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        if (style != 3) {
                            return null;
                        }
                        return "<b><i>";
                    }
                    return "<i>";
                }
                return "<b>";
            } else if (obj instanceof r4.c) {
                int i10 = ((r4.c) obj).f30382b;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return "<ruby style='ruby-position:under;'>";
                    }
                    return "<ruby style='ruby-position:over;'>";
                }
                return "<ruby style='ruby-position:unset;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (obj instanceof r4.e) {
                    r4.e eVar = (r4.e) obj;
                    return p0.B("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(eVar.f30383a, eVar.f30384b), g(eVar.f30385c));
                }
                return null;
            }
        }
    }

    private static C0177d f(SparseArray<C0177d> sparseArray, int i10) {
        C0177d c0177d = sparseArray.get(i10);
        if (c0177d == null) {
            C0177d c0177d2 = new C0177d();
            sparseArray.put(i10, c0177d2);
            return c0177d2;
        }
        return c0177d;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb = new StringBuilder();
        if (i11 == 1) {
            sb.append("filled ");
        } else if (i11 == 2) {
            sb.append("open ");
        }
        if (i10 == 0) {
            sb.append("none");
        } else if (i10 == 1) {
            sb.append("circle");
        } else if (i10 == 2) {
            sb.append("dot");
        } else if (i10 != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
