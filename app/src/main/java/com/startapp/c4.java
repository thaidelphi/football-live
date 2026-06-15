package com.startapp;

import android.content.Context;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c4 extends x1<b4> {
    public c4(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // com.startapp.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.startapp.b4 a() {
        /*
            r11 = this;
            android.content.Context r0 = r11.f23531a
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.view.inputmethod.InputMethodManager
            r2 = 0
            if (r1 != 0) goto Lf
            goto Lc0
        Lf:
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.view.inputmethod.InputMethodSubtype r1 = r0.getCurrentInputMethodSubtype()
            r3 = 10
            r4 = 24
            java.lang.String r5 = "keyboard"
            if (r1 == 0) goto L50
            java.lang.String r6 = r1.getMode()
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L50
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L30
            java.lang.String r6 = r1.getLanguageTag()
            goto L31
        L30:
            r6 = r2
        L31:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L3b
            java.lang.String r6 = r1.getLocale()
        L3b:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L50
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r7 = r1.size()
            if (r7 >= r3) goto L51
            r1.add(r6)
            goto L51
        L50:
            r1 = r2
        L51:
            java.util.List r6 = r0.getInputMethodList()
            if (r6 == 0) goto Lb9
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r6.next()
            android.view.inputmethod.InputMethodInfo r7 = (android.view.inputmethod.InputMethodInfo) r7
            if (r7 != 0) goto L6a
            goto L5b
        L6a:
            r8 = 1
            java.util.List r7 = r0.getEnabledInputMethodSubtypeList(r7, r8)
            if (r7 != 0) goto L72
            goto L5b
        L72:
            java.util.Iterator r7 = r7.iterator()
        L76:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5b
            java.lang.Object r8 = r7.next()
            android.view.inputmethod.InputMethodSubtype r8 = (android.view.inputmethod.InputMethodSubtype) r8
            if (r8 == 0) goto L76
            java.lang.String r9 = r8.getMode()
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L76
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r4) goto L97
            java.lang.String r9 = r8.getLanguageTag()
            goto L98
        L97:
            r9 = r2
        L98:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto La2
            java.lang.String r9 = r8.getLocale()
        La2:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto L76
            if (r1 != 0) goto Laf
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
        Laf:
            int r8 = r1.size()
            if (r8 >= r3) goto L76
            r1.add(r9)
            goto L76
        Lb9:
            if (r1 == 0) goto Lc0
            com.startapp.b4 r2 = new com.startapp.b4
            r2.<init>(r1)
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.c4.a():java.lang.Object");
    }

    @Override // com.startapp.x1
    public final b4 c() {
        return b4.f21792b;
    }
}
