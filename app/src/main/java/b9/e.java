package b9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Regex.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5299b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f5300a;

    /* compiled from: Regex.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public e(Pattern nativePattern) {
        kotlin.jvm.internal.n.f(nativePattern, "nativePattern");
        this.f5300a = nativePattern;
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.n.f(input, "input");
        return this.f5300a.matcher(input).matches();
    }

    public final String b(CharSequence input, String replacement) {
        kotlin.jvm.internal.n.f(input, "input");
        kotlin.jvm.internal.n.f(replacement, "replacement");
        String replaceAll = this.f5300a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.n.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String c(CharSequence input, String replacement) {
        kotlin.jvm.internal.n.f(input, "input");
        kotlin.jvm.internal.n.f(replacement, "replacement");
        String replaceFirst = this.f5300a.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.n.e(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List<String> d(CharSequence input, int i10) {
        List<String> b10;
        kotlin.jvm.internal.n.f(input, "input");
        p.Z(i10);
        Matcher matcher = this.f5300a.matcher(input);
        if (i10 != 1 && matcher.find()) {
            ArrayList arrayList = new ArrayList(i10 > 0 ? y8.i.c(i10, 10) : 10);
            int i11 = 0;
            int i12 = i10 - 1;
            do {
                arrayList.add(input.subSequence(i11, matcher.start()).toString());
                i11 = matcher.end();
                if (i12 >= 0 && arrayList.size() == i12) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(input.subSequence(i11, input.length()).toString());
            return arrayList;
        }
        b10 = j8.p.b(input.toString());
        return b10;
    }

    public String toString() {
        String pattern = this.f5300a.toString();
        kotlin.jvm.internal.n.e(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.n.f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.n.e(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.<init>(java.lang.String):void");
    }
}
