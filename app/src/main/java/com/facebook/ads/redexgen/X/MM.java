package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class MM extends AbstractC1951kq {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<C6K> A0A = new ArrayList<>();
    public ArrayList<C6K> A07 = new ArrayList<>();
    public ArrayList<C05285a> A09 = new ArrayList<>();
    public ArrayList<C5Z> A08 = new ArrayList<>();
    public ArrayList<ArrayList<C6K>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C05285a>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C5Z>> A03 = new ArrayList<>();
    public ArrayList<C6K> A00 = new ArrayList<>();
    public ArrayList<C6K> A04 = new ArrayList<>();
    public ArrayList<C6K> A06 = new ArrayList<>();
    public ArrayList<C6K> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final void A0I() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C05285a c05285a = this.A09.get(size2);
            View view = c05285a.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c05285a.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0P(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            C6K c6k = this.A07.get(size4);
            c6k.A0H.setAlpha(1.0f);
            A0N(c6k);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<C5Z> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A01(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C05285a> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C05285a c05285a2 = arrayList2.get(size7);
                    View view2 = c05285a2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0O(c05285a2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<C6K> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    C6K c6k2 = arrayList3.get(size9);
                    c6k2.A0H.setAlpha(1.0f);
                    A0N(c6k2);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<C6K>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<C5Z>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<C5Z> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1951kq
    public final boolean A0T(C6K c6k, int i10, int i11, int i12, int i13) {
        View view = c6k.A0H;
        int translationX = i10 + ((int) c6k.A0H.getTranslationX());
        int translationY = i11 + ((int) c6k.A0H.getTranslationY());
        A04(c6k);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            A0O(c6k);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.A09.add(new C05285a(c6k, translationX, translationY, i12, i13));
        return true;
    }

    private void A01(C5Z c5z) {
        if (c5z.A05 != null) {
            A07(c5z, c5z.A05);
        }
        if (c5z.A04 != null) {
            A07(c5z, c5z.A04);
        }
    }

    private void A03(final C6K c6k) {
        final View view = c6k.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(c6k);
        ViewPropertyAnimator animation = animate.setDuration(A07());
        animation.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.5U
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                MM.this.A0P(c6k);
                MM.this.A06.remove(c6k);
                MM.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(C6K c6k) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        c6k.A0H.animate().setInterpolator(A0B);
        A0K(c6k);
    }

    private final void A05(List<C6K> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<C5Z> list, C6K c6k) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C5Z changeInfo = list.get(size);
            if (A07(changeInfo, c6k) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(C5Z c5z, C6K c6k) {
        boolean z10 = false;
        if (c5z.A04 == c6k) {
            c5z.A04 = null;
        } else {
            C6K c6k2 = c5z.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (c6k2 == c6k) {
                c5z.A05 = null;
                z10 = true;
            } else {
                return false;
            }
        }
        c6k.A0H.setAlpha(1.0f);
        c6k.A0H.setTranslationX(0.0f);
        c6k.A0H.setTranslationY(0.0f);
        A0Q(c6k, z10);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.MM.A0J():void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final void A0K(C6K c6k) {
        View view = c6k.A0H;
        view.animate().cancel();
        for (int i10 = this.A09.size() - 1; i10 >= 0; i10--) {
            if (this.A09.get(i10).A04 == c6k) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(c6k);
                this.A09.remove(i10);
            }
        }
        A06(this.A08, c6k);
        if (this.A0A.remove(c6k)) {
            view.setAlpha(1.0f);
            A0P(c6k);
        }
        if (this.A07.remove(c6k)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0N(c6k);
        }
        for (int i11 = this.A03.size() - 1; i11 >= 0; i11--) {
            ArrayList<C5Z> arrayList = this.A03.get(i11);
            A06(arrayList, c6k);
            if (arrayList.isEmpty()) {
                this.A03.remove(i11);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            ArrayList<C05285a> arrayList2 = this.A05.get(size);
            int i12 = arrayList2.size() - 1;
            while (true) {
                if (i12 < 0) {
                    break;
                } else if (arrayList2.get(i12).A04 == c6k) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0O(c6k);
                    arrayList2.remove(i12);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size);
                    }
                } else {
                    i12--;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList<C6K> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(c6k)) {
                view.setAlpha(1.0f);
                A0N(c6k);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(c6k);
        this.A00.remove(c6k);
        this.A02.remove(c6k);
        this.A04.remove(c6k);
        A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final boolean A0L() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final boolean A0M(C6K c6k, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(c6k, payloads);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1951kq
    public final boolean A0R(C6K c6k) {
        A04(c6k);
        c6k.A0H.setAlpha(0.0f);
        this.A07.add(c6k);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1951kq
    public final boolean A0S(C6K c6k) {
        A04(c6k);
        this.A0A.add(c6k);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1951kq
    public final boolean A0U(C6K c6k, C6K c6k2, int i10, int i11, int i12, int i13) {
        if (c6k == c6k2) {
            return A0T(c6k, i10, i11, i12, i13);
        }
        float translationX = c6k.A0H.getTranslationX();
        float translationY = c6k.A0H.getTranslationY();
        float prevTranslationY = c6k.A0H.getAlpha();
        A04(c6k);
        float prevTranslationX = i12 - i10;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i13 - i11;
        int deltaX = (int) (prevTranslationX2 - translationY);
        c6k.A0H.setTranslationX(translationX);
        c6k.A0H.setTranslationY(translationY);
        c6k.A0H.setAlpha(prevTranslationY);
        if (c6k2 != null) {
            A04(c6k2);
            float prevTranslationX3 = -deltaY;
            c6k2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            c6k2.A0H.setTranslationY(prevTranslationX4);
            c6k2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C5Z(c6k, c6k2, i10, i11, i12, i13));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final C5Z c5z) {
        final View view;
        C6K holder = c5z.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        C6K holder2 = c5z.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(c5z.A05);
            oldViewAnim.translationX(c5z.A02 - c5z.A00);
            oldViewAnim.translationY(c5z.A03 - c5z.A01);
            oldViewAnim.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.5X
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    MM.this.A0Q(c5z.A05, true);
                    MM.this.A02.remove(c5z.A05);
                    MM.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(c5z.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.5Y
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    MM.this.A0Q(c5z.A04, false);
                    MM.this.A02.remove(c5z.A04);
                    MM.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final C6K c6k) {
        final View view = c6k.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(c6k);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.5V
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                MM.this.A0N(c6k);
                MM.this.A00.remove(c6k);
                MM.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final C6K c6k, int i10, int i11, int i12, int i13) {
        final View view = c6k.A0H;
        final int i14 = i12 - i10;
        final int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(c6k);
        animate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.5W
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i14 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i15 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                MM.this.A0O(c6k);
                MM.this.A04.remove(c6k);
                MM.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
