package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* compiled from: PrecomputedTextCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements Spannable {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2757d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f2758a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2759b;

    /* renamed from: c  reason: collision with root package name */
    private final PrecomputedText f2760c;

    public a a() {
        return this.f2759b;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f2758a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f2758a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2758a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2758a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2758a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f2760c.getSpans(i10, i11, cls);
        }
        return (T[]) this.f2758a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2758a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f2758a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2760c.removeSpan(obj);
                return;
            } else {
                this.f2758a.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2760c.setSpan(obj, i10, i11, i12);
                return;
            } else {
                this.f2758a.setSpan(obj, i10, i11, i12);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f2758a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2758a.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f2761a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f2762b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2763c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2764d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f2765e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: androidx.core.text.c$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0045a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f2766a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f2767b;

            /* renamed from: c  reason: collision with root package name */
            private int f2768c;

            /* renamed from: d  reason: collision with root package name */
            private int f2769d;

            public C0045a(TextPaint textPaint) {
                this.f2766a = textPaint;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    this.f2768c = 1;
                    this.f2769d = 1;
                } else {
                    this.f2769d = 0;
                    this.f2768c = 0;
                }
                if (i10 >= 18) {
                    this.f2767b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f2767b = null;
                }
            }

            public a a() {
                return new a(this.f2766a, this.f2767b, this.f2768c, this.f2769d);
            }

            public C0045a b(int i10) {
                this.f2768c = i10;
                return this;
            }

            public C0045a c(int i10) {
                this.f2769d = i10;
                return this;
            }

            public C0045a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2767b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2765e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2765e = null;
            }
            this.f2761a = textPaint;
            this.f2762b = textDirectionHeuristic;
            this.f2763c = i10;
            this.f2764d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 < 23 || (this.f2763c == aVar.b() && this.f2764d == aVar.c())) && this.f2761a.getTextSize() == aVar.e().getTextSize() && this.f2761a.getTextScaleX() == aVar.e().getTextScaleX() && this.f2761a.getTextSkewX() == aVar.e().getTextSkewX()) {
                if ((i10 < 21 || (this.f2761a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f2761a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) && this.f2761a.getFlags() == aVar.e().getFlags()) {
                    if (i10 >= 24) {
                        if (!this.f2761a.getTextLocales().equals(aVar.e().getTextLocales())) {
                            return false;
                        }
                    } else if (i10 >= 17 && !this.f2761a.getTextLocale().equals(aVar.e().getTextLocale())) {
                        return false;
                    }
                    return this.f2761a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2761a.getTypeface().equals(aVar.e().getTypeface());
                }
                return false;
            }
            return false;
        }

        public int b() {
            return this.f2763c;
        }

        public int c() {
            return this.f2764d;
        }

        public TextDirectionHeuristic d() {
            return this.f2762b;
        }

        public TextPaint e() {
            return this.f2761a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a(aVar)) {
                    return Build.VERSION.SDK_INT < 18 || this.f2762b == aVar.d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return androidx.core.util.d.b(Float.valueOf(this.f2761a.getTextSize()), Float.valueOf(this.f2761a.getTextScaleX()), Float.valueOf(this.f2761a.getTextSkewX()), Float.valueOf(this.f2761a.getLetterSpacing()), Integer.valueOf(this.f2761a.getFlags()), this.f2761a.getTextLocales(), this.f2761a.getTypeface(), Boolean.valueOf(this.f2761a.isElegantTextHeight()), this.f2762b, Integer.valueOf(this.f2763c), Integer.valueOf(this.f2764d));
            }
            if (i10 >= 21) {
                return androidx.core.util.d.b(Float.valueOf(this.f2761a.getTextSize()), Float.valueOf(this.f2761a.getTextScaleX()), Float.valueOf(this.f2761a.getTextSkewX()), Float.valueOf(this.f2761a.getLetterSpacing()), Integer.valueOf(this.f2761a.getFlags()), this.f2761a.getTextLocale(), this.f2761a.getTypeface(), Boolean.valueOf(this.f2761a.isElegantTextHeight()), this.f2762b, Integer.valueOf(this.f2763c), Integer.valueOf(this.f2764d));
            }
            if (i10 >= 18) {
                return androidx.core.util.d.b(Float.valueOf(this.f2761a.getTextSize()), Float.valueOf(this.f2761a.getTextScaleX()), Float.valueOf(this.f2761a.getTextSkewX()), Integer.valueOf(this.f2761a.getFlags()), this.f2761a.getTextLocale(), this.f2761a.getTypeface(), this.f2762b, Integer.valueOf(this.f2763c), Integer.valueOf(this.f2764d));
            }
            if (i10 >= 17) {
                return androidx.core.util.d.b(Float.valueOf(this.f2761a.getTextSize()), Float.valueOf(this.f2761a.getTextScaleX()), Float.valueOf(this.f2761a.getTextSkewX()), Integer.valueOf(this.f2761a.getFlags()), this.f2761a.getTextLocale(), this.f2761a.getTypeface(), this.f2762b, Integer.valueOf(this.f2763c), Integer.valueOf(this.f2764d));
            }
            return androidx.core.util.d.b(Float.valueOf(this.f2761a.getTextSize()), Float.valueOf(this.f2761a.getTextScaleX()), Float.valueOf(this.f2761a.getTextSkewX()), Integer.valueOf(this.f2761a.getFlags()), this.f2761a.getTypeface(), this.f2762b, Integer.valueOf(this.f2763c), Integer.valueOf(this.f2764d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2761a.getTextSize());
            sb.append(", textScaleX=" + this.f2761a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2761a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                sb.append(", letterSpacing=" + this.f2761a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f2761a.isElegantTextHeight());
            }
            if (i10 >= 24) {
                sb.append(", textLocale=" + this.f2761a.getTextLocales());
            } else if (i10 >= 17) {
                sb.append(", textLocale=" + this.f2761a.getTextLocale());
            }
            sb.append(", typeface=" + this.f2761a.getTypeface());
            if (i10 >= 26) {
                sb.append(", variationSettings=" + this.f2761a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2762b);
            sb.append(", breakStrategy=" + this.f2763c);
            sb.append(", hyphenationFrequency=" + this.f2764d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f2761a = params.getTextPaint();
            this.f2762b = params.getTextDirection();
            this.f2763c = params.getBreakStrategy();
            this.f2764d = params.getHyphenationFrequency();
            this.f2765e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
