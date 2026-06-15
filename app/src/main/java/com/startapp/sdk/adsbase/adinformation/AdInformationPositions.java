package com.startapp.sdk.adsbase.adinformation;

import android.widget.RelativeLayout;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class AdInformationPositions {

    /* renamed from: a  reason: collision with root package name */
    public static final String f22968a = Position.BOTTOM_LEFT.name();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Position {
        TOP_LEFT(1, new int[]{10, 9}, -1),
        TOP_RIGHT(2, new int[]{10, 11}, 1),
        BOTTOM_LEFT(3, new int[]{12, 9}, -1),
        BOTTOM_RIGHT(4, new int[]{12, 11}, 1);
        
        private int animationMultiplier;
        private int index;
        private int[] rules;

        Position(int i10, int[] iArr, int i11) {
            this.rules = iArr;
            this.animationMultiplier = i11;
            this.index = i10;
        }

        public static Position getByIndex(long j10) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].getIndex() == j10) {
                    position = values[i10];
                }
            }
            return position;
        }

        public static Position getByName(String str) {
            Position position = BOTTOM_LEFT;
            Position[] values = values();
            for (int i10 = 0; i10 < values.length; i10++) {
                if (values[i10].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    position = values[i10];
                }
            }
            return position;
        }

        public void addRules(RelativeLayout.LayoutParams layoutParams) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.rules;
                if (i10 >= iArr.length) {
                    return;
                }
                layoutParams.addRule(iArr[i10]);
                i10++;
            }
        }

        public Position flipHorizontal() {
            int i10 = a.f22969a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return BOTTOM_LEFT;
                        }
                        throw new IllegalStateException();
                    }
                    return BOTTOM_RIGHT;
                }
                return TOP_LEFT;
            }
            return TOP_RIGHT;
        }

        public int getAnimationStartMultiplier() {
            return this.animationMultiplier;
        }

        public int getIndex() {
            return this.index;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22969a;

        static {
            int[] iArr = new int[Position.values().length];
            f22969a = iArr;
            try {
                iArr[Position.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22969a[Position.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22969a[Position.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22969a[Position.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
