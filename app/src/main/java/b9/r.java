package b9;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class r extends q {
    public static final String A0(String str, int i10) {
        int c10;
        kotlin.jvm.internal.n.f(str, "<this>");
        if (i10 >= 0) {
            c10 = y8.i.c(i10, str.length());
            String substring = str.substring(c10);
            kotlin.jvm.internal.n.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char B0(CharSequence charSequence) {
        kotlin.jvm.internal.n.f(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(p.D(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
